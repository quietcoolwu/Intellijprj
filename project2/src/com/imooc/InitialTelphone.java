package com.imooc;
import com.imooc.Telphone; //换成second包时则需要注释带参数部分
public class InitialTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//无参构造方法创建对象
		Telphone phone=new Telphone();
		//带参不仅可以创建对象还可以赋初值
		Telphone phone2= new Telphone(1.5f,1.4f,2.0f);
		//phone2.cpu=6.0f;//private下不能直接访问
		phone2.setScreen(6.0f);
		System.out.println("屏幕大小为:"+phone2.getScreen());
	}

}
