package com.apreva.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Created by NBS.
 */
@Entity
public class Effectif {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Long id_effectif;
	
    private int numero_famille;         
    
    private String reference_interne_famille;
    
    private int rang_pres_famille;         
    
    private String date_entre_organisme; 
    
    private String nom;          
    
    private String nom_patronymique; 
    
    private String prenom;   
    
    private String date_naissance; 
    
    private String rang_genellaire;
    
    private String code_civilite;

    private String sexe;

    private String situation_familiale;

    private String code_qualite_personne;

    private String nationalite;

    private String nom_usage;

    private String assure;

    private String num_secu;

    private int cle_secu;

    private String grand_regime;

    private String caisse;

    private String centre_payeur;

    private String code_cpl_grand_regime;   

    private String refus_teletrans;   

    private String loi_madelin;        

    private String debut_periode_madelin;      

    private String fin_periode_madelin;        

    private String salarie;           

    private String matricule;                 

    private String code_college;              

    private String commercial;                 

    private String csp;                        

    private String statut_juridique;           

    private String code_agence;                

    private String adresse_normee;     

    private String reference_adresse;          

    private String auxiliaire_adresse1;       

    private String AUXILIAIRE_ADRESSE2;        

    private String num_voie;                   

    private String complement_num_voie;       

    private String lib_voie;                  

    private String lieu_dit;               

    private String nom_lieu_dit;               

    private String code_postal;                

    private String nom_acheminement;          

    private String code_pays;                  

    private String coordonne_tel_fixe;        

    private String commentaire_tel_fix;        

    private String coordonne_tel_portable;    

    private String commentaire_tel_por;        

    private String coordonne_mail;            

    private String commentaire_mel;            

    private String num_coll;                   

    private String num_contrat;                

    private String reference_contrat;          

    private String date_debut_contrat;         

    private String date_fin_contrat;           

    private String mode_paiement;              

    private String jour_paiements;             

    private String date_signature_ptf;         

    private String num_contrat_signe_ptf;      

    private String date_signature_mandat ;     

    private String num_contrat_rattachement;   

    private String date_debut_rattachement;    

    private String date_fin_rattachement;      

    private String code_mode_reglement;        

    private String num_banque_cot;             

    private String num_guichet_cot;            

    private String num_compte_cot;             

    private String cle_rib_cot;                

    private String code_bic_cot;               

    private String num_iban_cot;              

    private String titulaire_rib_cot;          

    private String num_banque_prest;           

    private String num_guichet_prest;          

    private String num_compte_prest;           

    private String cle_rib_prest;              

    private String code_bic_prest;             

    private String num_iban_prest;             

    private String titulaire_rib_prest;        

    private String date_enreg;                 

    private String azerty;

	public Long getId_effectif() {
		return id_effectif;
	}

	public void setId_effectif(Long id_effectif) {
		this.id_effectif = id_effectif;
	}

	public int getNumero_famille() {
		return numero_famille;
	}

	public void setNumero_famille(int numero_famille) {
		this.numero_famille = numero_famille;
	}

	public String getReference_interne_famille() {
		return reference_interne_famille;
	}

	public void setReference_interne_famille(String reference_interne_famille) {
		this.reference_interne_famille = reference_interne_famille;
	}

	public int getRang_pres_famille() {
		return rang_pres_famille;
	}

	public void setRang_pres_famille(int rang_pres_famille) {
		this.rang_pres_famille = rang_pres_famille;
	}

	public String getDate_entre_organisme() {
		return date_entre_organisme;
	}

