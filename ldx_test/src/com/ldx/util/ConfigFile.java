package com.ldx.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;



public class ConfigFile {
	private static Properties props = new Properties();

	public static boolean initConfig(String fileName) {
		return getFile(fileName);
	}

	private static boolean getFile(String fileName) {
		if (fileName == null) {
			return false;
		}
		InputStream inStream = ConfigFile.class.getClassLoader().getResourceAsStream(fileName);
		try {
			props.load(inStream);
			Iterator<Map.Entry<Object, Object>> iterator = props.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<Object, Object> entry = iterator.next();
			}
			return true;
		} catch (IOException e) {
		} finally {
			try {
				if (inStream != null) {
					inStream.close();
				}
			} catch (IOException e) {
			}
		}
		return false;
	}

	public static boolean isNull(String key) {
		return props.get(key) == null ? true : false;
	}

	public static String getString(String key) {
		if (isNull(key))
			return null;
		else
			return (String) props.get(key);
	}

	public static String getString(String key, String def) {
		if (isNull(key))
			return def;
		else
			return (String) props.get(key);
	}

	public final static int getInt(String key, int initValue) {
		int result = initValue;
		if (!isNull(key)) {
			try {
				result = Integer.parseInt(props.getProperty(key));
			} catch (Exception e) {
				result = initValue;
			}
		}
		return result;
	}

	public final static long getLong(String key, long initValue) {
		long result = initValue;
		if (!isNull(key)) {
			try {
				result = Long.parseLong(props.getProperty(key));
			} catch (Exception e) {
				result = initValue;
			}
		}
		return result;
	}

	public final static float getFloat(String key, float initValue) {
		float result = initValue;
		if (!isNull(key)) {
			try {
				result = Float.parseFloat(props.getProperty(key));
			} catch (Exception e) {
				result = initValue;
			}
		}
		return result;
	}

	public final static double getDouble(String key, double initValue) {
		double result = initValue;
		if (!isNull(key)) {
			try {
				result = Double.parseDouble(props.getProperty(key));
			} catch (Exception e) {
				result = initValue;
			}
		}
		return result;
	}
	
	public final static boolean getBoolean(String key, int initValue) {
		boolean result = getBooleanByInt(initValue);
		if (!isNull(key)) {
			try {
				int tempValue = Integer.parseInt(props.getProperty(key));
				result = getBooleanByInt(tempValue);
			} catch (Exception e) {
			}
		}
		return result;
	}
	private static boolean getBooleanByInt(int value){
		if(value == 0){
			return Boolean.FALSE;
		}else{
			return Boolean.TRUE;
		}
	}
}
