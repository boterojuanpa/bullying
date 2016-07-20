(function() {

    function consultarIntegrante(servicioREST, Notification, $scope, servicioIntegrantes, $location, $mdDialog) {

        var vm = this;
        vm.integrantes = null;
        vm.currentPage = 1;
        vm.filtrar = false;

        vm.main = function() {
            vm.listarTodos();
        };
        vm.listarTodos = function() {

            servicioREST.listarTodosIntegrantes({},
                function(data) {
                    vm.integrantes = data;

                },
                function(error) {
                    Notification.error({
                        message: 'Ha ocurrido un erro en el servidor',
                        delay: 5000
                    });

                });
        };

        vm.seleccionarIntegrante = function(integrante) {
            servicioIntegrantes.setIntegranteSeleccionado(integrante);
            $location.path("/nuevo-integrante");
        }

        vm.eliminarIntegrante = function(ev, integrante) {
            var confirm = $mdDialog.confirm()
                .title('¿Está seguro que desea eliminar el integrante?')
                .targetEvent(ev)
                .ok('Eliminar')
                .cancel('Cancelar');
            $mdDialog.show(confirm).then(function() {
                servicioREST.eliminarIntegrante(integrante,
                    function() {
                        vm.listarTodos();
                        Notification.success({
                            message: 'Integrante eliminado exitosamente',
                            delay: 5000
                        });

                    },
                    function() {
                        Notification.error({
                            message: 'Ha ocurrido un erro en el servidor',
                            delay: 5000
                        });

                    });
            }, function() {});
        };

        vm.cambiarFiltro = function() {
            vm.filtrar = !vm.filtrar;
        };

        vm.order = function(predicate) {
            $scope.predicate = predicate;
            $scope.reverse = ($scope.predicate === predicate) ? !$scope.reverse : false;
            $scope.friends = orderBy($scope.friends, predicate, $scope.reverse);
        };

        vm.main();

    }

    angular.module('rioDeLaGloria')
        .controller('consultarIntegranteCtr', consultarIntegrante);
})();
