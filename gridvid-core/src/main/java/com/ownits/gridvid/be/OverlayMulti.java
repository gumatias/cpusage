package com.ownits.gridvid.be;

import com.google.gson.annotations.SerializedName;

/**
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 * 
 * @author gumatias <gustavo@ownits.com>
 *
 */
public class OverlayMulti {

	@SerializedName("filename")
	private String mFilename;

	public String getFilename() {
		return mFilename;
	}

	public void setFilename(String pFilename) {
		mFilename = pFilename;
	}
	
}