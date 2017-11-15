package mappa;

import unit.Unit;
import utility.Posizione;

public class Acqua extends Casella{
	private final double bonus = 0.4;
	
	public Acqua(Posizione pos) {
		super(pos);
	}

	public Acqua(Posizione pos, Unit unit){
		super(pos,unit);
	}
	
	public double getBonus(){
		return this.bonus;
	}

}
