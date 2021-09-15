package roomie.repositories.landlord;

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;
import roomie.models.RoomiePersistentManager;
import roomie.models.landlord.Landlord;
import roomie.repositories.avatar.AvatarCriteria;
import roomie.repositories.house.HouseCriteria;

public class LandlordCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression avatarId;
	public final AssociationExpression avatar;
	public final StringExpression name;
	public final StringExpression email;
	public final StringExpression username;
	public final DateExpression birthDate;
	public final StringExpression sex;
	public final StringExpression nif;
	public final StringExpression address;
	public final StringExpression password;
	public final StringExpression phone;
	public final CollectionExpression houses;
	
	public LandlordCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		avatarId = new IntegerExpression("avatar.ID", this);
		avatar = new AssociationExpression("avatar", this);
		name = new StringExpression("name", this);
		email = new StringExpression("email", this);
		username = new StringExpression("username", this);
		birthDate = new DateExpression("birthDate", this);
		sex = new StringExpression("sex", this);
		nif = new StringExpression("nif", this);
		address = new StringExpression("address", this);
		password = new StringExpression("password", this);
		phone = new StringExpression("phone", this);
		houses = new CollectionExpression("ORM_Houses", this);
	}
	
	public LandlordCriteria(PersistentSession session) {
		this(session.createCriteria(Landlord.class));
	}
	
	public LandlordCriteria() throws PersistentException {
		this(RoomiePersistentManager.instance().getSession());
	}
	
	public AvatarCriteria createAvatarCriteria() {
		return new AvatarCriteria(createCriteria("avatar"));
	}
	
	public HouseCriteria createHousesCriteria() {
		return new HouseCriteria(createCriteria("ORM_Houses"));
	}
	
	public Landlord uniqueLandlord() {
		return (Landlord) super.uniqueResult();
	}
	
	public Landlord[] listLandlord() {
		java.util.List list = super.list();
		return (Landlord[]) list.toArray(new Landlord[list.size()]);
	}
}

