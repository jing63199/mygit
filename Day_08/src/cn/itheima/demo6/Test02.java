/*
 * StringBuilder �洢���ݷ���
 * public StringBuilder append(��������)
 * 1.�洢������������  2.������ַ�����ʽ 3.����ֵ���ǵ��ú�ģ���ʽ��̣�
 * ������ֵ���ظ�ԭ����
 * public StringBuilder reveres ��ת�ַ���  ��ת�Լ�
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
