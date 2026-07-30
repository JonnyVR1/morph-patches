package com.immomo.mediabase.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediabase.Log4Cam;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class AudioEncode extends MediaCodecBase {
    private static final String TAG = "AudioEncode_HUOHL";
    private int mChannel;
    private int mEncodeBitrate;
    private int mMaxInputSize = 20480;
    private int mSampleBits;
    private int mSampleRate;

    public AudioEncode(int i, int i2, int i3, int i4, MediaCodecBase.MediaCodecListener mediaCodecListener) {
        this.mSampleRate = i;
        this.mChannel = i2;
        this.mSampleBits = i3;
        this.mListener = mediaCodecListener;
        this.mEncodeBitrate = i4;
        setLogTag(TAG);
    }

    public int encodeFrame(ByteBuffer byteBuffer, long j) {
        return super.processFrame(byteBuffer, j);
    }

    public int initAudioEncode(String str) {
        try {
            this.mCodec = MediaCodec.createEncoderByType(str);
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            mediaFormat.setInteger("bitrate", this.mEncodeBitrate);
            mediaFormat.setInteger("channel-count", this.mChannel);
            mediaFormat.setInteger("sample-rate", this.mSampleRate);
            mediaFormat.setInteger("max-input-size", this.mMaxInputSize);
            if (str.equals("audio/mp4a-latm")) {
                mediaFormat.setInteger("aac-profile", 2);
            }
            return super.initCodec(true);
        } catch (IOException e) {
            Log4Cam.m18379e(TAG, "Init AudioEncode Error : " + e.toString());
            MediaCodecBase.MediaCodecListener mediaCodecListener = this.mListener;
            if (mediaCodecListener != null) {
                mediaCodecListener.onError(-1, e.toString());
            }
            return -1;
        }
    }

    public void setMaxInputSize(int i) {
        this.mMaxInputSize = i;
    }

    @Override // com.immomo.mediabase.mediacodec.MediaCodecBase
    public int start() {
        return super.start();
    }

    @Override // com.immomo.mediabase.mediacodec.MediaCodecBase
    public void stop() {
        super.stop();
    }
}
