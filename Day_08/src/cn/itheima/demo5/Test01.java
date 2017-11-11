/*
 * 去除空格和分割功能方法：
 * String trim() 去空格 字符串两边的空格
 * String[] split (string a) 字符串分割  用a分割字符串 得到了字符串数组 把这个数组返回
 * */

package cn.itheima.demo5;

public class Test01 {
	public static void main(String[] args) {
		String s="     asdfg    ";
		System.out.println(s);
		System.out.println(s.trim());
		
		
		String s2="aa,bb,b,cc,d";
		String[] arr=s2.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println(s2);
	}

}
