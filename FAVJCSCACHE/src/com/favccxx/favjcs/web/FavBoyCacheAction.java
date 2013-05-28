package com.favccxx.favjcs.web;

import com.favccxx.favjcs.model.FavConstants;
import com.favccxx.favjcs.model.FavUser;
import com.opensymphony.xwork2.ActionSupport;

public class FavBoyCacheAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3232771730909993531L;
	
	private FavUser favUser;
	
	public FavUser getFavUser() {
		return favUser;
	}

	public void setFavUser(FavUser favUser) {
		this.favUser = favUser;
	}

	public String executeMemoryCache() {
		
		return FavConstants.SUCCESS;
	}

}
