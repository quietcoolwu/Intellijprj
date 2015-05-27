package com.immoc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct=new TryCatchTest();
		int result=tct.test();
		System.out.println("test执行完毕,返回值为"+result);
		int result2=tct.test2();
		System.out.println("test2执行完毕,返回值为"+result2);
		int result3=tct.test3();
		System.out.println("test3执行完毕,返回值为"+result3);
	
	}
/**
 * try-catch捕获while循环
 * 每次循环divider-1,result=result+100/divider
 * 捕获异常则打印,否则返回result
 * **/
	public int test(){
		int divider=1;
		int result=100;
		try{
			while(divider>-1){
				divider--;
				result=result+100/divider;
			}
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			return -1;
		}
		
	}
	
	
	
	public int test2(){
		/**
		 * try-catch捕获while循环
		 * 每次循环divider-1,result=result+100/divider
		 * 捕获异常则打印,否则返回result
		 * finally打印输出
		 * **/
		int divider=1;
		int result=100;
		try{
			while(divider>-1){
				divider--;
				result=result+100/divider;
			}
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			return result=999;
		}
		finally{
			System.out.println("这是finally哈哈");
			System.out.println("我是Result!我的值是"+result);
		}
		
	}
	
	public int test3(){
		/**
		 * try-catch捕获while循环
		 * 每次循环divider-1,result=result+100/divider
		 * 捕获异常则打印,否则返回result
		 * finally打印输出
		 * **/
		
		int divider=10;
		int result=100;
		try{
			while(divider>-1){
				divider--;
				result=result+100/divider;
			}
			//return 300;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			//return 500;
		}
		finally{
			System.out.println("这是finally哈哈");
			System.out.println("我是Result!我的值是"+result);
		}
		System.out.println("我是test3,运行完毕");
		return 1111;
	}
	
	
	
	
	
}
