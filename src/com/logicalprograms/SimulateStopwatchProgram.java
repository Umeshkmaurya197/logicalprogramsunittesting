package com.logicalprograms;

import java.util.Timer;
import java.util.TimerTask;

public class SimulateStopwatchProgram {
	
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;
	
	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
	
		public void run() {
				milliseconds++;
				System.out.println(" "+hours+" : "+minutes+" : "+seconds+"  : "+milliseconds+" ms");
			    if(milliseconds >=999)
			    {	milliseconds=0;
			    	seconds++;
			    	if(seconds >= 59)
			    	{	seconds=0;
			    		minutes++;
			    		if(minutes >= 59)
			    		{	minutes=0;
			    			hours++;
			    		}
			    	}
			    }
		}
	};
	
	public void runTimer() {
		timer.scheduleAtFixedRate(task, 1, 1);
		
	}	
	public static void main(String[] args) {
		System.out.println(" ------ Welcome to Simulate Stopwatch Program ------- ");
	
		    SimulateStopwatchProgram simulateStopwatchProgram = new SimulateStopwatchProgram();
		    simulateStopwatchProgram.runTimer();
	}
}



