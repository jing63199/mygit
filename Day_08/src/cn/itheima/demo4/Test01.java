/*转换功能方法
 * char[] toCharArray() 把字符串转换成一个字符数组返回
 * String toLowerCase() 把字符串转成小写字符串返回，产生新的字符串对对原来没有影响
 * String toUpperCase() 把字符串转成大写字符串返回，产生的字符串对原来没有影响
 * 
 * 
 * */

package cn.itheima.demo4;

public class Test01 {
	public static void main(String[] args) {
		String s=new String("hello");
		char[] arr=s.toCharArray();
		System.out.println(arr[0]);
		String s2="heolloWorld";
		char[] arr1=s2.toCharArray();
		System.out.println(arr1[6]);
		System.out.println("================");
		String s3="NihAoMa";
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		
	}

}
