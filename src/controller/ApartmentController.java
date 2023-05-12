package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import contracts.IApartamentController;
import model.Apartament;

public class ApartmentController implements IApartamentController {

	Lista[] vetAps;
	
	public ApartmentController() {
		vetAps = new Lista[26];
		
		for (int i = 0 ; i < 26 ; i++) {
			vetAps[i] = new Lista();
		}
	}

	@Override
	public void adiciona(Apartament p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetAps[hash];

		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}
	}

	@Override
	public Apartament busca(Apartament p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetAps[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Apartament p1 = (Apartament) l.get(i);
			if (p1.number == p.number) {
				return p1;
			}
		}
		return null;
	}
	
	public void buscaAndar(int floorNumber) throws Exception {
		Lista l = vetAps[floorNumber];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Apartament p = (Apartament) l.get(i);
	
			System.out.println(p.tenant.name);
		}
	}

	public void remove(Apartament p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetAps[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Apartament p1 = (Apartament) l.get(i);
			if (p1.number == p.number) {
				l.remove(i);
				break;
			}
		}
	}
}
