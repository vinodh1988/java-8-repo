
function callMeWhenReady(callable){
    console.log("3-We Are not ready yet")
	setTimeout(()=>callable("Hey Take it"),3000)
	console.log("5-We Called you...!!!")

}

callMeWhenReady((data)=>{
	console.log("10-Thanks for calling");
	console.log("11-Received ",data);
});

console.log("14-We want to execute...No way related to that call Me When Ready");