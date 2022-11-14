$(document).ready( function () {
	$.ajax({
		url: "/dogs",
		'headers': { 'Accept': 'application/json;odata=nometadata' },
		success: function (data) {
			data = data;
			var table = $('#dataTable').DataTable();
			table.rows.add( data.content ).draw();
		}
	});

	 var table = $('#dataTable').DataTable({
			"columns": [
			    { "data": "id"},
		      { "data": "breed" },
				  { "data": "color" }
			]
	 })
});
