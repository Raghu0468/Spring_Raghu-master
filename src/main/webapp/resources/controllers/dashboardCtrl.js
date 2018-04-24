
myApp.controller("dashboardCtrl", function ($scope, $http) {

    $scope.Dashboardlist;
    $scope.editMode = false;

    $scope.fetchTrainsList = function () {
        $http.get('dashboard/box.json').then(function (response) {

            console.log(response.data);

            $scope.dashboardlist = response.data;
        });
    };
    $scope.fetchTrainsList();

});