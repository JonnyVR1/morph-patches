package com.immomo.mediabase.MultiAudioPlayer;

import android.media.MediaFormat;
import com.immomo.mediabase.AudioParameter;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface AudioFileDecodeListener {
    public static final int DECODE_EXTRACTOR_ERROR = -1;
    public static final int DECODE_EXTRACTOR_NO_AUDIO = -2;
    public static final int DECODE_EXTRACTOR_SEEK_ERROR = -3;

    void onDecodeFinished(AudioFileDecode audioFileDecode);

    void onDecoderError(int i, AudioFileDecode audioFileDecode);

    void onForamtChange(MediaFormat mediaFormat, AudioFileDecode audioFileDecode);

    void onPlayFinished(AudioFileDecode audioFileDecode);

    void onPlayStart(AudioFileDecode audioFileDecode);

    void onProcessFrame(ByteBuffer byteBuffer, long j, AudioFileDecode audioFileDecode);

    void onResampleOpen(AudioParameter audioParameter, AudioParameter audioParameter2, AudioFileDecode audioFileDecode);
}
