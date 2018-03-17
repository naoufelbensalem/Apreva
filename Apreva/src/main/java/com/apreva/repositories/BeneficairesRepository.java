package com.apreva.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.apreva.domain.Effectif;

/**
 * Created by BNS.
 */
public interface BeneficairesRepository extends JpaRepository<Effectif, Long> {

//	@Query("select e from Effectif e WHERE e.id_effectif in (SELECT id_effectif FROM Effectif where date_signature_ptf IS NOT NULL   )")
//	public Page<Effectif> effectifsByName(Pageable p);

	@Query("select e from Effectif e WHERE e.id_effectif in (SELECT id_effectif FROM Effectif where date_entre_organisme is NULL and numero_famille =:numF  )")
	public Page<Effectif> findBenefByContrat(Pageable p, @Param("numF") int numF);

	@Query("select e from Effectif e WHERE e.id_effectif in (SELECT id_effectif FROM Effectif where date_entre_organisme IS NULL and numero_famille like :numF and (date_entre_organisme like :x or  upper(nom) like upper(:x) or upper(prenom) like upper(:x) ) )")
	public Page<Effectif> beneficairParMC(@Param("x") String mc,@Param("numF") int numF, Pageable p);
	
	
	
//	@Transactional
//	@Modifying
//	@Query("delete from Effectif e where e.numero_famille = :x")
//	public void deleteEffectif(@Param("x") int x);

	
	
}
