package fatec_ipi_paoo_tarde_ex1_comportamento_arma;

public class Atacar {	

	public static void main(String[] args) {
		AxeBehavior a = new AxeBehavior();
		a.useWeapon();
		
		Knight k = new Knight();
		k.figth();
		
		KnifeBehavior kn = new KnifeBehavior();
		kn.useWeapon();
		
		BowAndArrowBehavior b = new BowAndArrowBehavior();
        b.useWeapon();
        
        SwordBehavior s = new SwordBehavior();
        s.useWeapon();
        
       
        
       
        
     
	}
}
