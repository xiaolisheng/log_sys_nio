package server.factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import server.constant.EnvironmentEnum;

public class SessionFactory {
	private static Map<EnvironmentEnum, SqlSessionFactory> map = new HashMap<>();

	public static void init() throws IOException {
		synchronized (map) {
			SqlSessionFactory sqlSessionFactory = null;
			for (EnvironmentEnum e : EnvironmentEnum.values()) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(
						Resources.getResourceAsStream("mybatis-config.xml"),
						e.name().toLowerCase());
				map.put(e, sqlSessionFactory);
			}
		}
	}

	public static SqlSessionFactory getSqlSessionFactory(EnvironmentEnum env)
			throws IOException {
		init();
		return map.get(env);
	}
}
