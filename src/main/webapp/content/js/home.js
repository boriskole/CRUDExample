const verwijderen = document.getElementById('verwijderen');
const bewerken = document.getElementById('bewerken');

verwijderen.addEventListener('show.bs.modal', function(event) {
    let button = event.relatedTarget;
    let id = button.getAttribute('data-bs-id');
    let idInput = document.getElementById('verwijderen-id');
    idInput.value = id;
})

bewerken.addEventListener('show.bs.modal', function(event) {

    let button = event.relatedTarget;

    let id = button.getAttribute('data-bs-id');
    let voornaam = button.getAttribute('data-bs-voornaam');
    let tussenvoegsel = button.getAttribute('data-bs-tussenvoegsel');
    let achternaam = button.getAttribute('data-bs-achternaam');
    let geboortedatum = button.getAttribute('data-bs-geboortedatum');

    let idInput = document.getElementById('bewerken-id');
    let voornaamInput = document.getElementById('bewerken-voornaam');
    let tussenvoegselInput = document.getElementById('bewerken-tussenvoegsel');
    let achternaamInput = document.getElementById('bewerken-achternaam');
    let geboortedatumInput = document.getElementById('bewerken-geboortedatum');

    idInput.value = id;
    voornaamInput.value = voornaam;
    tussenvoegselInput.value = tussenvoegsel;
    achternaamInput.value = achternaam;
    geboortedatumInput.value = geboortedatum;

})