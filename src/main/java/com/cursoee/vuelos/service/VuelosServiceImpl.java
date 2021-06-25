package com.cursoee.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoee.vuelos.dao.VuelosRepository;
import com.cursoee.vuelos.model.Vuelo;

@Service
public class VuelosServiceImpl implements VuelosService {
	@Autowired
	VuelosRepository repository;
	

	@Override
	public List<Vuelo> listado(String plazas) {
		Integer reservas= Integer.parseInt(plazas);
		return repository.findByPlazasGreaterThanEqual(reservas); 
	}

	@Override
	public void reservar(String idVuelo, String reservas) {
		Integer numVuelo = Integer.parseInt(idVuelo);
		Integer plazas= Integer.parseInt(reservas);
		Vuelo vuelo= buscar(numVuelo);
		vuelo.setPlazas(vuelo.getPlazas()-plazas);
		repository.save(vuelo);

	}
	private Vuelo buscar(int idVuelo) {
		return repository.findById(idVuelo)
				.stream()
				.findFirst()
				.orElse(new Vuelo());
	}

}
