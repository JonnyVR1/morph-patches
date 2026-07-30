package com.effectsar.labcv.effectsdk;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class VideoLiteHdr {
    private FrameInfo mFrameInfo;
    private boolean mInited;
    private long mNativePtr;
    private Param mParam;

    public static class FrameInfo {
        float contrast;
        float enhanceStrength;
        float faceLuminanceFactor;
        int faceLuminanceTarget;
        boolean isAFS;
        boolean isDay;
        boolean isFirstFrame;
        boolean isProtectFace;
        float luminanceFactor;
        int luminanceTarget;
        float saturation;
        float sharpenStrength;
    }

    public static class HdrConfig {
        int algType;
        String binPath;
        String imgLutPath;
        boolean isCover;
        int maxHeight;
        int maxWidth;
        int perNum;
        int powerLevel;
        String skinLutPath;
    }

    public static class Param {
        int height;
        FrameInfo info;
        boolean open;
        int textureId;
        int width;
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCreate(String str, boolean z, HdrConfig hdrConfig);

    private native int nativeProcess(Param param, BefVideoSRInfo befVideoSRInfo);

    private native int nativeRelease();

    public int init(String str, String str2, int i, int i2, EffectsSDKEffectConstants.ImageQulityPowerLevel imageQulityPowerLevel, String str3, boolean z) {
        HdrConfig hdrConfig = new HdrConfig();
        this.mParam = new Param();
        this.mFrameInfo = new FrameInfo();
        hdrConfig.binPath = str2;
        hdrConfig.maxHeight = i;
        hdrConfig.maxWidth = i2;
        hdrConfig.powerLevel = imageQulityPowerLevel.getLevel();
        hdrConfig.imgLutPath = str3;
        hdrConfig.skinLutPath = null;
        hdrConfig.perNum = 6;
        hdrConfig.isCover = false;
        hdrConfig.powerLevel = EffectsSDKEffectConstants.ImageQulityPowerLevel.POWER_LEVEL_AUTO.getLevel();
        hdrConfig.algType = EffectsSDKEffectConstants.ImageQulityVideoLiteHdrType.HDR_TYPE_LITE_V8.getLevel();
        int iNativeCreate = nativeCreate(str, z, hdrConfig);
        this.mInited = iNativeCreate == 0;
        return iNativeCreate;
    }

    public boolean isInited() {
        return this.mInited;
    }

    public BefVideoSRInfo process(int i, int i2, int i3, boolean z, float f) {
        if (!this.mInited) {
            return null;
        }
        BefVideoSRInfo befVideoSRInfo = new BefVideoSRInfo();
        FrameInfo frameInfo = this.mFrameInfo;
        frameInfo.isFirstFrame = z;
        frameInfo.isDay = true;
        frameInfo.isProtectFace = true;
        frameInfo.isAFS = true;
        frameInfo.isProtectFace = false;
        frameInfo.faceLuminanceTarget = -1;
        frameInfo.faceLuminanceFactor = -1.0f;
        frameInfo.luminanceTarget = -1;
        frameInfo.luminanceFactor = -1.0f;
        frameInfo.contrast = -1.0f;
        frameInfo.saturation = -1.0f;
        frameInfo.sharpenStrength = -1.0f;
        frameInfo.enhanceStrength = f;
        Param param = this.mParam;
        param.height = i3;
        param.width = i2;
        param.open = true;
        param.textureId = i;
        param.info = frameInfo;
        int iNativeProcess = nativeProcess(param, befVideoSRInfo);
        if (iNativeProcess == 0) {
            return befVideoSRInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativevideo lite hdr Process " + iNativeProcess);
        return null;
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }
}
