(function() {
  'use strict';

  function servicioIntegrantes() {
    var vm = this;

    vm.integranteSeleccionado = null;

    vm.setIntegranteSeleccionado = function(integranteSeleccionado)
    {
        vm.integranteSeleccionado = integranteSeleccionado;
    }

    vm.getIntegranteSeleccionado = function()
    {
        return vm.integranteSeleccionado ;
    }

    return vm;
  }

  angular.module('rioDeLaGloria')
    .factory('servicioIntegrantes', servicioIntegrantes);
})();
