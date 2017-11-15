package mappa;

import unit.Unit;
import utility.Posizione;

public class Town extends Casella{
	private final double bonus = 0.4;
	private double conquerPoints;
	
	public Town(Posizione pos) {
		super(pos);
	}

	public Town(Posizione pos, Unit unit){
		super(pos,unit);
	}

	public double getConquerPoints() {
		return conquerPoints;
	}

	public void setConquerPoints(double conquerPoints) {
		this.conquerPoints = conquerPoints;
	}

	public double getBonus() {
		return this.bonus;
	}

}
