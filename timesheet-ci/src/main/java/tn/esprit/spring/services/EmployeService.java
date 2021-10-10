package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;

@Service
public class EmployeService implements IEmployeService {
	
	@Autowired
	EmployeRepository ie;
	
	
	public Employe addEmploye(Employe employe)
	{
		return ie.save(employe); 
		
	}
	
	public List<Employe> retrieveAllEmploye(){}
	public void remove(int idEmploye){}
	public Employe updateEmploye(Employe employe){}

}
