/*
 * ȥ���ո�ͷָ�ܷ�����
 * String trim() ȥ�ո� �ַ������ߵĿո�
 * String[] split (string a) �ַ����ָ�  ��a�ָ��ַ��� �õ����ַ������� ��������鷵��
 * */

package cn.itheima.demo5;

public class Test01 {
	public static void main(String[] args) {
		String s="     asdfg    ";
		System.out.println(s);
		System.out.println(s.trim());
		
		
		String s2="aa,bb,b,cc,d";
		String[] arr=s2.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		System.out.println(s2);
	}

}
