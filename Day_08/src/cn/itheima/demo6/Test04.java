/*
 *  ����һ������ ���Խ���һ�� String���͵��ַ���,
 *   �������ڲ����ַ������з��� ���ѷ�ת֮����ַ�����String���ͷ��� */

package cn.itheima.demo6;

public class Test04 {
	public static void main(String[] args) {
		String s="123478";
		String s1=change(s);
		System.out.println(s1);
		
	}
	public static String change(String s){
		//Stringת����StringBuilder
		StringBuilder a=new StringBuilder (s);
		//��ת
		StringBuilder b=a.reverse();
		//StringBuilderת����String
		String c=b.toString();
		
		return c;
			
		
		
	}
	
	
	
	
}
