package common.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

public class Config {
	public static String CHARSET = "UTF-8";

	public static int PORT = 9000;

	public static int WORKERS = 4;

	public static void init() throws FileNotFoundException, IOException,
			IllegalArgumentException, IllegalAccessException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(
				new File(Config.class.getResource("/").getPath()
						+ "config.properties")));
		Field[] fs = Config.class.getFields();
		String value = "";
		for (Field f : fs) {
			value = properties.getProperty(f.getName().toLowerCase());
			if (value != null && value.length() != 0) {
				switch (f.getType().toString()) {
					case "int" :
						f.setInt(null, Integer.valueOf(value));
						break;
					case "class java.lang.String" :
						f.set(null, value);
						break;
					default :
						f.set(null, value);
				}

			}
		}
		System.out.println("config initialized!");
	}

}
