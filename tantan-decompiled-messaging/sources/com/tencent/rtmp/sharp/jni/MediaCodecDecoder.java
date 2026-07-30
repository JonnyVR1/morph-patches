package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecDecoder {
    private static final String TAG = "MediaCodecDecoder";
    private MediaCodec mAudioAACDecoder = null;
    private int mChannels = 2;
    private int mSampleRate = 44100;
    ByteBuffer mInputBuffer = null;
    ByteBuffer mOutputBuffer = null;
    private MediaCodec.BufferInfo mAACDecBufferInfo = null;
    private ByteBuffer mDecInBuffer = ByteBuffer.allocateDirect(16384);
    private ByteBuffer mDecOutBuffer = ByteBuffer.allocateDirect(16384);
    private byte[] mTempBufDec = new byte[16384];

    @SuppressLint({"NewApi"})
    public int createAACDecoder(int i, int i2) {
        try {
            this.mAudioAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            mediaFormatCreateAudioFormat.setInteger("sample-rate", i);
            mediaFormatCreateAudioFormat.setInteger("channel-count", i2);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{17, -112}));
            this.mAudioAACDecoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            MediaCodec mediaCodec = this.mAudioAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.start();
                this.mAACDecBufferInfo = new MediaCodec.BufferInfo();
                if (QLog.isColorLevel()) {
                    QLog.m84595w(TAG, 2, "createAACDecoder succeed!!! : (" + i + ", " + i2 + ")");
                }
            }
            return 0;
        } catch (Exception unused) {
            if (!QLog.isColorLevel()) {
                return -1;
            }
            QLog.m84590e("TRAE", 2, "Error when creating aac decode stream");
            return -1;
        }
    }

    public int decodeAACFrame(int i) {
        this.mDecInBuffer.get(this.mTempBufDec, 0, i);
        int iDecodeInternalAACFrame = decodeInternalAACFrame(i);
        this.mDecOutBuffer.rewind();
        if (iDecodeInternalAACFrame <= 0) {
            return 0;
        }
        this.mDecOutBuffer.put(this.mTempBufDec, 0, iDecodeInternalAACFrame);
        return iDecodeInternalAACFrame;
    }

    @SuppressLint({"NewApi"})
    public int decodeInternalAACFrame(int i) {
        int i2;
        while (true) {
            try {
                int iDequeueInputBuffer = this.mAudioAACDecoder.dequeueInputBuffer(200L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = this.mAudioAACDecoder.getInputBuffer(iDequeueInputBuffer);
                    this.mInputBuffer = inputBuffer;
                    inputBuffer.clear();
                    this.mInputBuffer.put(this.mTempBufDec, 0, i);
                    this.mDecInBuffer.rewind();
                    i2 = i;
                    this.mAudioAACDecoder.queueInputBuffer(iDequeueInputBuffer, 0, i2, 0L, 0);
                } else {
                    i2 = i;
                }
                int iDequeueOutputBuffer = this.mAudioAACDecoder.dequeueOutputBuffer(this.mAACDecBufferInfo, 10000L);
                if (iDequeueOutputBuffer < 0) {
                    return 0;
                }
                ByteBuffer outputBuffer = this.mAudioAACDecoder.getOutputBuffer(iDequeueOutputBuffer);
                this.mOutputBuffer = outputBuffer;
                int i3 = this.mAACDecBufferInfo.size;
                try {
                    outputBuffer.limit(i3);
                    this.mOutputBuffer.get(this.mTempBufDec, 0, i3);
                    this.mOutputBuffer.position(0);
                    this.mAudioAACDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return i3;
                } catch (Exception unused) {
                    if (QLog.isColorLevel()) {
                        QLog.m84590e("TRAE", 2, "Error when decoding aac stream");
                    }
                    i = i2;
                }
            } catch (Exception unused2) {
                if (QLog.isColorLevel()) {
                    QLog.m84590e("TRAE", 2, "decode failed.");
                }
                return 0;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public int releaseAACDecoder() {
        try {
            MediaCodec mediaCodec = this.mAudioAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAudioAACDecoder.release();
                this.mAudioAACDecoder = null;
                if (!QLog.isColorLevel()) {
                    return 0;
                }
                QLog.m84595w(TAG, 2, "releaseAACDecoder, release aac decode stream succeed!!");
                return 0;
            }
        } catch (Exception unused) {
            if (QLog.isColorLevel()) {
                QLog.m84590e("TRAE", 2, "release aac decoder failed.");
            }
        }
        if (!QLog.isColorLevel()) {
            return -1;
        }
        QLog.m84590e("TRAE", 2, "releaseAACDecoder, Error when releasing aac decode stream");
        return -1;
    }
}
