package com.imooc;

public class InitialTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone=new Telphone();
		phone.sendMessage();
		//��ʵ��������ֵ
		phone.screen=5.0f;
		phone.cpu=1.4f;
		phone.mem=2.0f;
		phone.sendMessage();
		phone.call();
	}

}
