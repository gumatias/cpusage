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
public class Video {
	
	@SerializedName("codec")
	private String mCodec;
	
	@SerializedName("advanced")
	private VideoAdvanced mAdvanced;
	
	@SerializedName("bitrate")
	private Bitrate mBitrate;
	
	@SerializedName("quantizer")
	private Quantizer mQuantizer;

	@SerializedName("disable")
	private Boolean mDisable;
	
	@SerializedName("aspectratio")
	private String mAspectratio;
	
	@SerializedName("vf")
	private String mVF;
	
	@SerializedName("no_stream")
	private Boolean mNoStream;
	
	@SerializedName("hls_stream")
	private HLSStream mHlsStream;

	public VideoCodec getCodec() {
		return VideoCodec.fromValue(mCodec);
	}

	public void setCodec(VideoCodec pCodec) {
		mCodec = pCodec.getValue();
	}

	public VideoAdvanced getAdvanced() {
		return mAdvanced;
	}

	public void setAdvanced(VideoAdvanced pAdvanced) {
		mAdvanced = pAdvanced;
	}

	public Bitrate getBitrate() {
		return mBitrate;
	}

	public void setBitrate(Bitrate pBitrate) {
		mBitrate = pBitrate;
	}

	public Quantizer getQuantizer() {
		return mQuantizer;
	}

	public void setQuantizer(Quantizer pQuantizer) {
		mQuantizer = pQuantizer;
	}

	public Boolean getDisable() {
		return mDisable;
	}

	public void setDisable(Boolean pDisable) {
		mDisable = pDisable;
	}

	public String getAspectratio() {
		return mAspectratio;
	}

	public void setAspectratio(String pAspectratio) {
		mAspectratio = pAspectratio;
	}

	public String getVF() {
		return mVF;
	}

	public void setVF(String pVF) {
		mVF = pVF;
	}

	public Boolean getNoStream() {
		return mNoStream;
	}

	public void setNoStream(Boolean pNoStream) {
		mNoStream = pNoStream;
	}

	public HLSStream getHlsStream() {
		return mHlsStream;
	}

	public void setHlsStream(HLSStream pHlsStream) {
		mHlsStream = pHlsStream;
	}
	
}