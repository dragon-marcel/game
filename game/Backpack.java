package game;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
	private List<IWeapon> item;

	public Backpack() {
		item = new ArrayList<>();
	}

	public void addWeapon(IWeapon weapon) {
		item.add(weapon);
		System.out.println("Dodano do plecaka broñ" + weapon.getName());
	}

	public IWeapon useWeapon(int id) {
		IWeapon weapon = item.get(id);
		System.out.println("U¿yto broñ" + weapon.getName());
		return weapon;
	}
}
