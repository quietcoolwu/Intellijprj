package com.imooc;

public class Smartphone extends Telephone implements IPlayGame {//实现接口

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("语音拨号");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("语音短信");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("智能手机玩游戏");
	}

}
