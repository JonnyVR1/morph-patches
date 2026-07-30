package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class TaintSceneDetect {
    private long mNativePtr;
    private boolean mInited = false;
    private boolean mFirstFrame = true;

    public static class TaintDetectParam {
        int backendType;
        int detectFrequency;
        String kernelBinPath;
        String modelPath;
        int numThread;

        public TaintDetectParam(int i, String str, String str2, int i2, int i3) {
            this.detectFrequency = i;
            this.modelPath = str;
            this.kernelBinPath = str2;
            this.backendType = i2;
            this.numThread = i3;
        }

        public int getBackendType() {
            return this.backendType;
        }

        public int getDetectFrequency() {
            return this.detectFrequency;
        }

        public String getKernelBinPath() {
            return this.kernelBinPath;
        }

        public String getModelPath() {
            return this.modelPath;
        }

        public int getNumThread() {
            return this.numThread;
        }

        public void setBackendType(int i) {
            this.backendType = i;
        }

        public void setDetectFrequency(int i) {
            this.detectFrequency = i;
        }

        public void setKernelBinPath(String str) {
            this.kernelBinPath = str;
        }

        public void setModelPath(String str) {
            this.modelPath = str;
        }

        public void setNumThread(int i) {
            this.numThread = i;
        }
    }

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreate(TaintDetectParam taintDetectParam);

    private native float nativeProcess(ByteBuffer byteBuffer, boolean z);

    private native int nativeRelease();

    public int init(Context context, TaintDetectParam taintDetectParam, String str, boolean z) {
        int iNativeCreate = nativeCreate(taintDetectParam);
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str, z);
        if (iNativeCheckLicense != 0) {
            nativeRelease();
            return iNativeCheckLicense;
        }
        this.mInited = true;
        return 0;
    }

    public float process(ByteBuffer byteBuffer) {
        if (!this.mInited) {
            return -1.0f;
        }
        if (!byteBuffer.isDirect()) {
            Log.e(EffectsSDKEffectConstants.TAG, "input buffer must be allocated by allocateDirect");
            return -1.0f;
        }
        float fNativeProcess = nativeProcess(byteBuffer, this.mFirstFrame);
        this.mFirstFrame = false;
        return fNativeProcess;
    }

    public int release() {
        if (!this.mInited) {
            return -1;
        }
        nativeRelease();
        this.mInited = false;
        return 0;
    }
}
