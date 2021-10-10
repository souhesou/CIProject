package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Employe;

public interface IEmployeService {
	

	public Employe addEmploye(Employe employe);
	public List<Employe> retrieveAllEmploye();
	public void remove(int idEmploye);
	public Employe updateEmploye(Employe employe);
	
}
