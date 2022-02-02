package rest;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import modelo.cuentas;
import service.CuentaService;

@RestController
@RequestMapping ("/api/v2/pokemon")
public class CuentaRestFul {

	@Autowired
	private CuentaService cuentaServi;
	
	@PostMapping
	private ResponseEntity<cuentas> guardar (@RequestBody cuentas cuenta){
		cuentas ct = cuentaServi.create(cuenta);
		
		try {
			return ResponseEntity.created(new URI("/api/persona"+ct.getId())).body(ct);
			
			}catch (Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}
		
		
		@GetMapping
		private ResponseEntity<java.util.List<cuentas>> listarTodasLasCuentas (){
			return ResponseEntity.ok(cuentaServi.getAllCuentas());
		}
		
		@DeleteMapping
		private ResponseEntity<Void> eliminarCuentas (@RequestBody cuentas cuenta){
			cuentaServi.delete(cuenta);
			return ResponseEntity.ok().build();
		}
		
		@GetMapping (value = "{id}")
		private ResponseEntity<Optional<cuentas>> listarCuentaPorID (@PathVariable ("id") Long id){
			return ResponseEntity.ok(cuentaServi.findById(id));
		}
		

	}