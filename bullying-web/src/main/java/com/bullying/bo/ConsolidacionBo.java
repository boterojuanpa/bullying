package com.bullying.bo;

import java.util.List;

import com.bullying.entity.Consolidacion;


public interface ConsolidacionBo
{

	void guardarIntegrante(Consolidacion consolidacion);

	List<Consolidacion> listarTodos();

	void eliminar(Consolidacion consolidacion);

}