package com.immomo.mediabase;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface DecodeAudioFileListener {
    public static final int DECODE_EXTRACTOR_ERROR = -1;
    public static final int DECODE_EXTRACTOR_NO_AUDIO = -2;
    public static final int DECODE_EXTRACTOR_SEEK_ERROR = -3;

    void onDecoderError(int i);

    void onFinished();

    void onForamtChange(MediaFormat mediaFormat);

    void onFrameAvailable(ByteBuffer byteBuffer, long j);
}
