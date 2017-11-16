package mappa;

import unit.Unit;
import utility.Posizione;

public class Montagna extends Casella{
	private final double bonus = 0.5;
	
	public Montagna(Posizione pos) {
		super(pos);
	}

	public Montagna(Posizione pos, Unit unit){
		super(pos,unit);
	}
	
	public double getBonus(){
		return this.bonus;
	}

}
