package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import contracts.IFloorController;
import model.Floor;

public class FloorController implements IFloorController {

	Lista[] vetFloor;
	
	public FloorController() {
		vetFloor = new Lista[4];
		
		for (int i = 0 ; i < 26 ; i++) {
			vetFloor[i] = new Lista();
		}
	}

	@Override
	public void adiciona(Floor p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetFloor[hash];

		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}
	}

	@Override
	public Floor busca(Floor p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetFloor[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Floor p1 = (Floor) l.get(i);
			if (p1.number == p.number) {
				return p1;
			}
		}
		return null;
	}

	@Override
	public void remove(Floor p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetFloor[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Floor p1 = (Floor) l.get(i);
			if (p1.number == p.number) {
				l.remove(i);
				break;
			}
		}
	}

}
