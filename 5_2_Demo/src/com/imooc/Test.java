package com.imooc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APerson p=new Chinese();//Person类制定规则,可换成抽象类APerson
		APerson p2=new American();//使用多态
		p.say();
		p2.say();
	}

}
