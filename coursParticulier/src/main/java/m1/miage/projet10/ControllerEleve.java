package m1.miage.projet10;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Metier.CoursParticulierMetier;

@Controller
@RequestMapping(value = "/Eleve")
public class ControllerEleve {

	@Autowired
	private CoursParticulierMetier metier;
	
	@RequestMapping(value = "/index")
	public String index(Locale locale, Model model) {	
		
		return "AccueilEleve";
	}
	@RequestMapping(value = "/listeCours")
	public String  listeCours(Locale locale, Model model) {	
		
		return "ElevelisteCours";
	}
	
	@RequestMapping(value = "/listeProf")
	public String  listeProf(Locale locale, Model model) {	
		
		return "ElevelisteProf";
	}
	
	@RequestMapping(value = "/espace")
	public String espace(Locale locale, Model model) {	
		
		return "EleveEspace";
	}
	@RequestMapping(value = "/inscrire")
	public String inscrire(Locale locale, Model model) {	
		
		model.addAttribute("Eleve", new Eleve());
		
		return "EleveInscrire";
	}
	
	@RequestMapping(value = "/inscrirEleve")
	public String inscrirEleve(@ModelAttribute Eleve user,Locale locale, Model model) {
		
		metier.inscrire(user);
		
		model.addAttribute("Eleve", new Eleve());
		
		return "EleveInscrire";
	}
	
	
	
	@RequestMapping(value = "/acheter")
	public String acheter(Locale locale, Model model) {	
		
		return "EleveAcheter";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "EleveMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "home";
	}
}
