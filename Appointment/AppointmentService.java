package module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
	private List<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList <Appointment>();
		
	}
	public boolean addAppt(String apptID, Date date, String apptDes) {
		Appointment appt = new Appointment(apptID, date, apptDes);
		
		appointments.add(appt);
		return true;
	}
	public boolean removeAppt(String apptID) {
		for(Appointment appt : appointments) {
			if(appt.getApptID().equals(apptID)) {
				appointments.remove(appt);
				return true;
			}
		}
		return false;
	}
}
