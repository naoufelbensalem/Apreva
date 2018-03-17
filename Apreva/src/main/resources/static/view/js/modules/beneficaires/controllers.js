'use strict';
var routeConstruction = angular.module('beneficaires', [ 'ngRoute'])

/** c'est le controleur qui gérer les beneficaires * */
routeApp.controller('beneficairesControler', function($scope, $http, $routeParams) {
	$scope.motCle = null;
	$scope.pageCourante = 0;
	$scope.site = [];
	$scope.beneficaires = [];


	$scope.statutJuridique = ["Aucun",
	                          "Apprenti",
	                          "Contrat de professionalisation",
	                          "Demandeur d'emploi",
	                          "Etudiant",
	                          "Handicapé",
	                          "Invalide",
	                          "Scolaire",
		                   ];

	
	
	/** cette fonction pour affichier la liste des beneficaires * */
	function benefiByNumFamil() {
		$scope.idEffectif=$routeParams.id;
		$scope.numFamille=$routeParams.numF;

		$http.get("/effectif/getBenefByNumFamil?numF="+$scope.numFamille+"&page="+$scope.pageCourante).success(function(data) {
			$scope.beneficaires = data;
			$scope.pages = new Array(data.totalPages)
		});
		
		$http.get("/getEffectif?idEff="+$scope.idEffectif).then(function(response) {
	    $scope.client = response.data;
		});

		
	};

		$scope.ajou=function(client)
		{
		client.idEffectif=null;
		$scope.ajouter(client);
		};
		
		$scope.modifier=function(client)
		{
		client.idEffectif=$scope.idEffectif;
		$scope.ajouter(client);
		};



	$scope.ajouter = function(client) {
	var	cli = { 
				"id_effectif":client.idEffectif,
		    	"numero_famille" : client.numero_famille,
				"reference_interne_famille":null,
			    "rang_pres_famille" :client.rang,
				"date_entre_organisme":client.dateEffet,
				"nom":$scope.nom,
				"nom_patronymique":$scope.nomJFille,
				"prenom":$scope.prenom,
				"date_naissance":$scope.dateNais,
				"rang_genellaire":$scope.grandRegime,
				"code_civilite":$scope.civilite,
				"sexe":$scope.sexe,
				"situation_familiale":null,
				"code_qualite_personne":$scope.lien,
				"nationalite":null,
				"nom_usage":null,
				"assure":null,
				"num_secu":$scope.nSecu,
				"cle_secu":client.cle_secu,
				"grand_regime":$scope.grandRegime,
				"caisse":$scope.caisse,
				"centre_payeur":$scope.centrePayeur,
				"code_cpl_grand_regime":client.code_cpl_grand_regime,
				"refus_teletrans":client.refus_teletrans,
				"loi_madelin":null,
				"debut_periode_madelin":null,
				"fin_periode_madelin":null,
				"salarie":client.salarie,
				"matricule":null,
				"code_college":null,
				"commercial":client.codeCommer,
				"csp":$scope.cspB,
				"statut_juridique":$scope.statutJurid,
				"code_agence":client.code_agence,
				"adresse_normee":null,
				"reference_adresse":null,
				"auxiliaire_adresse1":client.auxiliaire_adresse1,
				"num_voie":client.num_voie,
				"complement_num_voie":client.complement_num_voie,
				"lib_voie":client.lib_voie,
				"lieu_dit":null,
				"nom_lieu_dit":null,
				"code_postal":client.code_postal,
				"nom_acheminement":client.nom_acheminement,
				"code_pays":client.code_pays,
				"coordonne_tel_fixe":null,
				"commentaire_tel_fix":null,
				"coordonne_tel_portable":null,
				"commentaire_tel_por":null,
				"coordonne_mail":null,
				"commentaire_mel":null,
				"num_coll":client.num_coll,
				"num_contrat":null,
				"reference_contrat":client.reference_contrat,
				"date_debut_contrat":null,
				"date_fin_contrat":null,
				"mode_paiement":client.mode_paiement,
				"jour_paiements":client.jour_paiements,
				"date_signature_ptf":null,
				"num_contrat_signe_ptf":null,
				"date_signature_mandat":client.date_signature_mandat,
				"num_contrat_rattachement":client.num_contrat_rattachement,
				"date_debut_rattachement":null,
				"date_fin_rattachement":null,
				"code_mode_reglement":client.code_mode_reglement,
				"num_banque_cot":client.num_banque_cot,
				"num_guichet_cot":client.num_guichet_cot,
				"num_compte_cot":client.num_compte_cot,
				"cle_rib_cot":client.cle_rib_cot,
				"code_bic_cot":client.code_bic_cot,
				"num_iban_cot":client.num_iban_cot,
				"titulaire_rib_cot":client.titulaire_rib_cot,
				"num_banque_prest":client.num_banque_prest,
				"num_guichet_prest":client.num_guichet_prest,
				"num_compte_prest":client.num_compte_prest,
				"cle_rib_prest":client.cle_rib_prest,
				"code_bic_prest":client.code_bic_prest,
				"num_iban_prest":client.num_iban_prest,
				"titulaire_rib_prest":client.titulaire_rib_prest,
				"date_enreg":null,
				"azerty":null,
				"auxiliaire_ADRESSE2":client.auxiliaire_ADRESSE2
				
				};

		
		$http.put("/beneficaires/modifier", cli).then(function(response) {
			$scope.message = response.data;	
			$scope.gotoPage($scope.pageCourante);
			$scope.status = response.status;

		});
		
		};



$scope.liberChamps=function()
{
			$scope.nom="";
			$scope.prenom="";
			$scope.nomJFille="";
			$scope.civilite="";
			$scope.sexe="";
			$scope.dateNais=null;
			$scope.grandRegime="";
			$scope.lien="";
			$scope.nSecu="";
			$scope.rang="";
			$scope.connNoem="";
			$scope.caisse="";
			$scope.centrePayeur="";
			$scope.cspB="";
			$scope.statutJurid="";
			$scope.cle_secu="";
			$scope.lien="";
}


		/**
		 * cette fonction pour charger un bénificaire dans un pop-up pour qu'on puise
		 * apprés appliqué des modifications
		 */
		 
		$scope.getBenefic = function(b) {

			$scope.idEffectif=b.id_effectif;
			$scope.nom = b.nom;
			$scope.prenom = b.prenom;
			$scope.nomJFille = b.nom_patronymique;
			$scope.dateNais = b.date_naissance;
			$scope.rang = b.rang_genellaire;
			$scope.civilite = b.code_civilite;
			$scope.sexe = b.sexe;
			$scope.cspB = b.csp;
			$scope.grandRegime = b.grand_regime;
			$scope.nSecu = b.num_secu;
			$scope.caisse = b.caisse;
			$scope.statutJurid = b.statut_juridique;
			$scope.connNoem = b.refus_teletrans;
			$scope.lien=b.code_qualite_personne;
			$scope.cle_secu=$scope.client.cle_secu;
			$scope.centrePayeur=b.centre_payeur;

		};	
		
		
	/** cette fonction pour rechercher une beneficaires * */
	benefiByNumFamil();
	$scope.rechercher = function() {
		$http.get("/beneficaires/ParMC?mc=" + $scope.motCle+"&numF=" +$scope.client.numero_famille+ "&page="+$scope.pageCourante).success(function(data) {
			$scope.beneficaires = data;
			$scope.pages = new Array(data.totalPages)
		});
	};
	
	/**cette fonction pour supprimer le client et leur bénéficiaires**/
	$scope.supprimerBenefi = function(b) {
		$http.get("/beneficaires/delete?numF=" + b).success(function() {
			$scope.gotoPage($scope.pageCourante);
			
		});
	};
	
	$scope.GetInfoFromClient = function() {

		$scope.nom=$scope.client.nom;
		$scope.nSecu=$scope.client.num_secu;
		$scope.grandRegime=$scope.client.grand_regime;
		$scope.connNoem=$scope.client.refus_teletrans;
		$scope.caisse=$scope.client.caisse;
		$scope.centrePayeur=$scope.client.centre_payeur;
		$scope.cle_secu=$scope.client.cle_secu;
	}
	
	/**cette fonction pour retourner le nombre des pages**/
	$scope.gotoPage = function(p) {
		$scope.pageCourante = p;
		if ($scope.motCle == null) {
			
			benefiByNumFamil();
		} else {
			$scope.rechercher();
		}
	};
	
	
	

	
	
});
