package server.processor;

import io.netty.channel.socket.SocketChannel;

public interface Processor {

	public void processMsg(SocketChannel channel, Object msg);
}
