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
public class Audio {
	
	@SerializedName("codec")
	private String mCodec;
	
	@SerializedName("disable")
	private Boolean mDisable;
	
	@SerializedName("frequency")
	private Long mFrequency;
	
	@SerializedName("bitrate")
	private String mBitrate;
	
	@SerializedName("channels")
	private String mChannels;
	
	@SerializedName("quality")
	private Integer mQuality;
	
	@SerializedName("advanced")
	private AudioAdvanced mAdvanced;

	public AudioCodec getCodec() {
		return AudioCodec.fromValue(mCodec);
	}

	public void setCodec(AudioCodec pCodec) {
		mCodec = pCodec.getValue();
	}

	public Boolean isDisable() {
		return mDisable;
	}

	public void setDisable(Boolean pDisable) {
		mDisable = pDisable;
	}

	public Long getFrequency() {
		return mFrequency;
	}

	public void setFrequency(Long pFrequency) {
		mFrequency = pFrequency;
	}

	public String getBitrate() {
		return mBitrate;
	}

	public void setBitrate(String pBitrate) {
		mBitrate = pBitrate;
	}

	public String getChannels() {
		return mChannels;
	}

	public void setChannels(String pChannels) {
		mChannels = pChannels;
	}

	public Integer getQuality() {
		return mQuality;
	}

	public void setQuality(Integer pQuality) {
		mQuality = pQuality;
	}

	public AudioAdvanced getAdvanced() {
		return mAdvanced;
	}

	public void setAdvanced(AudioAdvanced pAdvanced) {
		mAdvanced = pAdvanced;
	}
	
}