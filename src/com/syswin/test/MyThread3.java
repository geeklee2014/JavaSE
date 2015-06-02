package com.syswin.test;

/*
 * 通过匿名内部类来实现接口对象
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
