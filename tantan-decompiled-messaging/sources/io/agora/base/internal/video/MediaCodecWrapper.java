package io.agora.base.internal.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    Surface createInputSurface();

    int dequeueInputBuffer(long j);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j);

    void flush();

    @Nullable
    MediaCodecInfo.CodecCapabilities getCodecInfo(String str);

    ByteBuffer[] getInputBuffers();

    ByteBuffer[] getOutputBuffers();

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);

    void signalEndOfInputStream();

    void start();

    void stop();
}
