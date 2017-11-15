package armi;

import unit.Unit;

public class AssaultRifle extends Weapons{
	
	public AssaultRifle(){
		super();
		this.maxAmmo = 30;
	}

	public boolean canTarget(Unit target) {
		
		return false;
	}

	public void damageTarget(Unit atk, Unit def) {
		// TODO Auto-generated method stub
		
	}
	
	
}
