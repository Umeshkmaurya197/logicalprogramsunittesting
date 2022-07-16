package com.logicalprograms;

import java.util.Date;
								//Not Working 
public class StopWatch {
	long startTime = 0;
	long endTime = 0;
	boolean flag = false;
	long elapsedTime = 0;
	Date dt=new Date(); 

	public void start() {
		startTime = System.currentTimeMillis();
		flag=true;
		System.out.println("Start Time : "+startTime/1000);
	}
	public void stop() {
		
		endTime = System.currentTimeMillis();
		flag = false;
		System.out.println("End Time : "+endTime/1000);
		
	}
	public long getElapsedTime() {
		if(flag)
				elapsedTime = ((System.currentTimeMillis()-startTime )/1000);
		else
			elapsedTime = (endTime - startTime)/1000;
				
		System.out.println("Elapsed Time : "+elapsedTime);
		return elapsedTime;
	}
	
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		sw.stop();
		sw.getElapsedTime();
	}


}
