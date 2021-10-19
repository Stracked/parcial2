package atletas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atletas.dao.IAtletaDAO;
import atletas.model.Atleta;
import atletas.service.IAtletaService;

@Service
public class AtletaServiceImpl implements IAtletaService {

	@Autowired
	private IAtletaDAO dao;	
	
	@Override
	public Atleta registrar(Atleta t) {
		return dao.save(t);
	}

	@Override
	public Atleta modificar(Atleta t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Atleta> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Atleta> listar() {
		return dao.findAll();
	}

}
