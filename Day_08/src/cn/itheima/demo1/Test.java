/*
 * API文档   应用程序编程接口
 * 1.打开文件 找到搜索框
 * 2.输入要查找的类
 * 3.查看包   只有java.lang包使用时不用导包
 * 4.查看类的介绍
 * 5.查看构造方法
 * 6.查看功能 成员方法
 * 
 * 
 * */




package cn.itheima.demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入数字：");
		int a=sc.nextInt();
		System.out.println("接收到的数字是："+a);
		System.out.println("请输入字符串：");
		//String s=sc.next(); 如果输入的字符串有空格  则只输入空格之前的内容
		String s=sc.nextLine();//使用sc.nextLine 解决空格问题
		System.out.println("接受到的字符串是："+s);
		//如果用sc.nextLine 弊端  前面有输入数字  则注意！！
		/*	请输入数字：
              1
  			接收到的数字是：1
			请输入字符串：
			接受到的字符串是：
		 * */
		//注意 next 和nextLine的使用
		
	}
	
	
	
	
	

}
