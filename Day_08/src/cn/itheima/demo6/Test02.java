/*
 * StringBuilder 存储数据方法
 * public StringBuilder append(任意类型)
 * 1.存储任意类型数据  2.结果是字符串形式 3.返回值的是调用后的（链式编程）
 * 会把这个值返回给原来的
 * public StringBuilder reveres 翻转字符串  翻转自己
 * 
 * */

package cn.itheima.demo6;

public class Test02 {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder();
		/*a.append("nihao");
		a.append("c");
		a.append("15");
		System.out.println(a);*/
		a.append("nihao").append("c").append("15");
		System.out.println(a);
		
		StringBuilder s=a.reverse();
		System.out.println(s);
		
		
		
		
		
	}

}
