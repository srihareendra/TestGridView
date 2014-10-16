<html>
<head>
<title>To-do List Gridview</title>

<link href="css/demo_table_jui.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/demo_page.css" rel="stylesheet" />

<script src="js/jquery.js"></script>
<script src="js/jquery.dataTables.js"></script>
<script>
$(document).ready(function() {
	$(".jqueryDataTable").dataTable({
		"sPaginationType" : "full_numbers",
		"bProcessing" : false,
		"bServerSide" : false,
		"sAjaxSource" : "displayData",
		"bJQueryUI" : true,
		"aoColumns" : [
            { "mData": "task" },
            { "mData": "priority" },
            { "mData": "status" },
            { "mData": "duedate"},
            
        ]
    } ); 
} );
</script>
<script>
function newDoc() {
    window.location.assign("http://localhost:8080/TestTodoApp/")
}
</script>
</head>

<body id="dt_example">
<div id="container">
<h1>jQuery DataTable plugin in Java web application</h1>
<div id="demo_jui">
	<table class="display jqueryDataTable">
	<thead>
	<tr>
		<th>Task DueDate</th>
		<th>Priority</th>
		<th>Status</th>
		<th>Description</th>
		
	</tr>
	</thead>
	<tbody>
	</tbody>
	</table>
</div>
<input type="button" value="To-do CRUD" onclick="newDoc()">
</div>
</body>
</html>