package com.apreva.controllers;

import java.util.List;

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
import com.apreva.services.EffectifService;


/**
 * Created by NBS.
 */
@RestController
public class BeneficairesController {
	
    @Autowired
    private BeneficairesService beneficairesService;

    @Autowired
    private EffectifRepository effectifRepository;
   
//    @RequestMapping("/effectif")
//    public String redirToList(){
//        return "redirect:/effectif/list";
//    }
//    
//    
//	@RequestMapping("/effectifByName")
//	public Page<Effectif> getBatiments(int page) {
//	return effectifService.effectifByName(new PageRequest(page, 5));
//	}
	
	
	@RequestMapping("/effectif/getBenefByNumFamil")
	public Page<Effectif> getBenefByNumFamil(int page,int numF) {
	return beneficairesService.findBenefByContrat(new PageRequest(page, 15),numF);
	}
    
    

	@RequestMapping("/beneficaires/ParMC")
	public Page<Effectif> getBatiments(String mc,int numF, int page) {
		return beneficairesService.beneficairParMC("%" + mc + "%",numF, new PageRequest(page, 15));
	}

//    
//    @RequestMapping("/effectif/findOne")
//    public Effectif findById(Long idEffe) {
//      return effectifService.getById(idEffe);
//    }
//
	@RequestMapping(value = "/beneficaires/delete")
	public void deleteBeneficaires(Long numF) {
		beneficairesService.deleteBeneficaires(numF);
	}

	@RequestMapping(value = "/beneficaires/modifier", method = RequestMethod.PUT)
	public Effectif modifierBeneficaire(@RequestBody Effectif Effectif) {
		return beneficairesService.modifierBeneficaire(Effectif);
	}
    
    
//	@RequestMapping(value = "/saveBatiments", method = RequestMethod.POST)
//	public Effectif save(@RequestBody Effectif e) {
//		return effectifService.saveOrUpdate(e);
//	}
	
	
    

}
