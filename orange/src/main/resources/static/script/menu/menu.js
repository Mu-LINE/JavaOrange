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
				
				var model = {
					No: "111",
					Name: "Test",
				};				
				
			    console.log(JSON.stringify(model));
				
				common.postAjax(
					"getData",
					model);
			});			
	    },
	
	    /**
	     * 画面表示時処理
	     */
	    Initialization: function () {
		
	    },
    };

})();

$(document).ready(function() {
	
    // 読込後、起動処理
	Menu.DOMContentLoaded();
});
