package com.aomruk.helloWorld;

class SwitchCase {
	public static void main(String[] args) { 
		int score = 70;
		String grade= "";
		switch(score) {
		case 80:
			grade = "A";break;
		case 70:
			grade = "B";break;
		case 60:
			grade = "C";break;
		case 50:
			grade = "D";break;
		case 40:
			grade = "F";break;
		default:
			grade = "E";
		}
		System.out.print(grade);
	}
}