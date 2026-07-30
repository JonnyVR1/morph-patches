package com.momo.rtcbase.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.momo.rtcbase.CalledByNative;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class AndroidAudioDecoder {
    private ByteBuffer[] mMediaCodecInputBuffers;
    private byte[] outBytes;
    private final String TAG = "AndroidAudioDecoder";
    private final String AUDIO_MIME = "audio/mp4a-latm";
    private final Object mMediaCodecSync = new Object();
    private MediaCodec mMediaCodec = null;
    private String mCodecName = null;
    private long TIME_OUT_US = 10000;
    private long mLastMeidaOutputPTSUs = 0;
    private MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();

    @CalledByNative
    public AndroidAudioDecoder(int i, int i2) {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
        mediaFormatCreateAudioFormat.setInteger("sample-rate", i);
        mediaFormatCreateAudioFormat.setInteger("channel-count", i2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", 64000);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("is-adts", 1);
        mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{17, -120}));
        createMediaCodec(mediaFormatCreateAudioFormat);
        this.outBytes = new byte[i2 * 2048];
    }

    private void addADTStoPacket(byte[] bArr, int i) {
        bArr[0] = -1;
        bArr[1] = -15;
        bArr[2] = 76;
        bArr[3] = (byte) (64 + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    private boolean createMediaCodec(MediaFormat mediaFormat) {
        synchronized (this.mMediaCodecSync) {
            if (mediaFormat == null) {
                Log.e("AndroidAudioDecoder", "Media format is null");
                return false;
            }
            try {
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.mCodecName = string;
                if (string == null) {
                    Log.e("AndroidAudioDecoder", "Media codec name is null");
                    return false;
                }
                MediaCodec mediaCodec = this.mMediaCodec;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.mMediaCodec.release();
                }
                if (this.mCodecName.startsWith("audio/mp4a-latm")) {
                    this.mMediaCodec = MediaCodec.createDecoderByType(this.mCodecName);
                }
                MediaCodec mediaCodec2 = this.mMediaCodec;
                if (mediaCodec2 != null) {
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.mMediaCodec.start();
                    this.mMediaCodecInputBuffers = this.mMediaCodec.getInputBuffers();
                    return true;
                }
                Log.e("AndroidAudioDecoder", "CreateMediaCodec error:" + this.mCodecName);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    private long getPTSUs() {
        long jNanoTime = System.nanoTime() / 1000;
        long j = this.mLastMeidaOutputPTSUs;
        return jNanoTime < j ? (j - jNanoTime) + jNanoTime : jNanoTime;
    }

    @CalledByNative
    public byte[] decode(ByteBuffer byteBuffer, int i, int i2) {
        try {
            int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(this.TIME_OUT_US);
            if (iDequeueInputBuffer < 0) {
                return null;
            }
            int i3 = i + 7;
            byte[] bArr = new byte[i3];
            addADTStoPacket(bArr, i3);
            byteBuffer.get(bArr, 7, i);
            this.mMediaCodecInputBuffers[iDequeueInputBuffer].put(bArr, 0, i3);
            this.mMediaCodecInputBuffers[iDequeueInputBuffer].flip();
            this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.limit() + 7, getPTSUs(), 0);
            int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, this.TIME_OUT_US);
            byte[] bArr2 = null;
            while (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
                byteBuffer2.get(this.outBytes);
                byteBuffer2.clear();
                bArr2 = this.outBytes;
                this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, this.TIME_OUT_US);
            }
            return bArr2;
        } catch (Exception e) {
            Log.e("AndroidAudioDecoder", e.toString());
            e.printStackTrace();
            return null;
        }
    }

    @CalledByNative
    public void stop() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
