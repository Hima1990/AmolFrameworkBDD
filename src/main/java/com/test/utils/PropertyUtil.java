package com.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.test.customexceptions.FileNotFoundException;

public final class PropertyUtil {

	private PropertyUtil() {

	}

	private static Properties properties;

	public static Properties loadProperty(String filePath) {
		try {
			FileInputStream fileInputStream = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File could not be located", e.getCause());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}

}
