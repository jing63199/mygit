/*String Builder 是一个容器 可以存放字符串  可以改变
 * 构造方法
 * StringBuilder() 创建了一个容量为16的容器 没有字符串
 * StringBuilder 常见方法
 * public int capacity() 获取容量的最大值
 * public inroadlength() 字符的个数
 *
 * */

package cn.itheima.demo6;

public class Test01 {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder();
		System.out.println(a.capacity());//16
		System.out.println(a.length());//0
		
		
	}

}
