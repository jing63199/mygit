package cn.itheima.demo7;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("老黑", 18);
		System.out.println(p1);
		test01(p1);

		System.out.println("========================");
		Person p3 = makeKid();
		System.out.println(p3);
		System.out.println(p3.getName());

	}

	public static Person makeKid() {

		Person p = new Person("老李", 3);
		System.out.println(p);
		return p;
	}

	public static void test01(Person p) {
		System.out.println(p);
		System.out.println("接受到的对象 的 name值是 : " + p.getName());

	}}
