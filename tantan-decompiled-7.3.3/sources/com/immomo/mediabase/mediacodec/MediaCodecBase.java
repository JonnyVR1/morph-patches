package com.immomo.mediabase.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.immomo.mediabase.Log4Cam;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MediaCodecBase {
    private static String TAG = "MediaCodecBase";
    private static final long kTimeOutUs = 100;
    protected MediaFormat mFormat = null;
    protected MediaCodec mCodec = null;
    protected MediaCodecListener mListener = null;
    private ByteBuffer[] mInputBuffers = null;
    private ByteBuffer[] mOutputBuffers = null;

    public interface MediaCodecListener {
        void onError(int i, String str);

        void onFinished();

        void onForamtChange(MediaFormat mediaFormat);

        void onFrameAvailable(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
    }

    public void flush() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            mediaCodec.flush();
        }
    }

    public int initCodec(boolean z) {
        try {
            this.mCodec.configure(this.mFormat, (Surface) null, (MediaCrypto) null, z ? 1 : 0);
            return 0;
        } catch (IllegalStateException e) {
            Log4Cam.m19388e(TAG, "Configure AudioEncode Error : " + e.toString());
            MediaCodecListener mediaCodecListener = this.mListener;
            if (mediaCodecListener == null) {
                return -1;
            }
            mediaCodecListener.onError(-2, e.toString());
            return -1;
        }
    }

    public int processFrame(ByteBuffer byteBuffer, long j) {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec == null) {
            return -1;
        }
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(kTimeOutUs);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = this.mInputBuffers[iDequeueInputBuffer];
            byteBuffer.position(0);
            byteBuffer2.put(byteBuffer);
            this.mCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.limit(), j, 0);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, kTimeOutUs);
        if (iDequeueOutputBuffer >= 0) {
            ByteBuffer byteBuffer3 = this.mOutputBuffers[iDequeueOutputBuffer];
            int i = bufferInfo.size;
            if (i > 0) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                byteBufferAllocate.clear();
                byteBuffer3.position(bufferInfo.offset);
                byteBuffer3.get(byteBufferAllocate.array(), 0, bufferInfo.size);
                MediaCodecListener mediaCodecListener = this.mListener;
                if (mediaCodecListener != null) {
                    mediaCodecListener.onFrameAvailable(byteBufferAllocate, bufferInfo);
                }
            }
            this.mCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            if ((bufferInfo.flags & 4) != 0) {
                Log4Cam.m19388e(TAG, "AudioEnoce END_OF_STREAM");
                MediaCodecListener mediaCodecListener2 = this.mListener;
                if (mediaCodecListener2 != null) {
                    mediaCodecListener2.onFinished();
                }
            }
            return 0;
        }
        if (iDequeueOutputBuffer == -3) {
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            Log4Cam.m19388e(TAG, "AudioEnoce output buffers have changed.");
            return 0;
        }
        if (iDequeueOutputBuffer != -2) {
            Log4Cam.m19388e(TAG, "AudioEnoce Error : dequeueOutputBuffer returned " + iDequeueOutputBuffer);
            return -2;
        }
        MediaFormat outputFormat = this.mCodec.getOutputFormat();
        MediaCodecListener mediaCodecListener3 = this.mListener;
        if (mediaCodecListener3 != null) {
            mediaCodecListener3.onForamtChange(outputFormat);
        }
        Log4Cam.m19388e(TAG, "AudioEnoce output format has changed to " + outputFormat);
        return 0;
    }

    public void release() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    public void setLogTag(String str) {
        TAG = str;
    }

    public int start() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec == null) {
            return -1;
        }
        try {
            mediaCodec.start();
            this.mInputBuffers = this.mCodec.getInputBuffers();
            this.mOutputBuffers = this.mCodec.getOutputBuffers();
            return 0;
        } catch (IllegalStateException e) {
            MediaCodecListener mediaCodecListener = this.mListener;
            if (mediaCodecListener == null) {
                return -1;
            }
            mediaCodecListener.onError(-3, e.toString());
            return -1;
        }
    }

    public void stop() {
        MediaCodec mediaCodec = this.mCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }
}
