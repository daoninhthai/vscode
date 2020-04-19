var myDog = {name:'Milu',age: 1 ,dead:false};
var myDogString=JSON.stringify(myDog);
//console.log(typeof(myDogString));


var myCatString='{"name":"Tom","age":2,"dead":true}';
var myCat =JSON.parse(myCatString);
console.log(myCat.name);
