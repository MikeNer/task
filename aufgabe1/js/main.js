function checkForm(){   
    var inputs = document.getElementById("seminarForm").elements;
    var x;
    
    for (i = 0; i < inputs.length; i++) {
        if(inputs[i].value.length==0){
            alert("Bitte alle Felder ausfüllen");
            return
        }else{
            alert("Wir haben deine Nachricht erhalten");
        }
      
      }
  

}