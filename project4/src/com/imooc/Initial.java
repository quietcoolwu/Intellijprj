package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal obj1=new Animal();//父类引用可指向本类对象
//		Animal obj2=new Dog();//从父类指向子类
//		Animal obj3=new Cat();
//		//Dog obj3=new Animal();//不能从子类指向父类
//		obj1.eat();//指向Animal
//		obj2.eat();//指向dog,方法多态，因为public void eat重写了
//		obj3.eat();//打印动物能吃，是子类继承父类的方法
//		//obj2.watchDoor();//子类中独有的方法不能直接引用
	Dog dog=new Dog();
	Animal animal=dog;//自动类型提升
	if(animal instanceof Dog){
		Dog dog2=(Dog)animal;//向下类型转换(强制类型转换),有风险
		System.out.println("类型转换成功dog2");
	}
	else{
		System.out.println("无法类型转换dog2");
	}
	//按Cat类型编译,运行时出错,开辟的内存空间是Dog类型
	if(animal instanceof Cat){
		Cat cat=(Cat)animal;//指向类型根本不同,不用instanceconsole报错com.imooc.Dog cannot be cast to com.imooc.Cat
	}
	else{
		System.out.println("无法类型转换-cat");//打印结果,可见类型不同
	}
	
	}

}
