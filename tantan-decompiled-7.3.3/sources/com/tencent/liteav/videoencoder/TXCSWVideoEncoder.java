package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.beauty.p098b.C14251p;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXCSWVideoEncoder extends C14489c {
    private static final boolean DEBUG = false;
    private static final String TAG = "TXCSWVideoEncoder";
    private C14178h mRawFrameFilter;
    private C14178h mResizeFilter;
    private long mNativeEncoder = 0;
    private int mBitrate = 0;
    private long mPTS = 0;
    private int mPushIdx = 0;
    private int mRendIdx = 0;
    private int mPopIdx = 0;

    static {
        C14215f.m84239f();
        nativeClassInit();
    }

    public static long getAndIncreaseGopIndex() {
        return nativeGetAndIncreaseGopIndex();
    }

    public static long getAndIncreateSeq() {
        return nativeGetAndIncreaseSeq();
    }

    private static native void nativeClassInit();

    private native void nativeEnableNearestRPS(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncode(long j, int i, int i2, int i3, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncodeSync(long j, int i, int i2, int i3, long j2);

    private static native long nativeGetAndIncreaseGopIndex();

    private static native long nativeGetAndIncreaseSeq();

    private native long nativeGetRealFPS(long j);

    private native long nativeInit(WeakReference<TXCSWVideoEncoder> weakReference);

    private native void nativeRelease(long j);

    private native void nativeRestartIDR(long j);

    private native void nativeSetBitrate(long j, int i);

    private native void nativeSetBitrateFromQos(long j, int i, int i2);

    private native void nativeSetEncodeIdrFpsFromQos(long j, int i);

    private native void nativeSetFPS(long j, int i);

    private native void nativeSetID(long j, String str);

    private native void nativeSetRPSRefBitmap(long j, int i, int i2, long j2);

    private native void nativeSignalEOSAndFlush(long j);

    private native int nativeStart(long j, TXSVideoEncoderParam tXSVideoEncoderParam);

    private native void nativeStop(long j);

    private native long nativegetRealBitrate(long j);

    private static void onEncodeFinishedFromNative(WeakReference<TXCSWVideoEncoder> weakReference, int i, long j, long j2) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.onEncodeFinished(i, j, j2);
        }
    }

    private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> weakReference, byte[] bArr, int i, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.callDelegate(bArr, i, j, j2, j3, j4, j5, j6, i2, null, null);
        }
    }

    private long pushVideoFrameInternal(int i, int i2, int i3, long j, final boolean z) {
        C14178h c14178h = this.mResizeFilter;
        C14178h c14251p = this.mRawFrameFilter;
        if (this.mGLContextExternal == null) {
            return 0L;
        }
        this.mInputWidth = i2;
        this.mInputHeight = i3;
        if (c14178h == null) {
            c14178h = new C14178h();
            this.mResizeFilter = c14178h;
            c14178h.mo83979a();
            c14178h.m83976a(true);
        }
        C14178h c14178h2 = c14178h;
        c14178h2.mo83969a(this.mOutputWidth, this.mOutputHeight);
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        int i4 = (720 - this.mRotation) % 360;
        c14178h2.m83970a(i2, i3, i4, null, ((i4 == 90 || i4 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i4 == 90 || i4 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, false);
        c14178h2.mo83981b(i);
        final int iM83997l = c14178h2.m83997l();
        int[] iArr = new int[1];
        this.mPTS = j;
        if (c14251p == null) {
            String str = TAG;
            TXCLog.m84152i(str, "pushVideoFrameInternal->create mRawFrameFilter");
            c14251p = new C14251p(1);
            this.mRawFrameFilter = c14251p;
            c14251p.m83976a(true);
            if (!c14251p.mo83979a()) {
                TXCLog.m84152i(str, "pushVideoFrameInternal->destroy mRawFrameFilter, init failed!");
                this.mRawFrameFilter = null;
                return 10000004L;
            }
            c14251p.mo83969a(this.mOutputWidth, this.mOutputHeight);
            c14251p.m83974a(new C14178h.a() { // from class: com.tencent.liteav.videoencoder.TXCSWVideoEncoder.1
                @Override // com.tencent.liteav.basic.p093c.C14178h.a
                /* JADX INFO: renamed from: a */
                public void mo83825a(int i5) {
                    synchronized (TXCSWVideoEncoder.this) {
                        try {
                            TXCSWVideoEncoder tXCSWVideoEncoder = TXCSWVideoEncoder.this;
                            InterfaceC14490d interfaceC14490d = tXCSWVideoEncoder.mListener;
                            if (interfaceC14490d != null) {
                                interfaceC14490d.mo83842l(tXCSWVideoEncoder.mStreamType);
                            }
                            boolean z2 = z;
                            TXCSWVideoEncoder tXCSWVideoEncoder2 = TXCSWVideoEncoder.this;
                            if (z2) {
                                long j2 = tXCSWVideoEncoder2.mNativeEncoder;
                                int i6 = iM83997l;
                                TXCSWVideoEncoder tXCSWVideoEncoder3 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder2.nativeEncodeSync(j2, i6, tXCSWVideoEncoder3.mOutputWidth, tXCSWVideoEncoder3.mOutputHeight, tXCSWVideoEncoder3.mPTS);
                            } else {
                                long j3 = tXCSWVideoEncoder2.mNativeEncoder;
                                int i7 = iM83997l;
                                TXCSWVideoEncoder tXCSWVideoEncoder4 = TXCSWVideoEncoder.this;
                                tXCSWVideoEncoder2.nativeEncode(j3, i7, tXCSWVideoEncoder4.mOutputWidth, tXCSWVideoEncoder4.mOutputHeight, tXCSWVideoEncoder4.mPTS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        c14251p.mo83981b(iM83997l);
        int i5 = iArr[0];
        if (i5 == 0) {
            return 0L;
        }
        callDelegate(i5);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void enableNearestRPS(int i) {
        synchronized (this) {
            nativeEnableNearestRPS(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long getRealBitrate() {
        long jNativegetRealBitrate;
        synchronized (this) {
            jNativegetRealBitrate = nativegetRealBitrate(this.mNativeEncoder);
        }
        return jNativegetRealBitrate;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public double getRealFPS() {
        double dNativeGetRealFPS;
        synchronized (this) {
            dNativeGetRealFPS = nativeGetRealFPS(this.mNativeEncoder);
        }
        return dNativeGetRealFPS;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrame(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, false);
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrameAsync(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, true);
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, true);
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void restartIDR() {
        synchronized (this) {
            nativeRestartIDR(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setBitrate(int i) {
        this.mBitrate = i;
        synchronized (this) {
            nativeSetBitrate(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setBitrateFromQos(int i, int i2) {
        this.mBitrate = i;
        synchronized (this) {
            nativeSetBitrateFromQos(this.mNativeEncoder, i, i2);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setEncodeIdrFpsFromQos(int i) {
        synchronized (this) {
            nativeSetEncodeIdrFpsFromQos(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setFPS(int i) {
        synchronized (this) {
            nativeSetFPS(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        synchronized (this) {
            nativeSetID(this.mNativeEncoder, str);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setRPSRefBitmap(int i, int i2, long j) throws Throwable {
        synchronized (this) {
            try {
                try {
                    nativeSetRPSRefBitmap(this.mNativeEncoder, i, i2, j);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void signalEOSAndFlush() {
        synchronized (this) {
            nativeSignalEOSAndFlush(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        int i = tXSVideoEncoderParam.width;
        int i2 = ((i + 7) / 8) * 8;
        int i3 = tXSVideoEncoderParam.height;
        int i4 = ((i3 + 1) / 2) * 2;
        if (i2 != i || i4 != i3) {
            String str = TAG;
            TXCLog.m84156w(str, "Encode Resolution not supportted, transforming...");
            TXCLog.m84156w(str, tXSVideoEncoderParam.width + BaseSei.f14624X + tXSVideoEncoderParam.height + "-> " + i2 + BaseSei.f14624X + i4);
        }
        tXSVideoEncoderParam.width = i2;
        tXSVideoEncoderParam.height = i4;
        this.mOutputWidth = i2;
        this.mOutputHeight = i4;
        this.mInputWidth = i2;
        this.mInputHeight = i4;
        this.mRawFrameFilter = null;
        this.mResizeFilter = null;
        synchronized (this) {
            long jNativeInit = nativeInit(new WeakReference<>(this));
            this.mNativeEncoder = jNativeInit;
            nativeSetBitrate(jNativeInit, this.mBitrate);
            nativeSetID(this.mNativeEncoder, getID());
            nativeStart(this.mNativeEncoder, tXSVideoEncoderParam);
        }
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void stop() {
        long j;
        TXCLog.m84152i(TAG, "stop->enter with mRawFrameFilter:" + this.mRawFrameFilter);
        this.mGLContextExternal = null;
        synchronized (this) {
            j = this.mNativeEncoder;
            this.mNativeEncoder = 0L;
        }
        nativeStop(j);
        nativeRelease(j);
        C14178h c14178h = this.mRawFrameFilter;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.mRawFrameFilter = null;
        }
        C14178h c14178h2 = this.mResizeFilter;
        if (c14178h2 != null) {
            c14178h2.mo83989d();
            this.mResizeFilter = null;
        }
        super.stop();
    }
}
