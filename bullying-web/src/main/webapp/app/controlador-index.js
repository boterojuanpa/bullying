(function() {

    function controladorIndex($route,servicioIntegrantes,$location) {

        var vm = this;

        vm.nuevoIntegrante = function()
        {
            servicioIntegrantes.setIntegranteSeleccionado(null);
            $location.path("/nuevo-integrante");
            $route.reload();
        }


    }

    angular.module('rioDeLaGloria')
        .controller('controladorIndex', controladorIndex);
})();
