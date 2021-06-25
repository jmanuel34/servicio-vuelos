package com.cursoee.vuelos.service;

import java.util.List;

import com.cursoee.vuelos.model.Vuelo;

public interface VuelosService {
	List<Vuelo> listado(String plazas);
	void reservar(String idVuelo, String reservas);


}
