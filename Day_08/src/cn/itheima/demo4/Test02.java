/*
 * 键盘录入一个字符串， 把该字符串的首字母转成大写， 其余为小写。
 * "abcDeF"
 * */

package cn.itheima.demo4;

public class Test02 {
	public static void main(String[] args) {
		String s="abcDeF";
		String s1=s.substring(0,1);
		String s2=s.substring(1);
		String s3=s1.toUpperCase();
		String s4=s2.toLowerCase();
		String s5=s3+s4;
		System.out.println(s5);
		
		
		
		
		
	}

}
