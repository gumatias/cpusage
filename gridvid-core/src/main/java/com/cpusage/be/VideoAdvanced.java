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
public class VideoAdvanced {
	
	@SerializedName("deblockalpha")
	private Integer mDeblockalpha;
	
	@SerializedName("vf")
	private String mVF;
	
	@SerializedName("subq")
	private Integer mSubq;
	
	@SerializedName("refs")
	private Integer mRefs;
	
	@SerializedName("wpredp")
	private Integer mWpredp;
	
	@SerializedName("qmin")
	private Integer mQmin;
	
	@SerializedName("aspect")
	private String mAspect;
	
	@SerializedName("me_method")
	private String mMeMethod;
	
	@SerializedName("deblockbeta")
	private Integer mDeblockbeta;
	
	@SerializedName("bufsize")
	private String mBufsize;
	
	@SerializedName("directpred")
	private Integer mDirectpred;
	
	@SerializedName("coder")
	private Integer mCoder;
	
	@SerializedName("flags2")
	private String mFlags2;
	
	@SerializedName("me_range")
	private Integer mMeRange;
	
	@SerializedName("maxrate")
	private String mMaxrate;
	
	@SerializedName("partitions")
	private String mPartitions;
	
	@SerializedName("bf")
	private Integer mBF;
	
	@SerializedName("qcomp")
	private Double mQcomp;
	
	@SerializedName("bt")
	private String mBT;
	
	@SerializedName("keyint_min")
	private Integer mKeyintMin;
	
	@SerializedName("b")
	private String mB;
	
	@SerializedName("qdiff")
	private Integer mQdiff;
	
	@SerializedName("g")
	private Integer mG;
	
	@SerializedName("f")
	private String mF;
	
	@SerializedName("level")
	private Integer mLevel;
	
	@SerializedName("rc_lookahead")
	private Integer mRcLookahead;
	
	@SerializedName("qmax")
	private Integer mQmax;
	
	@SerializedName("b_strategy")
	private Integer mBStrategy;
	
	@SerializedName("i_qfactor")
	private Double mIQfactor;
	
	@SerializedName("r")
	private Double mR;
	
	@SerializedName("flags")
	private String mFlags;
	
	@SerializedName("sc_threshold")
	private Integer mScThreshold;
	
	@SerializedName("trellis")
	private Integer mTrellis;
	
	@SerializedName("cmp")
	private String mCmp;

	public Integer getDeblockalpha() {
		return mDeblockalpha;
	}

	public void setDeblockalpha(Integer pDeblockalpha) {
		mDeblockalpha = pDeblockalpha;
	}

	public String getVF() {
		return mVF;
	}

	public void setVF(String pVF) {
		mVF = pVF;
	}

	public Integer getSubq() {
		return mSubq;
	}

	public void setSubq(Integer pSubq) {
		mSubq = pSubq;
	}

	public Integer getRefs() {
		return mRefs;
	}

	public void setRefs(Integer pRefs) {
		mRefs = pRefs;
	}

	public Integer getWpredp() {
		return mWpredp;
	}

	public void setWpredp(Integer pWpredp) {
		mWpredp = pWpredp;
	}

	public Integer getQmin() {
		return mQmin;
	}

	public void setQmin(Integer pQmin) {
		mQmin = pQmin;
	}

	public String getAspect() {
		return mAspect;
	}

	public void setAspect(String pAspect) {
		mAspect = pAspect;
	}

	public String getMeMethod() {
		return mMeMethod;
	}

	public void setMeMethod(String pMeMethod) {
		mMeMethod = pMeMethod;
	}

	public Integer getDeblockbeta() {
		return mDeblockbeta;
	}

	public void setDeblockbeta(Integer pDeblockbeta) {
		mDeblockbeta = pDeblockbeta;
	}

	public String getBufsize() {
		return mBufsize;
	}

	public void setBufsize(String pBufsize) {
		mBufsize = pBufsize;
	}

	public Integer getDirectpred() {
		return mDirectpred;
	}

	public void setDirectpred(Integer pDirectpred) {
		mDirectpred = pDirectpred;
	}

	public Integer getCoder() {
		return mCoder;
	}

	public void setCoder(Integer pCoder) {
		mCoder = pCoder;
	}

	public String getFlags2() {
		return mFlags2;
	}

	public void setFlags2(String pFlags2) {
		mFlags2 = pFlags2;
	}

	public Integer getMeRange() {
		return mMeRange;
	}

	public void setMeRange(Integer pMeRange) {
		mMeRange = pMeRange;
	}

	public String getMaxrate() {
		return mMaxrate;
	}

	public void setMaxrate(String pMaxrate) {
		mMaxrate = pMaxrate;
	}

	public String getPartitions() {
		return mPartitions;
	}

	public void setPartitions(String pPartitions) {
		mPartitions = pPartitions;
	}

	public Integer getBF() {
		return mBF;
	}

	public void setBF(Integer pBF) {
		mBF = pBF;
	}

	public Double getQcomp() {
		return mQcomp;
	}

	public void setQcomp(Double pQcomp) {
		mQcomp = pQcomp;
	}

	public String getBT() {
		return mBT;
	}

	public void setBT(String pBT) {
		mBT = pBT;
	}

	public Integer getKeyintMin() {
		return mKeyintMin;
	}

	public void setKeyintMin(Integer pKeyintMin) {
		mKeyintMin = pKeyintMin;
	}

	public String getB() {
		return mB;
	}

	public void setB(String pB) {
		mB = pB;
	}

	public Integer getQdiff() {
		return mQdiff;
	}

	public void setQdiff(Integer pQdiff) {
		mQdiff = pQdiff;
	}

	public Integer getG() {
		return mG;
	}

	public void setG(Integer pG) {
		mG = pG;
	}

	public String getF() {
		return mF;
	}

	public void setF(String pF) {
		mF = pF;
	}

	public Integer getLevel() {
		return mLevel;
	}

	public void setLevel(Integer pLevel) {
		mLevel = pLevel;
	}

	public Integer getRcLookahead() {
		return mRcLookahead;
	}

	public void setRcLookahead(Integer pRcLookahead) {
		mRcLookahead = pRcLookahead;
	}

	public Integer getQmax() {
		return mQmax;
	}

	public void setQmax(Integer pQmax) {
		mQmax = pQmax;
	}

	public Integer getBStrategy() {
		return mBStrategy;
	}

	public void setBStrategy(Integer pBStrategy) {
		mBStrategy = pBStrategy;
	}

	public Double getIQfactor() {
		return mIQfactor;
	}

	public void setIQfactor(Double pIQfactor) {
		mIQfactor = pIQfactor;
	}

	public Double getR() {
		return mR;
	}

	public void setR(Double pR) {
		mR = pR;
	}

	public String getFlags() {
		return mFlags;
	}

	public void setFlags(String pFlags) {
		mFlags = pFlags;
	}

	public Integer getScThreshold() {
		return mScThreshold;
	}

	public void setScThreshold(Integer pScThreshold) {
		mScThreshold = pScThreshold;
	}

	public Integer getTrellis() {
		return mTrellis;
	}

	public void setTrellis(Integer pTrellis) {
		mTrellis = pTrellis;
	}

	public String getCmp() {
		return mCmp;
	}

	public void setCmp(String pCmp) {
		mCmp = pCmp;
	}

}