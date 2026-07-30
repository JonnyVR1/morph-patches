package com.momo.rtcbase.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.momo.rtcbase.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AndroidAudioEncoder {
    public static final int MEDIA_TRACK_AUDIO = 1;
    private ByteBuffer[] mMediaCodecInputBuffers;
    private final String TAG = "AndroidAudioEncoder";
    private final String AUDIO_MIME = "audio/mp4a-latm";
    private int mMediaType = -1;
    private Object mMediaCodecSync = new Object();
    private MediaCodec mMediaCodec = null;
    private String mCodecName = null;
    private long TIME_OUT_US = 10000;
    private boolean shouldQuit = false;
    private long mPassedTime = 0;
    private int mSampleCnt = 0;
    private long mLastMeidaOutputPTSUs = 0;
    private MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();

    @CalledByNative
    public AndroidAudioEncoder(int i, int i2, int i3) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("bitrate", i3);
        mediaFormat.setInteger("channel-count", i2);
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("max-input-size", i2 * 1024);
        this.mMediaType |= 1;
        createMediaCodec(mediaFormat);
    }

    private long getPTSUs() {
        long jNanoTime = System.nanoTime() / 1000;
        long j = this.mLastMeidaOutputPTSUs;
        return jNanoTime < j ? (j - jNanoTime) + jNanoTime : jNanoTime;
    }

    public boolean createMediaCodec(MediaFormat mediaFormat) {
        synchronized (this.mMediaCodecSync) {
            if (mediaFormat == null) {
                Log.e("AndroidAudioEncoder", "Media format is null");
                return false;
            }
            try {
                String string = mediaFormat.getString("mime");
                this.mCodecName = string;
                if (string == null) {
                    Log.e("AndroidAudioEncoder", "Media codec name is null");
                    return false;
                }
                MediaCodec mediaCodec = this.mMediaCodec;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.mMediaCodec.release();
                }
                if (this.mCodecName.startsWith("audio/mp4a-latm")) {
                    this.mMediaCodec = MediaCodec.createEncoderByType(this.mCodecName);
                    this.mMediaType = 1;
                }
                MediaCodec mediaCodec2 = this.mMediaCodec;
                if (mediaCodec2 != null) {
                    mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                    this.mMediaCodec.start();
                    this.mMediaCodecInputBuffers = this.mMediaCodec.getInputBuffers();
                    return true;
                }
                Log.e("AndroidAudioEncoder", "CreateMediaCodec error:" + this.mCodecName);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    @CalledByNative
    public byte[] encode(ByteBuffer byteBuffer, long j) {
        try {
            int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(this.TIME_OUT_US);
            if (iDequeueInputBuffer >= 0) {
                this.mMediaCodecInputBuffers[iDequeueInputBuffer].put(byteBuffer);
                this.mMediaCodecInputBuffers[iDequeueInputBuffer].flip();
                this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.limit(), getPTSUs(), 0);
                int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, this.TIME_OUT_US);
                if (iDequeueOutputBuffer != -3 && iDequeueOutputBuffer != -2 && iDequeueOutputBuffer != -1) {
                    this.mSampleCnt++;
                    ByteBuffer byteBuffer2 = this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
                    int i = this.mBufferInfo.size;
                    byte[] bArr = new byte[i];
                    byteBuffer2.get(bArr, 0, i);
                    MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
                    if (bufferInfo.flags == 2 || bufferInfo.size == 0) {
                        this.mMediaCodec.getInputFormat().setByteBuffer("csd-0", byteBuffer2);
                    } else {
                        bufferInfo.presentationTimeUs = getPTSUs();
                        this.mLastMeidaOutputPTSUs = this.mBufferInfo.presentationTimeUs;
                    }
                    this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return bArr;
                }
            }
            return null;
        } catch (Exception e) {
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
