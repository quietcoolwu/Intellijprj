package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal obj1=new Animal();//�������ÿ�ָ�������
//		Animal obj2=new Dog();//�Ӹ���ָ������
//		Animal obj3=new Cat();
//		//Dog obj3=new Animal();//���ܴ�����ָ����
//		obj1.eat();//ָ��Animal
//		obj2.eat();//ָ��dog,������̬����Ϊpublic void eat��д��
//		obj3.eat();//��ӡ�����ܳԣ�������̳и���ķ���
//		//obj2.watchDoor();//�����ж��еķ�������ֱ������
	Dog dog=new Dog();
	Animal animal=dog;//�Զ���������
	if(animal instanceof Dog){
		Dog dog2=(Dog)animal;//��������ת��(ǿ������ת��),�з���
		System.out.println("����ת���ɹ�dog2");
	}
	else{
		System.out.println("�޷�����ת��dog2");
	}
	//��Cat���ͱ���,����ʱ����,���ٵ��ڴ�ռ���Dog����
	if(animal instanceof Cat){
		Cat cat=(Cat)animal;//ָ�����͸�����ͬ,����instanceconsole����com.imooc.Dog cannot be cast to com.imooc.Cat
	}
	else{
		System.out.println("�޷�����ת��-cat");//��ӡ���,�ɼ����Ͳ�ͬ
	}
	
	}

}
