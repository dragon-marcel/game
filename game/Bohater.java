package game;

public class Bohater {
	private String name;
	private Backpack backpack;
	private IProfesion prefosion;
	private int quantitylife;

	public Bohater(String name) {
		this.name = name;
		this.quantitylife = 100;
		this.backpack = new Backpack();
		System.out.println("Bohater " + name + " zosta³ utworzony.");

	}

	public void takeLife(int damage) {
		System.out.println(name + " zosta³ uszkodzony " + damage);
		quantitylife -= damage;

		if (quantitylife <= 0)
			System.out.println(name + " zosta³ zniszczony.");
		else
			System.out.println(name + " posiada " + quantitylife + " ¿ycia");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Backpack getBackpack() {
		return backpack;
	}

	public void setBackpack(Backpack backpack) {
		this.backpack = backpack;
	}

	public IProfesion getPrefosion() {
		return prefosion;
	}

	public void setPrefosion(IProfesion prefosion) {
		this.prefosion = prefosion;
	}

	public int getQuantitylife() {
		return quantitylife;
	}

	public void setQuantitylife(int quantitylife) {
		this.quantitylife = quantitylife;
	}

}
