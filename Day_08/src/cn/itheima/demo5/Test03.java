/*
 * 把数组中的数据按照指定格式拼接成一个字符串
 * 
 * int[] arr= {1,2,3}
 * [1, 2, 3]
 * 定义方法
 * 遍历数组  打印 当不是最好一个元素打印 元素+， 否则打印元素+]
 * 拼接 
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
