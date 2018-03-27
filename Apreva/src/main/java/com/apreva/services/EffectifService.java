package com.apreva.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import com.apreva.domain.Effectif;


/**
 * Created by BNS.
 */
public interface EffectifService {

	public List<Effectif> listAll();

	public Effectif getById(Long idEffe);

	public Effectif saveOrUpdate(Effectif effectif);

	public Page<Effectif> effectifByName(Pageable p);

	public void deleteEffectif(@Param("numF") int numF);
	
	public Effectif getEffectif(Long idEff);
	
	public Page<Effectif> effectifParMC(@Param("x") String mc, Pageable p);


//	public Page<Effectif> findBenefByContrat(Pageable p, @Param("numF") int numF);

}
