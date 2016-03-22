package m1.miage.projet10.Metier;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import m1.miage.projet10.DAO.CoursPDAO;
import m1.miage.projet10.DAO.InterfaceCoursPDAO;
import m1.miage.projet10.Entite.Cours;
import m1.miage.projet10.Entite.Disponibilite;
import m1.miage.projet10.Entite.Document;
import m1.miage.projet10.Entite.Eleve;
import m1.miage.projet10.Entite.EspacePersonnel;
import m1.miage.projet10.Entite.Matiere;
import m1.miage.projet10.Entite.Message;
import m1.miage.projet10.Entite.Niveau;
import m1.miage.projet10.Entite.Professeur;
import m1.miage.projet10.Entite.Statut;
import m1.miage.projet10.Entite.Utilisateur;

@Transactional
public class CoursParticulierMetierImpl implements CoursParticulierMetier{
	
	private CoursPDAO dao;
	
	public void setDao(CoursPDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean addProf(Professeur user) {		
		return dao.addProf(user);
	}

	@Override
	public boolean supprimerProf(Long iduser) {
		
		return dao.supprimerProf(iduser);
	}

	

	@Override
	public boolean modifierStatutProf(Statut statut, Professeur prof) {
		
		return dao.modifierStatutProf(statut, prof);
	}

	@Override
	public boolean addMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		
		return dao.addMatiere(matiere);
	}

	@Override
	public boolean supprimerMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		
		return dao.supprimerMatiere(matiere);
		
	}

	@Override
	public Collection<Eleve> getListEleve() {
		// TODO Auto-generated method stub
		
		return dao.getListEleve();
		
	}

	@Override
	public Collection<Professeur> getListProf() {
		// TODO Auto-generated method stub
		
		return dao.getListProf();
	}

	@Override
	public String modifierTitreMatiere(Matiere mat, String intitule) {
		// TODO Auto-generated method stub
		
		return dao.modifierTitreMatiere(mat, intitule);
		
	}

	@Override
	public Collection<Cours> consulterCours() {
		// TODO Auto-generated method stub
		
		return dao.consulterCours();
	}

	@Override
	public boolean acheterCours(Cours cours, Eleve e) {
		// TODO Auto-generated method stub
		
		return dao.acheterCours(cours, e);
		
	}


	@Override
	public EspacePersonnel getEspacePersonnel(Eleve e) {
		// TODO Auto-generated method stub
		return dao.getEspacePersonnel(e);
	}

	@Override
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(matiere, niveau);
	}

	@Override
	public Collection<Cours> rechercheCours(Niveau niveau) {
		// TODO Auto-generated method stub
		return dao.rechercheCours(niveau);
	}

	@Override
	public Collection<Cours> rechercherCours(String motCle) {
		// TODO Auto-generated method stub
		return dao.rechercherCours(motCle);
	}

	@Override
	public Collection<Document> getListDocument(EspacePersonnel esp) {
		// TODO Auto-generated method stub
		return dao.getListDocument(esp);
	}

	@Override
	public boolean seConnecter(String email, String motdepasse) {
		// TODO Auto-generated method stub
		return dao.seConnecter(email, motdepasse);
	}

	

	@Override
	public Collection<Cours> getListCours(Professeur prof) {
		// TODO Auto-generated method stub
		return dao.getListCours(prof);
	}

	@Override
	public Collection<Disponibilite> getListDispo(Professeur prof) {
		// TODO Auto-generated method stub
		return dao.getListDispo(prof);
	}

	@Override
	public Collection<Disponibilite> getlistDispoCours(Cours c, Professeur prof) {
		// TODO Auto-generated method stub
		return dao.getlistDispoCours(c, prof);
	}

	@Override
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Professeur prof) {
		// TODO Auto-generated method stub
		return dao.supprimerDisponibilite(Dispo, prof);
	}

	@Override
	public boolean addDispo(Disponibilite d, Professeur prof) {
		// TODO Auto-generated method stub
		return dao.addDispo(d, prof);
	}

	@Override
	public Cours addCours(Cours c, Professeur prof) {
		// TODO Auto-generated method stub
		return dao.addCours(c, prof);
	}

	@Override
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Professeur prof) {
		// TODO Auto-generated method stub
		return dao.addCours(c, dispo, prof);
	}

	
	@Override
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Professeur prof) {
		
		dao.deposerDocument(doc, listeEleve, prof);
	}

	@Override
	public Collection<Eleve> getElevesByCours(Cours c, Professeur prof) {
		
		return dao.getElevesByCours(c, prof);
	}

	@Override
	public boolean sedeconnecter() {
		return dao.sedeconnecter();
	}

	@Override
	public boolean envoyerMessage(Message msg, Collection<Utilisateur> users) {
		// TODO Auto-generated method stub
		return dao.envoyerMessage(msg, users);
	}

	@Override
	public boolean supprimerMessage(Message msg) {
		// TODO Auto-generated method stub
		return dao.supprimerMessage(msg);
	}

	@Override
	public Collection<Message> getMessages() {
		// TODO Auto-generated method stub
		return dao.getMessages();
	}

	@Override
	public boolean modifierMail(String mail, Utilisateur user) {
		// TODO Auto-generated method stub
		return dao.modifierMail(mail, user);
	}

	@Override
	public boolean modifierMDP(String mdp, Utilisateur user) {
		
		return dao.modifierMDP(mdp, user);
	}

	@Override
	public String reinitilialiserMDP(Utilisateur user) {
		// TODO Auto-generated method stub
		return dao.reinitilialiserMDP(user);
	}

	@Override
	public boolean modifierProfilProf(Professeur prof, Long idProf) {
		// TODO Auto-generated method stub
		return dao.modifierProfilProf(prof, idProf);
	}

	@Override
	public boolean modifierPrixMatiere(Matiere matiere, Long prix) {
		// TODO Auto-generated method stub
		return dao.modifierPrixMatiere(matiere, prix);
	}

	@Override
	public Long rechargerCredit(Long credit, Eleve e) {
		// TODO Auto-generated method stub
		return dao.rechargerCredit(credit, e);
	}

	@Override
	public void inscrire(Utilisateur user) {
		// TODO Auto-generated method stub
		dao.inscrire(user);
	}

	@Override
	public void saisirCompteRendu(String text, Long idCours, Professeur prof) {
		dao.saisirCompteRendu(text, idCours, prof);
		
	}

	@Override
	public boolean addCredit(Long credit, Eleve eleve) {
		return dao.addCredit(credit, eleve);
	}

}
