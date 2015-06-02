package com.syswin.test;

/*
 * 通过继承Thread类实现子线程
 */


public class MyThread extends Thread
{
	@Override
	public void run()
	{
		super.run();
		System.out.println("new thread started");
	}
	public static void main(String[] args)
	{
		new MyThread().start();
	}
}
