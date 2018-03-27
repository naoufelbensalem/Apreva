package com.apreva.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import com.apreva.domain.Effectif;



/**
 * Created by BNS.
 */
public interface BeneficairesService {

//	public List<Effectif> listAll();
//
//	public Effectif getById(Long idEffe);
//
//	public Effectif saveOrUpdate(Effectif effectif);
//
//	public Page<Effectif> effectifByName(Pageable p);
//	
	public void deleteBeneficaires(Long id);
//
//	public void deleteEffectif(@Param("numF") int numF);
	
	public Page<Effectif> beneficairParMC(@Param("x") String mc,@Param("numF") int numF, Pageable p);
	
	public Effectif modifierBeneficaire(@RequestBody Effectif Effectif);

	public Page<Effectif> findBenefByContrat(Pageable p, @Param("numF") int numF);

}
