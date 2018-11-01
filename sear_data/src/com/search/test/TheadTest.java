package com.search.test;

class ThreadC extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i < 10; i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}

public class TheadTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new ThreadC();
		t1.start();
		t1.join();
		for(int i =0; i < 100; i++){
			System.out.println("main 线程执行");
		}
	}
}
