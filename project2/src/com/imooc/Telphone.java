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


	public Telphone(){ //�޲ι���
		System.out.println("com.imooc.Telphone�޲ι���ִ��");
	}
	
	
	public Telphone(float newScreen,float newCpu,float newMem) {//��new��Ϊ����
	if(newScreen<3.5f){
		System.out.println("�������������,�Զ���ֵ");
		screen=3.5f;
	}
	else{
	screen=newScreen;
	}
	cpu=newCpu;
	mem=newMem;
	System.out.println("�в�ִ��");
	}
}
