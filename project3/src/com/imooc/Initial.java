package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Animal();
		System.out.println("animal age: "+animal.age);//���20˵�����Գ�ʼ����ִ��
		Dog dog= new Dog();
		dog.age=15;
		Dog dog2=new Dog();
		dog2.age=15;
		if(dog.equals(dog2)){//equals����
			System.out.println("����������ͬ");
		}
		else{
			System.out.println("��������ͬ");
		}
		dog.method();
		System.out.println(dog);//��������ַ
//		dog.age=10;  //�޷�����private
//		dog.name="xiaotian";
//		dog.eat();  //dog���Ե���animal�����Ժͷ���
	}

}
