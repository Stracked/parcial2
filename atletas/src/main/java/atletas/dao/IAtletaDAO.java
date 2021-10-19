package atletas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import atletas.model.Atleta;

public interface IAtletaDAO extends JpaRepository<Atleta , Integer> {

}
