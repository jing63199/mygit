/*
 * API�ĵ�   Ӧ�ó����̽ӿ�
 * 1.���ļ� �ҵ�������
 * 2.����Ҫ���ҵ���
 * 3.�鿴��   ֻ��java.lang��ʹ��ʱ���õ���
 * 4.�鿴��Ľ���
 * 5.�鿴���췽��
 * 6.�鿴���� ��Ա����
 * 
 * 
 * */




package cn.itheima.demo1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//����¼��һ���ַ���
		Scanner sc= new Scanner(System.in);
		System.out.println("���������֣�");
		int a=sc.nextInt();
		System.out.println("���յ��������ǣ�"+a);
		System.out.println("�������ַ�����");
		//String s=sc.next(); ���������ַ����пո�  ��ֻ����ո�֮ǰ������
		String s=sc.nextLine();//ʹ��sc.nextLine ����ո�����
		System.out.println("���ܵ����ַ����ǣ�"+s);
		//�����sc.nextLine �׶�  ǰ������������  ��ע�⣡��
		/*	���������֣�
              1
  			���յ��������ǣ�1
			�������ַ�����
			���ܵ����ַ����ǣ�
		 * */
		//ע�� next ��nextLine��ʹ��
		
	}
	
	
	
	
	

}
