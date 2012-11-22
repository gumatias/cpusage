package com.cpusage.gridvid.be;

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
public enum ThumbnailFormat {

	JPG ("jpg"),
	PNG ("png");
	
	private String mValue;
	
	private ThumbnailFormat(String pValue) {
		mValue = pValue;
	}

	public String getValue() {
		return mValue;
	}
	
	public static ThumbnailFormat fromValue(String pValue) {
		for (ThumbnailFormat f : ThumbnailFormat.values()) {
			if (f.getValue().equalsIgnoreCase(pValue)) return f;
		}
		return null;
	}
	
}