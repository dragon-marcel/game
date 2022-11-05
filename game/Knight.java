package game;

public class Knight implements IProfesion {

	@Override
	public Damage specialAttack() {

		Damage damage = new Damage(50);
		System.out.println("Rycerz zadal specialny atak " + damage.getDamage());
		return damage;
	}

}
