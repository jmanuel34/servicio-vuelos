package com.cursoee.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoee.vuelos.model.Vuelo;
import com.cursoee.vuelos.service.VuelosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//@CrossOrigin("*")
@Api("Servicio de vuelos")
@RestController
public class Controller {
	@Autowired
	VuelosService service;
		
		@ApiOperation("Devuelve todos los vuelos con mas plazas de las requeridas en parametro")
		@GetMapping(value="vuelos/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<Vuelo> vuelos (@PathVariable("plazas") String reservas) {
			return service.listado(reservas);
		}
		
		@ApiOperation("Reserva el vuelo con las plazas solicitadas")
		@PutMapping(value="reservar/{idVuelo}/{plazas}")
		public void reservar(@PathVariable ("idVuelo") String idVuelo,
									@PathVariable ("plazas") String plazas) {
			service.reservar(idVuelo, plazas);
			}
	}