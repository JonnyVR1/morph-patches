package com.immomo.mediabase.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class AudioDecode extends MediaCodecBase {
    private static final String TAG = "AudioDecode_HUOHL";

    public AudioDecode(MediaCodecBase.MediaCodecListener mediaCodecListener) {
        this.mListener = mediaCodecListener;
    }

    public int decodeAudioFrame(ByteBuffer byteBuffer, long j) {
        return super.processFrame(byteBuffer, j);
    }

    public int initAudioDeocde(MediaFormat mediaFormat) {
        this.mFormat = mediaFormat;
        try {
            this.mCodec = MediaCodec.createDecoderByType(mediaFormat.getString(IMediaFormat.KEY_MIME));
            return super.initCodec(false);
        } catch (IOException e) {
            Log.e(TAG, "initAudioDeocde: Init Error: " + e.toString());
            MediaCodecBase.MediaCodecListener mediaCodecListener = this.mListener;
            if (mediaCodecListener != null) {
                mediaCodecListener.onError(-1, e.toString());
            }
            return -1;
        }
    }
}
