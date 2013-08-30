package com.ownits.gridvid.be;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
public class EncodingRequestParseTest {
	
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
		assertNotNull(oEncodingRequest.getOutput().isPublic());
		assertNotNull(oEncodingRequest.getTemplate());
		
		assertEquals("CUSTOMER_KEY", oEncodingRequest.getKey());
		assertEquals("CUSTOMER_SECRET", oEncodingRequest.getSecret());
		assertEquals("amazon_bucket_in", oEncodingRequest.getInput().getBucket());
		assertEquals("AMAZON_KEY", oEncodingRequest.getInput().getKey());
		assertEquals("input_video.avi", oEncodingRequest.getInput().getObject());
		assertEquals("AMAZON_SECRET", oEncodingRequest.getInput().getSecret());
		assertEquals("AMAZON_KEY", oEncodingRequest.getOutput().getKey());
		assertEquals("AMAZON_SECRET", oEncodingRequest.getOutput().getSecret());
		assertEquals("amazon_bucket_out", oEncodingRequest.getOutput().getBucket());
		assertEquals("output_video.m4v", oEncodingRequest.getOutput().getObject());
		assertEquals(Boolean.TRUE, oEncodingRequest.getOutput().isPublic());
		assertEquals("ipod_small_widescreen", oEncodingRequest.getTemplate());
		
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
		
		assertEquals("CUSTOMER_KEY", oEncodingRequest.getKey());
		assertEquals("CUSTOMER_SECRET", oEncodingRequest.getSecret());
		assertEquals("AMAZON_KEY", oEncodingRequest.getInput().getKey());
		assertEquals("AMAZON_SECRET", oEncodingRequest.getInput().getSecret());
		assertEquals("amazon_bucket_in", oEncodingRequest.getInput().getBucket());
		assertEquals("input_video.avi", oEncodingRequest.getInput().getObject());
		assertEquals("AMAZON_SECRET", oEncodingRequest.getOutput().getSecret());
		assertEquals("amazon_bucket_out", oEncodingRequest.getOutput().getBucket());
		assertEquals("output_video.m4v", oEncodingRequest.getOutput().getObject());
		assertEquals(AudioCodec.MP3, oEncodingRequest.getAudio().getCodec());
		assertEquals(VideoCodec.X264, oEncodingRequest.getVideo().getCodec());
		assertEquals("250k", oEncodingRequest.getVideo().getAdvanced().getB());
		assertEquals("mp4", oEncodingRequest.getVideo().getAdvanced().getF());
		assertEquals("4:3", oEncodingRequest.getVideo().getAdvanced().getAspect());
		assertEquals("scale=640:360", oEncodingRequest.getVideo().getAdvanced().getVF());
		assertEquals(new Integer(7), oEncodingRequest.getVideo().getAdvanced().getSubq());
		
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
		
