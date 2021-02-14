/**/  
var common = null;

/*
*/ 
common = {
	
	
	getAjax: function() {
		
	},

	postAjax: function(uri, param, onSuccessedCollBackFunc = null, onFailedCollBack = null) {

		// TODO:チェック内容は要検討
		if(!(typeof(onSuccessedCollBackFunc) == "function")){
			console.log("");
			return;
		}
		
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
			onSuccessedCollBackFunc(data, textStatus, jqXHR);
		})
		.fail(function (jqXHR, textStatus, errorThrown) {
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
			onFailedCollBack(data, textStatus, jqXHR);
		})
		// TODO:仕様検討
		.always(function () {	
		});		
	},
};
