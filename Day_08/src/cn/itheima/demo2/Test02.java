/*String s=new String("hello")
 * String ��ȡ����
 * int ���� length() ��ȡ�ַ����ĳ��� ���� s.length()
 * char �ַ���  charAt(int index) ��ȡָ�����������ַ�  s.charAt(0)
 * int ���� indexOf(String str) ��ȡstr���ַ�����һ�γ��ֵ����� û�з���-1
 * String �ַ��� substring(int a) ��ȡ��aָ������ֵ��ȡ���ַ�����β����ԭ�ַ���û��Ӱ��
 * String �ַ��� substring(int a,intb)��ȡ��aָ������ֵ��bֵ������ֵ������b��ֵ
 * 
 * 
 * */


package cn.itheima.demo2;

public class Test02 {
	public static void main(String[] args) {
		String s1=new String ("hello");
		System.out.println(s1.length());
		//��ȡָ���������ַ�
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(0));
		//��ȡ�ַ�����Ӧ������
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("he"));
		
		//��ȡ��aָ������ֵ��ȡ���ַ�����β
		System.out.println(s1.substring(2));
		
		//��ȡ��aָ������ֵ��bֵ������ֵ������b��ֵ
		
		System.out.println(s1.substring(1, 4));
		
		
		
		
	}
	
	
	

}
