package contracts;

import model.Apartament;

public interface IApartamentController {

	public void adiciona(Apartament p) throws Exception;
	public Apartament busca(Apartament p) throws Exception;
	public void remove(Apartament p) throws Exception;

}