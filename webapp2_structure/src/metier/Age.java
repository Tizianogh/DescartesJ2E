package metier;

import java.util.*;

public class Age {
	private String dateDeNaissance;
	
	public Age(String dateDeNaissance) {
		this.dateDeNaissance=dateDeNaissance;
	}
	
	public int calculAge() {
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int ageCalcule = year - Integer.parseInt(this.getDateDeNaissance());
		return ageCalcule;
	}
	
	public String getDateDeNaissance() {
		return this.dateDeNaissance;
	}

}
