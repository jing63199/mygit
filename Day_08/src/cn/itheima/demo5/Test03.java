/*
 * �������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 * 
 * int[] arr= {1,2,3}
 * [1, 2, 3]
 * ���巽��
 * ��������  ��ӡ ���������һ��Ԫ�ش�ӡ Ԫ��+�� �����ӡԪ��+]
 * ƴ�� 
 *  
 *  
 *  */

package cn.itheima.demo5;

public class Test03 {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		
		show(arr);
		
		
	}
	public static void show(int[] arr){
		String s="[";
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				s=s+arr[i]+"]";
				
			}else {
				s=s+arr[i]+",";
			}
		}
		
		System.out.println(s);
		
	}
	
	
}
