package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.cuentas;

public interface CuentasRepo extends JpaRepository<cuentas, Long>{

}
