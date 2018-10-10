$(document).ready(function () {

    $("#saugoti").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        // Get form
        let form = $('#kontaktu_forma')[0];

        // Create an FormData object
        let data = new FormData(form);

        // disabled the submit button
        $("#saugoti").prop("disabled", true);

        $.ajax({
            type: "POST",
            url: "/saugoti_forma.php",
            enctype: 'multipart/form-data',
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            timeout: 600000,
            success: function (data) {

                alert("Your message was sent!");
                $("#saugoti").prop("disabled", false);

            },
            error: function (e) {

                alert("Oops! Something went wrong");
                $("#saugoti").prop("disabled", false);

            }
        });

    });

});