package com.tencent.liteav.videoencoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.nio.ByteBuffer;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14489c extends C14203a {
    protected C14178h mEncodeFilter;
    protected boolean mInit;
    protected C14178h mInputFilter;
    protected InterfaceC14490d mListener = null;
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
        InterfaceC14490d interfaceC14490d = this.mListener;
        if (interfaceC14490d != null) {
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
            interfaceC14490d.mo83839a(tXSNALPacket, i2);
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
        InterfaceC14490d interfaceC14490d = this.mListener;
        if (interfaceC14490d != null) {
            interfaceC14490d.mo83835a(i, j, j2);
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

    public void setListener(InterfaceC14490d interfaceC14490d) {
        this.mListener = interfaceC14490d;
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
        InterfaceC14490d interfaceC14490d = this.mListener;
        if (interfaceC14490d != null) {
            interfaceC14490d.mo83836a(mediaFormat);
        }
    }
}
