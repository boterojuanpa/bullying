package com.bullying.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bullying.dao.ConsolidacionDao;
import com.bullying.entity.Consolidacion;

@Repository
public class JpaConsolidacionDao extends JpaDao<Consolidacion, Long> implements ConsolidacionDao
{

	public JpaConsolidacionDao()
	{
		super(Consolidacion.class);
	}

	@Override
	@Transactional(readOnly=false)
	public void guardarIntegrante(Consolidacion consolidacion)
	{
		this.save(consolidacion);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Consolidacion> listarTodos()
	{
		return this.findAll();
	}
	
	@Override
	@Transactional(readOnly=false)
	public void eliminar(Consolidacion consolidacion)
	{
		this.delete(consolidacion.getId());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Consolidacion> listarPorNombre(String nombre)
	{
		Query query = this.getEntityManager().createNativeQuery("select * from consolidacion where nombre = ?");
		query.setParameter(1, nombre);
		return query.getResultList();
	}

}
