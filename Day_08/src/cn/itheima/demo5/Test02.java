/*
 * String replaceAll(String a,String b)Ê¹ÓÃÌæ»»a
 * 
 * boolean contains(String a) ÅÐ¶Ï×Ö·û´®ÊÇ·ñ°üº¬a ÓÐ ture
 * */

package cn.itheima.demo5;

public class Test02 {
	public static void main(String[] args) {
		String s="aa,bb,v,b,d";
		String s1=s.replaceAll(",", ":");
		System.out.println(s);
		System.out.println(s1);
		String s2=s1.replaceAll(":", ",");
		System.out.println(s2);
		
		
		System.out.println("====================");
		String s4="hello0";
		System.out.println(s4.contains("b"));
				
		
		
		
	}

}
