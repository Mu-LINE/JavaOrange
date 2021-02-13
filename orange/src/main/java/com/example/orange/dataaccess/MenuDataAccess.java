package com.example.orange.dataaccess;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  メニューデータアクセス
 */
public class MenuDataAccess {

	//region
	// 公開メソッド
	
	/**
	 *  メニュー画面情報取得
	 *  @param string 名前
	 *  @param int    年齢
	 *  @return String 戻り値
	 */
	@RequestMapping("/")
	public String getMenuData(Model model) {

		// DB取得処理
		
		return "menu";
	}
	//endregion;
}
