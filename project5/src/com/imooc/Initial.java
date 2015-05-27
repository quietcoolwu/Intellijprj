package com.imooc;

//import javax.xml.ws.handler.MessageContext;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tel1=new Cellphone();
		tel1.call();
		tel1.message();
		Telephone tel2=new Smartphone();
		tel2.call();
		tel2.message();
		//接口引用
		IPlayGame ip1=new Smartphone();
		ip1.playGame();
		IPlayGame ip2=new PSP();
		ip2.playGame();
		
		IPlayGame ip3=new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("用匿名内部类实现接口");
			}
		};//系统自动生成
		ip3.playGame();
		//方法2
		new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("方法2:用匿名内部类实现接口");
			}
		}.playGame();
		
		
	}

}
