package roomie.models.landlord;

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */

import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import roomie.models.RoomiePersistentManager;
import roomie.repositories.landlord.LandlordCriteria;

import java.util.List;

public class LandlordDAO {
	public static Landlord loadLandlordByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadLandlordByORMID(session, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord getLandlordByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return getLandlordByORMID(session, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadLandlordByORMID(session, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord getLandlordByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return getLandlordByORMID(session, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Landlord) session.load(Landlord.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord getLandlordByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Landlord) session.get(Landlord.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Landlord) session.load(Landlord.class, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord getLandlordByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Landlord) session.get(Landlord.class, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLandlord(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return queryLandlord(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLandlord(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return queryLandlord(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord[] listLandlordByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return listLandlordByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord[] listLandlordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return listLandlordByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLandlord(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.landlord.Landlord as Landlord");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLandlord(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.landlord.Landlord as Landlord");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Landlord", lockMode);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord[] listLandlordByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLandlord(session, condition, orderBy);
			return (Landlord[]) list.toArray(new Landlord[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord[] listLandlordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLandlord(session, condition, orderBy, lockMode);
			return (Landlord[]) list.toArray(new Landlord[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadLandlordByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadLandlordByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Landlord[] landlords = listLandlordByQuery(session, condition, orderBy);
		if (landlords != null && landlords.length > 0) return landlords[0];
		else return null;
	}
	
	public static Landlord loadLandlordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Landlord[] landlords = listLandlordByQuery(session, condition, orderBy, lockMode);
		if (landlords != null && landlords.length > 0) return landlords[0];
		else return null;
	}
	
	public static java.util.Iterator iterateLandlordByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return iterateLandlordByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLandlordByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return iterateLandlordByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLandlordByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.landlord.Landlord as Landlord");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLandlordByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.landlord.Landlord as Landlord");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Landlord", lockMode);
			return query.iterate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord createLandlord() {
		return new Landlord();
	}
	
	public static boolean save(Landlord landlord) throws PersistentException {
		try {
			RoomiePersistentManager.instance().saveObject(landlord);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Landlord landlord) throws PersistentException {
		try {
			RoomiePersistentManager.instance().deleteObject(landlord);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Landlord landlord) throws PersistentException {
		try {
			RoomiePersistentManager.instance().getSession().refresh(landlord);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Landlord landlord) throws PersistentException {
		try {
			RoomiePersistentManager.instance().getSession().evict(landlord);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Landlord loadLandlordByCriteria(LandlordCriteria landlordCriteria) {
		Landlord[] landlords = listLandlordByCriteria(landlordCriteria);
		if (landlords == null || landlords.length == 0) {
			return null;
		}
		return landlords[0];
	}
	
	public static Landlord[] listLandlordByCriteria(LandlordCriteria landlordCriteria) {
		return landlordCriteria.listLandlord();
	}
}
