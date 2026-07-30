package com.momo.voaac;

/* JADX INFO: loaded from: classes8.dex */
public class VoAACEncoder {
    private static volatile boolean mIsLibLoaded = false;
    private Object object = new Object();
    private volatile boolean isRelease = false;

    public VoAACEncoder() {
        loadLibrariesOnce();
    }

    private native byte[] Enc(byte[] bArr);

    private native int Init(int i, int i2, short s, short s2);

    private native int Uninit();

    private static void loadLibrariesOnce() {
        synchronized (VoAACEncoder.class) {
            if (!mIsLibLoaded) {
                try {
                    try {
                        System.loadLibrary("VoAACEncoder");
                        mIsLibLoaded = true;
                    } catch (Error unused) {
                        mIsLibLoaded = false;
                    }
                } catch (Exception unused2) {
                    mIsLibLoaded = false;
                }
            }
        }
    }

    public byte[] EncData(byte[] bArr) {
        synchronized (this.object) {
            byte[] bArrEnc = null;
            try {
                if (this.isRelease) {
                    return null;
                }
                bArrEnc = Enc(bArr);
            } catch (Error | Exception unused) {
            }
            return bArrEnc;
        }
    }

    public void InitEncoder(int i, int i2, short s, short s2) {
        synchronized (this.object) {
            try {
                Init(i, i2, s, s2);
            } catch (Error | Exception unused) {
            }
        }
    }

    public void release() {
        synchronized (this.object) {
            try {
                this.isRelease = true;
                Uninit();
            } catch (Error | Exception unused) {
            }
        }
    }
}
