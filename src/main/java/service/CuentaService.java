package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import modelo.cuentas;
import repository.CuentasRepo;

@Service
public class CuentaService {
	
	@Autowired
	private CuentasRepo cuentaRepo;
	
	public cuentas create (cuentas cuenta) {
		return cuentaRepo.save(cuenta);
	}
	
	public java.util.List<cuentas> getAllCuentas(){
		return cuentaRepo.findAll();
	}
	
	public void delete (cuentas cuenta) {
		 cuentaRepo.delete(cuenta);
	}
	
	public Optional<cuentas> findById (Long id) {
		return cuentaRepo.findById(id);
	}
	
}
