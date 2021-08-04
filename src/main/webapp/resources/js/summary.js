document.querySelectorAll("input[name='_categories']").forEach(el => el.remove());

function Summary() {

    let category = [];
    document.querySelectorAll("input[type=checkbox]").forEach(el => {
        if (el.checked === true) {
            category.push(el.parentElement.querySelector(".description").innerHTML);
        }
    })


    let quantity = document.getElementById("quantity").value;


    let institution;
    document.querySelectorAll("input[type=radio]").forEach(el => {
        if (el.checked === true) {
            institution = el.parentElement.querySelector(".title").innerHTML.substring(9); //split("“")[1];
        }
    });


    let street = document.getElementById("street").value;
    let city = document.getElementById("city").value;
    let zipCode = document.getElementById("zipCode").value;
    let pickUpDate = document.getElementById("pickUpDate").value;
    let pickUpTime = document.getElementById("pickUpTime").value;
    let pickUpComment = document.getElementById("pickUpComment").value;



    document.querySelector("li .icon-bag").nextElementSibling.innerHTML = quantity + " worki z " + category;

    document.querySelector("li .icon-hand").nextElementSibling.innerHTML = "Dla fundacji " + institution;


    let address = document.getElementById("summary-address").querySelectorAll("li");
    address[0].innerHTML = street;
    address[1].innerHTML = city;
    address[2].innerHTML = zipCode;


    let date = document.getElementById("summary-date").querySelectorAll("li");
    date[0].innerHTML = pickUpDate;
    date[1].innerHTML = pickUpTime;
    date[2].innerHTML = pickUpComment;
}