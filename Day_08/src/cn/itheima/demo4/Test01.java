/*ת�����ܷ���
 * char[] toCharArray() ���ַ���ת����һ���ַ����鷵��
 * String toLowerCase() ���ַ���ת��Сд�ַ������أ������µ��ַ����Զ�ԭ��û��Ӱ��
 * String toUpperCase() ���ַ���ת�ɴ�д�ַ������أ��������ַ�����ԭ��û��Ӱ��
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
