package com.immomo.moment.mediautils;

import com.cosmos.mdlog.MDLog;
import java.nio.ByteBuffer;
import p149l.u460;

/* JADX INFO: loaded from: classes7.dex */
public class FFVideoDecoder {
    private static final String TAG = "FFVideoDecoder";
    AVFrame audioFrame;
    private long decoderHandler;
    u460 mAudioPacket;
    u460 mVideoPacket;
    AVFrame videoFrame;

    public class AVFrame {
        byte[] frame;
        long pts;
        int size;

        private AVFrame() {
        }
    }

    static {
        System.loadLibrary("cosmosffmpeg");
        System.loadLibrary("mediadecoder");
    }

    public FFVideoDecoder() {
        this.videoFrame = new AVFrame();
        this.audioFrame = new AVFrame();
        this.decoderHandler = 0L;
        this.decoderHandler = nativeCreateNewDecoder();
        this.videoFrame = new AVFrame();
        this.audioFrame = new AVFrame();
    }

    private native long nativeCreateNewDecoder();

    private native void nativeDestroyDecoder(long j);

    private native int nativeGetAudioFrame(long j, AVFrame aVFrame);

    private native int nativeGetAudioFrameCnt(long j);

    private native int nativeGetBits(long j);

    private native int nativeGetChannels(long j);

    private native int nativeGetDuration(long j);

    private native int nativeGetFPS(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetRotation(long j);

    private native int nativeGetSampleRate(long j);

    private native int nativeGetStatus(long j);

    private native int nativeGetVideoFrame(long j, AVFrame aVFrame);

    private native int nativeGetVideoFrameCnt(long j);

    private native int nativeGetWidth(long j);

    private native void nativePause(long j);

    private native boolean nativePrepare(long j);

    private native int nativeRelease(long j);

    private native void nativeResume(long j);

    private native void nativeSeek(long j, long j2);

    private native void nativeSelectMeidaTrack(long j, int i);

    private native void nativeSetDataSource(long j, String str);

    private native void nativeSetMediaRange(long j, long j2, long j3, boolean z);

    private native void nativeSetOutMediaInfo(long j, int i, int i2, int i3);

    private native void nativeSetOutputAudioInfo(long j, int i, int i2, int i3);

    private native int nativeSetSeekPauseFlag(long j, boolean z);

    private native boolean nativeStart(long j);

    public synchronized void destroy() {
        if (this.decoderHandler != 0) {
            MDLog.m7389d(TAG, "destroy decoder ");
            nativeDestroyDecoder(this.decoderHandler);
            this.decoderHandler = 0L;
        }
    }

    public int getAudioBits() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetBits(j);
        }
        return 0;
    }

    public int getAudioChannel() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetChannels(j);
        }
        return 0;
    }

    public synchronized u460 getAudioFrame() {
        AVFrame aVFrame;
        try {
            if (nativeGetAudioFrame(this.decoderHandler, this.audioFrame) <= 0 || (aVFrame = this.audioFrame) == null || aVFrame.frame == null) {
                return null;
            }
            u460 u460Var = this.mAudioPacket;
            if (u460Var == null || (u460Var.m191673b() != null && this.mAudioPacket.m191673b().size != this.audioFrame.frame.length)) {
                this.mAudioPacket = new u460(ByteBuffer.wrap(this.audioFrame.frame));
            }
            u460 u460Var2 = this.mAudioPacket;
            AVFrame aVFrame2 = this.audioFrame;
            u460Var2.m191675d(aVFrame2.size, 0, 0, aVFrame2.pts * 1000, 0);
            return this.mAudioPacket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int getAudioFrameCnt() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetAudioFrameCnt(j);
        }
        return 0;
    }

    public int getFps() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetFPS(j);
        }
        return 0;
    }

    public int getHeight() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetHeight(j);
        }
        return 0;
    }

    public int getRotation() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetRotation(j);
        }
        return 0;
    }

    public int getSampleRate() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetSampleRate(j);
        }
        return 0;
    }

    public synchronized int getStatus() {
        long j = this.decoderHandler;
        if (j == 0) {
            return 0;
        }
        return nativeGetStatus(j);
    }

    public synchronized int getVideoDuration() {
        long j = this.decoderHandler;
        if (j == 0) {
            return 0;
        }
        return nativeGetDuration(j);
    }

    public synchronized u460 getVideoFrame() {
        AVFrame aVFrame;
        byte[] bArr;
        try {
            if (nativeGetVideoFrame(this.decoderHandler, this.videoFrame) <= 0 || (aVFrame = this.videoFrame) == null || (bArr = aVFrame.frame) == null) {
                return null;
            }
            if (this.mVideoPacket == null) {
                this.mVideoPacket = new u460(ByteBuffer.wrap(bArr));
            }
            u460 u460Var = this.mVideoPacket;
            AVFrame aVFrame2 = this.videoFrame;
            u460Var.m191675d(aVFrame2.size, 0, 0, 1000 * aVFrame2.pts, 0);
            return this.mVideoPacket;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int getVideoFrameCnt() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetVideoFrameCnt(j);
        }
        return 0;
    }

    public int getWidth() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeGetWidth(j);
        }
        return 0;
    }

    public synchronized void pause() {
        long j = this.decoderHandler;
        if (j != 0) {
            nativePause(j);
        }
    }

    public boolean prepare() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativePrepare(j);
        }
        return false;
    }

    public synchronized void release() {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    public void resume() {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeResume(j);
        }
    }

    public synchronized void seek(long j) {
        long j2 = this.decoderHandler;
        if (j2 != 0) {
            nativeSeek(j2, j);
        }
    }

    public void selectMeidaTrack(int i) {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeSelectMeidaTrack(j, i);
        }
    }

    public void setDataSource(String str) {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeSetDataSource(j, str);
        }
    }

    public void setDecoderRange(long j, long j2, boolean z) {
        long j3 = this.decoderHandler;
        if (j3 != 0) {
            nativeSetMediaRange(j3, j, j2, z);
        }
    }

    public void setOutAudioInfo(int i, int i2, int i3) {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeSetOutputAudioInfo(j, i, i2, i3);
        }
    }

    public void setOutVideoInfo(int i, int i2, int i3) {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeSetOutMediaInfo(j, i, i2, i3);
        }
    }

    public void setSeekPauseFlag(boolean z) {
        long j = this.decoderHandler;
        if (j != 0) {
            nativeSetSeekPauseFlag(j, z);
        }
    }

    public boolean start() {
        long j = this.decoderHandler;
        if (j != 0) {
            return nativeStart(j);
        }
        return false;
    }
}
