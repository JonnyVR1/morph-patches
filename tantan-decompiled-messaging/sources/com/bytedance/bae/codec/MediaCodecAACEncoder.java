package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecAACEncoder {
    private static final int MAX_WAITING_TIME = 300;
    private static final String TAG = "MediaCodecAACEncoder";
    private MediaCodec.BufferInfo mBufferInfo;

    @Nullable
    private byte[] mEncodedData;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private String mMimeType = "audio/mp4a-latm";
    private int mSampleRate = 44100;
    private int mChannels = 1;
    private int mProfile = 2;
    private int mBitrate = 64000;
    private int mFrameSize = 1024;
    private MediaCodec mAACEncoder = null;

    @CalledByNative
    public MediaCodecAACEncoder() {
        RXLogging.m5688e(TAG, "MediaCodecAAC Encoder Created");
    }

    @CalledByNative
    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                RXLogging.m5688e(TAG, "close AAC encoder success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "close AAC encoder failed");
        }
    }

    @CalledByNative
    public boolean configAndStartEncoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", this.mBitrate);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            RXLogging.m5688e(TAG, "config AAC encoder success");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Config and Start Encoder Error");
            return false;
        }
    }

    @CalledByNative
    public boolean encodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACEncoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACEncoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            int iDequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i = bufferInfo.size;
            int i2 = bufferInfo.flags & 2;
            if (i > 0 && iDequeueOutputBuffer >= 0) {
                MediaCodec mediaCodec2 = this.mAACEncoder;
                if (i2 == 2) {
                    mediaCodec2.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[i];
                this.mEncodedData = bArr2;
                outputBuffer.get(bArr2, this.mBufferInfo.offset, i);
                outputBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "AAC Encoder Encode failed");
            return false;
        }
    }

    @Nullable
    @CalledByNative
    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    @CalledByNative
    public int getFrameSize() {
        return this.mFrameSize;
    }

    @CalledByNative
    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            RXLogging.m5688e(TAG, "open AAC encoder success");
            return this.mAACEncoder != null;
        } catch (Exception e) {
            e.printStackTrace();
            this.mAACEncoder = null;
            RXLogging.m5688e(TAG, "Open AAC encoder failed");
            return false;
        }
    }

    @CalledByNative
    public void setBitRateValue(int i) {
        this.mBitrate = i;
    }

    @CalledByNative
    public boolean setBitrate(int i) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Config and Start Encoder Error");
            return false;
        }
    }

    @CalledByNative
    public void setChannelsValue(int i) {
        this.mChannels = i;
    }

    @CalledByNative
    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = 2048;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = 2048;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    @CalledByNative
    public void setSampeRateValue(int i) {
        this.mSampleRate = i;
    }
}
