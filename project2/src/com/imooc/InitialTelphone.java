package com.imooc;
import com.imooc.Telphone; //����second��ʱ����Ҫע�ʹ���������
public class InitialTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޲ι��췽����������
		Telphone phone=new Telphone();
		//���β������Դ������󻹿��Ը���ֵ
		Telphone phone2= new Telphone(1.5f,1.4f,2.0f);
		//phone2.cpu=6.0f;//private�²���ֱ�ӷ���
		phone2.setScreen(6.0f);
		System.out.println("��Ļ��СΪ:"+phone2.getScreen());
	}

}
