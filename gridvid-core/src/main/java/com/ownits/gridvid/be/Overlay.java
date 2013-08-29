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
public class Overlay {

	@SerializedName("w_offset")
	private String mWOffset;
	
	@SerializedName("h_offset")
	private String mHOffset;
	
	@SerializedName("input")
	private OverlayInput mInput;
	
	@SerializedName("multi")
	private OverlayMulti mMulti;

	public String getWOffset() {
		return mWOffset;
	}

	public void setWOffset(String pWOffset) {
		mWOffset = pWOffset;
	}

	public String getHOffset() {
		return mHOffset;
	}

	public void setHOffset(String pHOffset) {
		mHOffset = pHOffset;
	}

	public OverlayInput getInput() {
		return mInput;
	}

	public void setInput(OverlayInput pInput) {
		mInput = pInput;
	}

	public OverlayMulti getMulti() {
		return mMulti;
	}

	public void setMulti(OverlayMulti pMulti) {
		mMulti = pMulti;
	}

	@Override
	public String toString() {
		return "Overlay [mWOffset=" + mWOffset + ", mHOffset=" + mHOffset
				+ ", mInput=" + mInput + ", mMulti=" + mMulti + "]";
	}
	
}