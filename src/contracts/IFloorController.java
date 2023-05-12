package contracts;

import model.Floor;

public interface IFloorController {
	public void adiciona(Floor p) throws Exception;
	public Floor busca(Floor p) throws Exception;
	public void remove(Floor p) throws Exception;
}
