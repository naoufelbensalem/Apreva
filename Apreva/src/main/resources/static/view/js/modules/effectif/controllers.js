'use strict';
var effectif = angular.module('effectif', [ 'ngRoute'])


/** ce controleur pour gérer l'effectifs* */
effectif.controller('effectifControler', function($scope, $http, $routeParams) {
	$scope.effectif = [];
	$scope.motCle = null;
	$scope.pageCourante = 0;
	$scope.effectifs=[];
	$scope.idEffectif=$routeParams.id;
	var effcObject = {};
	$scope.status="erreur";
	
	$scope.combinaison = [
	                      "BOPT1",
	                      "BOPT2",
	                      "BSACE",
	                      "BSAL",
	                      "BSCE1",
	                      "BSCE2"
	                      		];
     
	$scope.statutJuridique = ["Aucun",
	                          "Apprenti",
	                          "Contrat de professionalisation",
	                          "Demandeur d'emploi",
	                          "Etudiant",
	                          "Handicapé",
	                          "Invalide",
	                          "Scolaire",
		                   ];
	
	$scope.strucIBAN = function() {
		$scope.effectif.numBanque = $scope.effectif.iban1+$scope.effectif.iban2.slice(0, 1);
		$scope.effectif.numGuichet =$scope.effectif.iban2.slice(1, 4)+$scope.effectif.iban3.slice(0, 2);
		$scope.effectif.numCompte =$scope.effectif.iban3.slice(2, 4)+$scope.effectif.iban4+$scope.effectif.iban5+$scope.effectif.iban6.slice(0, 1);
		$scope.effectif.cleRIB = $scope.effectif.iban6.slice(1, 3);
		
		$scope.effectif.numBanque = $scope.effectif.ibanP1+$scope.effectif.ibanP2.slice(0, 1);
		$scope.effectif.numGuichet =$scope.effectif.ibanP2.slice(1, 4)+$scope.effectif.ibanP3.slice(0, 2);
		$scope.effectif.numCompte =$scope.effectif.ibanP3.slice(2, 4)+$scope.effectif.ibanP4+$scope.effectif.ibanP5+$scope.effectif.ibanP6.slice(0, 1);
		$scope.effectif.cleRIB = $scope.effectif.ibanP6.slice(1, 3);
		
	}
	
	
	$scope.saveAndFlashEffectif = function() {
		
		var indexCombin=$scope.combinaison.indexOf($scope.effectif.reference_contrat);
		$scope.strucIBAN();

		effcObject = {
	 			
	 		"id_effectif":$scope.idEffectif,
		    "numero_famille" : $scope.effectif.numero_famille,
			"reference_interne_famille":null,
		    "rang_pres_famille" :$scope.effectif.rang_genellaire,
			"date_entre_organisme":$scope.effectif.date_entre_organisme,
			"nom":$scope.effectif.nom,
			"nom_patronymique":$scope.effectif.nom_patronymique,
			"prenom":$scope.effectif.prenom,
			"date_naissance":$scope.effectif.date_naissance,
			"rang_genellaire":$scope.effectif.rang_genellaire,
			"code_civilite":$scope.effectif.code_civilite,
			"sexe":$scope.effectif.sexe,
			"situation_familiale":$scope.effectif.situation_familiale,
			"code_qualite_personne":'A',
			"nationalite":$scope.effectif.nationalite,
			"nom_usage":null,
			"assure":null,
			"num_secu":$scope.effectif.num_secu,
			"cle_secu":$scope.effectif.cle_secu,
			"grand_regime":$scope.effectif.grand_regime,
			"caisse":$scope.effectif.caisse,
			"centre_payeur":$scope.effectif.centre_payeur,
			"code_cpl_grand_regime":$scope.effectif.code_cpl_grand_regime,
			"refus_teletrans":$scope.effectif.refus_teletrans,
			"loi_madelin":null,
			"debut_periode_madelin":null,
			"fin_periode_madelin":null,
			"salarie":$scope.effectif.salarie,
			"matricule":null,
			"code_college":null,
			"commercial":$scope.effectif.commercial,
			"csp":$scope.effectif.csp,
			"statut_juridique":$scope.effectif.statut_juridique,
			"code_agence":$scope.effectif.code_agence,
			"adresse_normee":null,
			"reference_adresse":null,
			"auxiliaire_adresse1":$scope.effectif.auxiliaire_adresse1,
			"num_voie":$scope.effectif.num_voie,
			"complement_num_voie":$scope.effectif.complement_num_voie,
			"lib_voie":$scope.effectif.lib_voie,
			"lieu_dit":null,
			"nom_lieu_dit":null,
			"code_postal":$scope.effectif.code_postal,
			"nom_acheminement":$scope.effectif.nom_acheminement,
			"code_pays":$scope.effectif.code_pays,
			"coordonne_tel_fixe":$scope.effectif.coordonne_tel_fixe,
			"commentaire_tel_fix":null,
			"coordonne_tel_portable":$scope.effectif.coordonne_tel_portable,
			"commentaire_tel_por":null,
			"coordonne_mail":$scope.effectif.coordonne_mail,
			"commentaire_mel":null,
			"num_coll":$scope.effectif.num_coll,
			"num_contrat":indexCombin+1,
			"reference_contrat":$scope.effectif.reference_contrat,
			"date_debut_contrat":$scope.effectif.date_debut_contrat,
			"date_fin_contrat":null,
			"mode_paiement":$scope.effectif.mode_paiement,
			"jour_paiements":$scope.effectif.jour_paiements,
			"date_signature_ptf":null,
			"num_contrat_signe_ptf":null,
			"date_signature_mandat":$scope.effectif.date_signature_mandat,
			"date_debut_rattachement":null,
			"date_fin_rattachement":null,
			"code_mode_reglement":$scope.effectif.code_mode_reglement,
			"num_banque_cot":$scope.effectif.numBanque,
			"num_guichet_cot":$scope.effectif.numGuichet,
			"num_compte_cot":$scope.effectif.numCompte,
			"cle_rib_cot":$scope.effectif.iban4,
			"code_bic_cot":$scope.effectif.code_bic_cot,
			"num_iban_cot":$scope.effectif.iban0+$scope.effectif.iban1+$scope.effectif.iban2+$scope.effectif.iban3+$scope.effectif.iban4+$scope.effectif.iban5+$scope.effectif.iban6,
			"titulaire_rib_cot":$scope.effectif.code_civilite +" "+$scope.effectif.prenom +" "+$scope.effectif.nom,
			"num_banque_prest":$scope.effectif.ibanP1,
			"num_guichet_prest":$scope.effectif.ibanP2,
			"num_compte_prest":$scope.effectif.ibanP3,
			"cle_rib_prest":$scope.effectif.ibanP4,
			"code_bic_prest":$scope.effectif.code_bic_prest,
			"num_iban_prest":$scope.effectif.ibanP0+$scope.effectif.ibanP1+$scope.effectif.ibanP2+$scope.effectif.ibanP3+$scope.effectif.ibanP4+$scope.effectif.ibanP5+$scope.effectif.ibanP6,
			"titulaire_rib_prest":$scope.effectif.code_civilite+" "+$scope.effectif.prenom +" "+$scope.effectif.nom,
			"date_enreg":null,
			"azerty":null,
			"auxiliaire_ADRESSE2":$scope.effectif.adresse3
			};

		var plan = $http.post('/saveEffectifs', effcObject);
		plan.success(function(data, status, headers, config) {
			$scope.message = data;
			//$scope.status = status;
			$('#info').modal('show');
		});
		
	};
	
	
	
		$scope.getEffectif = function(e) {
				$scope.effec=e;
			};


if($scope.idEffectif!=null)
{ 
$http.get("/getEffectif?idEff="+$scope.idEffectif).then(function(response) {
	    $scope.effectif = response.data;
	    $scope.chargeIBAN(response.data);
	});
}	
$scope.chargeIBAN = function(effec) {
	$scope.effectif.iban0 = effec.num_iban_cot.slice(0, 4);
	$scope.effectif.iban1 = effec.num_iban_cot.slice(4, 8);
	$scope.effectif.iban2 = effec.num_iban_cot.slice(8, 12);
	$scope.effectif.iban3 = effec.num_iban_cot.slice(12, 16);
	$scope.effectif.iban4 = effec.num_iban_cot.slice(16, 20);
	$scope.effectif.iban5 = effec.num_iban_cot.slice(20, 24);
	$scope.effectif.iban6 = effec.num_iban_cot.slice(24, 28);
	
	$scope.effectif.ibanP0 = effec.num_iban_cot.slice(0, 4);
	$scope.effectif.ibanP1 = effec.num_iban_cot.slice(4, 8);
	$scope.effectif.ibanP2 = effec.num_iban_cot.slice(8, 12);
	$scope.effectif.ibanP3 = effec.num_iban_cot.slice(12, 16);
	$scope.effectif.ibanP4 = effec.num_iban_cot.slice(16, 20);
	$scope.effectif.ibanP5 = effec.num_iban_cot.slice(20, 24);
	$scope.effectif.ibanP6 = effec.num_iban_cot.slice(24, 28);

}


	/** cette fonction pour affichier la liste des effectifs * */
	function effecByNumFamil() {
		$http.get("/effectifByName?page="+$scope.pageCourante).success(function(data) {
			$scope.effectifs = data;
			$scope.pages = new Array(data.totalPages)
			
		});
	};
	
	/** cette fonction pour rechercher l'effectifs * */
	effecByNumFamil();
	$scope.rechercher = function() {
		$http.get("/effectif/ParMC?mc=" + $scope.motCle + "&page="+$scope.pageCourante).success(function(data) {
			$scope.effectifs = data;
			$scope.pages = new Array(data.totalPages)
		});
	};
	

	
	$scope.getTetulairPrest=function()
	{

	if(($scope.effectif.code_civilite==null)||($scope.effectif.prenom==null)||($scope.effectif.nom==null))
			{
			$scope.effectif.titulaire_rib_prest=null;
			}
			else
			{
			  $scope.effectif.titulaire_rib_prest=$scope.effectif.code_civilite+" "+$scope.effectif.prenom+" "+$scope.effectif.nom;
			}

	}
	
	
	$scope.getTetulair=function()
	{
		if(($scope.effectif.code_civilite==null)||($scope.effectif.prenom==null)||($scope.effectif.nom==null))
			{
			$scope.effectif.titulaire_rib_cot=null;
			}
			else
			{
			  $scope.effectif.titulaire_rib_cot=$scope.effectif.code_civilite+" "+$scope.effectif.prenom+" "+$scope.effectif.nom;
			}
		
	}
	
	$scope.SendIbanFromCotToPrest=function()
			{

		$scope.effectif.code_bic_prest = $scope.effectif.code_bic_cot;
		$scope.effectif.titulaire_rib_prest = $scope.effectif.titulaire_rib_cot;
		$scope.effectif.ibanP0 = $scope.effectif.iban0;
		$scope.effectif.ibanP1 = $scope.effectif.iban1;
		$scope.effectif.ibanP2 = $scope.effectif.iban2;
		$scope.effectif.ibanP3 = $scope.effectif.iban3;
		$scope.effectif.ibanP4 = $scope.effectif.iban4;
		$scope.effectif.ibanP5 = $scope.effectif.iban5;
		$scope.effectif.ibanP6 = $scope.effectif.iban6;
			}
	
	
	$scope.SendIbanFromPrestToCot=function()
			{
		$scope.effectif.code_bic_cot = $scope.effectif.code_bic_prest;
		$scope.effectif.titulaire_rib_cot = $scope.effectif.titulaire_rib_prest;
		$scope.effectif.iban0 = $scope.effectif.ibanP0;
		$scope.effectif.iban1 = $scope.effectif.ibanP1;
		$scope.effectif.iban2 = $scope.effectif.ibanP2;
		$scope.effectif.iban3 = $scope.effectif.ibanP3;
		$scope.effectif.iban4 = $scope.effectif.ibanP4;
		$scope.effectif.iban5 = $scope.effectif.ibanP5;
		$scope.effectif.iban6 = $scope.effectif.ibanP6;
			}
	

	
	/**cette fonction pour supprimer l'effectif**/
	$scope.supprimerEffec = function(E) {
		$http.get("/effectif/delete?numF=" + E.numero_famille).success(function() {
			$scope.gotoPage($scope.pageCourante);
		});
	};
	

	/**cette fonction pour retourner le nombre des pages**/
	$scope.gotoPage = function(p) {
		$scope.pageCourante = p;
		if ($scope.motCle == null) {
			
			effecByNumFamil();
		} else {
			$scope.rechercher();
		}
	};
});
