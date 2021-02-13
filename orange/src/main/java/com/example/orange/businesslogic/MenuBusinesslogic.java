package com.example.orange.businesslogic;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.orange.dataaccess.MenuDataAccess;


@Service
/**
 *  メニュー画面ビジネスロジック
 */
public class MenuBusinesslogic {

	//region 定数
	private MenuDataAccess dataAccess = new MenuDataAccess();
	//endregion;
	
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
		
		// メニュー画面情報取得
		dataAccess.getMenuData(model);

		return "menu";
	}
	//endregion;

}
