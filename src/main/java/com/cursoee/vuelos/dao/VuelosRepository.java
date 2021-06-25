package com.cursoee.vuelos.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoee.vuelos.model.Vuelo;

public interface VuelosRepository extends JpaRepository<Vuelo, Integer> {
	List<Vuelo> findByPlazasGreaterThanEqual(int plazas);

}
