package com.imooc;

public class Telphone {
	//����(��Ա����)��ʲô
	float screen;
	float cpu;
	float mem;
	int var=30;
	//����(��ʲô)
	void call(){
		int var=40;//����ȡ�ֲ�����
		int localVar=0;//�ֲ��������븳��ʼֵ,���Ա������ͬ
		//int localVar=0;һ��������ֲ������������ظ�����
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("Telphone��绰");
	}
	void sendMessage(){
		
	    int localVar=20;//ֻ��ͬ��,����ͬһ���ֲ�����
	    System.out.println("localVar:"+localVar);
	  
		//�˴�����localVarֻ����call����System.out.println("localVar:"+localVar);
		System.out.println("screen"+screen+"cpu:"+cpu+"mem:"+mem+"Telphone������");
	}
}
