package com.immomo.mediabase;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MuxerBase {
    public static final int MEDIA_TRACK_AUDIO = 1;
    public static final int MEDIA_TRACK_AV = 3;
    public static final int MEDIA_TRACK_VIDEO = 2;
    protected int mAddedMediaTrack = 0;
    protected int mMediaTrackInfo = 3;

    public abstract int addMediaTrack(MediaFormat mediaFormat, int i);

    public abstract boolean isStarting();

    public abstract void setVideoOrientation(int i);

    public abstract void startMuxing();

    public abstract void stopMuxing();

    public abstract boolean writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
