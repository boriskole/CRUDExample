<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template>

    <jsp:attribute name="title">
        Homepagina - CRUDExample
    </jsp:attribute>

    <jsp:attribute name="content">

        <div class="container top-50 start-50 translate-middle position-absolute">

            <div class="row">

                <div class="col"></div>

                <div class="col text-center">
                    <h1>Personen</h1>
                </div>

                <div class="col text-center">
                    <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#toevoegen">
                        +
                    </button>
                </div>

            </div>

            <div class="mt-5 row text-center">

                <table class="table table-striped border">
                    <thead>
                        <tr>
                            <th>Voornaam</th>
                            <th>Tussenvoegsel</th>
                            <th>Achternaam</th>
                            <th>Geboortedatum</th>
                            <th>Acties</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="personen" var="persoon">
                            <tr>
                                <td><s:property value="voornaam" /></td>
                                <td><s:property value="tussenvoegsel" /></td>
                                <td><s:property value="achternaam" /></td>
                                <td><s:property value="geboortedatum" /></td>
                                <td>
                                    <button class="btn btn-primary" data-bs-id="<s:property value="id"/>" data-bs-voornaam="<s:property value="voornaam"/>" data-bs-tussenvoegsel="<s:property value="tussenvoegsel"/>" data-bs-achternaam="<s:property value="achternaam"/>" data-bs-geboortedatum="<s:property value="geboortedatum"/>" data-bs-toggle="modal" data-bs-target="#bewerken">Wijzigen</button>
                                    <button class="btn btn-danger" data-bs-id="<s:property value="id"/>" data-bs-toggle="modal" data-bs-target="#verwijderen">Verwijderen</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>

            </div>

        </div>

        <div class="modal" tabindex="-1" id="verwijderen">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="verwijderen" method="post">

                        <div class="modal-header">
                            <h1 class="mx-auto">Weet je het zeker?</h1>
                        </div>

                        <input type="hidden" id="verwijderen-id" name="id">

                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary ms-auto me-3">
                                <i class="bi bi-check-lg"></i>
                            </button>
                            <button type="button" class="btn btn-danger me-auto" data-bs-dismiss="modal">
                                <i class="bi bi-x-lg"></i>
                            </button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <div class="modal" tabindex="-1" id="bewerken">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="bewerken" method="post">

                        <div class="modal-header">
                            <h1 class="mx-auto">Bewerken</h1>
                        </div>

                        <div class="modal-body">

                            <input type="hidden" name="dto.id" id="bewerken-id">

                            <div class="form-floating mb-3">
                                <input type="text" required class="form-control" name="dto.voornaam" id="bewerken-voornaam" placeholder="Voornaam">
                                <label for="bewerken-voornaam">Voornaam</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" name="dto.tussenvoegsel" id="bewerken-tussenvoegsel" placeholder="Tussenvoegsel">
                                <label for="bewerken-tussenvoegsel">Tussenvoegsel</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="text" required class="form-control" name="dto.achternaam" id="bewerken-achternaam" placeholder="Achternaam">
                                <label for="bewerken-achternaam">Achternaam</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="date" required class="form-control" name="dto.geboortedatum" id="bewerken-geboortedatum" placeholder="Geboortedatum">
                                <label for="bewerken-geboortedatum">Geboortedatum</label>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary ms-auto me-3">
                                <i class="bi bi-check-lg"></i>
                            </button>
                            <button type="button" class="btn btn-danger me-auto" data-bs-dismiss="modal">
                                <i class="bi bi-x-lg"></i>
                            </button>
                        </div>

                    </form>

                </div>
            </div>
        </div>
        
        <div class="modal" tabindex="-1" id="toevoegen">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="toevoegen" method="post">

                        <div class="modal-header">
                            <h1 class="mx-auto">Toevoegen</h1>
                        </div>

                        <div class="modal-body">

                            <div class="form-floating mb-3">
                                <input type="text" required class="form-control" name="dto.voornaam" id="toevoegen-voornaam" placeholder="Voornaam">
                                <label for="toevoegen-voornaam">Voornaam</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" name="dto.tussenvoegsel" id="toevoegen-tussenvoegsel" placeholder="Tussenvoegsel">
                                <label for="toevoegen-tussenvoegsel">Tussenvoegsel</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="text" required class="form-control" name="dto.achternaam" id="toevoegen-achternaam" placeholder="Achternaam">
                                <label for="toevoegen-achternaam">Achternaam</label>
                            </div>

                            <div class="form-floating mb-3">
                                <input type="date" required class="form-control" name="dto.geboortedatum" id="toevoegen-geboortedatum" placeholder="Geboortedatum">
                                <label for="toevoegen-geboortedatum">Geboortedatum</label>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary ms-auto me-3">
                                <i class="bi bi-check-lg"></i>
                            </button>
                            <button type="button" class="btn btn-danger me-auto" data-bs-dismiss="modal">
                                <i class="bi bi-x-lg"></i>
                            </button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

    </jsp:attribute>

    <jsp:attribute name="script">
        <script src="content/js/home.js"></script>
    </jsp:attribute>

</t:template>