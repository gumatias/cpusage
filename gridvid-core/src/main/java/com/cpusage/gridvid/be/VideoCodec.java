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
public enum VideoCodec {

	COPY ("copy"), 
	MP4 ("mp4"),
	MPEG4 ("mpeg4"),
	XVID ("xvid"),
	LIBXVID ("libxvid"),
	X264 ("x264"),
	LIBX264 ("libx264"),
	VPX ("vpx"),
	LIBVPX ("libvpx"),
	FLV ("flv"),
	MPEG2 ("mpeg2"),
	MPEG2VIDEO ("mpeg2video"),
	H263 ("h263"),
	WMV ("wmv"),
	MSMEG4 ("msmeg4");
	
	private String mValue;
	
	private VideoCodec (String pValue) {
		mValue = pValue;
	}

	public String getValue() {
		return mValue;
	}
	
	public static VideoCodec fromValue(String pValue) {
		for (VideoCodec c : VideoCodec.values()) {
			if (c.getValue().equalsIgnoreCase(pValue)) return c;
		}
		return null;
	}

}
