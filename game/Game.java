package game;

public class Game {
	public static void main(String args[]) {
		Bohater smok = new Bohater("Smokus");
		smok.setPrefosion(new Dragon());

		Bohater bohater = new Bohater("Adamus");
		bohater.setPrefosion(new Knight());
		IWeapon sword = new Sword();
		bohater.getBackpack().addWeapon(sword);
		
		int quantityPofessionDamage = bohater.getPrefosion().specialAttack().getDamage();
		smok.takeLife(quantityPofessionDamage);

		for(int  a = 0;a<2;a++) {
			int quantityDamage = bohater.getBackpack().useWeapon(0).dealDamage().getDamage();
			smok.takeLife(quantityDamage);
		}


	}
}
