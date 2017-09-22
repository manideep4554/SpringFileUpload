var app = angular.module('myApp',[]);

app.controller('UploadController',function ($scope, fileReader,$http) {
     console.log(fileReader)
    $scope.getFile = function () {
       
        fileReader.readAsText($scope.file, $scope)
                      .then(function(result) {
                          $scope.textData = result;
                      });
    };
    
    $scope.sendFile = function (){
    	var url = '/my_app_url';
    	var data = $scope.textData;
        var config = {
                headers : {
                    'Content-Type': 'application/json;charset=UTF-8'
                }
            }
    	
    	 $http.post(url, data, config)
         .success(function (data, status, headers, config) {
        	 
        	 console.log("Sent");
         })
         .error(function (data, status, header, config) {
         });
    };

});

app.directive("ngFileSelect",function(){

  return {
    link: function($scope,el){
      
      el.bind("change", function(e){
      
        $scope.file = (e.srcElement || e.target).files[0];
        $scope.getFile();
      })
      
    }
    
  }
  
  
})