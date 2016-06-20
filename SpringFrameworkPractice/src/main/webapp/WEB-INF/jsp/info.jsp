<html>
   
   <head>
      <title>AngularJS Directives</title>
   </head>
   
   <body>
     
      
     <div ng-app = "myapp" ng-init = 'listOfValue =${itemList}'>  
          
         <ol>
            <li ng-repeat = "item in listOfValue">
            
              {{ 'Message: ' + item.message }}
            </li>
         </ol>
         <div ng-controller="HelloController">
         	<h2>Welcome to {{helloTo.title}}</h2>
         </div>
      </div>
      
      <script src = "http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
      <script>
         angular.module("myapp", [])
         
         .controller("HelloController", function($scope) {
            $scope.helloTo = {};
            $scope.helloTo.title = "AngularJS";
         });
      </script>
   </body>
</html>


