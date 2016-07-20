(function() {
  'use strict';

  function servicioREST($resource) {
    return $resource('', {}, {
      guardarIntegrante: {
        url: '/bullying-web/rest/consolidacion/guardarIntegrante',
        method: 'POST'
      },
      listarTodosIntegrantes: {
        url: '/bullying-web/rest/consolidacion/listarTodos',
        method: 'GET',
        isArray:true
      },
      eliminarIntegrante: {
        url: '/bullying-web/rest/consolidacion/eliminar',
        method: 'POST'
      }

    });
  }

  angular.module('rioDeLaGloria')
    .factory('servicioREST', servicioREST);
})();
