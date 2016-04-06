function titleValidation(){
	var filmTilte=createfilm.filmTilte.value;
	var letters = /^[A-Za-z]+$/;
	if(filmTilte.match(letters)){
		document.getElementById("titleErr").innerHTML="";
		return true;
	}
	else{
		document.getElementById("titleErr").innerHTML="*Please Enter a Title Starting with an Alphabet";
		filmTilte.focus();
		return false;
		
	}
}

function rentalDurationValidation(){
	var str=document.getElementById("datepicker1").value;
	var rentDur=document.getElementById("datepicker").value;
	if(str>rentDur){
		document.getElementById("").innerHTML="Please Enter A Date greater than release date";
		rentDur.focus();
		return false;
	}
	else{
		document.getElementById("").innerHTML="";
		return true;
	}
	
}

/*function compareDate() {
    var str = document.getElementById("start_date").value;
    var end = document.getElementById("end_date").value;
    var year = str.substring(0,4);
    var month = str.substring(5,7);
    var date = str.substring(8,10);
    var endYear = end.substring(0,4);
    var endMonth = end.substring(5,7);
    var endDate = end.substring(8,10);
    var startDate = new Date(year, month-1, date);
    var endDate = new Date(endYear, endMonth-1, endDate);

    if (startDate > endDate) {
      alert('start date should be less than end date');
       return false;
    } 
    else { return true; }
}
*/




function lengthValidation(){
	var length=createfilm.length.value;
	
	if(isNaN(length)||length<1||length>1000){
		document.getElementById("lengthErr").innerHTML="*Please Enter Length between 1 to 1000";
		lengthErr.focus();
		return false;
	}
	else{
		document.getElementById(lengthErr).innerHTML="";
		return true;
	}
}


function specialFeaturesValidation(){
	var spcFetVal=createfilm.decrp.value;
	var letters = /[A-Za-z0-9.,! ]+/;
	if(spcFetVal.match(letters)){
		document.getElementById("specialFeaturesErr").innerHTML="";
		return true;
	}
	else{
		document.getElementById("specialFeaturesErr").innerHTML="*Please Enter Valid Special Features";
		spcFetVal.focus();
		return false;
	}
}

function replacementCostValidation(){
	var repCost=createfilm.cost.value;
	
	if(isNaN(repCost)||repCost==0){
		document.getElementById("repCostErr").innerHTML="*Please Enter a Valid Replacement cost";
		repCostErr.focus();
		return false;
	}
	else{
		document.getElementById("repCostErr").innerHTML="";
		return true;
	}
}


