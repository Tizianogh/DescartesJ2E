package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculAge {	
	
	public int calculerAge(Date dateNaissance) {		
		return new Date().getYear() - dateNaissance.getYear();
	}
	
	public int calculerAge(String dateNaissance) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		Date ddnPersonne = df.parse(dateNaissance);
		return this.calculerAge(ddnPersonne);
	}
}
