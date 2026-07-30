package com.tencent.liteav.videoencoder;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TXSVideoEncoderParam {
    public int width = 0;
    public int height = 0;
    public int fps = 20;
    public int gop = 3;
    public int encoderProfile = 1;
    public int encoderMode = 1;
    public boolean enableBFrame = false;
    public Object glContext = null;
    public boolean realTime = false;
    public boolean annexb = false;
    public boolean appendSpsPps = true;
    public boolean fullIFrame = false;
    public boolean syncOutput = false;
    public boolean enableEGL14 = false;
    public boolean enableBlackList = true;
    public boolean record = false;
    public long baseFrameIndex = 0;
    public long baseGopIndex = 0;
    public int streamType = 0;
    public boolean bMultiRef = false;
    public int bitrate = 0;
    public boolean bLimitFps = false;
    public int encodeType = 0;
    public boolean forceSetBitrateMode = false;
    public JSONArray encFmt = null;
}
