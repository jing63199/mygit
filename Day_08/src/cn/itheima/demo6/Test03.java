/*int[] arr = {1,2,3};����� [1, 2, 3]
 * 
 *  Sb  
 *  
 *  ����һ������  ʵ�� ����һ��ָ��������  ����һ�� SB���͵����� ���������ŵ�������ָ���ĸ�ʽ���ַ��� 
 *  �����б�:int[] arr
 *  ����ֵ����:  StringBuilder  ��ʽ���
 * 
 * */

package cn.itheima.demo6;

public class Test03 {
	public static void main(String[] args) {
		int[] arr={1,2,3};
		StringBuilder s=show(arr);
		System.out.println(s);
		
	}

	public static StringBuilder show(int[] arr){
		StringBuilder a=new StringBuilder();
		a.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				a.append(arr[i]).append(",");
			}else {
				a.append(arr[i]).append("]");
			}
			
			
		}
		
		
		
			return a;
	}
	

	
	
}
