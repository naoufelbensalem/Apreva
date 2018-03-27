package com.apreva.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.apreva.domain.Effectif;
import com.apreva.repositories.EffectifRepository;
import java.util.List;


/**
 * Created by BNS.
 */
@Service
public class EffectifServiceImpl implements EffectifService {

	@Autowired
	private EffectifRepository effectifRepository;

	@Override
	public List<Effectif> listAll() {
		return effectifRepository.findAll();
	}

	@Override
	public Page<Effectif> effectifByName(Pageable pageRequest) {
		return effectifRepository.effectifsByName(pageRequest);
	}

	
	@Override
	public Page<Effectif> effectifParMC(@Param("x") String mc, Pageable p)
	 {
			return effectifRepository.effectifParMC(mc,p);
		}
	
//	@Override
//	public Page<Effectif> findBenefByContrat(Pageable pageRequest,int numF) {
//		return effectifRepository.findBenefByContrat(pageRequest,numF);
//	}
	
	@Override
	public Effectif getEffectif(Long idEff) {
		return effectifRepository.findOne(idEff);
	}

	@Override
	public Effectif saveOrUpdate(Effectif effectif) {

		return effectifRepository.saveAndFlush(effectif);
	}

	@Override
	public void deleteEffectif(int mc) {
		effectifRepository.deleteEffectif(mc);
	}

	public Effectif getById(Long idEffe) {
		return effectifRepository.findOne(idEffe);
	}

	// @Override
	// public Page<Effectif> EffectifByName(Pageable p) {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
