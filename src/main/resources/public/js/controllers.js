angular.module('app.controllers', []).controller('BooksListController', function($scope, $state, popupService, $window, Books) {
  $scope.books = Books.query(); //fetch all shipwrecks. Issues a GET to /api/vi/shipwrecks

  $scope.deletebooks = function(books) { // Delete a Shipwreck. Issues a DELETE to /api/v1/shipwrecks/:id
    if (popupService.showPopup('Really delete this?')) {
      books.$delete(function() {
        $scope.books = Books.query(); 
        $state.go('books');
      });
    }
  };
}).controller('BooksViewController', function($scope, $stateParams, Books) {
  $scope.books = Books.get({ id: $stateParams.id }); //Get a single shipwreck.Issues a GET to /api/v1/shipwrecks/:id
}).controller('BooksCreateController', function($scope, $state, $stateParams, Books) {
  $scope.books = new Books();  //create new shipwreck instance. Properties will be set via ng-model on UI

  $scope.addBooks = function() { //create a new shipwreck. Issues a POST to /api/v1/shipwrecks
    $scope.books.$save(function() {
      $state.go('books'); // on success go back to the list i.e. shipwrecks state.
    });
  };
}).controller('BooksEditController', function($scope, $state, $stateParams, Books) {
  $scope.updateBooks = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/shipwrecks/:id
    $scope.books.$update(function() {
      $state.go('books'); // on success go back to the list i.e. shipwrecks state.
    });
  };

  $scope.loadBooks = function() { //Issues a GET request to /api/v1/shipwrecks/:id to get a shipwreck to update
    $scope.books = Books.get({ id: $stateParams.id });
  };

  $scope.loadBooks(); // Load a shipwreck which can be edited on UI
});
