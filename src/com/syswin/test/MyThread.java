package com.syswin.test;

/*
 * ͨ���̳�Thread��ʵ�����߳�
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
