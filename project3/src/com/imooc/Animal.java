package com.imooc;

public class Animal extends Object {//�൱�ڼ̳�object
	public int age=10;//���Գ�ʼ��
	public String name;
	public void eat(){
		final int i=20;
		//i=20;
		System.out.println("�����ܳ�");
	}
	public Animal(){
		System.out.println("Animal��ִ����");//��ִ�и���Ĺ��췽��
		//age=20;//���췽����ʼ��
	}
//	public Animal(int age){
//		
//	}
}
