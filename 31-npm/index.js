var readlineSync =require('readline-sync');

var pet ={};
var name =readlineSync.question('ur pet name: ');
var gender =readlineSync.question('pet gender(male,female): ');

pet.name=name;
pet.gender=gender;
console.log(pet);