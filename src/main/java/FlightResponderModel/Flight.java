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
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long flightID;

	private Long flightScheduleNum;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date takeoffTime;
	@JoinColumn(name = "flightScheduleNum", referencedColumnName = "flightScheduleID", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private FlightSchedule flightSchedule;


	public Flight() {
	}
}