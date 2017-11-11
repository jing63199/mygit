/*String s=new String("hello")
 * String 获取功能
 * int 整型 length() 获取字符串的长度 个数 s.length()
 * char 字符型  charAt(int index) 获取指定的索引的字符  s.charAt(0)
 * int 整型 indexOf(String str) 获取str在字符串第一次出现的索引 没有返回-1
 * String 字符串 substring(int a) 获取从a指的索引值截取到字符串结尾，对原字符串没有影响
 * String 字符串 substring(int a,intb)获取从a指的索引值到b值的索引值不包括b的值
 * 
 * 
 * */


package cn.itheima.demo2;

public class Test02 {
	public static void main(String[] args) {
		String s1=new String ("hello");
		System.out.println(s1.length());
		//获取指定索引的字符
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(0));
		//获取字符所对应的索引
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("he"));
		
		//获取从a指的索引值截取到字符串结尾
		System.out.println(s1.substring(2));
		
		//获取从a指的索引值到b值的索引值不包括b的值
		
		System.out.println(s1.substring(1, 4));
		
		
		
		
	}
	
	
	

}
