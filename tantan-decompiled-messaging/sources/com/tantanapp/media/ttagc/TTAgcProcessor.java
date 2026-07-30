package com.tantanapp.media.ttagc;

/* JADX INFO: loaded from: classes13.dex */
public class TTAgcProcessor {
    private static final int ERROR = -1;
    private static boolean sLoadSuccessful;
    private long mAgcInstance;
    private int mFs;
    private int mVirtualMicOutLevel = 0;
    private int mMinLevel = 0;
    private int mMaxLevel = 255;
    private int mAgcMode = 3;
    boolean mLimiterEnable = true;
    private short mTargetLevelDbfs = 3;
    private short mCompressionGaindB = 15;
    private int mNumBand = 1;

    static {
        try {
            System.loadLibrary("ttagc");
            sLoadSuccessful = true;
        } catch (Throwable th) {
            th.printStackTrace();
            sLoadSuccessful = false;
        }
    }

    private TTAgcProcessor(int i) {
        if (sLoadSuccessful) {
            this.mAgcInstance = nativeAgcCreate();
            this.mFs = i;
        }
    }

    private native long nativeAgcCreate();

    private native void nativeAgcFree(long j);

    private native int nativeAgcInit(long j, int i, int i2, int i3, int i4);

    private native int nativeAgcProcess(long j, short[] sArr, int i, int i2, short[] sArr2, int i3, int i4, int i5, boolean z);

    private native int nativeAgcSetConfig(long j, short s, short s2, boolean z);

    private native int nativeVirtualMic(long j, short[] sArr, int i, int i2, int i3, int i4);

    public static TTAgcProcessor newInstance(int i) {
        return new TTAgcProcessor(i);
    }

    private void setVirtualMicOutLevel(int i) {
        this.mVirtualMicOutLevel = i;
    }

    public void free() {
        if (sLoadSuccessful) {
            nativeAgcFree(this.mAgcInstance);
            this.mAgcInstance = 0L;
        }
    }

    public int getVirtualMicOutLevel() {
        return this.mVirtualMicOutLevel;
    }

    public int init() {
        if (!sLoadSuccessful) {
            return -1;
        }
        nativeAgcInit(this.mAgcInstance, this.mMinLevel, this.mMaxLevel, this.mAgcMode, this.mFs);
        return nativeAgcSetConfig(this.mAgcInstance, this.mTargetLevelDbfs, this.mCompressionGaindB, this.mLimiterEnable);
    }

    public int process(short[] sArr, int i, short[] sArr2, int i2) {
        if (sLoadSuccessful) {
            return nativeAgcProcess(this.mAgcInstance, sArr, this.mNumBand, i, sArr2, getVirtualMicOutLevel(), 0, i2, false);
        }
        return -1;
    }

    public void setAgcMode(int i) {
        this.mAgcMode = i;
    }

    public void setCompressionGaindB(short s) {
        this.mCompressionGaindB = s;
    }

    public void setLimiterEnable(boolean z) {
        this.mLimiterEnable = z;
    }

    public void setMaxLevel(int i) {
        this.mMaxLevel = i;
    }

    public void setMinLevel(int i) {
        this.mMinLevel = i;
    }

    public void setNumBands(int i) {
        this.mNumBand = i;
    }

    public void setTargetLevelDbfs(short s) {
        this.mTargetLevelDbfs = s;
    }

    public int virtualMic(short[] sArr, int i) {
        if (sLoadSuccessful) {
            return nativeVirtualMic(this.mAgcInstance, sArr, this.mNumBand, i, 0, 0);
        }
        return -1;
    }
}
