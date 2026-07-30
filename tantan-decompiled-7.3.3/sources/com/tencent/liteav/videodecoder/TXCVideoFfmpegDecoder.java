package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TXCVideoFfmpegDecoder implements InterfaceC14481b {
    private boolean mFirstDec;
    private InterfaceC14485f mListener;
    private long mNativeDecoder;
    private long mNativeNotify;
    private ByteBuffer mPps;
    private byte[] mRawData;
    private ByteBuffer mSps;
    private int mVideoHeight;
    private int mVideoWidth;

    static {
        C14215f.m84239f();
        nativeClassInit();
    }

    private static native void nativeClassInit();

    private native boolean nativeDecode(byte[] bArr, long j, long j2, long j3);

    private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> weakReference, boolean z);

    private native void nativeLoadRawData(byte[] bArr, long j, int i);

    private native void nativeRelease();

    private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> weakReference, long j, int i, int i2, long j2, long j3, int i3) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int GetDecodeCost() {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int config(Surface surface) {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void decode(TXSNALPacket tXSNALPacket) {
        if (this.mFirstDec) {
            ByteBuffer byteBuffer = this.mSps;
            if (byteBuffer != null && this.mPps != null) {
                byte[] bArrArray = byteBuffer.array();
                byte[] bArrArray2 = this.mPps.array();
                byte[] bArr = new byte[bArrArray.length + bArrArray2.length];
                System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
                System.arraycopy(bArrArray2, 0, bArr, bArrArray.length, bArrArray2.length);
                nativeDecode(bArr, tXSNALPacket.pts - 1, tXSNALPacket.dts - 1, tXSNALPacket.rotation);
            }
            this.mFirstDec = false;
        }
        nativeDecode(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void enableLimitDecCache(boolean z) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public boolean isHevc() {
        return false;
    }

    public void loadNativeData(byte[] bArr, long j, int i) {
        nativeLoadRawData(bArr, j, i);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void setListener(InterfaceC14485f interfaceC14485f) {
        this.mListener = interfaceC14485f;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void setNotifyListener(WeakReference<InterfaceC14170b> weakReference) {
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2) {
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mFirstDec = true;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        nativeInit(new WeakReference<>(this), z);
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14481b
    public void stop() {
        nativeRelease();
    }

    public void config(JSONArray jSONArray) {
    }
}
