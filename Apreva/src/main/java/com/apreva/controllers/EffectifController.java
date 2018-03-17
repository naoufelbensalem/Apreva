package com.apreva.controllers;

import java.util.HashMap;
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
import com.apreva.services.EffectifService;


/**
 * Created by NBS.
 */
@RestController
public class EffectifController {
	
    @Autowired
    private EffectifService effectifService;

    @Autowired
    private EffectifRepository effectifRepository;
   
    @RequestMapping("/effectif")
    public String redirToList(){
    	return "redirect:/effectif/list";
    }
    
    
	@RequestMapping("/effectifByName")
	public Page<Effectif> getBatiments(int page) {
	return effectifService.effectifByName(new PageRequest(page, 15));
	}
	
	
//	@RequestMapping("/effectif/getBenefByNumFamil")
//	public Page<Effectif> getBenefByNumFamil(int page,int numF) {
//	return effectifService.findBenefByContrat(new PageRequest(page, 5),numF);
//	}
//    
	
	
	@RequestMapping("/effectif/ParMC")
	public Page<Effectif> getBatiments(String mc, int page) {
		return effectifService.effectifParMC("%" + mc + "%", new PageRequest(page, 15));
	}

	
	@RequestMapping("/getEffectif")
	public Effectif getEffectif(Long idEff) {
		return effectifService.getEffectif(idEff);
	}

    @RequestMapping("/listeEffectif")
    public List<Effectif> findItems() {
      return effectifService.listAll();
    }
    
    @RequestMapping("/effectif/findOne")
    public Effectif findById(Long idEffe) {
      return effectifService.getById(idEffe);
    }

	@RequestMapping(value = "/effectif/delete")
	public void deleteEffectif(int numF) {
		effectifService.deleteEffectif(numF);
	}


    
    
	@RequestMapping(value = "/saveEffectifs", method = RequestMethod.POST)
	public Effectif save(@RequestBody Effectif e) {
		return effectifService.saveOrUpdate(e);
	}
	
	
    

}
