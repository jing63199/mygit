/* String ���췽��
 *  1.public String(String s)     String s1=new String(�������ַ���)
 * 	2.public String(char[] s)     String s1= new String(�������ַ�����)
 * 	3.public String(char[] s,int a,int b) ͨ���ַ�����Ĳ����������ַ������󣬴�����a��ʼ������b��
 * 	 String s1=new String(�ַ���ɵ����飬a��b)
 * 4.ֱ�Ӹ�ֵ
 *  String="�ַ���"
 * 
 * 
 * */


package cn.itheima.demo1;

public class Test2 {
	public static void main(String[] args) {
		//�����ַ�������
		String s1=new String("nihaoya!");
		System.out.println(s1);
		System.out.println("==============");
		char[] arr={'n','i','h','a','o','y','a','!'};
		String s2=new String(arr);
		System.out.println(s2);
		System.out.println("==============");
		//string ��h��y
		String s3=new String(arr,2,4);
		System.out.println(s3);
		//��n��o
		String s4=new String(arr,0,5);
		System.out.println(s4);
		String s5="nihaiyao!";
		System.out.println(s5);
		
	}
	
	
	

}
