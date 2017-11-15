package armi;

import unit.Unit;

public class AssaultRifle extends Weapon{
	private double damTroops;
	private double damHearth;
	private double damWater;
	private double damAir;
	
	public AssaultRifle(){
		super();
		this.maxAmmo = 30;
	}
	
	@Override
	public boolean canTarget(Unit target) {
		if(target instanceof Fanteria && target instanceof Vehicle)
			return true;
	}
	
	@Override
	public void damageTarget(Unit atk, Unit def) {
		private int damageatkdef = ;
		private int damagedefatk = ;
		if(atk.canTarget(def)==true){
			atk.setLife(damagedefatk);
			def.setLife(damageatkdef);
		}
	}
	
	
}
