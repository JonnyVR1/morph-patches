package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import l.k250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@TargetApi(19)
class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "HardwareVideoEncoder";
    private static List<String> VBR_DEVICE_BLACK_LISTS = Arrays.asList("Le ", "LeX820", "vivoX7", "OPPOR9sk");
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private int bitrateMode;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private Object codecSync;
    private final VideoCodecType codecType;
    private ByteBuffer configBuffer;
    private boolean enableCQ;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private boolean isNeedUpdateShareContext;
    boolean isUseVbr;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private boolean needresetCodec;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private int resetCodecInterval;
    private long resetCodecPreTime;
    private volatile boolean running;
    private EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int startBitrate;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private GlRectDrawer textureDrawer = new GlRectDrawer();
    private VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    public enum YuvFormat {
        I420 { // from class: com.momo.rtcbase.HardwareVideoEncoder.YuvFormat.1
            @Override // com.momo.rtcbase.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 { // from class: com.momo.rtcbase.HardwareVideoEncoder.YuvFormat.2
            @Override // com.momo.rtcbase.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            k250.a("Unsupported colorFormat: ", i);
            return null;
        }

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context, int i3, int i4) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.resetCodecPreTime = 0L;
        this.isNeedUpdateShareContext = false;
        this.bitrateMode = 0;
        this.isUseVbr = true;
        this.resetCodecInterval = 0;
        this.needresetCodec = false;
        this.enableCQ = false;
        this.codecSync = new Object();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.resetCodecInterval = i3;
        this.enableCQ = i4 > 0;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: com.momo.rtcbase.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    boolean z = HardwareVideoEncoder.this.running;
                    HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                    if (!z) {
                        hardwareVideoEncoder.releaseCodecOnOutputThread();
                        return;
                    }
                    hardwareVideoEncoder.deliverEncodedImage();
                }
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.m468d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[iDequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.m470e(TAG, "queueInputBuffer failed", e);
                    return VideoCodecStatus.NO_OUTPUT;
                }
            } catch (IllegalStateException e2) {
                Logging.m470e(TAG, "getInputBuffers failed", e2);
                return VideoCodecStatus.NO_OUTPUT;
            }
        } catch (IllegalStateException e3) {
            Logging.m470e(TAG, "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.NO_OUTPUT;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(Act.TAKE_PICTURE);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Error e) {
            Logging.m470e(TAG, "encodeTexture failed", e);
            releaseResource();
            return VideoCodecStatus.NO_OUTPUT;
        } catch (Exception e2) {
            Logging.m470e(TAG, "encodeTexture failed", e2);
            releaseResource();
            return VideoCodecStatus.NO_OUTPUT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0126 A[Catch: Exception -> 0x0058, TryCatch #0 {Exception -> 0x0058, blocks: (B:9:0x0036, B:13:0x004e, B:20:0x007a, B:23:0x00a2, B:30:0x00db, B:32:0x00df, B:33:0x00e4, B:35:0x00ea, B:39:0x00f9, B:50:0x0126, B:44:0x0108, B:46:0x0110, B:47:0x011f, B:51:0x012d, B:53:0x013a, B:55:0x013e, B:58:0x0173, B:24:0x00ad, B:26:0x00b9, B:27:0x00c4, B:29:0x00d1, B:16:0x005b, B:18:0x006b, B:19:0x0075), top: B:68:0x0036 }] */
    private VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1L;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            Logging.m469e(TAG, "resetCodec initEncodeInternal startBitrate " + this.startBitrate);
            Integer num = this.surfaceColorFormat;
            if (num == null) {
                num = this.yuvColorFormat;
            }
            int iIntValue = num.intValue();
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                boolean z = this.isUseVbr;
                boolean z2 = this.needresetCodec;
                if (z) {
                    if (z2) {
                        mediaFormatCreateVideoFormat.setInteger("bitrate", this.bitrateAdjuster.getAdjustedBitrateBps());
                    } else {
                        mediaFormatCreateVideoFormat.setInteger("bitrate", this.startBitrate);
                    }
                } else if (z2) {
                    mediaFormatCreateVideoFormat.setInteger("bitrate", this.bitrateAdjuster.getAdjustedBitrateBps());
                } else {
                    mediaFormatCreateVideoFormat.setInteger("bitrate", (int) (((double) this.startBitrate) * 0.8d));
                }
                mediaFormatCreateVideoFormat.setInteger("color-format", iIntValue);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", this.bitrateAdjuster.getCodecConfigFramerate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 1)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_VBR");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 1);
                    this.bitrateMode = 1;
                } else if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 0)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_CQ");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 0);
                    this.bitrateMode = 0;
                } else if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 2)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_CBR");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 2);
                    this.bitrateMode = 2;
                }
                if (this.enableCQ) {
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 0);
                    this.bitrateMode = 0;
                }
                if (this.codecType == VideoCodecType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1537948542) {
                        if (iHashCode == 1595523974 && str.equals("640c1f")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            mediaFormatCreateVideoFormat.setInteger("level", VIDEO_AVC_LEVEL_3);
                        } else {
                            Logging.m472w(TAG, "Unknown profile level id: ".concat(str));
                        }
                    } else if (!str.equals("42e01f")) {
                        Logging.m472w(TAG, "Unknown profile level id: ".concat(str));
                    }
                }
                mediaFormatCreateVideoFormat.toString();
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (!this.useSurfaceMode || this.sharedContext == null) {
                    releaseResource();
                    return VideoCodecStatus.OK;
                }
                this.textureEglBase = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                this.textureInputSurface = surfaceCreateInputSurface;
                this.textureEglBase.createSurface(surfaceCreateInputSurface);
                this.textureEglBase.makeCurrent();
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                Log.e(TAG, "resetCodec initEncodeInternal failed", e);
                releaseResource();
                if (!this.enableCQ) {
                    return VideoCodecStatus.OK;
                }
                this.enableCQ = false;
                return initEncodeInternal_ex();
            }
        } catch (Error | Exception unused) {
            Logging.m469e(TAG, "Cannot create media encoder " + this.codecName);
            releaseResource();
            return VideoCodecStatus.OK;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011d A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:9:0x0035, B:13:0x004d, B:20:0x0079, B:23:0x00a1, B:30:0x00db, B:32:0x00e1, B:36:0x00f0, B:47:0x011d, B:41:0x00ff, B:43:0x0107, B:44:0x0116, B:48:0x0124, B:50:0x0131, B:52:0x0135, B:55:0x016a, B:24:0x00ac, B:26:0x00b9, B:27:0x00c4, B:29:0x00d1, B:16:0x005a, B:18:0x006a, B:19:0x0074), top: B:61:0x0035 }] */
    private VideoCodecStatus initEncodeInternal_ex() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1L;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            Logging.m469e(TAG, "resetCodec initEncodeInternal startBitrate " + this.startBitrate);
            Integer num = this.surfaceColorFormat;
            if (num == null) {
                num = this.yuvColorFormat;
            }
            int iIntValue = num.intValue();
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                boolean z = this.isUseVbr;
                boolean z2 = this.needresetCodec;
                if (z) {
                    if (z2) {
                        mediaFormatCreateVideoFormat.setInteger("bitrate", this.bitrateAdjuster.getAdjustedBitrateBps());
                    } else {
                        mediaFormatCreateVideoFormat.setInteger("bitrate", this.startBitrate);
                    }
                } else if (z2) {
                    mediaFormatCreateVideoFormat.setInteger("bitrate", this.bitrateAdjuster.getAdjustedBitrateBps());
                } else {
                    mediaFormatCreateVideoFormat.setInteger("bitrate", (int) (((double) this.startBitrate) * 0.8d));
                }
                mediaFormatCreateVideoFormat.setInteger("color-format", iIntValue);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", this.bitrateAdjuster.getCodecConfigFramerate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 1)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_VBR");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 1);
                    this.bitrateMode = 1;
                } else if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 0)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_CQ");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 0);
                    this.bitrateMode = 0;
                } else if (isEncodeSupportBitrateMode(this.codecType.mimeType(), 2)) {
                    Logging.m468d("zhengjijian", "MediaFormat BITRATE_MODE_CBR");
                    mediaFormatCreateVideoFormat.setInteger(KEY_BITRATE_MODE, 2);
                    this.bitrateMode = 2;
                }
                if (this.codecType == VideoCodecType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1537948542) {
                        if (iHashCode == 1595523974 && str.equals("640c1f")) {
                            mediaFormatCreateVideoFormat.setInteger("profile", 8);
                            mediaFormatCreateVideoFormat.setInteger("level", VIDEO_AVC_LEVEL_3);
                        } else {
                            Logging.m472w(TAG, "Unknown profile level id: ".concat(str));
                        }
                    } else if (!str.equals("42e01f")) {
                        Logging.m472w(TAG, "Unknown profile level id: ".concat(str));
                    }
                }
                mediaFormatCreateVideoFormat.toString();
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (!this.useSurfaceMode || this.sharedContext == null) {
                    releaseResource();
                    return VideoCodecStatus.OK;
                }
                this.textureEglBase = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                Surface surfaceCreateInputSurface = this.codec.createInputSurface();
                this.textureInputSurface = surfaceCreateInputSurface;
                this.textureEglBase.createSurface(surfaceCreateInputSurface);
                this.textureEglBase.makeCurrent();
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                Log.e(TAG, "resetCodec initEncodeInternal failed", e);
                releaseResource();
                return VideoCodecStatus.OK;
            }
        } catch (Error | Exception unused) {
            Logging.m469e(TAG, "Cannot create media encoder " + this.codecName);
            releaseResource();
            return VideoCodecStatus.OK;
        }
    }

    private boolean isEncodeSupportBitrateMode(String str, int i) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equalsIgnoreCase(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null) {
                            return encoderCapabilities.isBitrateModeSupported(i);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m468d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m470e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m470e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.m468d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodecWrapper mediaCodecWrapper = this.codec;
            if (mediaCodecWrapper != null) {
                mediaCodecWrapper.setParameters(bundle);
            }
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.m470e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        VideoCodecStatus videoCodecStatusInitEncodeInternal;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.resetCodecPreTime == 0) {
            this.resetCodecPreTime = System.currentTimeMillis();
        }
        if (this.resetCodecInterval > 0 && System.currentTimeMillis() - this.resetCodecPreTime < this.resetCodecInterval && !this.isNeedUpdateShareContext) {
            this.adjustedBitrate = DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US;
            return VideoCodecStatus.NO_OUTPUT;
        }
        Logging.m469e(TAG, "resetCodec begin frame =" + this.bitrateAdjuster.getCodecConfigFramerate() + "biterate=" + this.bitrateAdjuster.getAdjustedBitrateBps() + ";resetCodecInterval =" + this.resetCodecInterval + ";viideoModem=" + this.bitrateMode);
        this.resetCodecPreTime = System.currentTimeMillis();
        synchronized (this.codecSync) {
            releaseResource();
            this.width = i;
            this.height = i2;
            this.useSurfaceMode = z;
            videoCodecStatusInitEncodeInternal = initEncodeInternal();
        }
        return videoCodecStatusInitEncodeInternal;
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        String str = Build.MODEL;
        if (str != null && !isVbrDeivceSupported(str)) {
            return VideoCodecStatus.OK;
        }
        try {
            Bundle bundle = new Bundle();
            Log.e(TAG, "resetCodec updateBitrate adjustedBitrate:" + this.adjustedBitrate + "adjustframeRate:" + this.bitrateAdjuster.getCodecConfigFramerate());
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Log.e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer < 0) {
                return;
            }
            ByteBuffer byteBuffer = this.codec.getOutputBuffers()[iDequeueOutputBuffer];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.m468d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = byteBufferAllocateDirect;
                byteBufferAllocateDirect.put(byteBuffer);
            } else {
                this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
                boolean z = true;
                if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                    if (this.resetCodecInterval == 0) {
                        updateBitrate();
                    } else {
                        this.needresetCodec = true;
                    }
                }
                if ((bufferInfo.flags & 1) == 0) {
                    z = false;
                }
                if (z) {
                    Logging.m469e(TAG, "Sync frame generated");
                }
                if (z && this.codecType == VideoCodecType.H264) {
                    Logging.m468d(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                    byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                    this.configBuffer.rewind();
                    byteBufferSlice.put(this.configBuffer);
                    byteBufferSlice.put(byteBuffer);
                    byteBufferSlice.rewind();
                } else {
                    byteBufferSlice = byteBuffer.slice();
                }
                EncodedImage.FrameType frameType = z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
                EncodedImage.Builder builderPoll = this.outputBuilders.poll();
                builderPoll.setBuffer(byteBufferSlice).setFrameType(frameType);
                this.callback.onEncodedFrame(builderPoll.createEncodedImage(), new VideoEncoder.CodecSpecificInfo());
            }
            this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
        } catch (Exception e) {
            Logging.m470e(TAG, "deliverOutput failed", e);
        }
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.NO_OUTPUT;
        synchronized (this.codecSync) {
            try {
                EglBase14.Context context = this.sharedContext;
                if (context == null) {
                    return videoCodecStatus;
                }
                if (this.codec == null && context != null) {
                    this.isNeedUpdateShareContext = true;
                }
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                boolean z = buffer instanceof VideoFrame.TextureBuffer;
                int width = videoFrame.getBuffer().getWidth();
                int height = videoFrame.getBuffer().getHeight();
                if (this.textureDrawer == null) {
                    this.textureDrawer = new GlRectDrawer();
                }
                if (this.videoFrameDrawer == null) {
                    this.videoFrameDrawer = new VideoFrameDrawer();
                }
                if ((this.resetCodecInterval > 0 && this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) || this.isNeedUpdateShareContext) {
                    if (resetCodec(width, height, z) != VideoCodecStatus.OK) {
                        Logging.m469e(TAG, "resetCodec fail");
                    } else {
                        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                        this.isNeedUpdateShareContext = false;
                    }
                }
                if (this.outputBuilders.size() > 2) {
                    Logging.m469e(TAG, "Dropped frame, encoder queue full");
                    return videoCodecStatus;
                }
                boolean z2 = false;
                for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
                    if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                        z2 = true;
                    }
                }
                if (z2 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
                    requestKeyFrame(videoFrame.getTimestampNs());
                }
                int height2 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
                this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setCompleteFrame(true).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
                VideoCodecStatus videoCodecStatusEncodeByteBuffer = VideoCodecStatus.NO_OUTPUT;
                if (this.useSurfaceMode && z) {
                    videoCodecStatusEncodeByteBuffer = encodeTextureBuffer(videoFrame);
                } else if (!z) {
                    videoCodecStatusEncodeByteBuffer = encodeByteBuffer(videoFrame, buffer, height2);
                }
                if (videoCodecStatusEncodeByteBuffer != VideoCodecStatus.OK) {
                    this.outputBuilders.pollLast();
                }
                return videoCodecStatusEncodeByteBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public String getImplementationName() {
        return "HWEncoder";
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecType videoCodecType = this.codecType;
            if (videoCodecType == VideoCodecType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecType == VideoCodecType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public Integer getVideoMode() {
        return Integer.valueOf(this.bitrateMode);
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        VideoCodecStatus videoCodecStatusInitEncodeInternal;
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.isUseVbr = settings.useVbr;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (i2 == 0 || (i = settings.maxFramerate) == 0) {
            BitrateAdjuster bitrateAdjuster = this.bitrateAdjuster;
            int i3 = i2 != 0 ? i2 * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE : 1000000;
            int i4 = settings.maxFramerate;
            if (i4 == 0) {
                i4 = 15;
            }
            bitrateAdjuster.setTargets(i3, i4);
        } else {
            this.bitrateAdjuster.setTargets(i2 * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE, i);
        }
        int adjustedBitrateBps = this.bitrateAdjuster.getAdjustedBitrateBps();
        this.adjustedBitrate = adjustedBitrateBps;
        this.startBitrate = adjustedBitrateBps;
        Logging.m468d(TAG, "initEncode: " + this.width + " x " + this.height + ". @ " + settings.startBitrate + "kbps. Fps: " + settings.maxFramerate + " Use surface mode: " + this.useSurfaceMode);
        synchronized (this.codecSync) {
            videoCodecStatusInitEncodeInternal = initEncodeInternal();
        }
        return videoCodecStatusInitEncodeInternal;
    }

    public boolean isVbrDeivceSupported(String str) {
        return this.isUseVbr;
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus release() {
        this.encodeThreadChecker.checkIsOnValidThread();
        Logging.m469e(TAG, "HardwareVideoEncoder release");
        synchronized (this.codecSync) {
            try {
                this.isNeedUpdateShareContext = true;
                if (this.outputThread == null) {
                    VideoCodecStatus videoCodecStatus = VideoCodecStatus.REQUEST_SLI;
                } else {
                    this.running = false;
                    if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                        Logging.m469e(TAG, "Media encoder release timeout");
                        VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.REQUEST_SLI;
                    } else if (this.shutdownException != null) {
                        Logging.m470e(TAG, "Media encoder release exception", this.shutdownException);
                        VideoCodecStatus videoCodecStatus3 = VideoCodecStatus.REQUEST_SLI;
                    } else {
                        VideoCodecStatus videoCodecStatus4 = VideoCodecStatus.REQUEST_SLI;
                    }
                }
                this.textureDrawer.release();
                this.textureDrawer = null;
                this.videoFrameDrawer.release();
                this.videoFrameDrawer = null;
                EglBase14 eglBase14 = this.textureEglBase;
                if (eglBase14 != null) {
                    eglBase14.release();
                    this.textureEglBase = null;
                }
                Surface surface = this.textureInputSurface;
                if (surface != null) {
                    surface.release();
                    this.textureInputSurface = null;
                }
                this.outputBuilders.clear();
                this.codec = null;
                this.outputThread = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.encodeThreadChecker.detachThread();
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus releaseResource() {
        Logging.m469e(TAG, "HardwareVideoEncoder releaseResource");
        this.running = false;
        Thread thread = this.outputThread;
        if (thread != null && !ThreadUtils.joinUninterruptibly(thread, 5000L)) {
            Logging.m469e(TAG, "Media encoder release timeout");
        }
        BlockingDeque<EncodedImage.Builder> blockingDeque = this.outputBuilders;
        if (blockingDeque != null) {
            blockingDeque.clear();
        }
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.isNeedUpdateShareContext = true;
        return VideoCodecStatus.OK;
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        int sum = bitrateAllocation.getSum();
        Log.e(TAG, "resetCodec setRateAllocation:Bitrate = " + sum + ";framerate=" + i);
        this.bitrateAdjuster.setTargets(sum, i);
        return VideoCodecStatus.OK;
    }

    @Override // com.momo.rtcbase.VideoEncoder
    public void updateSharedContext(EglBase.Context context) {
        this.useSurfaceMode = true;
        EglBase14.Context context2 = (EglBase14.Context) context;
        if (this.sharedContext != context2 || this.textureEglBase == null) {
            Logging.m468d(TAG, "need release codec");
            this.isNeedUpdateShareContext = true;
        }
        this.sharedContext = context2;
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.resetCodecPreTime = 0L;
        this.isNeedUpdateShareContext = false;
        this.bitrateMode = 0;
        this.isUseVbr = true;
        this.resetCodecInterval = 0;
        this.needresetCodec = false;
        this.enableCQ = false;
        this.codecSync = new Object();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.resetCodecInterval = 0;
        this.enableCQ = false;
        threadChecker.detachThread();
    }
}
