/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */
package roomie.models.house;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import roomie.models.RoomiePersistentManager;
import roomie.repositories.house.HouseCriteria;

import java.util.List;

public class HouseDAO {
	public static House loadHouseByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadHouseByORMID(session, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House getHouseByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return getHouseByORMID(session, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByORMID(int id, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadHouseByORMID(session, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House getHouseByORMID(int id, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return getHouseByORMID(session, id, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (House) session.load(House.class, new Integer(id));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House getHouseByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (House) session.get(House.class, new Integer(id));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByORMID(PersistentSession session, int id, LockMode lockMode) throws PersistentException {
		try {
			return (House) session.load(House.class, new Integer(id), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House getHouseByORMID(PersistentSession session, int id, LockMode lockMode) throws PersistentException {
		try {
			return (House) session.get(House.class, new Integer(id), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouse(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return queryHouse(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouse(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return queryHouse(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House[] listHouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return listHouseByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House[] listHouseByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return listHouseByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouse(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.house.House as House");
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
	
	public static List queryHouse(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.house.House as House");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("House", lockMode);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House[] listHouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHouse(session, condition, orderBy);
			return (House[]) list.toArray(new House[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House[] listHouseByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryHouse(session, condition, orderBy, lockMode);
			return (House[]) list.toArray(new House[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadHouseByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return loadHouseByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		House[] houses = listHouseByQuery(session, condition, orderBy);
		if (houses != null && houses.length > 0) return houses[0];
		else return null;
	}
	
	public static House loadHouseByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		House[] houses = listHouseByQuery(session, condition, orderBy, lockMode);
		if (houses != null && houses.length > 0) return houses[0];
		else return null;
	}
	
	public static java.util.Iterator iterateHouseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return iterateHouseByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHouseByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			return iterateHouseByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHouseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.house.House as House");
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
	
	public static java.util.Iterator iterateHouseByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From roomie.models.house.House as House");
		if (condition != null) sb.append(" Where ").append(condition);
		if (orderBy != null) sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("House", lockMode);
			return query.iterate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static int getTotalNOfHouses() throws PersistentException {
		StringBuffer sb = new StringBuffer("Select count(id) as total From roomie.models.house.House as House");
		try {
			PersistentSession session = RoomiePersistentManager.instance().getSession();
			Query query = session.createQuery(sb.toString());
			return Integer.parseInt(query.list().get(0).toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House createHouse() {
		return new House();
	}
	
	public static boolean save(House house) throws PersistentException {
		try {
			RoomiePersistentManager.instance().saveObject(house);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(House house) throws PersistentException {
		try {
			RoomiePersistentManager.instance().deleteObject(house);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(House house) throws PersistentException {
		try {
			if (house.getLandlord() != null) {
				house.getLandlord().houses.remove(house);
			}
			
			return delete(house);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(House house, PersistentSession session) throws PersistentException {
		try {
			if (house.getLandlord() != null) {
				house.getLandlord().houses.remove(house);
			}
			
			try {
				session.delete(house);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(House house) throws PersistentException {
		try {
			RoomiePersistentManager.instance().getSession().refresh(house);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(House house) throws PersistentException {
		try {
			RoomiePersistentManager.instance().getSession().evict(house);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static House loadHouseByCriteria(HouseCriteria houseCriteria) {
		House[] houses = listHouseByCriteria(houseCriteria);
		if (houses == null || houses.length == 0) {
			return null;
		}
		return houses[0];
	}
	
	public static House[] listHouseByCriteria(HouseCriteria houseCriteria) {
		return houseCriteria.listHouse();
	}
}
