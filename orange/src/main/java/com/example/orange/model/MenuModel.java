package com.example.orange.model;

import java.util.List;
import lombok.Data;

@Data
/**
 *  メニュー画面Model
 */
public class MenuModel {
	
    /**
     * No
     */	
	public String No;
	
    /**
     * Name
     */	
	public String Name;
	
    /**
     * Favorite
     */	
	public List<String> Favorite;
}

