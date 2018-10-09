function sleptiViska() {
    var sheetai = document.getElementsByClassName('sheet');

    for (var i = 0; sheetai.length > 1; i++) {
        var elementas = sheetai[i];
        elementas.style.display = 'none';

    }
}

function rodyti(id) {
    var elementas = document.getElementById(id);
    elementas.style.display = 'block';
}

document.getElementsByClassName('csharp')[0].addEventListener('click',function () {
    sleptiViska();
    rodyti('csharp');
})

document.getElementsByClassName('java')[0].addEventListener('click',function () {
  sleptiViska();
  rodyti('java');
})
document.getElementsByClassName('web')[0].addEventListener('click',function () {
    sleptiViska();
    rodyti('web');
})
document.getElementsByClassName('Kita')[0].addEventListener('click',function () {
    sleptiViska();
    rodyti('kita');
})