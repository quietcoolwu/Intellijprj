package com.imooc;

public class Animal extends Object {//相当于继承object
	public int age=10;//属性初始化
	public String name;
	public void eat(){
		final int i=20;
		//i=20;
		System.out.println("动物能吃");
	}
	public Animal(){
		System.out.println("Animal类执行了");//先执行父类的构造方法
		//age=20;//构造方法初始化
	}
//	public Animal(int age){
//		
//	}
}
