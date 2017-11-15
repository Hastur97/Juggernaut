package mappa;

import unit.Unit;
import utility.Posizione;

public class Foresta extends Casella{
	private final double bonus = 0.9;
	
	public Foresta(Posizione pos) {
		super(pos);
	}

	public Foresta(Posizione pos, Unit unit){
		super(pos,unit);
	}
	
	public double getBonus(){
		return this.bonus;
	}

}
