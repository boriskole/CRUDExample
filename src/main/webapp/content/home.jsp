<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template>

    <jsp:attribute name="title">
        Homepagina - CRUDExample
    </jsp:attribute>

    <jsp:attribute name="css">
        <link rel="stylesheet" href="/content/css/home.css" type="text/css" />
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
                                    <button class="btn btn-danger">Verwijderen</button>
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>

            </div>

        </div>

    </jsp:attribute>

</t:template>