/**/  
var common = null;

/*
*/ 
common = {
	
	
	getAjax: function() {
		
	},

	postAjax: function(uri, param) {
		
		$.ajax({
			url: uri,
			type: "POST",
			contentType: "application/json",
			data: JSON.stringify(param),
			dataType: "json",
		})
		.done(function (data, textStatus, jqXHR) {
			console.log(data);
			console.log(textStatus);
			console.log(jqXHR);
		})
		.fail(function (jqXHR, textStatus, errorThrown) {
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
		})
		.always(function () {	
		});		
	},
};
