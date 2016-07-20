package com.bullying.dao;

import java.util.List;

import com.bullying.entity.Consolidacion;


public interface ConsolidacionDao extends Dao<Consolidacion, Long>
{

	void guardarIntegrante(Consolidacion consolidacion);

	List<Consolidacion> listarTodos();

	void eliminar(Consolidacion consolidacion);

	List<Consolidacion> listarPorNombre(String nombre);

}