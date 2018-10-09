var kint = "Labas pasauli!";
document.getElementById("demo").innerHTML = kint;

var lempute_busena = false;

function lempute() {
    if (lempute_busena) {
    document.getElementById("lempute").src = "/img/lampoff.jpg" ;

    } else {
        document.getElementById("lempute").src = "/img/lampon.jpg" ;

    }
    lempute_busena = !lempute_busena;
}
