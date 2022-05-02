package module5;
import java.util.Date;
public class Appointment {
	
	private static String apptID;
	private static Date date;
	private static String apptDes;
	
	public Appointment(String apptID, Date date, String apptDes) {
		if(apptID == null || apptID.length()>10) {
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		
		
		if (date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		
		if(apptDes == null || apptDes.length()>50) {
			throw new IllegalArgumentException("Invalid Appointment Description");
		}
		
		this.apptID = apptID;
		this.date = date;
		this.apptDes = apptDes;
	}
	public static String getApptID() {
		return apptID;
	}
	public void setApptID(String apptID) {
		this.apptID = apptID;
	}
	public static Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static String getApptDes() {
		return apptDes;
	}
	public void setApptDes(String apptDes) {
		this.apptDes = apptDes;
	}
	
	
}
