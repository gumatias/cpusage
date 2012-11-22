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
public class EncodingRequest {

	@SerializedName("key")
	private String mKey;
	
	@SerializedName("secret")
	private String mSecret;
	
	@SerializedName("input")
	private Input mInput;
	
	@SerializedName("output")
	private Output mOutput;
	
	@SerializedName("audio")
	private Audio mAudio;
	
	@SerializedName("video")
	private Video mVideo;
	
	@SerializedName("thumbnails")
	private Thumbnail mThumbnail;
	
	@SerializedName("overlay")
	private Overlay mOverlay;
	
	@SerializedName("template")
	private String mTemplate;

	public String getKey() {
		return mKey;
	}

	public void setKey(String pKey) {
		mKey = pKey;
	}

	public String getSecret() {
		return mSecret;
	}

	public void setSecret(String pSecret) {
		mSecret = pSecret;
	}

	public Input getInput() {
		return mInput;
	}

	public void setInput(Input pInput) {
		mInput = pInput;
	}

	public Output getOutput() {
		return mOutput;
	}

	public void setOutput(Output pOutput) {
		mOutput = pOutput;
	}

	public Audio getAudio() {
		return mAudio;
	}

	public void setAudio(Audio pAudio) {
		mAudio = pAudio;
	}

	public Video getVideo() {
		return mVideo;
	}

	public void setVideo(Video pVideo) {
		mVideo = pVideo;
	}

	public Thumbnail getThumbnail() {
		return mThumbnail;
	}

	public void setThumbnail(Thumbnail pThumbnail) {
		mThumbnail = pThumbnail;
	}

	public Overlay getOverlay() {
		return mOverlay;
	}

	public void setOverlay(Overlay pOverlay) {
		mOverlay = pOverlay;
	}

	public String getTemplate() {
		return mTemplate;
	}

	public void setTemplate(String pTemplate) {
		mTemplate = pTemplate;
	}
	
}