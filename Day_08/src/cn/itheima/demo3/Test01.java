/*字符串的遍历
 * 
 * 
 * */


package cn.itheima.demo3;

public class Test01 {
	public static void main(String[] args) {
		String s=new String("abfdsgf");
		//之前的方法
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println("===============");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
		
		
	}

}
