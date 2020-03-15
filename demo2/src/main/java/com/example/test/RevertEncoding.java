package com.example.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class RevertEncoding {

    public static void main(String[] args) throws IOException {

        Properties initProp = new Properties(System.getProperties());

        String encode = initProp.getProperty("file.encoding");

        System.out.println("当前系统编码:" + initProp.getProperty("file.encoding"));

        String a = "韩";

        System.out.println(a.getBytes().length);

        String gbkString = new String(a.getBytes(), "GBK");

        System.out.println(gbkString.getBytes("GBK").length);

        File filePath = new File("D:\\testFile\\");

        if (!filePath.exists()) {
            filePath.mkdirs();
        }

        File file = new File(filePath,"aaa.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(gbkString);

        fileWriter.flush();

        fileWriter.close();

    }

}
