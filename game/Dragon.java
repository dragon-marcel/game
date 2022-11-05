package game;

public class Dragon implements IProfesion {

	@Override
	public Damage specialAttack() {
		Damage damage = new Damage(50);
		System.out.println("Dragon zadanal specialny atak " + damage.getDamage());
		return damage;
	}

}
