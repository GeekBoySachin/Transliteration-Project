$(document).ready(function() {

	$(document).keypress(function(event) {
		if (event.which == '13') {
			event.preventDefault();
		}
	});

	$('#clear').click(function(){
		$('#hindi').val("");
		$('#english').val("");
	});
	
	$('#convert').click(function() {

		var input = $.trim($('#hindi').val());
		
		$.ajax({
			type : "POST",
			url : '/HiToEn',
			contentType : "text/plain",
			dataType : "html",
			data : input

		}).then(function(data) {
			$('#english').html(data);
		});

	});
});