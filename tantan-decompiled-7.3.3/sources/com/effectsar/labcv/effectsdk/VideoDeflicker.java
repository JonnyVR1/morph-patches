package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class VideoDeflicker {
    private long mNativePtr;
    private boolean mInited = false;
    private boolean mFirstFrame = true;

    public static class VideoDeflickerInitConfig {
        int algType;
        int backendType;
        String binPath;
        boolean isExtOESTexture;
        int maxHeight;
        int maxWidth;
        int pixelFmt;
        int powerLevel;

        public VideoDeflickerInitConfig(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
            this.binPath = str;
            this.isExtOESTexture = z;
            this.maxHeight = i;
            this.maxWidth = i2;
            this.pixelFmt = i3;
            this.powerLevel = i4;
            this.backendType = i5;
            this.algType = i6;
        }
    }

    public static class VideoDeflickerProcessParam {
        float blendRate;
        int height;
        int inputTextureId;
        boolean isFirst;
        float kernelSize;
        boolean open;
        float[] stMatrix;
        int strideH;
        int strideW;
        int width;

        public VideoDeflickerProcessParam(int i, int i2, int i3, int i4, boolean z, int i5, float f, float f2) {
            this.width = i;
            this.height = i2;
            this.strideW = i3;
            this.strideH = i4;
            this.open = z;
            this.inputTextureId = i5;
            this.blendRate = f;
            this.kernelSize = f2;
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(String str, boolean z);

    private native int nativeCreate(VideoDeflickerInitConfig videoDeflickerInitConfig);

    private native int nativeDestory();

    private native int nativeProcessTexture(VideoDeflickerProcessParam videoDeflickerProcessParam, BefTextureResultInfo befTextureResultInfo);

    public int create(VideoDeflickerInitConfig videoDeflickerInitConfig, String str, boolean z) {
        int iNativeCreate = nativeCreate(videoDeflickerInitConfig);
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(str, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        this.mInited = true;
        return 0;
    }

    public int destroy() {
        if (!this.mInited) {
            return -1;
        }
        nativeDestory();
        this.mInited = false;
        return 0;
    }

    public int processTexture(VideoDeflickerProcessParam videoDeflickerProcessParam, BefTextureResultInfo befTextureResultInfo) {
        if (!this.mInited) {
            return -1;
        }
        videoDeflickerProcessParam.isFirst = this.mFirstFrame;
        int iNativeProcessTexture = nativeProcessTexture(videoDeflickerProcessParam, befTextureResultInfo);
        this.mFirstFrame = false;
        return iNativeProcessTexture;
    }
}
