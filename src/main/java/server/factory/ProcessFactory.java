package server.factory;

import server.processor.Processor;

public class ProcessFactory {
	public static Processor getProcessor(String code)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Class<?> clazz = Processor.class.getClassLoader()
				.loadClass("server.processor.impl.ProcessorCode" + code);
		return (Processor) clazz.newInstance();
	}
}
