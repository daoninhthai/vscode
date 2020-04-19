var arr=[1,2,3];
function max(arr) {
    var max=arr[0];
    for(var i=0 ;i<arr.length;i++){
        if(max>arr[i]){
            max=max;
            
        }else{
            max=arr[i];
        }
        
    }
    return max;
  
}
var result = max(arr);
console.log(result);