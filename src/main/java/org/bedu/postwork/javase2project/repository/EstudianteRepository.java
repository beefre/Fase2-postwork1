package org.bedu.postwork.javase2project.repository;

import org.bedu.postwork.javase2project.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante,Integer> {
}
