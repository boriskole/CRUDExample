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
                    <button class="btn btn-primary">+</button>
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
                                    <button class="btn btn-primary">Wijzigen</button>
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

                        <input type="hidden" id="persoon-id" name="id">

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