package atletas.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atletas.model.Atleta;
import atletas.service.IAtletaService;

@RestController
@RequestMapping("/ver_atleta")
public class VerAtletasController {
	@Autowired
	private IAtletaService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Atleta>> listar(){ 
		return new ResponseEntity<List<Atleta>>(service.listar(), HttpStatus.OK); 
	 }
}
