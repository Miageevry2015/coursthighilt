package m1.miage.projet10;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import m1.miage.projet10.Metier.CoursParticulierMetier;

@Controller
@RequestMapping(value = "/prof")
public class ControllerProf {

	@Autowired
	private CoursParticulierMetier metier;
	
	@RequestMapping(value = "/index")
	public String index(Locale locale, Model model) {	
		
		return "AccueilProf";
	}
	
	@RequestMapping(value = "/listeCours")
	public String  listeCours(Locale locale, Model model) {	
		
		return "ProflisteCours";
	}
	
	@RequestMapping(value = "/disponibilite")
	public String disponibilite(Locale locale, Model model) {	
		
		return "ProfDisponibilite";
	}
	@RequestMapping(value = "/compteRendu")
	public String compteRendu(Locale locale, Model model) {	
		
		return "ProfcompteRendu";
	}
	
	@RequestMapping(value = "/listeEleve")
	public String listeEleve(Locale locale, Model model) {	
		
		return "ProflistEleve";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "ProfMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "home";
	}

}
