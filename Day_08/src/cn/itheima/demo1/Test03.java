/* 判断方法
 * 通过构造方法创建的字符串对象 是先经过堆区 在到常量池
 * 直接赋值创建的对象 直接到了常量池中
 * 基本类型数据比较 比较值
 * 引用类型数据比较   地址编码
 * 
 * 
 * */


package cn.itheima.demo1;

public class Test03 {
	public static void main(String[] args) {
		String s=new String("hello");
		String s1="hello";
		String s2="hello";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s==s1);//false
		System.out.println(s1==s2);//true
		
		
		
	}

}
