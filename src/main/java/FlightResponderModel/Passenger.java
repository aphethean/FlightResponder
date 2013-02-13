package FlightResponderModel;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long passengerNo;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date dateOfBirth;
	private Long flightID;
	private String name;
	@JoinColumn(name = "flightID", referencedColumnName = "flightID", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Flight flight;


	public Passenger() {
	}
}