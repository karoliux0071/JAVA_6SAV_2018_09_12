$(document).ready(function(){

    $('.tab').click(function (event) {

        event.preventDefault();
        $('.tab').removeClass('aktyvus');
        $('.sheet').hide().removeClass('aktyvus');

        var id = $(this).attr('href');
        $(this).addClass('aktyvus');
        $(id).show().addClass('aktyvus');

    });

});