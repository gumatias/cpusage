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
public class HLSStream {

	@SerializedName("filter")
	private String mFilter;
	
	@SerializedName("format")
	private String mFormat;
	
	@SerializedName("segment_time")
	private Integer mSegmentTime;

	public String getFilter() {
		return mFilter;
	}

	public void setFilter(String pFilter) {
		mFilter = pFilter;
	}

	public String getFormat() {
		return mFormat;
	}

	public void setFormat(String pFormat) {
		mFormat = pFormat;
	}

	public Integer getSegmentTime() {
		return mSegmentTime;
	}

	public void setSegmentTime(Integer pSegmentTime) {
		mSegmentTime = pSegmentTime;
	}
	
}