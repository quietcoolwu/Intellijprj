package com.imooc;

public class Smartphone extends Telephone implements IPlayGame {//ʵ�ֽӿ�

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ�����Ϸ");
	}

}
