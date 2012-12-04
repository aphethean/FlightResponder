package FlightResponderModel;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {

	@Id
	@Basic(optional = false)
	private String code;

	private String name;
	private String country;

	public Airport() {
	}
}