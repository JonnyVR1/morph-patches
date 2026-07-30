package com.momo.x264;

import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class x264sdk {
    private static volatile boolean mIsLibLoaded = false;
    private listener _listener;
    private ByteBuffer mVideobuffer;
    private volatile boolean isRelease = false;
    private Object object = new Object();
    private long mNativeContext = 0;

    public interface listener {
        void h264data(byte[] bArr, int i);
    }

    public x264sdk(listener listenerVar) {
        loadLibrariesOnce();
        this._listener = listenerVar;
    }

    private native void CloseX264Encode();

    private native byte[] GenX264Sei(byte[] bArr);

    private void H264DataCallBackFunc(Object obj, byte[] bArr, int i) {
        x264sdk x264sdkVar;
        if (obj == null || (x264sdkVar = (x264sdk) ((WeakReference) obj).get()) == null) {
            return;
        }
        x264sdkVar._listener.h264data(bArr, i);
    }

    private native int encoderH264(int i, long j);

    private native void initX264Encode(int i, int i2, int i3, int i4, Object obj);

    private static void loadLibrariesOnce() {
        synchronized (x264sdk.class) {
            try {
                if (!mIsLibLoaded) {
                    try {
                        try {
                            System.loadLibrary("x264encoder");
                            mIsLibLoaded = true;
                        } catch (Error unused) {
                            mIsLibLoaded = false;
                        }
                    } catch (Exception unused2) {
                        mIsLibLoaded = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] GenSEI(byte[] bArr, int i) {
        synchronized (this.object) {
            try {
                if (!mIsLibLoaded) {
                    return null;
                }
                return GenX264Sei(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void PushOriStream(byte[] bArr, int i, long j) {
        synchronized (this.object) {
            try {
                if (this.isRelease) {
                    return;
                }
                ByteBuffer byteBuffer = this.mVideobuffer;
                if (byteBuffer == null || byteBuffer.capacity() < i) {
                    this.mVideobuffer = ByteBuffer.allocateDirect(((i / 1024) + 1) * 1024);
                }
                this.mVideobuffer.rewind();
                this.mVideobuffer.put(bArr, 0, i);
                encoderH264(i, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean getEnabled() {
        return mIsLibLoaded;
    }

    public void initEncode(int i, int i2, int i3, int i4) {
        synchronized (this.object) {
            try {
                initX264Encode(i, i2, i3, i4, new WeakReference(this));
            } catch (Error | Exception unused) {
            }
        }
    }

    public void release() {
        synchronized (this.object) {
            try {
                this.isRelease = true;
                CloseX264Encode();
            } catch (Error | Exception unused) {
            }
        }
    }
}
