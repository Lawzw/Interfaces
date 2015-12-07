package demo;

import java.lang.*;
import java.util.Scanner;
/*
 * 使用scanner工具类来获取用户输入的成绩信息
 * scanner类位于java.util包中，使用时需导入此包
 * 步骤：
 * 1、导入java.util.Scanner
 * 2、创建Scanner对象
 * 3、接收并保存用户输入的值
 */
public class Demo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//创建Scanner对象
		System.out.print("请输入用户成绩信息：");
		int score=input.nextInt();//获取用户输入的数据并保存在变量中
		int count=0;
		System.out.println("修改前成绩："+score);
		while(score<60){
			score+=1;
			count++;
		}
		System.out.println("修改后成绩："+score);
		System.out.println("修改次数："+count);
	}
}