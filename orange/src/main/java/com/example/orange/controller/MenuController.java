package com.example.orange.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.orange.businesslogic.MenuBusinesslogic;
import com.example.orange.model.MenuModel;
import com.google.gson.Gson;

/**
 *  メニュープレゼンテーションロジック
 */

@Controller
@RequestMapping("menu")
public class MenuController {

	//region 定数
	private MenuBusinesslogic biz = new MenuBusinesslogic();
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
	public String index(Model model) {
		
		// メニューデータを取得する
		var ret = biz.getMenuData(model);

		// 画面データに反映する
        model.addAttribute("funcName", ret);
        //model.addAttribute("funcName", data);

		return "Menu/index";
	}
	
	/**
	 *  メニュー画面情報取得
	 *  @param string 名前
	 *  @param int    年齢
	 *  @return String 戻り値
	 */
	@RequestMapping("getData")
	public String getData(@RequestBody MenuModel menuModel,  Model model) {
		
		// メニューデータを取得する
		var ret = biz.getMenuData(model);

		// 画面データに反映する
        model.addAttribute("funcName", ret);

		return "Menu/index";
	}	
	
	//endregion;

	/// region
	/// 非公開メソッド
	/// endregion
	

	
}
