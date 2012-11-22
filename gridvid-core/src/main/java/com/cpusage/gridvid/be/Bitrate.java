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
public class Bitrate {

	@SerializedName("rate")
	private String mRate;
	
	@SerializedName("tolerance")
	private String mTolerance;
	
	@SerializedName("maxrate")
	private String mMaxrate;
	
	@SerializedName("minrate")
	private String mMinrate;
	
	@SerializedName("bufsize")
	private String mBufsize;

	public String getRate() {
		return mRate;
	}

	public void setRate(String pRate) {
		mRate = pRate;
	}

	public String getTolerance() {
		return mTolerance;
	}

	public void setTolerance(String pTolerance) {
		mTolerance = pTolerance;
	}

	public String getMaxrate() {
		return mMaxrate;
	}

	public void setMaxrate(String pMaxrate) {
		mMaxrate = pMaxrate;
	}

	public String getMinrate() {
		return mMinrate;
	}

	public void setMinrate(String pMinrate) {
		mMinrate = pMinrate;
	}

	public String getBufsize() {
		return mBufsize;
	}

	public void setBufsize(String pBufsize) {
		mBufsize = pBufsize;
	}

}