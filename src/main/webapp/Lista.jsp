<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="menu.jsp"></jsp:include>
<!--=======content================================-->
<div class="content_wrapper"><div class="ic">More Website Templates @ TemplateMonster.com - September 23, 2013!</div>
    <div class="container_12">
        <div class="grid_12">
            <div class="content">
                <img src="/resources/images/page2_img1.jpg" alt="" class="img_inner">
                <h3>Sistema de inventario</h3>
                <p>stock actual</p>
                <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                    <thead>
                    <tr>
                        <th>Marca</th>
                        <th>Tipo</th>
                        <th>Cepa</th>
                        <th>reserva</th>
                        <th>Stock minimo</th>
                        <th>Stock maximo</th>
                        <th>Stock</th>
                        <th>Tipo volumen</th>
                    </tr>
                    </thead>
                    <tfoot>
                    <tr>
                        <th>Marca</th>
                        <th>Tipo</th>
                        <th>Cepa</th>
                        <th>reserva</th>
                        <th>Stock minimo</th>
                        <th>Stock maximo</th>
                        <th>Stock</th>
                        <th>Tipo volumen</th>
                    </tr>
                    </tfoot>
                    <tbody>
                    <c:forEach var="lista" items="${productos}">
                    <tr>
                        <td>${lista.marca}</td>
                        <td>${lista.tipo}</td>
                        <td>${lista.cepa}</td>
                        <td>${lista.reserva}</td>
                        <td>${lista.stock_minimo}</td>
                        <td>${lista.stock_maximo}</td>
                        <td>${lista.stock}</td>
                        <td>${lista.formato}</td>
                    </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>

    </div>
</div>

<script>
    $(document).ready(function() {
        $('#example').DataTable( {
            dom: 'Bfrtip',
            buttons: [
                'copy', 'csv', 'excel', 'pdf', 'print'
            ]
        } );
    } );
</script>
<!--==============================footer=================================-->
<jsp:include page="footer.jsp"></jsp:include>