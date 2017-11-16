package mappa;

import unit.Unit;
import utility.Posizione;

public abstract class Casella{
	private final Posizione pos;
	private Unit unit;
	
	public Casella(Posizione pos){
		this.pos = pos;
		this.setUnit(null);
	}
	
	public Casella(Posizione pos, Unit unit){
		this.pos = pos;
		this.setUnit(unit);
	}
	
	public Unit getUnit(){
		return unit;
	}

	public void setUnit(Unit unit){
		this.unit = unit;
	}

	public Posizione getPos(){
		return pos;
	}

	public abstract double getBonus();
}
