package com.imooc;

public class Telphone {
	private float cpu;
	private float screen;
	private float mem;
	public float getScreen(){
		return screen;
	}
	public void setScreen(float newScreen){
		screen=newScreen;
	}
	
//	public void sendMessage() {
//		System.out.println("sendMessage");
//	}
//	public float getCpu() {
//		return cpu;
//	}
//
//
//	public void setCpu(float cpu) {
//		this.cpu = cpu;
//	}
//
//
//	public float getScreen() {
//		return screen;
//		this.sendMessage();
//	}
//
//
//	public void setScreen(float screen) {
//		this.screen = screen;
//	}
//
//
//	public float getMem() {
//		return mem;
//	}
//
//
//	public void setMem(float mem) {
//		this.mem = mem;
//	}


	public Telphone(){ //无参构造
		System.out.println("com.imooc.Telphone无参构造执行");
	}
	
	
	public Telphone(float newScreen,float newCpu,float newMem) {//带new的为参数
	if(newScreen<3.5f){
		System.out.println("输入参数有问题,自动赋值");
		screen=3.5f;
	}
	else{
	screen=newScreen;
	}
	cpu=newCpu;
	mem=newMem;
	System.out.println("有参执行");
	}
}
