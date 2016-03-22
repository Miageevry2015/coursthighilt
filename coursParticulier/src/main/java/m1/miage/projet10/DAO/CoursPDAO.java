package m1.miage.projet10.DAO;

import java.util.Collection;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;


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

public class CoursPDAO implements InterfaceCoursPDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean addProf(Professeur user) {
		em.persist(user);
		System.out.println(user.getIdUtilisateur());
		return true;
	}

	@Override
	public boolean supprimerProf(Long iduser) {
		Professeur p = em.find(Professeur.class, iduser);
		em.remove(em.merge(p));// bon
		return true;
	}

	@Override
	public boolean modifierStatutProf(Statut statut, Professeur prof) {
		Professeur p = (Professeur) em.find(Utilisateur.class, prof.getIdUtilisateur());
		p.setStatut(statut);
		em.persist(p);
		return true;
	}

	@Override
	public boolean addMatiere(Matiere matiere) {
		em.persist(matiere);
		return true;
	}

	@Override
	public boolean supprimerMatiere(Matiere matiere) {
		em.remove(matiere);
		return true;
	}

	

	@Override
	public Collection<Eleve> getListEleve() {
		Query requet = em.createQuery("select e from Eleve e ");
		return requet.getResultList();
	}

	@Override
	public Collection<Professeur> getListProf() {
		Query requet = em.createQuery("select p from Professeur p");
		return requet.getResultList();
	}

	@Override
	public String modifierTitreMatiere(Matiere mat, String intitule) {
		Matiere m = em.find(Matiere.class, mat);
		m.setIntitule(intitule);
		em.persist(m);
		return m.getIntitule();
	}

	@Override
	public boolean addCredit(Long credit, Eleve eleve) {
		// TODO Auto-generated method stub
		Eleve e = (Eleve) em.find(Utilisateur.class, eleve);
		e.setCredits(e.getCredits()+credit);
		return true;
		
	}
	
	@Override
	public Collection<Cours> consulterCours() {
		Query requet = em.createQuery("select c from Cours c");
		return requet.getResultList();
	}

	@Override
	public Collection<Cours> rechercherCours(Matiere matiere, Niveau niveau) {
		Query requet = em.createQuery("select c from Cours c where c.matiere=:x and c.niveau=:y");
		requet.setParameter("x", matiere);
		requet.setParameter("y", niveau);
		return requet.getResultList();
	}

	@Override
	public Collection<Cours> rechercheCours(Niveau niveau) {
		// TODO Auto-generated method stub
		Query requet = em.createQuery("select c from Cours c where and c.niveau=:y");
		requet.setParameter("x", niveau);
		return requet.getResultList();
		
	}

	@Override
	public Collection<Cours> rechercherCours(String motCle) {
		// TODO Auto-generated method stub
		Query requet = em.createQuery("select c from Cours c where c.matiere like :x");
		requet.setParameter("x", "%"+motCle+"%");
		return requet.getResultList();
		
	}

	@Override
	public boolean acheterCours(Cours cours, Eleve e) {
		// TODO Auto-generated method stub
		Eleve el = (Eleve) em.find(Utilisateur.class, e);
		if(el.getCredits()> cours.getPrix())
		{
			el.setCredits(el.getCredits()-cours.getPrix());
			el.getListeCours().add(cours);
			em.persist(el);
			return true;
		}else
			return false;
	}

	@Override
	public Long rechargerCredit(Long credit, Eleve e) {
		Eleve el = (Eleve) em.find(Utilisateur.class, e);
		el.setCredits(el.getCredits()+credit);
		em.persist(el);
		return el.getCredits();
	}

	@Override
	public EspacePersonnel getEspacePersonnel(Eleve e) {
		// TODO Auto-generated method stub
		Eleve el = (Eleve) em.find(Utilisateur.class, e);
		return el.getEspacePersonnel();
	}
	
	@Override
	public Collection<Document> getListDocument(EspacePersonnel esp) {
		// TODO Auto-generated method stub
		Query requet = em.createQuery("select es from EspacePersonnel");
		return requet.getResultList();
	}
	@Override
	public Collection<Cours> getListCours(Professeur prof) {
		// TODO Auto-generated method stub
		Professeur p = (Professeur) em.find(Utilisateur.class, prof);
		return p.getListeCours();
	}

	@Override
	public Collection<Disponibilite> getListDispo(Professeur prof) {
		Professeur p = (Professeur) em.find(Utilisateur.class, prof);
		return p.getListeDisponibilte();
	}

	@Override
	public Collection<Disponibilite> getlistDispoCours(Cours c, Professeur prof) {
		Professeur p = (Professeur) em.find(Utilisateur.class, prof);
		for(Cours cours : p.getListeCours())
		{
			if(cours.equals(c))
				return cours.getDate();
		}
		return null;
	}

	
	@Override
	public Cours addCours(Cours c, Professeur prof) {
		// probleme dans la matiere et la sauvegarde des objets avant d enregistrer dans le prof
		// prblm avec l objet matiere
		Matiere m = c.getMatiere();
		
		//Professeur p =  em.find(Professeur.class, 2L);
		//Cours c1 = new Cours("C++", 10L, "1h", null, null, null);
		//em.persist(c);
		//p.setAdresse("11");
		//p.getListeCours().add(c1);
		
		System.out.println();
		//em.merge(p);
		return c;
		
	}

	@Override
	public Cours addCours(Cours c, Collection<Disponibilite> dispo, Professeur prof) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deposerDocument(Document doc, Collection<Eleve> listeEleve, Professeur prof) {
		
		
	}

	@Override
	public Collection<Eleve> getElevesByCours(Cours c, Professeur prof) {
		
		return null;
	}

	@Override
	public Disponibilite supprimerDisponibilite(Disponibilite Dispo, Professeur prof) {
		Professeur p = (Professeur) em.find(Utilisateur.class, prof);
		p.getListeDisponibilte().remove(Dispo);
		em.merge(p);
		return null;
	}

	@Override
	public boolean addDispo(Disponibilite d, Professeur prof) {
		Professeur p =  em.find(Professeur.class, 2L);
		em.persist(d);
		p.getListeDisponibilte().add(d);
		em.merge(p);
		return true;
	}
	
	@Override
	public boolean sedeconnecter() {
		
		return false;
	}

	@Override
	public boolean envoyerMessage(Message msg, Collection<Utilisateur> users) {
		for (Utilisateur user : users)
		{
			user.getListsMessage().add(msg);
			em.persist(user);
		}
		return true;
	}

	@Override
	public boolean supprimerMessage(Message msg) {
		em.remove(msg);
		return true;
	}

	@Override
	public Collection<Message> getMessages() {
		Query requet = em.createQuery("select m from Message");
		return requet.getResultList();
	}

	@Override
	public boolean modifierMail(String mail, Utilisateur user) {
		Utilisateur u = em.find(Utilisateur.class, user);
		u.setEmail(mail);
		em.persist(u);
		return true;
	}

	@Override
	public boolean modifierMDP(String mdp, Utilisateur user) {
		Utilisateur u = em.find(Utilisateur.class, user);
		u.setMotDePasse(mdp);
		em.persist(u);
		return true;
	}

	@Override
	public String reinitilialiserMDP(Utilisateur user) {
		Utilisateur u = em.find(Utilisateur.class, user);
		return u.getMotDePasse();
		
	}

	@Override
	public boolean seConnecter(String email, String motdepasse) {
		
		return false;
	}

	
	@Override
	public boolean modifierProfilProf(Professeur prof, Long idProf) {
		
		em.merge(prof);
		return true;
		
	}

	@Override
	public boolean modifierPrixMatiere(Matiere matiere, Long prix) {
		Matiere m = em.find(Matiere.class, matiere);
		m.setPrix(prix);
		return true;
	}
	@Override
	public void saisirCompteRendu(String text, Long idCours, Professeur prof) {
		
		Professeur p = (Professeur) em.find(Utilisateur.class, prof);
		for(Cours cours : p.getListeCours())
			if(cours.getIdCours().equals(idCours))
				cours.setCompteRendu(text);
				
	}

	@Override
	public void inscrire(Utilisateur user) {
		em.persist(user);
	}
	
}
