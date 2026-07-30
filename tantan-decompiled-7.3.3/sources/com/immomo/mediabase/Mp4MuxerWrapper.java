package com.immomo.mediabase;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class Mp4MuxerWrapper extends MuxerBase {
    private MediaMuxer mMediaMuxer;
    private final String TAG = "Mp4MuxerWrapper";
    private int mAudioTrackIndex = -1;
    private int mVideoTrackIndex = -1;
    private Object mMuxerLock = new Object();
    private boolean mIsRunning = false;

    public Mp4MuxerWrapper(String str, int i) throws IOException {
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

    @Override // com.immomo.mediabase.MuxerBase
    public int addMediaTrack(MediaFormat mediaFormat, int i) {
        int iAddTrack = -1;
        if (mediaFormat == null || i < 1 || i > 2) {
            Log4Cam.m19388e("Mp4MuxerWrapper", "Add media track error ! Invalid parameter ! format=" + mediaFormat + " and track=" + i);
            return -1;
        }
        synchronized (this.mMuxerLock) {
            try {
                MediaMuxer mediaMuxer = this.mMediaMuxer;
                if (mediaMuxer != null) {
                    iAddTrack = mediaMuxer.addTrack(mediaFormat);
                    this.mAddedMediaTrack |= i;
                    Log4Cam.m19385d("Mp4MuxerWrapper", "Add track info " + getCurStringInfo());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iAddTrack;
    }

    public int getAudiotrackIndex() {
        return this.mAudioTrackIndex;
    }

    public int getVideoTrackIndex() {
        return this.mVideoTrackIndex;
    }

    @Override // com.immomo.mediabase.MuxerBase
    public boolean isStarting() {
        return this.mIsRunning;
    }

    public void setAudioInfo(String str, int i, int i2, int i3, int i4, int i5) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
        mediaFormat.setInteger("bitrate", i4);
        mediaFormat.setInteger("channel-count", i2);
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("aac-profile", 2);
        this.mAudioTrackIndex = addMediaTrack(mediaFormat, 1);
    }

    public void setVideoInfo(int i, int i2, int i3, int i4) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i3);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        this.mVideoTrackIndex = addMediaTrack(mediaFormatCreateVideoFormat, 2);
    }

    @Override // com.immomo.mediabase.MuxerBase
    public void setVideoOrientation(int i) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            mediaMuxer.setOrientationHint(i);
        }
    }

    @Override // com.immomo.mediabase.MuxerBase
    public void startMuxing() {
        synchronized (this.mMuxerLock) {
            try {
                if (!this.mIsRunning && this.mMediaTrackInfo == this.mAddedMediaTrack) {
                    MediaMuxer mediaMuxer = this.mMediaMuxer;
                    if (mediaMuxer != null) {
                        mediaMuxer.start();
                        this.mIsRunning = true;
                    }
                    Log4Cam.m19388e("Mp4MuxerWrapper", "Start Media muxing !!" + getCurStringInfo());
                    return;
                }
                Log4Cam.m19395w("Mp4MuxerWrapper", "Meida info not enough , need waitting, already have " + getCurStringInfo());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.mediabase.MuxerBase
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
        Log4Cam.m19385d("Mp4MuxerWrapper", "Stop media muxing !" + this.mMediaTrackInfo);
    }

    @Override // com.immomo.mediabase.MuxerBase
    public boolean writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.mMuxerLock) {
            try {
                if (byteBuffer == null || bufferInfo == null) {
                    Log4Cam.m19388e("Mp4MuxerWrapper", "[writeSampleData] Invalid Parameter !! ByteBuffer or BufferInfo is null");
                    return false;
                }
                if (this.mIsRunning) {
                    MediaMuxer mediaMuxer = this.mMediaMuxer;
                    if (mediaMuxer != null) {
                        mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                    }
                    return true;
                }
                Log4Cam.m19395w("Mp4MuxerWrapper", "Media muxer not started !!, already have media type:" + getCurStringInfo());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
