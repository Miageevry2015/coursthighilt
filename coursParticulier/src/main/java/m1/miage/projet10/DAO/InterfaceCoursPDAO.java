package m1.miage.projet10.DAO;

import java.util.Collection;

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

public interface InterfaceCoursPDAO {
	
	
	public boolean addProf(Professeur user);
	public boolean supprimerProf(Long iduser);
	public boolean modifierProfilProf(Professeur prof, Long idProf);
	public boolean modifierStatutProf(Statut statut , Professeur prof);
	public boolean addMatiere(Matiere matiere);
	public boolean supprimerMatiere(Matiere matiere);
	public boolean modifierPrixMatiere(Matiere matiere,Long prix);
	public Collection<Eleve> getListEleve();
	public Collection<Professeur> getListProf();
	public String modifierTitreMatiere(Matiere mat, String intitule);
	public Collection<Cours> consulterCours();
	public boolean acheterCours(Cours cours, Eleve e);
	public Long rechargerCredit(Long credit, Eleve e);
	public EspacePersonnel getEspacePersonnel(Eleve e);
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau);
	public Collection<Cours> rechercheCours(Niveau niveau);
	public Collection<Cours> rechercherCours(String motCle);
	public Collection<Document> getListDocument(EspacePersonnel esp);
	public boolean seConnecter(String email, String motdepasse);
	public void inscrire(Utilisateur user);
	public Collection<Cours> getListCours(Professeur prof);
	public Collection<Disponibilite> getListDispo(Professeur prof);
	public Collection<Disponibilite> getlistDispoCours(Cours c, Professeur prof);
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Professeur prof);
	public boolean addDispo(Disponibilite d, Professeur prof);
	public Cours addCours(Cours c, Professeur prof);
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Professeur prof);
	public void saisirCompteRendu(String text, Long idCours, Professeur prof );
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Professeur prof);
	public Collection<Eleve> getElevesByCours(Cours c, Professeur prof);

	public boolean sedeconnecter();
	public boolean envoyerMessage(Message msg, Collection<Utilisateur> users);
	public boolean supprimerMessage(Message msg);
	public Collection<Message> getMessages();
	public boolean modifierMail(String mail, Utilisateur user);
	public boolean modifierMDP(String mdp, Utilisateur user);
	public String reinitilialiserMDP(Utilisateur user); // renvoyer le mot de passe a la boite mail
	boolean addCredit(Long credit, Eleve eleve);
	

}
