package com.syswin.test;

/*
 * ͨ�������ڲ�����ʵ�ֽӿڶ���
 */

public class MyThread3
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("another thread started!");
			}
		}).start();
	}
}
