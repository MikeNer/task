function checkForm(){   
    var inputs = document.getElementById("seminarForm").elements;
    var iterator =0;
    /*Loop geht jedes Element in Form Field
      durch und checkt ob es ausgefüllt ist. 
    */
    for (iterator; iterator < inputs.length; i++) {
        if(inputs[iterator].value.length==0){
            alert("Bitte alle Felder ausfüllen");
            return;
        }
        if(inputs[iterator].value!=0){
            i++;
         }
        }
        if(iterator == inputs.length){
            alert("Wir haben deine Nachricht erhalten");
    } 
}