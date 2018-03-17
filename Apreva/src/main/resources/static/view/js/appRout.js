

angular.module('effectif', []);
angular.module('plan', []);
angular.module('effectifService', []);

/**cette configuration c'est pour faire le routage entre les pages **/
var routeApp = angular.module('routeApp', [ 'ngRoute','effectif']);


routeApp.config([ '$routeProvider', '$httpProvider',  function($routeProvider, $httpProvider) {

  $httpProvider.defaults.cache = false;
  if (!$httpProvider.defaults.headers.get) {
    $httpProvider.defaults.headers.get = {};
  }
  // disable IE ajax request caching
  $httpProvider.defaults.headers.get['If-Modified-Since'] = '0';
  //.....here proceed with your routes
	
	$routeProvider.when('/ajouterBeneficaire', {
		
		templateUrl : 'view/js/modules/priorite/views/priorite.html',
		controller: 'prioriteControler'

	})
 .when('/', {
	templateUrl : 'view/js/modules/effectif/views/ajouterEffectif.html',
	controller:'effectifControler'
		
		//
}) .when('/charger/:id', {
	templateUrl : 'view/js/modules/effectif/views/ajouterEffectif.html',
	controller:'effectifControler'
		
		
})
	.when('/listEffectif', {
		templateUrl : 'view/js/modules/effectif/views/listEffectif.html',
		controller:'effectifControler'
			
			
	})
	.when('/listeBeneficaires/:numF/:id', {
		templateUrl : 'view/js/modules/beneficaires/views/listeBeneficaires.html',
		controller:'beneficairesControler'
			
			
	})
	.when('/detaillBeneficaire/:numF/:id', {
		templateUrl : 'view/js/modules/beneficaires/views/detaillBeneficaire.html',
		controller:'beneficairesControler'
			
			
	});
	

		    
}
]);


routeApp.controller('home', function ($scope, $http) {

  });
