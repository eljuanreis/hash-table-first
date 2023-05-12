package contracts;

import model.Tenant;

public interface ITenantController {
	public void adiciona(Tenant p) throws Exception;
	public Tenant busca(Tenant p) throws Exception;
	public void remove(Tenant p) throws Exception;
}
