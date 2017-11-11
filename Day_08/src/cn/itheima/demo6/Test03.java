/*int[] arr = {1,2,3};结果： [1, 2, 3]
 * 
 *  Sb  
 *  
 *  定义一个方法  实现 接受一个指定的数组  返回一个 SB类型的容器 容器里面存放的内容是指定的格式的字符串 
 *  参数列表:int[] arr
 *  返回值类型:  StringBuilder  链式编程
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
