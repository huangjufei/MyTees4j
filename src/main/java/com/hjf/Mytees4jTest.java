package com.hjf;

import java.io.File;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;


/**
 * tess4j 找不模板使用这个链接,helloworld 也是这个链接
	http://tess4j.sourceforge.net/usage.html
 *
 */
public class Mytees4jTest {

	

public static void main(String[] args) throws TesseractException {
	

		ITesseract instance = new Tesseract1();
		File tessDataFolder = LoadLibs.extractTessResources("tessdata");
		// 如果未将tessdata放在根目录下需要指定绝对路径
		// instance.setDatapath("the absolute path of tessdata");
		instance.setDatapath(tessDataFolder.getAbsolutePath());
		// 我们需要指定识别语种
	
		instance.setLanguage("zwp");//中文库识别中文
		//instance.setLanguage("eng");//英文库识别数字比较准确
		// 指定识别图片
		File imgDir = new File("d:"+File.separator+"13.png");
		long startTime = System.currentTimeMillis();
		String ocrResult = instance.doOCR(imgDir);
		// 输出识别结果
		System.out.println(ocrResult);

	}
	
	
	

}
