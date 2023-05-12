package view;

import controller.ApartmentController;
import model.Apartament;
import model.Floor;
import model.Tenant;

public class Main {

	public static void main(String[] args) {		
		Floor f = new Floor();
		f.number = 1;

		// andar 1
		Apartament c1 = new Apartament(101, new Tenant("João"));
		Apartament c2 = new Apartament(101, new Tenant("Pedro"));
		Apartament c3 = new Apartament(101, new Tenant("Marcelo"));
		Apartament c4 = new Apartament(101, new Tenant("Nelson"));
		
		ApartmentController apc = new ApartmentController();
		
		try {
			apc.adiciona(c1);
			apc.adiciona(c2);
			apc.adiciona(c3);
			apc.adiciona(c4);
			
			apc.buscaAndar(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
