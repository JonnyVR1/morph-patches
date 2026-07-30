package com.momo.xengine.media;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class Mp4MuxerWrapper {
    public static final int MEDIA_TRACK_AUDIO = 1;
    public static final int MEDIA_TRACK_AV = 3;
    public static final int MEDIA_TRACK_VIDEO = 2;
    private MediaMuxer mMediaMuxer;
    protected int mMediaTrackInfo;
    private final String TAG = "Mp4MuxerWrapper";
    private int mAudioTrackIndex = -1;
    private int mVideoTrackIndex = -1;
    protected int mAddedMediaTrack = 0;
    private Object mMuxerLock = new Object();
    private boolean mIsRunning = false;

    public Mp4MuxerWrapper(String str, int i) throws IOException {
        this.mMediaTrackInfo = 3;
        this.mMediaMuxer = null;
        if (str == null || i < 1 || i > 3) {
            wg3.m206174a("Invalid file path or media track info");
            throw null;
        }
        this.mMediaMuxer = new MediaMuxer(str, 0);
        this.mMediaTrackInfo = i;
    }

    private String getCurStringInfo() {
        int i = this.mAddedMediaTrack;
        if (i == 1) {
            return "audio";
        }
        return i == 2 ? "video" : "audio/video";
    }

    public int addMediaTrack(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            return -1;
        }
        synchronized (this.mMuxerLock) {
            try {
                MediaMuxer mediaMuxer = this.mMediaMuxer;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.mAddedMediaTrack |= i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iAddTrack;
    }

    public boolean isStarting() {
        return this.mIsRunning;
    }

    public void setVideoOrientation(int i) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(i);
        }
    }

    public void startMuxing() {
        synchronized (this.mMuxerLock) {
            try {
                if (!this.mIsRunning && this.mMediaTrackInfo == this.mAddedMediaTrack) {
                    MediaMuxer mediaMuxer = this.mMediaMuxer;
                    if (mediaMuxer != null) {
                        mediaMuxer.start();
                        this.mIsRunning = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopMuxing() {
        synchronized (this.mMuxerLock) {
            MediaMuxer mediaMuxer = this.mMediaMuxer;
            if (mediaMuxer != null && this.mIsRunning) {
                try {
                    mediaMuxer.stop();
                    this.mMediaMuxer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.mMediaMuxer = null;
                this.mIsRunning = false;
            }
        }
    }

    public boolean writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.mMuxerLock) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    return false;
                }
                if (!this.mIsRunning) {
                    return false;
                }
                MediaMuxer mediaMuxer = this.mMediaMuxer;
                if (mediaMuxer != null) {
                    mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
