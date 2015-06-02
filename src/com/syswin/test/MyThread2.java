package com.syswin.test;
/*
 * 通过实现接口,生成对口对象来完成对子线程的实现
 */
public class MyThread2 implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("a new thread started!");
	}
	public static void main(String[] args)
	{
		MyThread2 myThread2 = new MyThread2();
		new Thread(myThread2).start();
	}

}
