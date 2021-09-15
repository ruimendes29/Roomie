package roomie.repositories.photo;

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.AbstractORMDetachedCriteria;
import org.orm.criteria.IntegerExpression;
import org.orm.criteria.StringExpression;
import roomie.models.photo.Photo;

import java.util.List;

public class PhotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression path;
	
	public PhotoDetachedCriteria() {
		super(Photo.class, PhotoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		path = new StringExpression("path", this.getDetachedCriteria());
	}
	
	public PhotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PhotoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		path = new StringExpression("path", this.getDetachedCriteria());
	}
	
	public Photo uniquePhoto(PersistentSession session) {
		return (Photo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Photo[] listPhoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Photo[]) list.toArray(new Photo[list.size()]);
	}
}

