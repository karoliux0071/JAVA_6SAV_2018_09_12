function sleptiViska()
{
    var sheetai = document.getElementsByClassName('sheet');
    var tabai = document.getElementsByClassName('tab');

    for (var i = 0; sheetai.length > i; i++){
        var elementas = sheetai[i];
        elementas.style.display = 'none';
        elementas.classList.remove('aktyvus');
    }

    for (var j = 0; tabai.length > j; j++){
        var tab = tabai[j];
        if (tab.classList.contains('aktyvus')) {
            tab.classList.remove('aktyvus');
        }
    }
}

function rodyti(selector)
{
    var elementas = document.getElementById(selector);
    elementas.style.display = 'block';
    elementas.classList.add('aktyvus');

    var tabas = document.getElementsByClassName(selector)[0];
    tabas.classList.add('aktyvus');

}

document.getElementsByClassName('csharp')[0].addEventListener('click', function () {
    sleptiViska('java');
    rodyti('csharp');
});

document.getElementsByClassName('java')[0].addEventListener('click', function () {
    sleptiViska();
    rodyti('java');
});

document.getElementsByClassName('web')[0].addEventListener('click', function () {
    sleptiViska();
    rodyti('web');
});

document.getElementsByClassName('other')[0].addEventListener('click', function () {
    sleptiViska();
    rodyti('other');
});