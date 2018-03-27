package com.apreva.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.apreva.domain.Effectif;
import com.apreva.repositories.BeneficairesRepository;



/**
 * Created by NBS.
 */
@Service
public class BeneficairesServiceImpl implements BeneficairesService {

	@Autowired
	private BeneficairesRepository beneficairesRepository;

	// @Override
	// public List<Effectif> listAll() {
	// return effectifRepository.findAll();
	// }
	//
	// @Override
	// public Page<Effectif> effectifByName(Pageable pageRequest) {
	// return effectifRepository.effectifsByName(pageRequest);
	// }

	@Override
	public Page<Effectif> findBenefByContrat(Pageable pageRequest, int numF) {
		return beneficairesRepository.findBenefByContrat(pageRequest, numF);
	}

	// @Override
	// public Effectif saveOrUpdate(Effectif effectif) {
	//
	// return effectifRepository.saveAndFlush(effectif);
	// }
	//
	@Override
	public void deleteBeneficaires(Long mc) {
		beneficairesRepository.delete(mc);
	}

	
	@Override
	public Page<Effectif> beneficairParMC(@Param("x") String mc,@Param("numF") int numF, Pageable p)
	 {
			return beneficairesRepository.beneficairParMC(mc,numF,p);
		}
	//
	// public Effectif getById(Long idEffe) {
	// return effectifRepository.findOne(idEffe);
	// }

	// @Override
	// public Page<Effectif> EffectifByName(Pageable p) {
	// // TODO Auto-generated method stub
	// return null;
	// }

	@Override
	public Effectif modifierBeneficaire(@RequestBody Effectif Effectif) {
		return beneficairesRepository.saveAndFlush(Effectif);
	}

}
