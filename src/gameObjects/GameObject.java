package gameObjects;

abstract public class GameObject {
	private double cost;
	private double upkeep;
	private double income;
	
	
	public GameObject(double cost, double upkeep, double income) {
		super();
		this.cost = cost;
		this.upkeep = upkeep;
		this.income = income;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getUpkeep() {
		return upkeep;
	}
	public void setUpkeep(double upkeep) {
		this.upkeep = upkeep;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	

}
