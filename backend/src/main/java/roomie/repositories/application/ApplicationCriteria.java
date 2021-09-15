package roomie.repositories.application;

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMCriteria;
import org.orm.criteria.AssociationExpression;
import org.orm.criteria.BooleanExpression;
import org.orm.criteria.IntegerExpression;
import roomie.models.RoomiePersistentManager;
import roomie.models.application.Application;
import roomie.repositories.house.HouseCriteria;
import roomie.repositories.tenant.TenantCriteria;

public class ApplicationCriteria extends AbstractORMCriteria {
	public final IntegerExpression tenantId;
	public final AssociationExpression tenant;
	public final IntegerExpression houseId;
	public final AssociationExpression house;
	public final BooleanExpression toBeAssessed;
	public final BooleanExpression accepted;
	
	public ApplicationCriteria(Criteria criteria) {
		super(criteria);
		tenantId = new IntegerExpression("tenant.id", this);
		tenant = new AssociationExpression("tenant", this);
		houseId = new IntegerExpression("house.id", this);
		house = new AssociationExpression("house", this);
		toBeAssessed = new BooleanExpression("toBeAssessed", this);
		accepted = new BooleanExpression("accepted", this);
	}
	
	public ApplicationCriteria(PersistentSession session) {
		this(session.createCriteria(Application.class));
	}
	
	public ApplicationCriteria() throws PersistentException {
		this(RoomiePersistentManager.instance().getSession());
	}
	
	public TenantCriteria createTenantCriteria() {
		return new TenantCriteria(createCriteria("tenant"));
	}
	
	public HouseCriteria createHouseCriteria() {
		return new HouseCriteria(createCriteria("house"));
	}
	
	public Application uniqueApplication() {
		return (Application) super.uniqueResult();
	}
	
	public Application[] listApplication() {
		java.util.List list = super.list();
		return (Application[]) list.toArray(new Application[list.size()]);
	}
}

