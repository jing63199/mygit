/*
 * �жϹ���
 *  boolean equals(Object obj) �Ƚ������ַ��������Ƿ����
 *  boolean equalsIgnoreCase(String s) �Ƚ������ַ��������Ƿ���� ���Դ�Сд
 *  boolean startsWith(String s) �ж��ַ����Ƿ���s��ͷ
 *  boolean endsWith(String a)  �ж��ַ����Ƿ���a��β
 * 
 * 
 * */



package cn.itheima.demo2;

public class Test1 {
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="hello";
		String s3="HellO";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false		
		System.out.println(s1.equalsIgnoreCase(s2));//true		
		System.out.println(s1.equalsIgnoreCase(s3));//true	
		System.out.println("========================");
		
		String s4=new String("nihao");
		System.out.println(s4.startsWith("n"));
		System.out.println(s4.startsWith("nih"));
		System.out.println(s4.startsWith("ih"));
		System.out.println(s4.endsWith("o"));
		System.out.println(s4.endsWith("ao"));
		System.out.println(s4.endsWith("aoo"));
		
		
		
	}

}
