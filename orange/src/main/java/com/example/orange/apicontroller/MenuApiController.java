package com.example.orange.apicontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("MenuApi")
public class MenuApiController {

	/**
	 *  メニュー情報取得
	 *  @param string 名前
	 *  @param int    年齢
	 *  @return String 戻り値
	 */
    @RequestMapping(value = "getData", method = RequestMethod.POST)
    private String getData() {
        return "data!";
    }

}
