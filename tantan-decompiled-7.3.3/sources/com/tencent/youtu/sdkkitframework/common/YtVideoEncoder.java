package com.tencent.youtu.sdkkitframework.common;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.brq0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class YtVideoEncoder {
    public static final String MIME_TYPE = "video/avc";
    public static final String TAG = "YtVideoEncoder";
    public static MediaCodecInfo codecInfo = null;
    public static int colorFormat = 21;
    public CountDownLatch mNewFrameLatch;
    public File mOutputFile;
    public MediaMuxer mediaMuxer;
    public MediaFormat mediaMuxerFormat;
    public String outputFileString;
    public MediaCodec videoEncoder;
    public int videoTrackIndex;
    public ConcurrentLinkedQueue<YTImageData> videoEncodeQueue = new ConcurrentLinkedQueue<>();
    public boolean isMediaMuxerStarted = false;
    public final Object mFrameSync = new Object();
    public final Object mediaMuxerSync = new Object();
    public int videoGenerateIndex = 0;
    public int addedTrackCount = 0;
    public boolean mNoMoreFrames = false;
    public boolean isEncodingStarted = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VideoEncodeResultCode {
        public static final int VIDEO_ENCODE_FAIL = -2;
        public static final int VIDEO_ENCODE_SUCCESS = 0;
        public static final int VIDEO_MEDIA_NOT_HAS_USE = -1;
        public static final int VIDEO_START_SUCCESS = 0;
    }

    private long computePresentationTime(long j, int i) {
        return ((j * 1000000) / ((long) i)) + 132;
    }

    public static boolean findColorFormats(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.videoEncoder.getInputBuffer(i);
    }

    public static int getMediaCodecInfo() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            codecInfo = null;
            for (int i = 0; i < codecCount && codecInfo == null; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    boolean z = false;
                    for (int i2 = 0; i2 < supportedTypes.length && !z; i2++) {
                        if (supportedTypes[i2].equals(MIME_TYPE)) {
                            z = true;
                        }
                    }
                    if (z) {
                        codecInfo = codecInfoAt;
                    }
                }
            }
            MediaCodecInfo mediaCodecInfo = codecInfo;
            if (mediaCodecInfo == null) {
                return -1;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(MIME_TYPE);
            YtLogger.m85811o(TAG, "codecInfoName:" + codecInfo.getName() + " colorFormat:" + Arrays.toString(capabilitiesForType.colorFormats));
            if (findColorFormats(21, capabilitiesForType.colorFormats)) {
                colorFormat = 21;
                return 0;
            }
            if (!findColorFormats(19, capabilitiesForType.colorFormats)) {
                return -1;
            }
            colorFormat = 19;
            return 0;
        } catch (Exception e) {
            YtLogger.m85809e(TAG, "get color format type error", e);
            return -1;
        }
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.videoEncoder.getOutputBuffer(i);
    }

    private void release() {
        synchronized (this.mediaMuxerSync) {
            try {
                if (this.videoEncoder != null) {
                    String str = TAG;
                    YtLogger.m85808d(str, "reset media codec");
                    this.videoEncoder.reset();
                    YtLogger.m85808d(str, "stop media codec");
                    this.videoEncoder.stop();
                    YtLogger.m85808d(str, "Release media codec");
                    this.videoEncoder.release();
                    this.videoEncoder = null;
                    YtLogger.m85808d(str, "RELEASE Video CODEC");
                }
                if (this.mediaMuxer != null) {
                    String str2 = TAG;
                    YtLogger.m85808d(str2, "Stop media muxer");
                    this.mediaMuxer.stop();
                    YtLogger.m85808d(str2, "Release media muxer");
                    this.mediaMuxer.release();
                    this.mediaMuxer = null;
                    this.isMediaMuxerStarted = false;
                    YtLogger.m85808d(str2, "RELEASE MUXER");
                }
                this.mediaMuxerFormat = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startMediaMuxer(MediaFormat mediaFormat) {
        synchronized (this.mediaMuxerSync) {
            if (this.isMediaMuxerStarted) {
                MediaFormat mediaFormat2 = this.mediaMuxerFormat;
                if (mediaFormat2 != null && mediaFormat != null && mediaFormat2.toString().equals(mediaFormat.toString())) {
                    return;
                }
                try {
                    this.mediaMuxer.stop();
                } catch (Exception e) {
                    YtLogger.m85809e(TAG, "media muxer stop failed:", e);
                }
                this.mediaMuxer.release();
                this.mediaMuxer = null;
                this.isMediaMuxerStarted = false;
                try {
                    this.mediaMuxer = new MediaMuxer(this.outputFileString, 0);
                } catch (Exception e2) {
                    YtLogger.m85809e(TAG, "Unable to get path for ", e2);
                    return;
                }
            }
            this.mediaMuxerFormat = mediaFormat;
            this.videoTrackIndex = this.mediaMuxer.addTrack(mediaFormat);
            int i = this.addedTrackCount + 1;
            this.addedTrackCount = i;
            if (i >= 1) {
                YtLogger.m85808d(TAG, "Media muxer is starting...");
                this.mediaMuxer.start();
                this.isMediaMuxerStarted = true;
                this.mediaMuxerSync.notifyAll();
            }
        }
    }

    public void abortEncoding() {
        this.isEncodingStarted = false;
        if (this.mOutputFile != null) {
            YtLogger.m85808d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            YtLogger.m85810i(TAG, "Failed to abort encoding since it never started");
            return;
        }
        YtLogger.m85810i(TAG, "Aborting encoding");
        release();
        this.mNoMoreFrames = true;
        this.videoEncodeQueue = new ConcurrentLinkedQueue<>();
        synchronized (this.mFrameSync) {
            try {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCache() {
        if (this.mOutputFile != null) {
            YtLogger.m85808d(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.isEncodingStarted) {
            try {
                this.videoEncoder.stop();
                this.videoEncoder.release();
            } catch (IllegalStateException e) {
                YtLogger.m85809e(TAG, "restart:stop video error", e);
            }
        }
        if (this.mediaMuxer != null) {
            this.mediaMuxer = null;
        }
        this.videoEncodeQueue.clear();
        this.isEncodingStarted = false;
    }

    public void encode(int i) throws Exception {
        CountDownLatch countDownLatch;
        if (!this.isEncodingStarted) {
            brq0.m106161a("encode not started");
            return;
        }
        YtLogger.m85808d(TAG, "Encoder started");
        if (this.mNoMoreFrames && this.videoEncodeQueue.size() == 0) {
            return;
        }
        YTImageData yTImageDataPoll = this.videoEncodeQueue.poll();
        if (yTImageDataPoll == null) {
            synchronized (this.mFrameSync) {
                countDownLatch = new CountDownLatch(1);
                this.mNewFrameLatch = countDownLatch;
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                YtLogger.m85809e(TAG, "Queueing frame", e);
            }
            yTImageDataPoll = this.videoEncodeQueue.poll();
        }
        if (yTImageDataPoll == null) {
            YtLogger.m85809e(TAG, "encode data is Null!!: ", null);
            return;
        }
        int iDequeueInputBuffer = this.videoEncoder.dequeueInputBuffer(200000L);
        long jComputePresentationTime = computePresentationTime(this.videoGenerateIndex, i);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer inputBuffer = getInputBuffer(iDequeueInputBuffer);
            inputBuffer.clear();
            inputBuffer.put(yTImageDataPoll.imgData);
            this.videoEncoder.queueInputBuffer(iDequeueInputBuffer, 0, yTImageDataPoll.imgData.length, jComputePresentationTime, 0);
            this.videoGenerateIndex++;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(bufferInfo, 200000L);
        if (iDequeueOutputBuffer == -1) {
            YtLogger.m85809e(TAG, "No output from encoder available", null);
            return;
        }
        if (iDequeueOutputBuffer == -2) {
            startMediaMuxer(this.videoEncoder.getOutputFormat());
            return;
        }
        if (iDequeueOutputBuffer < 0) {
            YtLogger.m85809e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, null);
            return;
        }
        if (bufferInfo.size != 0) {
            ByteBuffer outputBuffer = getOutputBuffer(iDequeueOutputBuffer);
            if (outputBuffer == null) {
                YtLogger.m85809e(TAG, "encoderOutputBuffer " + iDequeueOutputBuffer + " was null", null);
                return;
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            YtLogger.m85808d(TAG, "media muxer write video data outputindex " + this.videoGenerateIndex);
            synchronized (this.mediaMuxer) {
                this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, bufferInfo);
            }
            this.videoEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        }
    }

    public MediaCodecInfo getCodecInfo() {
        return codecInfo;
    }

    public int getColorFormat() {
        return colorFormat;
    }

    public String getSupportCodecJSONStr() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaCodecInfo mediaCodecInfo = codecInfo;
            jSONObject.put("codec_info:", mediaCodecInfo == null ? "codecInfo null" : mediaCodecInfo.getName());
            jSONObject.put("color_format:", colorFormat);
        } catch (JSONException e) {
            YtLogger.m85809e(TAG, "video encode make json error:", e);
        }
        return jSONObject.toString();
    }

    public boolean isEncodingStarted() {
        return this.isEncodingStarted;
    }

    public void queueFrame(YTImageData yTImageData) {
        if (!this.isEncodingStarted || this.videoEncoder == null || this.mediaMuxer == null) {
            return;
        }
        YtLogger.m85808d(TAG, "Queueing frame");
        this.videoEncodeQueue.add(yTImageData);
        synchronized (this.mFrameSync) {
            try {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startEncoding(int i, int i2, File file, int i3, int i4, int i5, int i6) throws IOException {
        this.mOutputFile = file;
        file.delete();
        this.outputFileString = file.getCanonicalPath();
        String str = TAG;
        YtLogger.m85811o(str, "found codec: " + codecInfo.getName() + "|colorFormat:" + colorFormat + "|width=" + i + "|height=" + i2 + "|videoRotation=" + i6);
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, i, i2);
        mediaFormatCreateVideoFormat.setInteger("color-format", colorFormat);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i3);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i5);
        mediaFormatCreateVideoFormat.setInteger("width", i);
        mediaFormatCreateVideoFormat.setInteger("height", i2);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
        this.videoEncoder = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.videoEncoder.start();
        if (this.mediaMuxer == null) {
            MediaMuxer mediaMuxer = new MediaMuxer(this.outputFileString, 0);
            this.mediaMuxer = mediaMuxer;
            mediaMuxer.setOrientationHint(i6 == 0 ? 90 : 0);
        }
        YtLogger.m85810i(str, "Initialization complete. Starting encoder...");
        this.isEncodingStarted = true;
    }

    public void stopEncoding() {
        this.isEncodingStarted = false;
        if (this.videoEncoder == null || this.mediaMuxer == null) {
            return;
        }
        YtLogger.m85810i(TAG, "Stopping encoding");
        this.mNoMoreFrames = true;
        synchronized (this.mFrameSync) {
            try {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        release();
    }
}
