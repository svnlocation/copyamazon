<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="">

<head>
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
   </head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Testing jsp</title>
</head>
<body>
		${testList}
	<div ng-init='value=${testList}'></div>
	<!-- <div ng-controller = "HelloController" > -->
		<div>After iterating with angularjs:</div>
		<br>
		<div ng-repeat='data in value'>{{data}}</div>
		
	</div>
	<!-- <script>
         angular.module("myapp", [])
         
         .controller("HelloController", function($scope) {
            $scope.dataV = ${testList};
            alert( $scope.dataV);
           // $scope.helloTo.title = "AngularJS";
         });
      </script> -->
</body>
</html>