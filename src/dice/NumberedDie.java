/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author samuraipanzer
 */
public class NumberedDie implements Die{
  private final int sideCount;
  private int value;

  public NumberedDie(int sideCount) {
	this.sideCount = sideCount;
	this.value = 0;
  }
  
  @Override
  public void roll() {
	this.value = this.sideCount;
  }

  @Override
  public int value() {
	return this.value;
  }
  
}
