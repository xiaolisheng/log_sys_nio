package client;

import common.handler.HeartbeatHandler;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;

public class ClientHandler extends HeartbeatHandler {

	private final ByteBuf firstMessage;

	private ChannelHandlerContext ctx;

	private Client client;

	public ClientHandler(Client client) {
		super("client");
		byte[] req = "QUERY TIME ORDER".getBytes();
		firstMessage = Unpooled.buffer(req.length);
		firstMessage.writeBytes(req);
		this.client = client;
	}

	public void send(String msg) {
		byte[] req = msg.getBytes();
		ByteBuf msgBuf = Unpooled.buffer(req.length);
		msgBuf.writeBytes(req);
		ctx.writeAndFlush(msgBuf);
	}

	@Override
	protected void handleData(ChannelHandlerContext channelHandlerContext,
			ByteBuf byteBuf) {
		byte[] data = new byte[byteBuf.readableBytes() - 5];
		byteBuf.skipBytes(5);
		byteBuf.readBytes(data);
		String content = new String(data);
		System.out.println(name + " get content: " + content);
	}

	@Override
	protected void handleAllIdle(ChannelHandlerContext ctx) {
		super.handleAllIdle(ctx);
		sendPingMsg(ctx);
	}
}
