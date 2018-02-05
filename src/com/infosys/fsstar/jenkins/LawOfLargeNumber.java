package com.infosys.fsstar.jenkins;

public class LawOfLargeNumber {

	public static void main(String[] args) {
		int counter= 1000000;
		int max = 100;
		int maxHalf = max / 2;
		int random  ;
		int firstHalf = 0 ;
		int secondHalf = 0 ;
		
		for(int i = 0; i <counter; i++ ){
			random =  getRandom(max);
			if (random <= maxHalf){
				firstHalf++;
			}
			else {
				secondHalf++;
			}
		}
		
		System.out.println("firstHalf: " + firstHalf);
		System.out.println("secondHalf: " + secondHalf);
		System.out.println("Diff: " + (100 - (firstHalf * 100 / secondHalf)));

	}
	
	public static int getRandom(int max){ 
		// return (int) (Math.random()*max); 
		//incorrect always return zero 
		return (int) (Math.random()*max); 
	}
	
}
