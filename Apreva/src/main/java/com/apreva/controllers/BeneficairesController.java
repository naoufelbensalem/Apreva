package com.apreva.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.apreva.domain.Effectif;
import com.apreva.repositories.EffectifRepository;
import com.apreva.services.BeneficairesService;


/**
 * Created by NBS.
 */
@RestController
@RequestMapping("/beneficaires")
public class BeneficairesController {
	
    @Autowired
    private BeneficairesService beneficairesService;

   
	@RequestMapping("/getBenefByNumFamil")
	public Page<Effectif> getBenefByNumFamil(int page,int numF) {
	return beneficairesService.findBenefByContrat(new PageRequest(page, 15),numF);
	}
    
    
	@RequestMapping("/ParMC")
	public Page<Effectif> getBatiments(String mc,int numF, int page) {
		return beneficairesService.beneficairParMC("%" + mc + "%",numF, new PageRequest(page, 15));
	}

	@RequestMapping(value = "/delete")
	public void deleteBeneficaires(Long numF) {
		beneficairesService.deleteBeneficaires(numF);
	}

	@RequestMapping(value = "/modifier", method = RequestMethod.PUT)
	public Effectif modifierBeneficaire(@RequestBody Effectif Effectif) {
		return beneficairesService.modifierBeneficaire(Effectif);
	}
    
    
    

}
