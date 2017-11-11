/*
 *  定义一个方法 可以接受一个 String类型的字符串,
 *   方法的内部对字符串进行返回 并把翻转之后的字符串以String类型返回 */

package cn.itheima.demo6;

public class Test04 {
	public static void main(String[] args) {
		String s="123478";
		String s1=change(s);
		System.out.println(s1);
		
	}
	public static String change(String s){
		//String转换成StringBuilder
		StringBuilder a=new StringBuilder (s);
		//翻转
		StringBuilder b=a.reverse();
		//StringBuilder转换成String
		String c=b.toString();
		
		return c;
			
		
		
	}
	
	
	
	
}
