package com.tencent.liteav.videoencoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14326c extends C14040a {
    protected C14015h mEncodeFilter;
    protected boolean mInit;
    protected C14015h mInputFilter;
    protected InterfaceC14327d mListener = null;
    protected int mInputWidth = 0;
    protected int mInputHeight = 0;
    protected int mOutputWidth = 0;
    protected int mOutputHeight = 0;
    protected int mInputTextureID = -1;
    protected Object mGLContextExternal = null;
    private long mVideoGOPEncode = 0;
    private boolean mEncodeFirstGOP = false;
    protected int mStreamType = 2;
    protected int mRotation = 0;
    protected JSONArray mEncFmt = null;
    protected boolean mEnableXMirror = false;

    public void callDelegate(byte[] bArr, int i, long j, long j2, long j3, long j4, long j5, long j6, int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer == null ? null : byteBuffer.asReadOnlyBuffer();
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo != null ? new MediaCodec.BufferInfo() : null;
        if (bufferInfo2 != null) {
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        }
        InterfaceC14327d interfaceC14327d = this.mListener;
        if (interfaceC14327d != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i;
            tXSNALPacket.gopIndex = j;
            tXSNALPacket.gopFrameIndex = j2;
            tXSNALPacket.frameIndex = j3;
            tXSNALPacket.refFremeIndex = j4;
            tXSNALPacket.pts = j5;
            tXSNALPacket.dts = j6;
            tXSNALPacket.buffer = byteBufferAsReadOnlyBuffer;
            tXSNALPacket.streamType = this.mStreamType;
            if (bufferInfo2 != null) {
                tXSNALPacket.info = bufferInfo2;
            }
            interfaceC14327d.mo82656a(tXSNALPacket, i2);
            long j7 = this.mVideoGOPEncode;
            if (i == 0) {
                if (j7 != 0) {
                    this.mEncodeFirstGOP = true;
                    setStatusValue(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, Long.valueOf(j7));
                }
                this.mVideoGOPEncode = 1L;
                return;
            }
            long j8 = j7 + 1;
            this.mVideoGOPEncode = j8;
            if (this.mEncodeFirstGOP) {
                return;
            }
            setStatusValue(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, Long.valueOf(j8));
        }
    }

    public void enableNearestRPS(int i) {
    }

    public int getEncodeCost() {
        return 0;
    }

    public long getRealBitrate() {
        return 0L;
    }

    public double getRealFPS() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public int getVideoHeight() {
        return this.mOutputHeight;
    }

    public int getVideoWidth() {
        return this.mOutputWidth;
    }

    public void onEncodeFinished(int i, long j, long j2) {
        InterfaceC14327d interfaceC14327d = this.mListener;
        if (interfaceC14327d != null) {
            interfaceC14327d.mo82652a(i, j, j2);
        }
    }

    public long pushVideoFrame(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public long pushVideoFrameAsync(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public void restartIDR() {
    }

    public void setBitrate(int i) {
    }

    public void setBitrateFromQos(int i, int i2) {
    }

    public void setEncodeIdrFpsFromQos(int i) {
    }

    public void setFPS(int i) {
    }

    public void setListener(InterfaceC14327d interfaceC14327d) {
        this.mListener = interfaceC14327d;
    }

    public void setRPSRefBitmap(int i, int i2, long j) {
    }

    public void setRotation(int i) {
        this.mRotation = i;
    }

    public void setXMirror(boolean z) {
        this.mEnableXMirror = z;
    }

    public void signalEOSAndFlush() {
    }

    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        if (tXSVideoEncoderParam != null) {
            int i = tXSVideoEncoderParam.width;
            this.mOutputWidth = i;
            int i2 = tXSVideoEncoderParam.height;
            this.mOutputHeight = i2;
            this.mInputWidth = i;
            this.mInputHeight = i2;
            this.mGLContextExternal = tXSVideoEncoderParam.glContext;
            this.mStreamType = tXSVideoEncoderParam.streamType;
            this.mEncFmt = tXSVideoEncoderParam.encFmt;
        }
        this.mVideoGOPEncode = 0L;
        this.mEncodeFirstGOP = false;
        return 10000002;
    }

    public void stop() {
    }

    public void callDelegate(int i) {
        callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, i, null, null);
    }

    public void callDelegate(MediaFormat mediaFormat) {
        InterfaceC14327d interfaceC14327d = this.mListener;
        if (interfaceC14327d != null) {
            interfaceC14327d.mo82653a(mediaFormat);
        }
    }
}
