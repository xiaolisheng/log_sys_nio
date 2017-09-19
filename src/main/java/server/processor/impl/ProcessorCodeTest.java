package server.processor.impl;

import io.netty.channel.socket.SocketChannel;
import server.processor.Processor;

public class ProcessorCodeTest implements Processor {

	@Override
	public void processMsg(SocketChannel channel, Object msg) {
		System.out.println("test access!");
		channel.writeAndFlush(msg);
	}
}
