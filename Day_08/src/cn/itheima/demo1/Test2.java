/* String 构造方法
 *  1.public String(String s)     String s1=new String(给出的字符串)
 * 	2.public String(char[] s)     String s1= new String(给出的字符数组)
 * 	3.public String(char[] s,int a,int b) 通过字符数组的部分来创建字符串对象，从索引a开始，持续b个
 * 	 String s1=new String(字符组成的数组，a，b)
 * 4.直接赋值
 *  String="字符串"
 * 
 * 
 * */


package cn.itheima.demo1;

public class Test2 {
	public static void main(String[] args) {
		//创建字符串对象
		String s1=new String("nihaoya!");
		System.out.println(s1);
		System.out.println("==============");
		char[] arr={'n','i','h','a','o','y','a','!'};
		String s2=new String(arr);
		System.out.println(s2);
		System.out.println("==============");
		//string 从h到y
		String s3=new String(arr,2,4);
		System.out.println(s3);
		//从n到o
		String s4=new String(arr,0,5);
		System.out.println(s4);
		String s5="nihaiyao!";
		System.out.println(s5);
		
	}
	
	
	

}
