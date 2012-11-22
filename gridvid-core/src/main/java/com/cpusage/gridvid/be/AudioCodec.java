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
public enum AudioCodec {

	AAC("aac"), AC3("ac3"), MP3("mp3"), WMA("wma"), VORBIS("vorbis");

	private String mValue;

	private AudioCodec(String pValue) {
		mValue = pValue;
	}

	public String getValue() {
		return mValue;
	}
	
	public static AudioCodec fromValue(String pValue) {
		for (AudioCodec c : AudioCodec.values()) {
			if (c.getValue().equalsIgnoreCase(pValue)) return c;
		}
		return null;
	}

}