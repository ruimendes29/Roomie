package roomie.models.avatar;

/**
 * Licensee: vr(Universidade do Minho)
 * License Type: Academic
 */

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Avatar implements Serializable {
	private int ID;
	@JsonIgnore
	private String path;
	
	public Avatar() {
	}
	
	public int getID() {
		return ID;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	@JsonIgnore
	public int getORMID() {
		return getID();
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String value) {
		this.path = value;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
