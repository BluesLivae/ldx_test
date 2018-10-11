package com.ldx.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/java/hello.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		InputStream is = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
	}
}
