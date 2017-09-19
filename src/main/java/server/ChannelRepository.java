package server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.netty.channel.socket.SocketChannel;

public class ChannelRepository {
	private static final Map<String, SocketChannel> map = new ConcurrentHashMap<String, SocketChannel>(
			1000);

	public static void put(String key, SocketChannel sc) {
		map.put(key, sc);
	}
}
