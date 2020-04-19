function grade(score) {
   
    if(score>=0 && score<5){
        console.log("C");
    }
     if(score>=5 && score<7){
        console.log("B");
    }
     if(score>=7 && score<=10){
        console.log("A");
    }
   }
   grade(1);