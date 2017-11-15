package mappa;

import unit.Unit;
import utility.Posizione;

public class Pianura extends Casella{
	private final double bonus = 0.1;
	
	public Pianura(Posizione pos) {
		super(pos);
	}

	public Pianura(Posizione pos, Unit unit){
		super(pos,unit);
	}
	
	public double getBonus(){
		return this.bonus;
	}
}