	public void setDate_entre_organisme(String date_entre_organisme) {
		this.date_entre_organisme = date_entre_organisme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom_patronymique() {
		return nom_patronymique;
	}

	public void setNom_patronymique(String nom_patronymique) {
		this.nom_patronymique = nom_patronymique;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getRang_genellaire() {
		return rang_genellaire;
	}

	public void setRang_genellaire(String rang_genellaire) {
		this.rang_genellaire = rang_genellaire;
	}

	public String getCode_civilite() {
		return code_civilite;
	}

	public void setCode_civilite(String code_civilite) {
		this.code_civilite = code_civilite;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSituation_familiale() {
		return situation_familiale;
	}

	public void setSituation_familiale(String situation_familiale) {
		this.situation_familiale = situation_familiale;
	}

	public String getCode_qualite_personne() {
		return code_qualite_personne;
	}

	public void setCode_qualite_personne(String code_qualite_personne) {
		this.code_qualite_personne = code_qualite_personne;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getNom_usage() {
		return nom_usage;
	}

	public void setNom_usage(String nom_usage) {
		this.nom_usage = nom_usage;
	}

	public String getAssure() {
		return assure;
	}

	public void setAssure(String assure) {
		this.assure = assure;
	}

	public String getNum_secu() {
		return num_secu;
	}

	public void setNum_secu(String num_secu) {
		this.num_secu = num_secu;
	}

	public int getCle_secu() {
		return cle_secu;
	}

	public void setCle_secu(int cle_secu) {
		this.cle_secu = cle_secu;
	}

	public String getGrand_regime() {
		return grand_regime;
	}

	public void setGrand_regime(String grand_regime) {
		this.grand_regime = grand_regime;
	}

	public String getCaisse() {
		return caisse;
	}

	public void setCaisse(String caisse) {
		this.caisse = caisse;
	}

	public String getCentre_payeur() {
		return centre_payeur;
	}

	public void setCentre_payeur(String centre_payeur) {
		this.centre_payeur = centre_payeur;
	}

	public String getCode_cpl_grand_regime() {
		return code_cpl_grand_regime;
	}

	public void setCode_cpl_grand_regime(String code_cpl_grand_regime) {
		this.code_cpl_grand_regime = code_cpl_grand_regime;
	}

	public String getRefus_teletrans() {
		return refus_teletrans;
	}

	public void setRefus_teletrans(String refus_teletrans) {
		this.refus_teletrans = refus_teletrans;
	}

	public String getLoi_madelin() {
		return loi_madelin;
	}

	public void setLoi_madelin(String loi_madelin) {
		this.loi_madelin = loi_madelin;
	}

	public String getDebut_periode_madelin() {
		return debut_periode_madelin;
	}

	public void setDebut_periode_madelin(String debut_periode_madelin) {
		this.debut_periode_madelin = debut_periode_madelin;
	}

	public String getFin_periode_madelin() {
		return fin_periode_madelin;
	}

	public void setFin_periode_madelin(String fin_periode_madelin) {
		this.fin_periode_madelin = fin_periode_madelin;
	}

	public String getSalarie() {
		return salarie;
	}

	public void setSalarie(String salarie) {
		this.salarie = salarie;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCode_college() {
		return code_college;
	}

	public void setCode_college(String code_college) {
		this.code_college = code_college;
	}

	public String getCommercial() {
		return commercial;
	}

	public void setCommercial(String commercial) {
		this.commercial = commercial;
	}

	public String getCsp() {
		return csp;
	}

	public void setCsp(String csp) {
		this.csp = csp;
	}

	public String getStatut_juridique() {
		return statut_juridique;
	}

	public void setStatut_juridique(String statut_juridique) {
		this.statut_juridique = statut_juridique;
	}

	public String getCode_agence() {
		return code_agence;
	}

	public void setCode_agence(String code_agence) {
		this.code_agence = code_agence;
	}

	public String getAdresse_normee() {
		return adresse_normee;
	}

	public void setAdresse_normee(String adresse_normee) {
		this.adresse_normee = adresse_normee;
	}

	public String getReference_adresse() {
		return reference_adresse;
	}

	public void setReference_adresse(String reference_adresse) {
		this.reference_adresse = reference_adresse;
	}

	public String getAuxiliaire_adresse1() {
		return auxiliaire_adresse1;
	}

	public void setAuxiliaire_adresse1(String auxiliaire_adresse1) {
		this.auxiliaire_adresse1 = auxiliaire_adresse1;
	}

	public String getAUXILIAIRE_ADRESSE2() {
		return AUXILIAIRE_ADRESSE2;
	}

	public void setAUXILIAIRE_ADRESSE2(String aUXILIAIRE_ADRESSE2) {
		AUXILIAIRE_ADRESSE2 = aUXILIAIRE_ADRESSE2;
	}

	public String getNum_voie() {
		return num_voie;
	}

	public void setNum_voie(String num_voie) {
		this.num_voie = num_voie;
	}

	public String getComplement_num_voie() {
		return complement_num_voie;
	}

	public void setComplement_num_voie(String complement_num_voie) {
		this.complement_num_voie = complement_num_voie;
	}

	public String getLib_voie() {
		return lib_voie;
	}

	public void setLib_voie(String lib_voie) {
		this.lib_voie = lib_voie;
	}

	public String getLieu_dit() {
		return lieu_dit;
	}

	public void setLieu_dit(String lieu_dit) {
		this.lieu_dit = lieu_dit;
	}

	public String getNom_lieu_dit() {
		return nom_lieu_dit;
	}

	public void setNom_lieu_dit(String nom_lieu_dit) {
		this.nom_lieu_dit = nom_lieu_dit;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getNom_acheminement() {
		return nom_acheminement;
	}

	public void setNom_acheminement(String nom_acheminement) {
		this.nom_acheminement = nom_acheminement;
	}

	public String getCode_pays() {
		return code_pays;
	}

	public void setCode_pays(String code_pays) {
		this.code_pays = code_pays;
	}

	public String getCoordonne_tel_fixe() {
		return coordonne_tel_fixe;
	}

	public void setCoordonne_tel_fixe(String coordonne_tel_fixe) {
		this.coordonne_tel_fixe = coordonne_tel_fixe;
	}

	public String getCommentaire_tel_fix() {
		return commentaire_tel_fix;
	}

	public void setCommentaire_tel_fix(String commentaire_tel_fix) {
		this.commentaire_tel_fix = commentaire_tel_fix;
	}

	public String getCoordonne_tel_portable() {
		return coordonne_tel_portable;
	}

	public void setCoordonne_tel_portable(String coordonne_tel_portable) {
		this.coordonne_tel_portable = coordonne_tel_portable;
	}

	public String getCommentaire_tel_por() {
		return commentaire_tel_por;
	}

	public void setCommentaire_tel_por(String commentaire_tel_por) {
		this.commentaire_tel_por = commentaire_tel_por;
	}

	public String getCoordonne_mail() {
		return coordonne_mail;
	}

	public void setCoordonne_mail(String coordonne_mail) {
		this.coordonne_mail = coordonne_mail;
	}

	public String getCommentaire_mel() {
		return commentaire_mel;
	}

	public void setCommentaire_mel(String commentaire_mel) {
		this.commentaire_mel = commentaire_mel;
	}

	public String getNum_coll() {
		return num_coll;
	}

	public void setNum_coll(String num_coll) {
		this.num_coll = num_coll;
	}

	public String getNum_contrat() {
		return num_contrat;
	}

	public void setNum_contrat(String num_contrat) {
		this.num_contrat = num_contrat;
	}

	public String getReference_contrat() {
		return reference_contrat;
	}

	public void setReference_contrat(String reference_contrat) {
		this.reference_contrat = reference_contrat;
	}

	public String getDate_debut_contrat() {
		return date_debut_contrat;
	}

	public void setDate_debut_contrat(String date_debut_contrat) {
		this.date_debut_contrat = date_debut_contrat;
	}

	public String getDate_fin_contrat() {
		return date_fin_contrat;
	}

	public void setDate_fin_contrat(String date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}

	public String getMode_paiement() {
		return mode_paiement;
	}

	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}

	public String getJour_paiements() {
		return jour_paiements;
	}

	public void setJour_paiements(String jour_paiements) {
		this.jour_paiements = jour_paiements;
	}

	public String getDate_signature_ptf() {
		return date_signature_ptf;
	}

	public void setDate_signature_ptf(String date_signature_ptf) {
		this.date_signature_ptf = date_signature_ptf;
	}

	public String getNum_contrat_signe_ptf() {
		return num_contrat_signe_ptf;
	}

	public void setNum_contrat_signe_ptf(String num_contrat_signe_ptf) {
		this.num_contrat_signe_ptf = num_contrat_signe_ptf;
	}

	public String getDate_signature_mandat() {
		return date_signature_mandat;
	}

	public void setDate_signature_mandat(String date_signature_mandat) {
		this.date_signature_mandat = date_signature_mandat;
	}

	public String getNum_contrat_rattachement() {
		return num_contrat_rattachement;
	}

	public void setNum_contrat_rattachement(String num_contrat_rattachement) {
		this.num_contrat_rattachement = num_contrat_rattachement;
	}

	public String getDate_debut_rattachement() {
		return date_debut_rattachement;
	}

	public void setDate_debut_rattachement(String date_debut_rattachement) {
		this.date_debut_rattachement = date_debut_rattachement;
	}

	public String getDate_fin_rattachement() {
		return date_fin_rattachement;
	}

	public void setDate_fin_rattachement(String date_fin_rattachement) {
		this.date_fin_rattachement = date_fin_rattachement;
	}

	public String getCode_mode_reglement() {
		return code_mode_reglement;
	}

	public void setCode_mode_reglement(String code_mode_reglement) {
		this.code_mode_reglement = code_mode_reglement;
	}

	public String getNum_banque_cot() {
		return num_banque_cot;
	}

	public void setNum_banque_cot(String num_banque_cot) {
		this.num_banque_cot = num_banque_cot;
	}

	public String getNum_guichet_cot() {
		return num_guichet_cot;
	}

	public void setNum_guichet_cot(String num_guichet_cot) {
		this.num_guichet_cot = num_guichet_cot;
	}

	public String getNum_compte_cot() {
		return num_compte_cot;
	}

	public void setNum_compte_cot(String num_compte_cot) {
		this.num_compte_cot = num_compte_cot;
	}

	public String getCle_rib_cot() {
		return cle_rib_cot;
	}

	public void setCle_rib_cot(String cle_rib_cot) {
		this.cle_rib_cot = cle_rib_cot;
	}

	public String getCode_bic_cot() {
		return code_bic_cot;
	}

	public void setCode_bic_cot(String code_bic_cot) {
		this.code_bic_cot = code_bic_cot;
	}

	public String getNum_iban_cot() {
		return num_iban_cot;
	}

	public void setNum_iban_cot(String num_iban_cot) {
		this.num_iban_cot = num_iban_cot;
	}

	public String getTitulaire_rib_cot() {
		return titulaire_rib_cot;
	}

	public void setTitulaire_rib_cot(String titulaire_rib_cot) {
		this.titulaire_rib_cot = titulaire_rib_cot;
	}

	public String getNum_banque_prest() {
		return num_banque_prest;
	}

	public void setNum_banque_prest(String num_banque_prest) {
		this.num_banque_prest = num_banque_prest;
	}

	public String getNum_guichet_prest() {
		return num_guichet_prest;
	}

	public void setNum_guichet_prest(String num_guichet_prest) {
		this.num_guichet_prest = num_guichet_prest;
	}

	public String getNum_compte_prest() {
		return num_compte_prest;
	}

	public void setNum_compte_prest(String num_compte_prest) {
		this.num_compte_prest = num_compte_prest;
	}

	public String getCle_rib_prest() {
		return cle_rib_prest;
	}

	public void setCle_rib_prest(String cle_rib_prest) {
		this.cle_rib_prest = cle_rib_prest;
	}

	public String getCode_bic_prest() {
		return code_bic_prest;
	}

	public void setCode_bic_prest(String code_bic_prest) {
		this.code_bic_prest = code_bic_prest;
	}

	public String getNum_iban_prest() {
		return num_iban_prest;
	}

	public void setNum_iban_prest(String num_iban_prest) {
		this.num_iban_prest = num_iban_prest;
	}

	public String getTitulaire_rib_prest() {
		return titulaire_rib_prest;
	}

	public void setTitulaire_rib_prest(String titulaire_rib_prest) {
		this.titulaire_rib_prest = titulaire_rib_prest;
	}

	public String getDate_enreg() {
		return date_enreg;
	}

	public void setDate_enreg(String date_enreg) {
		this.date_enreg = date_enreg;
	}

	public String getAzerty() {
		return azerty;
	}

	public void setAzerty(String azerty) {
		this.azerty = azerty;
	}

    
    

}
