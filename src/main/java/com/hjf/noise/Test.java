package com.hjf.noise;


import java.io.File;

/**
 * 该类的作用只是调用OCRHelper.recognizeText方法而已;没有去燥
 */
public class Test {
    public static void main(String[] args) {
        try {
            String relativePath = "\\src\\main\\resources\\two_weima\\tmp";
            //指定目录位置,里面装图片集合
            File testDataDir = new File(System.getProperty("user.dir")+relativePath);
            System.out.println(testDataDir.listFiles().length);
            int i = 0;
            for (File file : testDataDir.listFiles()) {
                String str = new OCRHelper().recognizeText(file);
                System.out.print(str + "\t");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
