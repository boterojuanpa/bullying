package com.bullying.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bullying.bo.ConsolidacionBo;
import com.bullying.entity.Consolidacion;

@Component
@Path("/consolidacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConsolidacionResource {
	
	@Autowired
	ConsolidacionBo consolidacionBo;

	@POST
	@Path("guardarIntegrante")
	public void guardarIntegrante(Consolidacion consolidacion)
	{
		consolidacionBo.guardarIntegrante(consolidacion);
	}
	
	@GET
	@Path("listarTodos")
	public List<Consolidacion> listarTodos()
	{
		return consolidacionBo.listarTodos();
	}
	
	@POST
	@Path("eliminar")
	public void eliminar(Consolidacion consolidacion)
	{
		consolidacionBo.eliminar(consolidacion);
	}
}
