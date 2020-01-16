package net.alkalus.debug.core;

public class Logger {

	public static void INFO(String aLog) {
		System.out.println("[Alk-Debug][Info] "+aLog);
	}
	public static void WARNING(String aLog) {
		System.out.println("[Alk-Debug][Warn] "+aLog);
	}
	public static void ERROR(String aLog) {
		System.out.println("[Alk-Debug][Error] "+aLog);
	}
	
}
