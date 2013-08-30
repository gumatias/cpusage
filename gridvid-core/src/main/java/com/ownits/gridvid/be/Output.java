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
public class Output {

	@SerializedName("key")
	private String mKey;
	
	@SerializedName("secret")
	private String mSecret;
	
	@SerializedName("bucket")
	private String mBucket;
	
	@SerializedName("object")
	private String mObject;
	
	@SerializedName("set_public")
	private Boolean mPublic;
	
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

	public String getBucket() {
		return mBucket;
	}

	public void setBucket(String pBucket) {
		mBucket = pBucket;
	}

	public String getObject() {
		return mObject;
	}

	public void setObject(String pObject) {
		mObject = pObject;
	}

	public Boolean isPublic() {
		return mPublic;
	}

	public void setPublic(Boolean pPublic) {
		mPublic = pPublic;
	}

	@Override
	public String toString() {
		return "Output [mKey=" + mKey + ", mSecret=" + mSecret + ", mBucket="
				+ mBucket + ", mObject=" + mObject + ", mPublic=" + mPublic
				+ "]";
	}
	
}