angular.module('rioDeLaGloria', ['ngRoute', 'ui.date', 'ngMaterial', 'ngResource', 'ui-notification', 'ngMessages', 'angularUtils.directives.dirPagination'])
    .config(
        ['$routeProvider', function($routeProvider) {

            $routeProvider.when('/nuevo-integrante', {
                templateUrl: 'module/integrantes/nuevo/nuevo.html',
                controller: 'nuevoIntegranteCtr',
                controllerAs: 'nuevoIntegranteCtr'
            });
            $routeProvider.when('/consultar-integrantes', {
                templateUrl: 'module/integrantes/consultar/consultar.html',
                controller: 'consultarIntegranteCtr',
                controllerAs: 'consultarIntegranteCtr'
            });

        }]

    ).config(function(NotificationProvider) {
        NotificationProvider.setOptions({
            delay: 8000,
            startTop: 60,
            startRight: 20,
            verticalSpacing: 50,
            horizontalSpacing: 50,
            positionX: 'right',
            positionY: 'top',
            replaceMessage: true
        });

    })
    .config(function($mdDateLocaleProvider) {
        $mdDateLocaleProvider.formatDate = function(date) {
            return date ? moment(date).format('DD-MM-YYYY') : '';
        }
    }).config(function($mdDateLocaleProvider){
      $mdDateLocaleProvider.parseDate = function(dateString) {
        var m = moment(dateString, 'DD-MM-YYYY', true);
        return m.isValid() ? m.toDate() : new Date(NaN);
    };
    });
