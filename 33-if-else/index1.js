var bills =[
    {value:10000},
    {value:20000},
    {value:50000,fake:true},
    {value:100000},
]
function countBill(bills){
    var total =0;
    for(var bill of bills){
        if(!bill.fake){
           total +=bill.value; 
        }
        else{
            console.log("fake",bill);
            break;
        }
        
    }

    return total;

}
var total =countBill(bills);
console.log(total);