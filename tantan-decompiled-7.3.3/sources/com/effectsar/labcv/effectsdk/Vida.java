package com.effectsar.labcv.effectsdk;

import android.content.Context;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Vida {
    private boolean mInited = false;
    private long mNativePtr;

    public static class VidaInitConfig {
        int backendType;
        String kernelBinPath;
        String modelPath;
        int numThread;
        int vidaType;

        public VidaInitConfig(String str, String str2, int i, int i2, int i3) {
            this.modelPath = str;
            this.kernelBinPath = str2;
            this.backendType = i;
            this.vidaType = i2;
            this.numThread = i3;
        }

        public int getBackendType() {
            return this.backendType;
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

        public int getVidaType() {
            return this.vidaType;
        }

        public void setBackendType(int i) {
            this.backendType = i;
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

        public void setVidaType(int i) {
            this.vidaType = i;
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

    private native int nativeCreate(VidaInitConfig vidaInitConfig);

    private native float nativeProcess(ByteBuffer byteBuffer, int i, int i2);

    private native int nativeRelease();

    public int destroy() {
        if (!this.mInited) {
            return -1;
        }
        nativeRelease();
        this.mInited = false;
        return 0;
    }

    public int init(Context context, VidaInitConfig vidaInitConfig, String str, boolean z) {
        int iNativeCreate = nativeCreate(vidaInitConfig);
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str, z);
        if (iNativeCheckLicense != 0) {
            return iNativeCheckLicense;
        }
        this.mInited = true;
        return 0;
    }

    public float process(ByteBuffer byteBuffer, int i, int i2) {
        if (this.mInited) {
            return nativeProcess(byteBuffer, i, i2);
        }
        return -1.0f;
    }
}
