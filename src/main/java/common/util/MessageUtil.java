package common.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

import common.config.Config;
import common.entity.Message;
import common.entity.SysEntity;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class MessageUtil {

	public static <T> Message<T> decode(Object msg, Class<?> clazz)
			throws UnsupportedEncodingException, NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException,
			InstantiationException {
		Message<T> message = new Message<T>();
		T t = (T) clazz.newInstance();
		ByteBuf buf = (ByteBuf) msg;
		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		message.setCode(req[0]);
		String body = new String(Arrays.copyOfRange(req, 1, req.length),
				Config.CHARSET);
		Field f = clazz.getField("name");
		f.set(t, body);
		message.setData(t);
		System.out.println(t.getClass());
		return message;
	}

	public static <T> ByteBuf encode(Message<T> message) {
		ByteBuf buf = Unpooled.copiedBuffer(new byte[]{message.getCode()},
				message.getData().toString().getBytes());
		return buf;
	}

	public static void main(String[] args) throws UnsupportedEncodingException,
			NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, InstantiationException {
		ByteBuf buf = Unpooled.copiedBuffer("1这是我的名字".getBytes(Config.CHARSET));
		Message<SysEntity> msg = decode(buf, SysEntity.class);
		System.out.println(msg.getCode());
		System.out.println(msg.getData().name);
	}
}
