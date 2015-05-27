package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		System.out.println("animal age: "+animal.age);//输出20说明属性初始化先执行
		Dog dog= new Dog();
		dog.age=15;
		Dog dog2=new Dog();
		dog2.age=15;
		if(dog.equals(dog2)){//equals方法
			System.out.println("两个对象相同");
		}
		else{
			System.out.println("两个对象不同");
		}
		dog.method();
		System.out.println(dog);//输出对象地址
//		dog.age=10;  //无法调用private
//		dog.name="xiaotian";
//		dog.eat();  //dog可以调用animal的属性和方法
	}

}