		assertEquals("CUSTOMER KEY", oEncodingRequest.getKey());
		assertEquals("CUSTOMER SECRET", oEncodingRequest.getSecret());
		assertEquals("AMAZON KEY", oEncodingRequest.getInput().getKey());
		assertEquals("AMAZON SECRET", oEncodingRequest.getInput().getSecret());
		assertEquals("S3 INPUT BUCKET", oEncodingRequest.getInput().getBucket());
		assertEquals("input_video.avi", oEncodingRequest.getInput().getObject());
		assertEquals("AMAZON SECRET", oEncodingRequest.getOutput().getSecret());
		assertEquals("S3 OUTPUT BUCKET", oEncodingRequest.getOutput().getBucket());
		assertEquals("output_video.mp4", oEncodingRequest.getOutput().getObject());
		assertEquals(AudioCodec.AAC, oEncodingRequest.getAudio().getCodec());
		assertEquals(new Integer(2), oEncodingRequest.getAudio().getAdvanced().getAC());
		assertEquals("112k", oEncodingRequest.getAudio().getAdvanced().getAB());
		assertEquals(new Long(48000), oEncodingRequest.getAudio().getAdvanced().getAR());
		assertEquals(VideoCodec.X264, oEncodingRequest.getVideo().getCodec());
		assertEquals(new Integer(0), oEncodingRequest.getVideo().getAdvanced().getDeblockalpha());
		assertEquals("scale=640:480", oEncodingRequest.getVideo().getAdvanced().getVF());
		assertEquals(new Integer(7), oEncodingRequest.getVideo().getAdvanced().getSubq());
		assertEquals(new Integer(1), oEncodingRequest.getVideo().getAdvanced().getRefs());
		assertEquals(new Integer(2), oEncodingRequest.getVideo().getAdvanced().getWpredp());
		assertEquals(new Integer(10), oEncodingRequest.getVideo().getAdvanced().getQmin());
		assertEquals("4:3", oEncodingRequest.getVideo().getAdvanced().getAspect());
		assertEquals("umh", oEncodingRequest.getVideo().getAdvanced().getMeMethod());
		assertEquals(new Integer(0), oEncodingRequest.getVideo().getAdvanced().getDeblockbeta());
		assertEquals("4M", oEncodingRequest.getVideo().getAdvanced().getBufsize());
		assertEquals(new Integer(3), oEncodingRequest.getVideo().getAdvanced().getDirectpred());
		assertEquals(new Integer(1), oEncodingRequest.getVideo().getAdvanced().getCoder());
		assertEquals("+bpyramid+mixed_refs+wpred+dct8x8+fastpskip", oEncodingRequest.getVideo().getAdvanced().getFlags2());
		assertEquals(new Integer(16), oEncodingRequest.getVideo().getAdvanced().getMeRange());
		assertEquals("1500k", oEncodingRequest.getVideo().getAdvanced().getMaxrate());
		assertEquals("+parti4x4+parti8x8+partp8x8+partb8x8", oEncodingRequest.getVideo().getAdvanced().getPartitions());
		assertEquals(new Integer(3), oEncodingRequest.getVideo().getAdvanced().getBF());
		assertEquals(new Integer(25), oEncodingRequest.getVideo().getAdvanced().getKeyintMin());
		assertEquals("1250k", oEncodingRequest.getVideo().getAdvanced().getB());
		assertEquals(new Integer(4), oEncodingRequest.getVideo().getAdvanced().getQdiff());
		assertEquals(new Integer(250), oEncodingRequest.getVideo().getAdvanced().getG());
		assertEquals("mp4", oEncodingRequest.getVideo().getAdvanced().getF());
		assertEquals(new Integer(30), oEncodingRequest.getVideo().getAdvanced().getLevel());
		assertEquals(new Integer(50), oEncodingRequest.getVideo().getAdvanced().getRcLookahead());
		assertEquals(new Integer(51), oEncodingRequest.getVideo().getAdvanced().getQmax());
		assertEquals(new Integer(2), oEncodingRequest.getVideo().getAdvanced().getBStrategy());
		assertEquals(new Double(0.71), oEncodingRequest.getVideo().getAdvanced().getIQfactor());
		assertEquals(new Double(29.97), oEncodingRequest.getVideo().getAdvanced().getR());
		assertEquals("+loop", oEncodingRequest.getVideo().getAdvanced().getFlags());
		assertEquals(new Integer(40), oEncodingRequest.getVideo().getAdvanced().getScThreshold());
		assertEquals(new Integer(2), oEncodingRequest.getVideo().getAdvanced().getTrellis());
		assertEquals("+chroma", oEncodingRequest.getVideo().getAdvanced().getCmp());
		
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
		assertNotNull(oEncodingRequest.getThumbnail().getOutputName());
		assertNotNull(oEncodingRequest.getThumbnail().getNumber());
		assertNotNull(oEncodingRequest.getThumbnail().getSize());
		assertNotNull(oEncodingRequest.getThumbnail().getFormat());
		
		assertEquals("AMAZON S3 KEY", oEncodingRequest.getOutput().getKey());
		assertEquals("AMAZON S3 SECRET", oEncodingRequest.getOutput().getSecret());
		assertEquals("AmazonBucketName", oEncodingRequest.getOutput().getBucket());
		assertEquals("OutputDir/OutputFileName.mp4", oEncodingRequest.getOutput().getObject());
		assertEquals("file_output_name", oEncodingRequest.getThumbnail().getOutputName());
		assertEquals(new Integer(3), oEncodingRequest.getThumbnail().getNumber());
		assertEquals("640x480", oEncodingRequest.getThumbnail().getSize());
		assertEquals(ThumbnailFormat.PNG, oEncodingRequest.getThumbnail().getFormat());
		
		String oJson = mGson.toJson(oEncodingRequest);
		assertNotNull(oJson);
	}
	
}