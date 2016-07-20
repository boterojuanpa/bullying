(function() {

    function NuevoIntegrante(servicioREST, Notification, $scope, servicioIntegrantes,$location) {

        var vm = this;

        vm.main = function() {
            if (servicioIntegrantes.getIntegranteSeleccionado() != null) {
                vm.integrante = servicioIntegrantes.getIntegranteSeleccionado();
                vm.integrante.fecha = new Date(vm.integrante.fecha);
                vm.integrante.fechaCumpleanhos = vm.integrante.fechaCumpleanhos != null ? new Date(vm.integrante.fechaCumpleanhos) : null;
            } else {
                vm.integrante = {};
                vm.integrante.fecha = new Date();
                vm.integrante.sexo = "M";
            }

        };
        vm.guardarIntegrante = function() {
            if ($scope.formIntegrante.$valid) {
                servicioREST.guardarIntegrante(vm.integrante,
                    function() {

                        if (servicioIntegrantes.getIntegranteSeleccionado() != null) {
                            servicioIntegrantes.setIntegranteSeleccionado(null);
                            $location.path("/consultar-integrantes");
                        } else {
                            vm.main();
                            $scope.formIntegrante.$setPristine();
                            $scope.formIntegrante.$setUntouched();
                            Notification.success({
                                message: 'Integrante guardado éxitosamente',
                                delay: 5000
                            });
                        }

                    },
                    function() {
                        Notification.error({
                            message: 'Ha ocurrido un error guardando el integrante',
                            delay: 5000
                        });
                    });
            }
            else
            {
                Notification.error({
                    message: 'Existen campos por diligenciar',
                    delay: 5000
                });
            }
        };

        vm.main();

    }

    angular.module('rioDeLaGloria')
        .controller('nuevoIntegranteCtr', NuevoIntegrante);
})();
