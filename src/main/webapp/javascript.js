/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//1
$(document).ready(function () {
    $(document).on("click", "#qBtn", function () {
        $("#qDiv").load("QouteServlet");
    });

    setInterval(myfunc, 20000);
    function myfunc() {
        $("#qDiv").load("QouteServlet");
    }

});

//2
$(document).on("click", "#pBtn", function () {
        $("#pDiv").load("TimeServlet");
    });
    
//3


//4
window.onload = function () {
    // Get the Object by ID
    var a = document.getElementById("hearts");
    // Get the SVG document inside the Object tag
    var svgDoc = a.contentDocument;
    // Get one of the SVG items by ID;
    var svgItem = svgDoc.getElementById("svg2");

    console.log(svgItem);

    var id;
    $("g", svgItem).click(function () {

        id = $(this).attr('id');
        $("#direction").html("Direction: " + id);

    });
};



