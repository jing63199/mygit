
/*
 * 统计字符串中大写、 小写及数字字符个数
 * String s = "aA2bF4cG9de";
 *遍历字符串 
 *定义三个计数器  满足条件自增
 */
package cn.itheima.demo3;

public class Tset02 {
	public static void main(String[] args) {
		String s =new String("aA2bF4cG9de");
		int big=0;
		int small=0;
		int num=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) >='a' && s.charAt(i) <='z'){
				small++;
			}if(s.charAt(i)>='A'&&s.charAt(i)<='z'){
				big++;
			}if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				num++;
			}
			
		}
		
		System.out.println(small);
		System.out.println(big);
		System.out.println(num);
		
		
	}

}
