<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>test page</title>
<link rel="stylesheet" href="resources/css/jquery.dataTables.css">
<script type="text/javascript" src="resources/js/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="resources/js/jquery/jquery.dataTables.min.js"></script>
</head>
<script type="text/javascript">
$(function () {

$("#data-table").dataTable({
    "sAjaxSource": "/pageNation.do",
    "bProcessing": true,
    "bFilter": false,
    "bServerSide": true,
    "bAutoWidth": true,
    "aoColumns": [     
		{ "sWidth": "8%", "sTitle": "navid", "sClass": "center", "mData": "navid", "bSortable": false },
        { "sWidth": "8%", "sTitle": "navname", "sClass": "center", "mData": "navname", "bSortable": false },
        { "sWidth": "8%", "sTitle": "navlink", "sClass": "center", "mData": "navlink", "bSortable": false }
    ],
    "aLengthMenu": [ 10, 20, 30 ],
    "aaSorting": [],
    "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {
        

    },
     "fnServerParams": function (aoData) {
       
    },
    "fnInitComplete": function () {
        
    } 
});

});
</script>
<body>
	<table id="data-table">
	</table>
</body>
</html>