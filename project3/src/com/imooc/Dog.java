package com.imooc;

public class Dog extends Animal {
//���Animal�����������������д����
	public int age=20;
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	public Dog(){
		//super();//�˴�д��дЧ��һ����Ϊ��ʽ���ã�һ����ʽ�����ŵ����๹�췽���ڵĵ�һ��
		System.out.println("Dog��ִ����");
		//super();
		//System.out.println("����"+age+"�����ԳԶ���");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	public void method(){
		super.eat();  //���ø��෽��
		System.out.println(super.age);//���ø�������
	}
}
