package io.agora.rtc2.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.utils2.NetUtil;
import io.agora.utils2.internal.Logging;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleMediaPlayerSource {
    private static final int DEQUEUE_OR_DECODE_TIMEOUT_US = 1000;
    private static final int EXTRACTOR_TIMEOUT_MS = 2000;
    private static final List<String> HW_EXCEPTION_MODELS = Arrays.asList("Lenovo S90-u", "CHM-CL00", "CHM-TL00H", "CHM-UL00", "E6533", "HUAWEI CRR-UL00", "HUAWEI MT7-TL00", "HONOR H30-L01", "GN3001", "SCH-I869", "SM-G7509");
    private static final List<String> HW_UNSUPPORTED_MIMES = Arrays.asList(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_WMA);
    private static final boolean IS_DEBUG = false;
    private static final String PREFIX_ASSETS = "/assets/";
    private static final String PREFIX_DOCUMENT = "content://";
    private static final String TAG = "SMPS";
    private MediaCodec mAudioDecoder;
    final int mAudioFrameSendInterval;
    ByteBuffer mByteBuffer;
    private MediaExtractorWrapper mExtractor;
    private volatile boolean mIsExtractorEndOfStream;
    ByteBuffer mJitterByteBuffer;
    private final SparseArray<MediaStreamInfoWrapper> mMediaStreamInfoMap = new SparseArray<>();
    private int mBytesPerSample = -1;
    private int mAudioSampleRate = -1;
    private int mAudioChannels = -1;
    private long mDurationMs = -1;
    private long mPlayPositionInMicroseconds = -1;

    public static class MediaExtractorWrapper {
        private final Handler mHandler;
        private final MediaExtractor mMediaExtractor;
        private volatile boolean mPrepared;
        private final String threadName;

        public MediaExtractorWrapper() {
            String str = "MediaExtractor-" + new Random().nextInt();
            this.threadName = str;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
            this.mMediaExtractor = new MediaExtractor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean setDataSource(final String str) throws InterruptedException {
            Logging.m87216d(SimpleMediaPlayerSource.TAG, "setDataSource()");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final boolean zStartsWith = str.startsWith("/assets/");
            final boolean zStartsWith2 = str.startsWith("content://");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.m87216d(SimpleMediaPlayerSource.TAG, "setDataSource in thread " + MediaExtractorWrapper.this.threadName + "  url: " + str);
                    try {
                        Context applicationContext = ContextUtils.getApplicationContext();
                        if (zStartsWith && applicationContext != null) {
                            AssetFileDescriptor assetFileDescriptorOpenFd = applicationContext.getAssets().openFd(str.substring(8));
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        } else if (!zStartsWith2 || applicationContext == null) {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(str);
                        } else {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(applicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
                        }
                        MediaExtractorWrapper.this.mPrepared = true;
                    } catch (Exception e) {
                        Logging.m87224w(SimpleMediaPlayerSource.TAG, "setDataSource fail: " + e.toString());
                    }
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            Logging.m87216d(SimpleMediaPlayerSource.TAG, "setDataSource complete");
            return this.mPrepared;
        }

        public void advance() {
            checkPrepared();
            this.mMediaExtractor.advance();
        }

        public void checkPrepared() {
            if (this.mPrepared) {
                return;
            }
            qkq0.m175383a("mMediaExtractor hasn't prepared");
        }

        public long getSampleTime() {
            checkPrepared();
            return this.mMediaExtractor.getSampleTime();
        }

        public int getTrackCount() {
            checkPrepared();
            return this.mMediaExtractor.getTrackCount();
        }

        public MediaFormat getTrackFormat(int i) {
            checkPrepared();
            return this.mMediaExtractor.getTrackFormat(i);
        }

        public int readSampleData(ByteBuffer byteBuffer, int i) {
            checkPrepared();
            return this.mMediaExtractor.readSampleData(byteBuffer, i);
        }

        public void release() {
            Logging.m87216d(SimpleMediaPlayerSource.TAG, "release()");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (MediaExtractorWrapper.this.mMediaExtractor != null) {
                            MediaExtractorWrapper.this.mMediaExtractor.release();
                        }
                    } catch (Exception e) {
                        Logging.m87220e(SimpleMediaPlayerSource.TAG, "release media extractor exception.", e);
                    }
                    MediaExtractorWrapper.this.mHandler.getLooper().quit();
                    Logging.m87216d(SimpleMediaPlayerSource.TAG, "mediaExtractor released in thread " + MediaExtractorWrapper.this.threadName);
                }
            });
        }

        public void seekTo(long j, int i) {
            checkPrepared();
            this.mMediaExtractor.seekTo(j, i);
        }

        public void selectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.selectTrack(i);
        }

        public void unselectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.unselectTrack(i);
        }
    }

    public static class MediaStreamInfoWrapper extends MediaStreamInfo {

        @NonNull
        private MediaFormat format;

        public MediaStreamInfoWrapper(@NonNull MediaFormat mediaFormat) {
            this.format = mediaFormat;
        }

        @NonNull
        public MediaFormat getFormat() {
            return this.format;
        }
    }

    public @interface PlayerError {
        public static final int PLAYER_REASON_CODEC_NOT_SUPPORTED = -7;
        public static final int PLAYER_REASON_INTERNAL = -2;
        public static final int PLAYER_REASON_INTERRUPTED = -13;
        public static final int PLAYER_REASON_INVALID_ARGUMENTS = -1;
        public static final int PLAYER_REASON_INVALID_CONNECTION_STATE = -11;
        public static final int PLAYER_REASON_INVALID_MEDIA_SOURCE = -4;
        public static final int PLAYER_REASON_INVALID_STATE = -9;
        public static final int PLAYER_REASON_NONE = 0;
        public static final int PLAYER_REASON_NO_RESOURCE = -3;
        public static final int PLAYER_REASON_OBJ_NOT_INITIALIZED = -6;
        public static final int PLAYER_REASON_SRC_BUFFER_UNDERFLOW = -12;
        public static final int PLAYER_REASON_UNKNOWN_STREAM_TYPE = -5;
        public static final int PLAYER_REASON_URL_NOT_FOUND = -10;
        public static final int PLAYER_REASON_VIDEO_RENDER_FAILED = -8;
    }

    public static class SMPSIntervalData {

        @Nullable
        private ByteBuffer byteBuffer = null;
        private boolean isEndOfStream = false;
        private boolean isError = false;

        @Nullable
        @CalledByNative("SMPSIntervalData")
        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        @CalledByNative("SMPSIntervalData")
        public boolean isEndOfStream() {
            return this.isEndOfStream;
        }

        @CalledByNative("SMPSIntervalData")
        public boolean isError() {
            return this.isError;
        }
    }

    @CalledByNative
    public SimpleMediaPlayerSource(int i) {
        if (i <= 0) {
            ig3.m135964a("interval illegal");
            throw null;
        }
        this.mAudioFrameSendInterval = i;
        reset();
    }

    private boolean acquireFrames(@NonNull ByteBuffer byteBuffer) {
        String str;
        if (!this.mIsExtractorEndOfStream) {
            int iDequeueInputBuffer = this.mAudioDecoder.dequeueInputBuffer(1000L);
            if (iDequeueInputBuffer < 0) {
                Logging.m87224w(TAG, "wait for next available input buffer timeout");
            } else {
                int sampleData = this.mExtractor.readSampleData(this.mAudioDecoder.getInputBuffers()[iDequeueInputBuffer], 0);
                if (sampleData < 0) {
                    Logging.m87224w(TAG, "no more samples are available");
                    this.mAudioDecoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.mIsExtractorEndOfStream = true;
                } else {
                    long sampleTime = this.mExtractor.getSampleTime();
                    this.mPlayPositionInMicroseconds = sampleTime;
                    this.mAudioDecoder.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, sampleTime, 0);
                    this.mExtractor.advance();
                }
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.mAudioDecoder.dequeueOutputBuffer(bufferInfo, 1000L);
        if (iDequeueOutputBuffer < 0) {
            if (iDequeueOutputBuffer == -3) {
                str = "output buffers changed";
            } else {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer == -1) {
                        str = "info try again later";
                    }
                    return true;
                }
                str = "output format changed";
            }
            Logging.m87216d(TAG, str);
            return true;
        }
        ByteBuffer byteBuffer2 = this.mAudioDecoder.getOutputBuffers()[iDequeueOutputBuffer];
        byteBuffer2.position(bufferInfo.offset);
        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.put(byteBuffer2);
        this.mAudioDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
        if ((bufferInfo.flags & 4) == 0) {
            return true;
        }
        Logging.m87224w(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        return false;
    }

    private boolean checkMimeTypeSupported(@NonNull MediaExtractorWrapper mediaExtractorWrapper) {
        int trackCount = mediaExtractorWrapper.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractorWrapper.getTrackFormat(i).getString(IMediaFormat.KEY_MIME);
            if (string.startsWith("audio") && HW_UNSUPPORTED_MIMES.contains(string)) {
                return false;
            }
        }
        return true;
    }

    private static int findAudioTrackAndFillStreamInfo(@NonNull SparseArray<MediaStreamInfoWrapper> sparseArray, @NonNull MediaExtractorWrapper mediaExtractorWrapper, @NonNull String str) {
        int i;
        MediaStreamInfoWrapper audioTrackInfo;
        int trackCount = mediaExtractorWrapper.getTrackCount();
        Logging.m87216d(TAG, "track count : " + trackCount);
        int i2 = -1;
        for (int i3 = 0; i3 < trackCount; i3++) {
            MediaFormat trackFormat = mediaExtractorWrapper.getTrackFormat(i3);
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            Logging.m87216d(TAG, "track : " + i3 + " type : " + string);
            if (string.startsWith("audio")) {
                audioTrackInfo = getAudioTrackInfo(trackFormat);
                i = i3;
            } else {
                if (string.startsWith("video")) {
                    MediaStreamInfoWrapper videoTrackInfo = getVideoTrackInfo(trackFormat);
                    i = i2;
                    audioTrackInfo = videoTrackInfo;
                }
            }
            if (audioTrackInfo.getDuration() == 0 && !str.startsWith("http")) {
                audioTrackInfo.setDuration(getLocalFileDuration(str));
            }
            sparseArray.put(i3, audioTrackInfo);
            i2 = i;
        }
        return i2;
    }

    @NonNull
    public static MediaStreamInfoWrapper getAudioTrackInfo(@NonNull MediaFormat mediaFormat) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(mediaFormat);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO));
        if (mediaFormat.containsKey(IMediaFormat.KEY_MIME)) {
            mediaStreamInfoWrapper.setCodecName(mediaFormat.getString(IMediaFormat.KEY_MIME));
        }
        if (mediaFormat.containsKey(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
            mediaStreamInfoWrapper.setLanguage(mediaFormat.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE));
        }
        if (mediaFormat.containsKey("sample-rate")) {
            int integer = mediaFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            mediaStreamInfoWrapper.setAudioSampleRate(integer);
        }
        if (mediaFormat.containsKey("channel-count")) {
            mediaStreamInfoWrapper.setAudioChannels(mediaFormat.getInteger("channel-count"));
        }
        if (mediaFormat.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(mediaFormat.getLong("durationUs") / 1000);
        }
        int integer2 = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : 2;
        if (integer2 == 2) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(2);
            return mediaStreamInfoWrapper;
        }
        if (integer2 == 3) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(1);
            return mediaStreamInfoWrapper;
        }
        if (integer2 != 4) {
            return mediaStreamInfoWrapper;
        }
        mediaStreamInfoWrapper.setAudioBytesPerSample(4);
        return mediaStreamInfoWrapper;
    }

    private static long getLocalFileDuration(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    private static int getMaxOutputBufferSize(@NonNull MediaCodec mediaCodec) {
        int iMax = 0;
        for (ByteBuffer byteBuffer : mediaCodec.getOutputBuffers()) {
            iMax = Math.max(byteBuffer.capacity(), iMax);
        }
        return iMax;
    }

    @NonNull
    private static MediaStreamInfoWrapper getVideoTrackInfo(@NonNull MediaFormat mediaFormat) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(mediaFormat);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_VIDEO));
        if (mediaFormat.containsKey(IMediaFormat.KEY_MIME)) {
            mediaStreamInfoWrapper.setCodecName(mediaFormat.getString(IMediaFormat.KEY_MIME));
        }
        if (mediaFormat.containsKey(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
            mediaStreamInfoWrapper.setLanguage(mediaFormat.getString(IjkMediaMeta.IJKM_KEY_LANGUAGE));
        }
        if (mediaFormat.containsKey("height")) {
            mediaStreamInfoWrapper.setVideoHeight(mediaFormat.getInteger("height"));
        }
        if (mediaFormat.containsKey("width")) {
            mediaStreamInfoWrapper.setVideoWidth(mediaFormat.getInteger("width"));
        }
        if (mediaFormat.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(mediaFormat.getLong("durationUs") / 1000);
        }
        return mediaStreamInfoWrapper;
    }

    private int openImpl(@NonNull String str, long j) throws Throwable {
        String str2;
        MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
        this.mExtractor = mediaExtractorWrapper;
        if (mediaExtractorWrapper.setDataSource(str) && checkMimeTypeSupported(this.mExtractor)) {
            this.mMediaStreamInfoMap.clear();
            int iFindAudioTrackAndFillStreamInfo = findAudioTrackAndFillStreamInfo(this.mMediaStreamInfoMap, this.mExtractor, str);
            MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(iFindAudioTrackAndFillStreamInfo);
            if (mediaStreamInfoWrapper == null) {
                str2 = "Failed to find audio track";
            } else {
                MediaFormat format = mediaStreamInfoWrapper.getFormat();
                this.mDurationMs = mediaStreamInfoWrapper.getDuration();
                this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
                this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
                this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
                Logging.m87216d(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
                if (this.mBytesPerSample == 0) {
                    str2 = "Failed to check bytesPerSample";
                } else {
                    this.mExtractor.selectTrack(iFindAudioTrackAndFillStreamInfo);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(format.getString(IMediaFormat.KEY_MIME));
                    this.mAudioDecoder = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(format, (Surface) null, (MediaCrypto) null, 0);
                    this.mAudioDecoder.start();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getMaxOutputBufferSize(this.mAudioDecoder) * 2);
                    this.mJitterByteBuffer = byteBufferAllocate;
                    byteBufferAllocate.flip();
                    int i = this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval);
                    int i2 = this.mBytesPerSample * i * this.mAudioChannels;
                    this.mByteBuffer = ByteBuffer.allocateDirect(i2);
                    Logging.m87216d(TAG, " samplesPerChannel: " + i + ", bytesPerInterval: " + i2);
                    if (this.mByteBuffer.hasArray()) {
                        if (j > 0) {
                            this.mExtractor.seekTo(j * 1000, 2);
                        }
                        return 0;
                    }
                    str2 = "ByteBuffer does not have backing array.";
                }
            }
            Logging.m87219e(TAG, str2);
        } else {
            Logging.m87224w(TAG, "Failed to setDataSource");
        }
        reset();
        return -2;
    }

    private void reset() {
        Logging.m87216d(TAG, "reset()");
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper != null) {
            mediaExtractorWrapper.release();
            this.mExtractor = null;
        }
        MediaCodec mediaCodec = this.mAudioDecoder;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                Logging.m87220e(TAG, "Media decoder stop failed", e);
            }
            try {
                this.mAudioDecoder.release();
            } catch (Exception e2) {
                Logging.m87220e(TAG, "Media decoder release failed", e2);
            }
            this.mAudioDecoder = null;
        }
        ByteBuffer byteBuffer = this.mJitterByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.mJitterByteBuffer = null;
        }
        ByteBuffer byteBuffer2 = this.mByteBuffer;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.mByteBuffer = null;
        }
        this.mMediaStreamInfoMap.clear();
        this.mAudioSampleRate = -1;
        this.mAudioChannels = -1;
        this.mBytesPerSample = -1;
        this.mDurationMs = -1L;
        this.mIsExtractorEndOfStream = false;
    }

    private int selectAudioTrackWithPos(int i, long j) {
        String str;
        int trackCount = this.mExtractor.getTrackCount();
        Logging.m87222i(TAG, "selectAudioTrackWithPos audioTrackIndex: " + i + ", startPos: " + j + " ms, TrackCount: " + trackCount);
        MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(i);
        if (mediaStreamInfoWrapper == null || mediaStreamInfoWrapper.getMediaStreamType() != Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO)) {
            str = "Failed to find audio track";
        } else {
            for (int i2 = 0; i2 < trackCount; i2++) {
                this.mExtractor.unselectTrack(i2);
            }
            this.mDurationMs = mediaStreamInfoWrapper.getDuration();
            this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
            this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
            this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
            Logging.m87222i(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
            if (this.mBytesPerSample != 0) {
                this.mExtractor.selectTrack(i);
                if (j > 0) {
                    this.mExtractor.seekTo(j * 1000, 2);
                }
                return 0;
            }
            str = "Failed to check bytesPerSample";
        }
        Logging.m87219e(TAG, str);
        reset();
        return -2;
    }

    @NonNull
    @CalledByNative
    public SMPSIntervalData acquireIntervalData() {
        SMPSIntervalData sMPSIntervalData = new SMPSIntervalData();
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer == null) {
            Logging.m87216d(TAG, "Failed to acquireIntervalData, invalidate frame buffer");
        } else {
            try {
                byteBuffer.clear();
                int iCapacity = this.mByteBuffer.capacity();
                if (this.mJitterByteBuffer.remaining() < iCapacity) {
                    this.mJitterByteBuffer.compact();
                    sMPSIntervalData.isEndOfStream = !acquireFrames(this.mJitterByteBuffer);
                    this.mJitterByteBuffer.flip();
                }
                if (this.mJitterByteBuffer.remaining() >= iCapacity) {
                    this.mByteBuffer.put(this.mJitterByteBuffer.array(), this.mJitterByteBuffer.arrayOffset() + this.mJitterByteBuffer.position(), iCapacity);
                    this.mByteBuffer.flip();
                    ByteBuffer byteBuffer2 = this.mJitterByteBuffer;
                    byteBuffer2.position(byteBuffer2.position() + iCapacity);
                    sMPSIntervalData.byteBuffer = this.mByteBuffer;
                }
                return sMPSIntervalData;
            } catch (Throwable th) {
                Logging.m87220e(TAG, "Failed to acquireIntervalData", th);
            }
        }
        sMPSIntervalData.isError = true;
        return sMPSIntervalData;
    }

    @CalledByNative
    public boolean checkFormatInfoChanged() {
        boolean z = false;
        try {
            MediaFormat outputFormat = this.mAudioDecoder.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            z = (this.mAudioSampleRate == integer && this.mAudioChannels == integer2) ? false : true;
            if (z) {
                this.mAudioSampleRate = integer;
                this.mAudioChannels = integer2;
                ByteBuffer byteBuffer = this.mByteBuffer;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    this.mByteBuffer = null;
                }
                this.mByteBuffer = ByteBuffer.allocateDirect((this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval)) * this.mBytesPerSample * this.mAudioChannels);
            }
            return z;
        } catch (Exception e) {
            Logging.m87219e(TAG, "Error when checking file's new format");
            e.printStackTrace();
            return z;
        }
    }

    @CalledByNative
    public void dispose() {
        reset();
    }

    @CalledByNative
    public int getAudioChannels() {
        return this.mAudioChannels;
    }

    @CalledByNative
    public int getAudioSampleRate() {
        return this.mAudioSampleRate;
    }

    @CalledByNative
    public int getBytesPerSample() {
        return this.mBytesPerSample;
    }

    @CalledByNative
    public long getDuration() {
        return this.mDurationMs;
    }

    @CalledByNative
    public long getPlayPosition() {
        if (this.mExtractor != null) {
            return this.mPlayPositionInMicroseconds / 1000;
        }
        return -1L;
    }

    @CalledByNative
    public int getStreamCount() {
        return this.mMediaStreamInfoMap.size();
    }

    @CalledByNative
    public MediaStreamInfo getStreamInfo(int i) {
        return this.mMediaStreamInfoMap.get(i);
    }

    @CalledByNative
    public int open(String str, long j) {
        String str2;
        Logging.m87216d(TAG, "open() url, startPos: " + j);
        List<String> list = HW_EXCEPTION_MODELS;
        String str3 = Build.MODEL;
        if (list.contains(str3)) {
            str2 = "Not support for " + str3;
        } else {
            if (!TextUtils.isEmpty(str)) {
                reset();
                if (URLUtil.isNetworkUrl(str) && ((str = NetUtil.getEncodedUrl(str)) == null || !NetUtil.testNetworkUrlAvailable(str))) {
                    Logging.m87224w(TAG, "Fail to open, 404 for url");
                    return -2;
                }
                try {
                    return openImpl(str, j);
                } catch (Throwable unused) {
                    Logging.m87224w(TAG, "Failed to open");
                    reset();
                    return -2;
                }
            }
            str2 = "Fail to open, empty url";
        }
        Logging.m87224w(TAG, str2);
        return -1;
    }

    @CalledByNative
    public int seek(long j) {
        Logging.m87216d(TAG, "seek() " + j);
        long duration = getDuration();
        if (j >= duration) {
            j = duration;
        }
        long j2 = 1000 * j;
        this.mPlayPositionInMicroseconds = j2;
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            return -1;
        }
        mediaExtractorWrapper.seekTo(j2, 1);
        if (this.mAudioDecoder != null && j == 0 && this.mIsExtractorEndOfStream) {
            this.mIsExtractorEndOfStream = false;
            this.mAudioDecoder.flush();
        }
        return 0;
    }

    @CalledByNative
    public int selectAudioTrack(int i) {
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            Logging.m87219e(TAG, "null extractor");
            return -1;
        }
        try {
            return selectAudioTrackWithPos(i, mediaExtractorWrapper.getSampleTime() / 1000);
        } catch (Exception e) {
            Logging.m87220e(TAG, "selectAudioTrackWithPos failed:", e);
            return -1;
        }
    }
}
