package com.ownits.gridvid.be;

import java.util.Properties;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ownits.gridvid.be.EncodingRequest;

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
public class ParseTest {
	
	private static final String SAMPLE_REQUESTS_PROPERTIES = "sample-requests.properties";
	
	private Properties mSampleRequests;
	private Gson mGson;
	
	@Before
	public void setup() throws Exception {
		mSampleRequests = new Properties();
		mSampleRequests.load(this.getClass().getResourceAsStream(SAMPLE_REQUESTS_PROPERTIES));
		mGson = new GsonBuilder().create();
	}

	@Test
	public void shouldParseTest_1() throws Exception {
		EncodingRequest oEncodingRequest = mGson.fromJson(mSampleRequests.get("1").toString(), EncodingRequest.class);
		
		assertNotNull(oEncodingRequest);
		assertNotNull(oEncodingRequest.getKey());
		assertNotNull(oEncodingRequest.getSecret());
		assertNotNull(oEncodingRequest.getInput());
		assertNotNull(oEncodingRequest.getInput().getKey());
		assertNotNull(oEncodingRequest.getInput().getSecret());
		assertNotNull(oEncodingRequest.getInput().getBucket());
		assertNotNull(oEncodingRequest.getInput().getObject());
		assertNotNull(oEncodingRequest.getOutput());
		assertNotNull(oEncodingRequest.getOutput().getSecret());
		assertNotNull(oEncodingRequest.getOutput().getBucket());
		assertNotNull(oEncodingRequest.getOutput().getObject());
		assertNotNull(oEncodingRequest.getTemplate());
		
		String oJson = mGson.toJson(oEncodingRequest);
		assertNotNull(oJson);
	}
	
	@Test
	public void shouldParseTest_2() throws Exception {
		EncodingRequest oEncodingRequest = mGson.fromJson(mSampleRequests.get("2").toString(), EncodingRequest.class);
		
		assertNotNull(oEncodingRequest);
		assertNotNull(oEncodingRequest.getKey());
		assertNotNull(oEncodingRequest.getSecret());
		assertNotNull(oEncodingRequest.getInput());
		assertNotNull(oEncodingRequest.getInput().getKey());
		assertNotNull(oEncodingRequest.getInput().getSecret());
		assertNotNull(oEncodingRequest.getInput().getBucket());
		assertNotNull(oEncodingRequest.getInput().getObject());
		assertNotNull(oEncodingRequest.getOutput());
		assertNotNull(oEncodingRequest.getOutput().getSecret());
		assertNotNull(oEncodingRequest.getOutput().getBucket());
		assertNotNull(oEncodingRequest.getOutput().getObject());
		assertNotNull(oEncodingRequest.getAudio());
		assertNotNull(oEncodingRequest.getAudio().getCodec());
		assertNotNull(oEncodingRequest.getVideo());
		assertNotNull(oEncodingRequest.getVideo().getCodec());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getB());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getF());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getAspect());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getVF());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getSubq());
		
		String oJson = mGson.toJson(oEncodingRequest);
		assertNotNull(oJson);
	}
	
	@Test
	public void shouldParseTest_3() throws Exception {
		EncodingRequest oEncodingRequest = mGson.fromJson(mSampleRequests.get("3").toString(), EncodingRequest.class);
		
		assertNotNull(oEncodingRequest);
		assertNotNull(oEncodingRequest.getKey());
		assertNotNull(oEncodingRequest.getSecret());
		assertNotNull(oEncodingRequest.getInput());
		assertNotNull(oEncodingRequest.getInput().getKey());
		assertNotNull(oEncodingRequest.getInput().getSecret());
		assertNotNull(oEncodingRequest.getInput().getBucket());
		assertNotNull(oEncodingRequest.getInput().getObject());
		assertNotNull(oEncodingRequest.getOutput());
		assertNotNull(oEncodingRequest.getOutput().getSecret());
		assertNotNull(oEncodingRequest.getOutput().getBucket());
		assertNotNull(oEncodingRequest.getOutput().getObject());
		assertNotNull(oEncodingRequest.getAudio());
		assertNotNull(oEncodingRequest.getAudio().getCodec());
		assertNotNull(oEncodingRequest.getAudio().getAdvanced());
		assertNotNull(oEncodingRequest.getAudio().getAdvanced().getAC());
		assertNotNull(oEncodingRequest.getAudio().getAdvanced().getAB());
		assertNotNull(oEncodingRequest.getAudio().getAdvanced().getAR());
		assertNotNull(oEncodingRequest.getVideo());
		assertNotNull(oEncodingRequest.getVideo().getCodec());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getDeblockalpha());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getVF());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getSubq());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getRefs());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getWpredp());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getQmin());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getAspect());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getMeMethod());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getDeblockbeta());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getBufsize());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getDirectpred());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getCoder());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getFlags2());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getMeRange());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getMaxrate());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getPartitions());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getBF());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getKeyintMin());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getB());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getQdiff());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getG());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getF());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getLevel());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getRcLookahead());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getQmax());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getBStrategy());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getIQfactor());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getR());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getFlags());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getScThreshold());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getTrellis());
		assertNotNull(oEncodingRequest.getVideo().getAdvanced().getCmp());
		
		String oJson = mGson.toJson(oEncodingRequest);
		assertNotNull(oJson);
	}
	
	@Test
	public void shouldParseTest_4() throws Exception {
		EncodingRequest oEncodingRequest = mGson.fromJson(mSampleRequests.get("4").toString(), EncodingRequest.class);
		
		assertNotNull(oEncodingRequest);
		assertNotNull(oEncodingRequest.getOutput());
		assertNotNull(oEncodingRequest.getOutput().getKey());
		assertNotNull(oEncodingRequest.getOutput().getSecret());
		assertNotNull(oEncodingRequest.getOutput().getBucket());
		assertNotNull(oEncodingRequest.getOutput().getObject());
		assertNotNull(oEncodingRequest.getThumbnail());
		assertNotNull(oEncodingRequest.getThumbnail().getNumber());
		assertNotNull(oEncodingRequest.getThumbnail().getSize());
		assertNotNull(oEncodingRequest.getThumbnail().getFormat());
		
		String oJson = mGson.toJson(oEncodingRequest);
		assertNotNull(oJson);
	}
	
}
