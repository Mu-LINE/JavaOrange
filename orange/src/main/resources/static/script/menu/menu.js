// 
// Menu
//
// 作成者：野田
// 作成日：2021/01/21
//

/**
 * 基盤の名前空間.
 * @namespace
 */
var Menu;


(function () {
	
    "use strict";

    Menu = {
	
		// 定義値
	    Constant: {
	    },
	
	    // 設定値
	    AppSetting: {
	    },

	    /**
	     * DOM読み込み完了後の処理.
	     */
	    DOMContentLoaded: function () {
		
			// コマンドの設定を行う
			Menu.InitializeCommands();
			
			// 画面表示時処理
			Menu.Initialization();
	    },
	
	    /**
	     * コマンドを初期化.
	     */
	    InitializeCommands: function () {
		
			$('#button').on('click', function() {
				
			});			
	    },
	
	    /**
	     * 画面表示時処理
	     */
	    Initialization: function () {
		
			// メニュー情報を取得する
			Menu.GetMenuData();
	    },

	    /**
	     * メニュー情報を取得する
	     */
		GetMenuData: function(){

			var model = {
				No: "111",
				Name: "Test",
			};
				
		    console.log(JSON.stringify(model));
			
			common.postAjax("getData", model, Menu.SetMenuData);
		},
		
	    /**
	     * メニュー情報を画面に設定する
	     */
		SetMenuData: function(data, textStatus, jqXHR){
			
			alert("SetMenuData");
			console.log(data);
		}
    };

})();

$(document).ready(function() {
	
    // 読込後、起動処理
	Menu.DOMContentLoaded();
});
