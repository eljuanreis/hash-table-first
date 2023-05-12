package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import contracts.ITenantController;
import model.Tenant;

public class TenantController implements ITenantController {

	Lista[] vetTenant;
	
	public TenantController() {
		vetTenant = new Lista[4];
		
		for (int i = 0 ; i < 26 ; i++) {
			vetTenant[i] = new Lista();
		}
	}

	@Override
	public void adiciona(Tenant p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetTenant[hash];

		if (l.isEmpty()) {
			l.addFirst(p);
		} else {
			l.addLast(p);
		}
	}

	@Override
	public Tenant busca(Tenant p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetTenant[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Tenant p1 = (Tenant) l.get(i);
			if (p1.name.equals(p.name)) {
				return p1;
			}
		}
		return null;
	}

	@Override
	public void remove(Tenant p) throws Exception {
		int hash = p.hashCode();
		Lista l = vetTenant[hash];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			Tenant p1 = (Tenant) l.get(i);
			if (p1.name.equals(p.name)) {
				l.remove(i);
				break;
			}
		}
	}

}
