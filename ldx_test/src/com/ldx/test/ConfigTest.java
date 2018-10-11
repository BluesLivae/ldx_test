package com.ldx.test;

import com.ldx.util.Config;
import com.ldx.util.ConfigFile;

public class ConfigTest {
	public static void main(String[] args) {
		if(ConfigFile.initConfig("iems_config.properties")){
			ConfigTest.process();
		}
	}
	
	public static void process(){
		System.out.println(Config.TEST_NAME);
	}
}
