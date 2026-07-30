package com.momo.mcamera.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class MediaVideoEncoder extends MediaEncoder {
    private static final float BPP = 0.25f;
    private static final boolean DEBUG = false;
    private static final int FRAME_RATE = 10;
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "MediaVideoEncoder";
    protected static int[] recognizedFormats = {2130708361};
    private long mBitRate;
    private int mHeight;
    private Surface mSurface;
    private int mWidth;

    public MediaVideoEncoder(MediaMuxerWrapper mediaMuxerWrapper, MediaEncoder.MediaEncoderListener mediaEncoderListener, int i, int i2, long j) {
        super(mediaMuxerWrapper, mediaEncoderListener);
        this.mWidth = i;
        this.mHeight = i2;
        this.mBitRate = j;
    }

    private int calcBitRate() {
        return (int) (this.mWidth * 2.5f * this.mHeight);
    }

    private static final boolean isRecognizedViewoFormat(int i) {
        int[] iArr = recognizedFormats;
        int length = iArr != null ? iArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (recognizedFormats[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(16)
    public static final int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            Thread.currentThread().setPriority(10);
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Thread.currentThread().setPriority(5);
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = capabilitiesForType.colorFormats;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (isRecognizedViewoFormat(i3)) {
                    i = i3;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "MediaVideoEncoder couldn't find a good color format for " + mediaCodecInfo.getName() + " / " + str);
            }
            return i;
        } catch (Throwable th) {
            Thread.currentThread().setPriority(5);
            throw th;
        }
    }

    @TargetApi(16)
    public static final MediaCodecInfo selectVideoCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && selectColorFormat(codecInfoAt, str) > 0) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.momo.mcamera.videoencoder.MediaEncoder
    @TargetApi(18)
    public void prepare(ProcessSurface processSurface, MediaFormat mediaFormat) throws IOException {
        this.mTrackIndex = -1;
        this.mIsEOS = false;
        this.mMuxerStarted = false;
        this.processSurface = processSurface;
        if (selectVideoCodec("video/avc") == null) {
            return;
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mWidth, this.mHeight);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", (int) this.mBitRate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 10);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.mMediaCodec = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        Surface surfaceCreateInputSurface = this.mMediaCodec.createInputSurface();
        this.mSurface = surfaceCreateInputSurface;
        ProcessSurface processSurface2 = this.processSurface;
        if (processSurface2 != null) {
            processSurface2.addMediaCodecSurface(surfaceCreateInputSurface);
        }
        this.mMediaCodec.start();
        MediaEncoder.MediaEncoderListener mediaEncoderListener = this.mListener;
        if (mediaEncoderListener != null) {
            try {
                mediaEncoderListener.onPrepared(this);
            } catch (Exception e) {
                MDLog.m7450i(MDLogTag.MEDIA_ENCODER_TAG, "MediaVideoEncoder prepare:", e);
            }
        }
    }

    @Override // com.momo.mcamera.videoencoder.MediaEncoder
    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        super.release();
    }

    @Override // com.momo.mcamera.videoencoder.MediaEncoder
    @TargetApi(18)
    public void signalEndOfInputStream() {
        this.mMediaCodec.signalEndOfInputStream();
        this.mIsEOS = true;
    }
}
