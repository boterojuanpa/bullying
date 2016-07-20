package com.bullying.test;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bullying.dao.ConsolidacionDao;
import com.bullying.entity.Consolidacion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
@Transactional
public class TestUsuario
{
	
	@Autowired
	ConsolidacionDao consolidacionDao;
	
	@Test
	public void testUsuario()
	{
		Consolidacion consolidacionGuardar = new Consolidacion();
		consolidacionGuardar.setNombre("Fabio");
		consolidacionGuardar.setApellidos("Botero");
		consolidacionGuardar.setFecha(new Date());
		consolidacionGuardar.setSexo("M");
		consolidacionDao.guardarIntegrante(consolidacionGuardar);
		List<Consolidacion> consolidacion =  consolidacionDao.listarPorNombre("Fabio");
		assertTrue(consolidacion.size() == 1);
	}
}
