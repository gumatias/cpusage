package com.cpusage.gridvid.be;

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
public class Thumbnail {

	@SerializedName("number")
	private Integer mNumber;
	
	@SerializedName("size")
	private String mSize;
	
	@SerializedName("format")
	private String mFormat;

	public Integer getNumber() {
		return mNumber;
	}

	public void setNumber(Integer pNumber) {
		mNumber = pNumber;
	}

	public String getSize() {
		return mSize;
	}

	public void setSize(String pSize) {
		mSize = pSize;
	}

	public ThumbnailFormat getFormat() {
		return ThumbnailFormat.fromValue(mFormat);
	}

	public void setFormat(ThumbnailFormat pFormat) {
		mFormat = pFormat.getValue();
	}
	
}