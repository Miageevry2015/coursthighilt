package m1.miage.projet10;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import m1.miage.projet10.Entite.Administrateur;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Utilisateur;
import m1.miage.projet10.Metier.CoursParticulierMetier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"applicontext.xml"});
		
		CoursParticulierMetier metier = (CoursParticulierMetier) app.getBean("metier");
		
		
		Administrateur admin = new Administrateur();
		admin.setNom("Benkhellat");
		admin.setPrenom("Omar");
		admin.setDateNaissance("30/09/1992");
		admin.setEmail("omar07ben@outlook.fr");
		admin.setMotDePasse("benkhellat");
		
		Matiere mat1 = new Matiere("Mathematique", Niveau.TERMINAL, 10L);
		
		Professeur prof1 = new Professeur("DJAFRI", "BACHIR", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC4);
		Professeur prof2 = new Professeur("Melliti", "Tarek", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC5);
		Professeur prof3 = new Professeur("Hannichi", "Djelloul", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC5);
		
		Cours c1 = new Cours("Limite", 20L, "2h", null, mat1, null);
		
		Disponibilite dispo1 = new Disponibilite(new Date(), "12h", "13h");
		
		// /////////////////////////////
		
		//metier.addCours(c1, prof1);
		//metier.inscrire(admin);
		metier.addProf(prof1);
		metier.addProf(prof2);
		metier.addProf(prof3);
		/*
		Professeur prof1 = new Professeur("boukersi", "youcef", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC4);
		Professeur prof2 = new Professeur("Zegrour", "yasmine", "16051993", "", "youcef.boukersi@yahoo.fr", "", "youyou2012", Niveau.BAC5);

		metier.addProf(prof1);
		metier.addProf(prof2);
		
		//metier.addMatiere(new Matiere("mat", Niveau.BAC1, null));
 		
		Cours c = new Cours("grammaire", null, null, null, null, null);
		*/
		for(Professeur user : metier.getListProf())
			System.out.println(user.getIdUtilisateur()+"  "+user.getNom());
		
	/*	
		System.out.println("apress");
		metier.supprimerProf(prof1);
		
		//System.out.println(metier.addCours(c, prof1));
		
		for(Utilisateur user : metier.getListProf())
			System.out.println(user.getIdUtilisateur()+"  "+user.getNom());
	
		*/
	}
}
