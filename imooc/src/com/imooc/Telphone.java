package com.imooc;

public class Telphone {
	//属性(成员变量)有什么
	float screen;
	float cpu;
	float mem;
	int var=30;
	//方法(干什么)
	void call(){
		int var=40;//优先取局部变量
		int localVar=0;//局部变量必须赋初始值,与成员变量不同
		//int localVar=0;一个方法里局部变量不允许重复声明
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("Telphone打电话");
	}
	void sendMessage(){
		
	    int localVar=20;//只是同名,不是同一个局部变量
	    System.out.println("localVar:"+localVar);
	  
		//此处错误localVar只能在call中用System.out.println("localVar:"+localVar);
		System.out.println("screen"+screen+"cpu:"+cpu+"mem:"+mem+"Telphone发短信");
	}
}
