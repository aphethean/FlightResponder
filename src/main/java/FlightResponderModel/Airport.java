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
public class Airport {

	@Id
	@Basic(optional = false)
	private String code;

	private String name;
	private String country;

    @OneToMany(mappedBy="departureAirportCode")
    private Collection<FlightSchedule> departures;
    @OneToMany(mappedBy="arrivalAirportCode")
    private Collection<FlightSchedule> arrivals;

	public Airport() {
	}
}