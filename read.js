

//Javascript

//Callback

// An Anonymous function which is passed as a paramter to another function

const fs = require('fs');

fs.readFile("d:\\Main.java","utf-8",function(err,data){
    if(err)
		  console.log(err)
	else
		  console.log(data)
})

function logic(){
	console.log("other logic");
}

logic();
