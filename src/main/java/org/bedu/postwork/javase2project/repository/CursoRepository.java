package org.bedu.postwork.javase2project.repository;

import org.bedu.postwork.javase2project.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Integer> {
}
