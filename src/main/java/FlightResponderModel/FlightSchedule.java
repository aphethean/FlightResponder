package FlightResponderModel;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FlightSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long flightScheduleID;

	private String flightNo;
	private String arrivalAirportCode;
	@Temporal(TemporalType.TIME)
	private java.util.Date arrivalTime;
	@Temporal(TemporalType.TIME)
	private java.util.Date departureTime;
	private String departureAirportCode;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date firstDeparture;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date lastDeparture;
	@JoinColumn(name = "departureAirportCode", referencedColumnName = "code", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Airport departureAirport;
	@JoinColumn(name = "arrivalAirportCode", referencedColumnName = "code", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Airport arrivalAirport;

	public FlightSchedule() {
	}
}