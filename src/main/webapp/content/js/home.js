const verwijderen = document.getElementById('verwijderen');
verwijderen.addEventListener('show.bs.modal', function(event) {
    let button = event.relatedTarget;
    let id = button.getAttribute('data-bs-id')
    let modalBodyInput = document.getElementById('persoon-id');
    modalBodyInput.value = id
})