package game;

public class Sword implements IWeapon {

	@Override
	public Damage dealDamage() {

		return new Damage(30);
	}

	@Override
	public String getName() {
		return "Miecz";
	}

}
