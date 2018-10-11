package com.ldx.io;

import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
        characters();  
	}
	private static void characters() {
        try {
            FileReader fr = new FileReader("Demo.txt");
            char[]  buf = new char[6];
            //将Denmo中的文件读取到buf数组中。
            int num = 0;
            while((num = fr.read(buf))!=-1) {
                //String(char[] value , int offest,int count) 分配一个新的String,包含从offest开始的count个字符
                sop(new String(buf,0,num));
            }
            sop('\n');
            fr.close();
        }
        catch (IOException e) {
            sop(e.toString());
        }
    }
	
	private static void sop(Object obj) {
        System.out.print(obj);
    }
}
