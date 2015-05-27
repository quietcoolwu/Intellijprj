package com.immoc.test;

public class ChainTest {
/**
 * test1():自定义异常
 * test2():调用test1()捕获上条异常
 * 在main()中调用test2(),尝试捕获test2()抛出的异常
 * @param args  根据caused by追踪异常链
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct=new ChainTest();
		try{
			ct.test2();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void test1() throws DrunkException{
		throw new DrunkException("喝你麻痹起来嗨");
	}
	
	public void test2(){
		try {
			test1();
		} 
		catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc=new RuntimeException(e);
			//newExc.initCause(e);
			throw newExc;
			
			//e.printStackTrace();
		}
	}

}
