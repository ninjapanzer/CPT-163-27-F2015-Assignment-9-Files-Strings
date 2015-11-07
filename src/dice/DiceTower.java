/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuraipanzer
 */
public class DiceTower {
  public static final int PANEL_COUNT = 3;
  private List<Die> dice;
  private int trayValue;

  public DiceTower() {
	this.trayValue = 0;
	this.dice = new ArrayList();
  }
  
  public DiceTower(List<Die> dice) {
	this.trayValue = 0;
	this.dice = dice;
  }
  
  public void addDice(Die die){
	this.dice.add(die);
  }
  
  public void dropDice(){
	for(int i = 0; i < DiceTower.PANEL_COUNT; i++){
	  for(Die die : this.dice){
		die.roll();
	  }
	}
	readTray();
  }
  
  public int getTrayValue(){
	return this.trayValue;
  }
  
  private void readTray(){
	for(Die die : this.dice){
	  this.trayValue += die.value();
	}
  }
}
