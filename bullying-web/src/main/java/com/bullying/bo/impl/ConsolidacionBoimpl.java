package com.bullying.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullying.bo.ConsolidacionBo;
import com.bullying.dao.ConsolidacionDao;
import com.bullying.entity.Consolidacion;

@Service
public class ConsolidacionBoimpl implements ConsolidacionBo
{
	@Autowired
	ConsolidacionDao consolidacionDao;

	@Override
	public void guardarIntegrante(Consolidacion consolidacion) 
	{
		consolidacionDao.guardarIntegrante(consolidacion);
		
	}

	@Override
	public List<Consolidacion> listarTodos() {
		return consolidacionDao.listarTodos();
	}

	@Override
	public void eliminar(Consolidacion consolidacion) {
		consolidacionDao.eliminar(consolidacion);
		
	}	

}
