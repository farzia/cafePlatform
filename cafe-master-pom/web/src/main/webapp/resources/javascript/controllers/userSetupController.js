app.controller('UserSetupController', function($scope, $rootScope, $location, $stateParams, $state, $http, $timeout, UserSetupService) {

    $scope.hasError = false;
    $scope.hasSuccess = false;
    $scope.message = "";
    $scope.userData = {};
    $scope.userDataList = [];
    $scope.showForm = false;
    $scope.editObj = {};

    $scope.init = function() {

        $scope.userData = {};
        $scope.showForm = false;
        UserSetupService.getAll.query({}, {}).$promise.then(function(result) {
            $scope.userDataList = result;
        });
    };

    $scope.save = function(userData) {
        $scope.hideMessage();
        if(validator.validateForm("#validationRequired",".validatorMsg",null)) {
            UserSetupService.save.query({}, userData ).$promise.then(function(result) {
                $scope.showSuccessMessage("User " + sector.name + " saved successfully");
                $scope.init();
            });
        }

    };

    $scope.update = function(userData){
        $scope.hideMessage();
        if(validator.validateForm("#validationRequired",".validatorMsg",null)) {
                    UserSetupService.update.query({}, userData ).$promise.then(function(result) {
                        $scope.showSuccessMessage("Sector " + userData.sectorName + " updated successfully");
                        $scope.init();
                    });
        }
    };

    $scope.showErrorMessage = function(message){
        $scope.hasError = true;
        $scope.hasSuccess = false;
        $scope.message = message;
    };

    $scope.showSuccessMessage = function(message){
        $scope.hasError = false;
        $scope.hasSuccess = true;
        $scope.message = message;
    };

    $scope.hideMessage = function(){
        $scope.hasError = false;
        $scope.hasSuccess = false;
    };


    $scope.edit = function(userData){
        $scope.userData = {};
        angular.copy(userData, $scope.editObj);
        angular.copy(userData, $scope.userData);
        $scope.hideMessage();
        $scope.showForm = true;
    };

    $scope.reset = function(){
        angular.copy($scope.editObj, $scope.userData);
        $scope.hideMessage();
        validator.hideError("#validationRequired");
    };

    $scope.add = function(){
        $scope.editObj = {};
        $scope.reset();
        $scope.showForm = true;
    };

    $scope.cancel = function(){
        $scope.reset();
        $scope.showForm = false;
    };

    $scope.init();

});