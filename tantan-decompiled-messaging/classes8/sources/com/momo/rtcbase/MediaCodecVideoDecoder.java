package com.momo.rtcbase;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import l.dxc0;
import l.ibe;
import l.q2j;
import l.qkq0;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Deprecated
public class MediaCodecVideoDecoder {
    private static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    private static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String FORMAT_KEY_STRIDE = "stride";
    private static final String H264_MIME_TYPE = "video/avc";
    private static final long MAX_DECODE_TIME_MS = 200;
    private static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "MediaCodecVideoDecoder";
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors = 0;
    private static EglBase eglBase = null;
    private static MediaCodecVideoDecoderErrorCallback errorCallback = null;
    private static MediaCodecVideoDecoder runningInstance = null;
    private static final String supportedMediaTekH264HighProfileHwCodecPrefix = "OMX.MTK.";
    private int colorFormat;
    private final Queue<TimeStamps> decodeStartTimeMs = new ArrayDeque();
    private final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new ArrayDeque();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private TextureListener textureListener;
    private int width;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static final String supportedQcomH264HighProfileHwCodecPrefix = "OMX.qcom.";
    private static final String supportedExynosH264HighProfileHwCodecPrefix = "OMX.Exynos.";
    private static final String[] supportedVp9HwCodecPrefixes = {supportedQcomH264HighProfileHwCodecPrefix, supportedExynosH264HighProfileHwCodecPrefix};
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final List<Integer> supportedColorList = Arrays.asList(19, 21, 2141391872, Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka), Integer.valueOf(COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m));

    public static class DecodedOutputBuffer {
        private final long decodeTimeMs;
        private final long endDecodeTimeMs;
        private final int index;
        private final long ntpTimeStampMs;
        private final int offset;
        private final long presentationTimeStampMs;
        private final int size;
        private final long timeStampMs;

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getIndex() {
            return this.index;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getOffset() {
            return this.offset;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getSize() {
            return this.size;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getTimestampMs() {
            return this.timeStampMs;
        }
    }

    public static class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final long timeStampMs;
        private final VideoFrame.Buffer videoFrameBuffer;

        public DecodedTextureBuffer(VideoFrame.Buffer buffer, long j, long j2, long j3, long j4, long j5) {
            this.videoFrameBuffer = buffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getFrameDelayMs() {
            return this.frameDelayMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getTimeStampMs() {
            return this.timeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public VideoFrame.Buffer getVideoFrameBuffer() {
            return this.videoFrameBuffer;
        }
    }

    public static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    public static class HwDecoderFactory implements VideoDecoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoDecoder.isVp8HwSupported()) {
                Logging.m468d(MediaCodecVideoDecoder.TAG, "VP8 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isVp9HwSupported()) {
                Logging.m468d(MediaCodecVideoDecoder.TAG, "VP9 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.m468d(MediaCodecVideoDecoder.TAG, "H.264 High Profile HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoDecoder.isH264HwSupported()) {
                Logging.m468d(MediaCodecVideoDecoder.TAG, "H.264 HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo videoCodecInfo2 : videoCodecInfoArr) {
                if (isSameCodec(videoCodecInfo2, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (!videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                return false;
            }
            if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
            }
            return true;
        }

        @Override // com.momo.rtcbase.VideoDecoderFactory
        public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
            if (isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                Logging.m468d(MediaCodecVideoDecoder.TAG, "Create HW video decoder for " + videoCodecInfo.name);
                return new WrappedNativeVideoDecoder() { // from class: com.momo.rtcbase.MediaCodecVideoDecoder.HwDecoderFactory.1
                    @Override // com.momo.rtcbase.WrappedNativeVideoDecoder, com.momo.rtcbase.VideoDecoder
                    public long createNativeVideoDecoder() {
                        return MediaCodecVideoDecoder.nativeCreateDecoder(videoCodecInfo.name, MediaCodecVideoDecoder.useSurface());
                    }
                };
            }
            Logging.m468d(MediaCodecVideoDecoder.TAG, "No HW video decoder for codec " + videoCodecInfo.name);
            return null;
        }

        @Override // com.momo.rtcbase.VideoDecoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    public class TextureListener implements VideoSink {
        private DecodedOutputBuffer bufferToRender;
        private final Object newFrameLock = new Object();
        private DecodedTextureBuffer renderedBuffer;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.m469e(MediaCodecVideoDecoder.TAG, "Unexpected addBufferToRender() called while waiting for a texture.");
                qkq0.a("Waiting for a texture.");
            }
        }

        public DecodedTextureBuffer dequeueTextureBuffer(int i) {
            DecodedTextureBuffer decodedTextureBuffer;
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null && i > 0 && isWaitingForTexture()) {
                    try {
                        this.newFrameLock.wait(i);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    decodedTextureBuffer = this.renderedBuffer;
                    this.renderedBuffer = null;
                } else {
                    decodedTextureBuffer = this.renderedBuffer;
                    this.renderedBuffer = null;
                }
                throw th;
            }
            return decodedTextureBuffer;
        }

        public boolean isWaitingForTexture() {
            boolean z;
            synchronized (this.newFrameLock) {
                z = this.bufferToRender != null;
            }
            return z;
        }

        @Override // com.momo.rtcbase.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            synchronized (this.newFrameLock) {
                try {
                    if (this.renderedBuffer != null) {
                        Logging.m469e(MediaCodecVideoDecoder.TAG, "Unexpected onFrame() called while already holding a texture.");
                        throw new IllegalStateException("Already holding a texture.");
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    buffer.retain();
                    this.renderedBuffer = new DecodedTextureBuffer(buffer, this.bufferToRender.presentationTimeStampMs, this.bufferToRender.timeStampMs, this.bufferToRender.ntpTimeStampMs, this.bufferToRender.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                    this.bufferToRender = null;
                    this.newFrameLock.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                try {
                    DecodedTextureBuffer decodedTextureBuffer = this.renderedBuffer;
                    if (decodedTextureBuffer != null) {
                        decodedTextureBuffer.getVideoFrameBuffer().release();
                        this.renderedBuffer = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.surfaceTextureHelper.dispose();
        }

        public void setSize(int i, int i2) {
            this.surfaceTextureHelper.setTextureSize(i, i2);
        }
    }

    public static class TimeStamps {
        private final long decodeStartTimeMs;
        private final long ntpTimeStampMs;
        private final long timeStampMs;

        public TimeStamps(long j, long j2, long j3) {
            this.decodeStartTimeMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_UNKNOWN,
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        @CalledByNative("VideoCodecType")
        public static VideoCodecType fromNativeIndex(int i) {
            return values()[i];
        }
    }

    @CalledByNative
    public MediaCodecVideoDecoder() {
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (this.dequeuedSurfaceOutputBuffers.isEmpty() || this.textureListener.isWaitingForTexture()) {
            return;
        }
        DecodedOutputBuffer decodedOutputBufferRemove = this.dequeuedSurfaceOutputBuffers.remove();
        this.textureListener.addBufferToRender(decodedOutputBufferRemove);
        this.mediaCodec.releaseOutputBuffer(decodedOutputBufferRemove.index, true);
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        StringBuilder sb = new StringBuilder("MediaCodecVideoDecoder previously operated on ");
        sb.append(this.mediaCodecThread);
        q2j.a(sb, " but is now called on ", Thread.currentThread());
    }

    public static VideoDecoderFactory createFactory() {
        return new DefaultVideoDecoderFactory(new HwDecoderFactory());
    }

    @CalledByNativeUnchecked
    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException e) {
            Logging.m470e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    @CalledByNativeUnchecked
    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        long j;
        int integer;
        int integer2;
        checkOnMediaCodecThread();
        if (this.decodeStartTimeMs.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i));
            if (iDequeueOutputBuffer == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.m468d(TAG, "Decoder output buffers changed: " + this.outputBuffers.length);
                if (this.hasDecodedFirstFrame) {
                    upk0.a("Unexpected output buffer change event.");
                    return null;
                }
            } else {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer == -1) {
                        return null;
                    }
                    this.hasDecodedFirstFrame = true;
                    TimeStamps timeStampsRemove = this.decodeStartTimeMs.remove();
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - timeStampsRemove.decodeStartTimeMs;
                    if (jElapsedRealtime > MAX_DECODE_TIME_MS) {
                        Logging.m469e(TAG, "Very high decode time: " + jElapsedRealtime + "ms. Q size: " + this.decodeStartTimeMs.size() + ". Might be caused by resuming H264 decoding after a pause.");
                        j = 200L;
                    } else {
                        j = jElapsedRealtime;
                    }
                    return new DecodedOutputBuffer(iDequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs / 1000, timeStampsRemove.timeStampMs, timeStampsRemove.ntpTimeStampMs, j, SystemClock.elapsedRealtime());
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Logging.m468d(TAG, "Decoder format changed: " + outputFormat.toString());
                if (outputFormat.containsKey(FORMAT_KEY_CROP_LEFT) && outputFormat.containsKey(FORMAT_KEY_CROP_RIGHT) && outputFormat.containsKey(FORMAT_KEY_CROP_BOTTOM) && outputFormat.containsKey(FORMAT_KEY_CROP_TOP)) {
                    integer = (outputFormat.getInteger(FORMAT_KEY_CROP_RIGHT) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_LEFT);
                    integer2 = (outputFormat.getInteger(FORMAT_KEY_CROP_BOTTOM) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_TOP);
                } else {
                    integer = outputFormat.getInteger("width");
                    integer2 = outputFormat.getInteger("height");
                }
                if (this.hasDecodedFirstFrame && (integer != this.width || integer2 != this.height)) {
                    throw new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2);
                }
                this.width = integer;
                this.height = integer2;
                TextureListener textureListener = this.textureListener;
                if (textureListener != null) {
                    textureListener.setSize(integer, integer2);
                }
                if (!useSurface() && outputFormat.containsKey("color-format")) {
                    this.colorFormat = outputFormat.getInteger("color-format");
                    Logging.m468d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                    if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                        dxc0.a("Non supported color format: ", this.colorFormat);
                        return null;
                    }
                }
                if (outputFormat.containsKey(FORMAT_KEY_STRIDE)) {
                    this.stride = outputFormat.getInteger(FORMAT_KEY_STRIDE);
                }
                if (outputFormat.containsKey(FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = outputFormat.getInteger(FORMAT_KEY_SLICE_HEIGHT);
                }
                Logging.m468d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    @CalledByNativeUnchecked
    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        checkOnMediaCodecThread();
        if (!useSurface()) {
            qkq0.a("dequeueTexture() called for byte buffer decoding.");
            return null;
        }
        DecodedOutputBuffer decodedOutputBufferDequeueOutputBuffer = dequeueOutputBuffer(i);
        if (decodedOutputBufferDequeueOutputBuffer != null) {
            this.dequeuedSurfaceOutputBuffers.add(decodedOutputBufferDequeueOutputBuffer);
        }
        MaybeRenderDecodedTextureBuffer();
        DecodedTextureBuffer decodedTextureBufferDequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i);
        if (decodedTextureBufferDequeueTextureBuffer != null) {
            MaybeRenderDecodedTextureBuffer();
            return decodedTextureBufferDequeueTextureBuffer;
        }
        if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
            return null;
        }
        this.droppedFrames++;
        DecodedOutputBuffer decodedOutputBufferRemove = this.dequeuedSurfaceOutputBuffers.remove();
        if (i > 0) {
            Logging.m472w(TAG, "Draining decoder. Dropping frame with TS: " + decodedOutputBufferRemove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
        } else {
            Logging.m472w(TAG, "Too many output buffers " + this.dequeuedSurfaceOutputBuffers.size() + ". Dropping frame with TS: " + decodedOutputBufferRemove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
        }
        this.mediaCodec.releaseOutputBuffer(decodedOutputBufferRemove.index, false);
        return new DecodedTextureBuffer(null, decodedOutputBufferRemove.presentationTimeStampMs, decodedOutputBufferRemove.timeStampMs, decodedOutputBufferRemove.ntpTimeStampMs, decodedOutputBufferRemove.decodeTimeMs, SystemClock.elapsedRealtime() - decodedOutputBufferRemove.endDecodeTimeMs);
    }

    public static void disableH264HwCodec() {
        Logging.m472w(TAG, "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        Logging.m472w(TAG, "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.m472w(TAG, "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    public static void disposeEglContext() {
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
            eglBase = null;
        }
    }

    private static DecoderProperties findDecoder(String str, String[] strArr) {
        MediaCodecInfo codecInfoAt;
        Logging.m468d(TAG, "Trying to find HW decoder for mime " + str);
        int i = 0;
        while (true) {
            String name = null;
            if (i >= MediaCodecList.getCodecCount()) {
                Logging.m468d(TAG, "No HW decoder found for mime " + str);
                return null;
            }
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m470e(TAG, "Cannot retrieve decoder codec info", e);
                codecInfoAt = null;
            }
            if (codecInfoAt != null && !codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equals(str)) {
                        name = codecInfoAt.getName();
                        break;
                    }
                }
                if (name == null) {
                    continue;
                } else {
                    Logging.m468d(TAG, "Found candidate decoder ".concat(name));
                    for (String str3 : strArr) {
                        if (name.startsWith(str3)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                                for (int i2 : capabilitiesForType.colorFormats) {
                                    Logging.m471v(TAG, "   Color: 0x" + Integer.toHexString(i2));
                                }
                                Iterator<Integer> it = supportedColorList.iterator();
                                while (it.hasNext()) {
                                    int iIntValue = it.next().intValue();
                                    for (int i3 : capabilitiesForType.colorFormats) {
                                        if (i3 == iIntValue) {
                                            Logging.m468d(TAG, "Found target decoder " + name + ". Color: 0x" + Integer.toHexString(i3));
                                            return new DecoderProperties(name, i3);
                                        }
                                    }
                                }
                                break;
                            } catch (IllegalArgumentException e2) {
                                Logging.m470e(TAG, "Cannot retrieve decoder capabilities", e2);
                            }
                        }
                    }
                }
            }
            i++;
        }
    }

    @CalledByNativeUnchecked
    private boolean initDecode(VideoCodecType videoCodecType, int i, int i2) {
        String[] strArrSupportedH264HwCodecPrefixes;
        String str;
        SurfaceTextureHelper surfaceTextureHelperCreate;
        if (this.mediaCodecThread != null) {
            upk0.a("initDecode: Forgot to release()?");
            return false;
        }
        if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
            strArrSupportedH264HwCodecPrefixes = supportedVp8HwCodecPrefixes();
            str = VP8_MIME_TYPE;
        } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
            strArrSupportedH264HwCodecPrefixes = supportedVp9HwCodecPrefixes;
            str = VP9_MIME_TYPE;
        } else {
            if (videoCodecType != VideoCodecType.VIDEO_CODEC_H264) {
                ibe.a("initDecode: Non-supported codec ", videoCodecType);
                return false;
            }
            strArrSupportedH264HwCodecPrefixes = supportedH264HwCodecPrefixes();
            str = H264_MIME_TYPE;
        }
        DecoderProperties decoderPropertiesFindDecoder = findDecoder(str, strArrSupportedH264HwCodecPrefixes);
        if (decoderPropertiesFindDecoder == null) {
            ibe.a("Cannot find HW decoder for ", videoCodecType);
            return false;
        }
        Logging.m468d(TAG, "Java initDecode: " + videoCodecType + " : " + i + " x " + i2 + ". Color: 0x" + Integer.toHexString(decoderPropertiesFindDecoder.colorFormat) + ". Use Surface: " + useSurface());
        runningInstance = this;
        this.mediaCodecThread = Thread.currentThread();
        try {
            this.width = i;
            this.height = i2;
            this.stride = i;
            this.sliceHeight = i2;
            if (useSurface() && (surfaceTextureHelperCreate = SurfaceTextureHelper.create("Decoder SurfaceTextureHelper", eglBase.getEglBaseContext())) != null) {
                TextureListener textureListener = new TextureListener(surfaceTextureHelperCreate);
                this.textureListener = textureListener;
                textureListener.setSize(i, i2);
                this.surface = new Surface(surfaceTextureHelperCreate.getSurfaceTexture());
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
            if (!useSurface()) {
                mediaFormatCreateVideoFormat.setInteger("color-format", decoderPropertiesFindDecoder.colorFormat);
            }
            Logging.m468d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
            MediaCodec mediaCodecCreateByCodecName = MediaCodecVideoEncoder.createByCodecName(decoderPropertiesFindDecoder.codecName);
            this.mediaCodec = mediaCodecCreateByCodecName;
            if (mediaCodecCreateByCodecName == null) {
                Logging.m469e(TAG, "Can not create media decoder");
                return false;
            }
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, this.surface, (MediaCrypto) null, 0);
            this.mediaCodec.start();
            this.colorFormat = decoderPropertiesFindDecoder.colorFormat;
            this.outputBuffers = this.mediaCodec.getOutputBuffers();
            this.inputBuffers = this.mediaCodec.getInputBuffers();
            this.decodeStartTimeMs.clear();
            this.hasDecodedFirstFrame = false;
            this.dequeuedSurfaceOutputBuffers.clear();
            this.droppedFrames = 0;
            Logging.m468d(TAG, "Input buffers: " + this.inputBuffers.length + ". Output buffers: " + this.outputBuffers.length);
            return true;
        } catch (IllegalStateException e) {
            Logging.m470e(TAG, "initDecode failed", e);
            return false;
        }
    }

    public static boolean isH264HighProfileHwSupported() {
        if (hwDecoderDisabledTypes.contains(H264_MIME_TYPE)) {
            return false;
        }
        return (findDecoder(H264_MIME_TYPE, new String[]{supportedQcomH264HighProfileHwCodecPrefix}) == null && findDecoder(H264_MIME_TYPE, new String[]{supportedExynosH264HighProfileHwCodecPrefix}) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        return (hwDecoderDisabledTypes.contains(H264_MIME_TYPE) || findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp8HwSupported() {
        return (hwDecoderDisabledTypes.contains(VP8_MIME_TYPE) || findDecoder(VP8_MIME_TYPE, supportedVp8HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwDecoderDisabledTypes.contains(VP9_MIME_TYPE) || findDecoder(VP9_MIME_TYPE, supportedVp9HwCodecPrefixes) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateDecoder(String str, boolean z);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.m468d(TAG, "MediaCodecVideoDecoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.m468d(TAG, stackTraceElement.toString());
            }
        }
    }

    @CalledByNativeUnchecked
    private boolean queueInputBuffer(int i, int i2, long j, long j2, long j3) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i].position(0);
            this.inputBuffers[i].limit(i2);
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j2, j3));
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            Logging.m470e(TAG, "decode failed", e);
            return false;
        }
    }

    @CalledByNativeUnchecked
    private void release() {
        Logging.m468d(TAG, "Java releaseDecoder. Total number of dropped frames: " + this.droppedFrames);
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.momo.rtcbase.MediaCodecVideoDecoder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logging.m468d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.m468d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread done");
                } catch (Exception e) {
                    Logging.m470e(MediaCodecVideoDecoder.TAG, "Media decoder release failed", e);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
            Logging.m469e(TAG, "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.m469e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (useSurface()) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        Logging.m468d(TAG, "Java releaseDecoder done");
    }

    @CalledByNativeUnchecked
    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            upk0.a("Incorrect reset call for non-initialized decoder.");
            return;
        }
        Logging.m468d(TAG, "Java reset: " + i + " x " + i2);
        this.mediaCodec.flush();
        this.width = i;
        this.height = i2;
        TextureListener textureListener = this.textureListener;
        if (textureListener != null) {
            textureListener.setSize(i, i2);
        }
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    @CalledByNativeUnchecked
    private void returnDecodedOutputBuffer(int i) throws IllegalStateException {
        checkOnMediaCodecThread();
        if (useSurface()) {
            qkq0.a("returnDecodedOutputBuffer() called for surface decoding.");
        } else {
            this.mediaCodec.releaseOutputBuffer(i, false);
        }
    }

    public static void setEglContext(EglBase.Context context) {
        if (eglBase != null) {
            Logging.m472w(TAG, "Egl context already set.");
            eglBase.release();
        }
        eglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.m468d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private static final String[] supportedH264HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(supportedQcomH264HighProfileHwCodecPrefix);
        arrayList.add("OMX.Intel.");
        arrayList.add(supportedExynosH264HighProfileHwCodecPrefix);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static final String[] supportedVp8HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(supportedQcomH264HighProfileHwCodecPrefix);
        arrayList.add("OMX.Nvidia.");
        arrayList.add(supportedExynosH264HighProfileHwCodecPrefix);
        arrayList.add("OMX.Intel.");
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean useSurface() {
        return eglBase != null;
    }

    @CalledByNative
    public int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public ByteBuffer[] getInputBuffers() {
        return this.inputBuffers;
    }

    @CalledByNative
    public ByteBuffer[] getOutputBuffers() {
        return this.outputBuffers;
    }

    @CalledByNative
    public int getSliceHeight() {
        return this.sliceHeight;
    }

    @CalledByNative
    public int getStride() {
        return this.stride;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }
}
