var kintamasis = "Labas pasauli :)";
document.getElementById("demo").innerHTML = kintamasis;

var lempute_busena = false;

function lempute() {
    if (lempute_busena) {
        document.getElementById("lempute").src = '/img/off.jpeg';
    } else {
        document.getElementById("lempute").src = '/img/on.png';
    }
    lempute_busena = !lempute_busena;
}