package com.ownits.gridvid.be;

import java.util.Map;

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
public class EncodingCallbackResponse {

	@SerializedName("jobid")
	private String mJobId;
	
	@SerializedName("exit_code")
	private Integer mExitCode;
	
	@SerializedName("proc_time")
	private String mProcTime;
	
	@SerializedName("total_time")
	private String mTotalTime;
	
	@SerializedName("outputs")
	private Map<String, Map<String, Map<String, Object>>> mOutputs;
	
	@SerializedName("length")
	private Integer mLength;

	public String getJobId() {
		return mJobId;
	}

	public void setJobId(String pJobId) {
		mJobId = pJobId;
	}

	public Integer getExitCode() {
		return mExitCode;
	}

	public void setExitCode(Integer pExitCode) {
		mExitCode = pExitCode;
	}

	public String getProcTime() {
		return mProcTime;
	}

	public void setProcTime(String pProcTime) {
		mProcTime = pProcTime;
	}

	public String getTotalTime() {
		return mTotalTime;
	}

	public void setTotalTime(String pTotalTime) {
		mTotalTime = pTotalTime;
	}

	public Map<String, Map<String, Map<String, Object>>> getOutputs() {
		return mOutputs;
	}

	public void setOutputs(Map<String, Map<String, Map<String, Object>>> pOutputs) {
		mOutputs = pOutputs;
	}

	public Integer getLength() {
		return mLength;
	}

	public void setLength(Integer pLength) {
		mLength = pLength;
	}
	
}