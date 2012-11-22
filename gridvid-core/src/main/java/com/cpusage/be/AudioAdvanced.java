package com.cpusage.be;

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
public class AudioAdvanced {

	@SerializedName("ac")
	private Integer mAC;
	
	@SerializedName("ab")
	private String mAB;
	
	@SerializedName("ar")
	private Long mAR;

	public Integer getAC() {
		return mAC;
	}

	public void setAC(Integer pAC) {
		mAC = pAC;
	}

	public String getAB() {
		return mAB;
	}

	public void setAB(String pAB) {
		mAB = pAB;
	}

	public Long getAR() {
		return mAR;
	}

	public void setAR(Long pAR) {
		mAR = pAR;
	}
	
}