package m1.miage.projet10;

import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Metier.CoursParticulierMetier;

@Controller
@RequestMapping(value = "/admin")
public class ControllerAdmin {

	@Autowired
	private CoursParticulierMetier metier;
	
	@RequestMapping(value = "/index")
	public String home(Locale locale, Model model) {	
		
		return "AccueilAdmin";
	}
	
	@RequestMapping(value = "/listeProf")
	public String  listeProf(Locale locale, Model model) {	
		model.addAttribute("listeProf",  metier.getListProf());
		return "AdminlisteProf";
	}
	@ModelAttribute
	@RequestMapping(value = "/sup")
	public String  supprimer(Long id ,Locale locale, Model model) {
		
	    metier.supprimerProf(id);
		return "AdminlisteProf";
	}
	@RequestMapping(value = "/matier")
	public String compteRendu(Locale locale, Model model) {	
		
		return "AdminMatier";
	}
	
	@RequestMapping(value = "/listeEleve")
	public String listEleve(Locale locale, Model model) {	
		
		model.addAttribute("listeEleve",  metier.getListEleve());
		return "AdminlistEleve";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {	
		
		return "AdminMessage";
	}
	
	@RequestMapping(value = "/deconnecter")
	public String deconnecter(Locale locale, Model model) {	
		
		return "home";
	}
}
