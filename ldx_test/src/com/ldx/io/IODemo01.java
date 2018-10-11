package com.ldx.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *	使用BufferedReader在控制台读取字符 
 */
public class IODemo01 {
	public static void main(String[] args) throws IOException{
		char c;
		String str;
		//使用System.in 创建BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q'键退出。");
		//读取字符
		do {
//			c = (char) br.read();
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("end"));
	}
}
