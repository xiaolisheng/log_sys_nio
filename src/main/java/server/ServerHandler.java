package server;

import common.handler.HeartbeatHandler;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;

public class ServerHandler extends HeartbeatHandler {
	public ServerHandler() {
		super("server");
	}

	@Override
	protected void handleData(ChannelHandlerContext channelHandlerContext,
			ByteBuf byteBuf) {
		byte[] data = new byte[byteBuf.readableBytes() - 5];
		ByteBuf responseBuf = Unpooled.copiedBuffer(byteBuf);
		byteBuf.skipBytes(5);
		byteBuf.readBytes(data);
		String content = new String(data);
		System.out.println(name + " get content: " + content);
		channelHandlerContext.write(responseBuf);
	}

	@Override
	protected void handleReaderIdle(ChannelHandlerContext ctx) {
		super.handleReaderIdle(ctx);
		System.err
				.println("---client " + ctx.channel().remoteAddress().toString()
						+ " reader timeout, close it---");
		ctx.close();
	}
}
