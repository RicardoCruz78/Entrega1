package fatec_ipi_paoo_tarde_ex1_comportamento_arma;


public class Character {//Personagem
	WeaponBehavior weapon;
	
	
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	public void figth () {//luta
		
	}
	public void usarArma () {
		weapon.useWeapon();
		
		
	}
	
	}
	

	


