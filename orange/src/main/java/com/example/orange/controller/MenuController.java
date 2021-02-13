package com.example.orange.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class MenuController {

	//region 定数
	//endregion;
	
	//region
	// 公開メソッド
	@RequestMapping("/")
	public String index(Model model) {

		// 画面用モデルの追加
        model.addAttribute("funcName", "Menu");

		return "menu";
	}
	//endregion;

	/// region
	/// 非公開メソッド
	/// endregion
	

	
}
