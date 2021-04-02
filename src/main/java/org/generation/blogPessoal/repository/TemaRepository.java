/* 2  Uma camada de repository com o nome TemaRepository (com a capacidade de se comunicar com o banco de dados mysql).*/

package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List <Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
