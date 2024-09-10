package com.tcet;
class NumberPrinter implements Runnable{
	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}

public class qn2 {
	public static void main(String[] args) {
		Runnable numberPrinter=new NumberPrinter();
		Thread thread=new Thread(numberPrinter);
		thread.start();
	}

}
