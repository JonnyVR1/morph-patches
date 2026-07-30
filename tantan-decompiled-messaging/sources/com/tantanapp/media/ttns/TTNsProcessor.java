package com.tantanapp.media.ttns;

/* JADX INFO: loaded from: classes13.dex */
public class TTNsProcessor {
    private static boolean sLoadSuccessful;
    private int mFs;
    private long mNsInstance;
    private final int ERROR = -1;
    private final int SUCCESS = 0;
    private int mNsMode = 1;

    static {
        try {
            System.loadLibrary("ttns");
            sLoadSuccessful = true;
        } catch (Throwable th) {
            th.printStackTrace();
            sLoadSuccessful = false;
        }
    }

    private TTNsProcessor(int i) {
        if (sLoadSuccessful) {
            this.mNsInstance = nativeNsCreate();
            this.mFs = i;
        }
    }

    private native long nativeNsCreate();

    private native void nativeNsFree(long j);

    private native int nativeNsInit(long j, int i);

    private native int nativeNsProcess(long j, short[] sArr, int i, short[] sArr2);

    private native int nativeNsSetConfig(long j, int i);

    public static TTNsProcessor newInstance(int i) {
        return new TTNsProcessor(i);
    }

    public void free() {
        if (sLoadSuccessful) {
            nativeNsFree(this.mNsInstance);
        }
    }

    public int init() {
        if (sLoadSuccessful && nativeNsInit(this.mNsInstance, this.mFs) == 0) {
            return nativeNsSetConfig(this.mNsInstance, this.mNsMode);
        }
        return -1;
    }

    public int process(short[] sArr, int i, short[] sArr2) {
        if (!sLoadSuccessful) {
            return -1;
        }
        nativeNsProcess(this.mNsInstance, sArr, i, sArr2);
        return 0;
    }

    public void setNsMode(int i) {
        this.mNsMode = i;
    }
}
