package model;

public class Apartament {
	public int number;
	public Tenant tenant;

	@Override
	public int hashCode() {		
		return (this.number / 100);
	}

	public Apartament(int number, Tenant tenant) {
		super();
		this.number = number;
		this.tenant = tenant;
	}
}
