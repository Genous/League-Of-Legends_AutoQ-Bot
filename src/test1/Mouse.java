package test1;

import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Mouse {
	public static void main(String[] args) throws Exception{
		
		Robot robot = new Robot();
		robot.delay(3000);
		robot.mouseMove(675,50);	//Play
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		
		robot.mouseMove(415,175);	//Co-op
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		
		robot.mouseMove(520,140);	//Classic
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		
		robot.mouseMove(750,140);	//Summoner's Rift
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		
		robot.mouseMove(940,175);	//Beginner Bots
		
		//robot.mouseMove(940,200);	//Intermediate Bots
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		
		robot.mouseMove(825,650);	//Match me up with teammates
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
        
        Color acceptButtomColor = robot.getPixelColor(1,1);
        Color champSelectColor = robot.getPixelColor(1,1);
        Color topBar = robot.getPixelColor(477,37);
        Color topBarGreyed = robot.getPixelColor(477,37);
        Color gameStartedBlack = Color.blue;
	
		//680,375		White loading circle in the accept/decline menu.
		
		
        while( gameStartedBlack != Color.black){
        
	        while(champSelectColor.getRed() != 221 && champSelectColor.getGreen() != 88 && champSelectColor.getBlue() != 6 && (topBar.getRed() == 6 || topBarGreyed.getRed() == 3) && (topBar.getGreen() == 21 || topBarGreyed.getGreen() == 10) && (topBar.getBlue() == 26 || topBarGreyed.getBlue() == 13)){    //scanning for Champion select screen and top blue bar
				champSelectColor = robot.getPixelColor(600,410);
	            
			
				while( acceptButtomColor.getRed() != 14 && acceptButtomColor.getBlue() != 73 && acceptButtomColor.getGreen() != 40 && (topBar.getRed() == 6 || topBarGreyed.getRed() == 3) && (topBar.getGreen() == 21 || topBarGreyed.getGreen() == 10) && (topBar.getBlue() == 26 || topBarGreyed.getBlue() == 13)){	//Scanning for accept buttom
					acceptButtomColor = robot.getPixelColor(600, 415);
		            topBar = robot.getPixelColor(477,37);
		            topBarGreyed = robot.getPixelColor(477,37);
				}
			
				if( acceptButtomColor.getRed() == 14 && acceptButtomColor.getBlue() == 73 && acceptButtomColor.getGreen() == 40){
		        robot.mouseMove(600, 415);		//Press Accept
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
		        }
			}
			
			champSelectColor = robot.getPixelColor(600,410);
			
			if(champSelectColor.getRed() == 221 && champSelectColor.getGreen() == 88 && champSelectColor.getBlue() == 6){
				robot.delay(1000);
				robot.mouseMove(970,125);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyPress(KeyEvent.VK_K);
				robot.keyPress(KeyEvent.VK_A);
				robot.delay(1000);
				
				robot.mouseMove(400,190);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
			}
			
			while(champSelectColor.getRed() == 221 && champSelectColor.getGreen() == 88 && champSelectColor.getBlue() == 6 ){
				
				champSelectColor = robot.getPixelColor(600,410);
			}
        }
	}
}