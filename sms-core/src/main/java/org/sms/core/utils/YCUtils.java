package org.sms.core.utils;

public class YCUtils {
	public static double getTotal(double... itemCost) {
		double total = 0;
		for (double d : itemCost) {
			total += d;
		}
		return total;
	}
}
