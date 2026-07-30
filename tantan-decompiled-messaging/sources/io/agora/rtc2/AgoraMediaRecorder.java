package io.agora.rtc2;

import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import io.agora.rtc2.internal.RtcEngineImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraMediaRecorder {
    public static final int CONTAINER_MP4 = 1;
    public static final int RECORDER_REASON_CONFIG_CHANGED = 4;
    public static final int RECORDER_REASON_NONE = 0;
    public static final int RECORDER_REASON_NO_STREAM = 2;
    public static final int RECORDER_REASON_OVER_MAX_DURATION = 3;
    public static final int RECORDER_REASON_WRITE_FAILED = 1;
    public static final int RECORDER_STATE_ERROR = -1;
    public static final int RECORDER_STATE_START = 2;
    public static final int RECORDER_STATE_STOP = 3;
    public static final int STREAM_TYPE_AUDIO = 1;
    public static final int STREAM_TYPE_BOTH = 3;
    public static final int STREAM_TYPE_VIDEO = 2;
    String mChannelId;
    WeakReference<RtcEngineImpl> mEngineReference;
    boolean mIsLocal = false;
    RecorderStreamInfo mStreamInfo;

    public static class MediaRecorderConfiguration {
        public int channel_num;
        public int containerFormat;
        public int fps;
        public int height;
        public int maxDurationMs;
        public int recorderInfoUpdateInterval;
        public int sample_rate;
        public String storagePath;
        public int streamType;
        public int videoSourceType;
        public int width;

        public MediaRecorderConfiguration(String str, int i, int i2, int i3, int i4) {
            this.storagePath = str;
            this.containerFormat = i;
            this.streamType = i2;
            this.maxDurationMs = i3;
            this.recorderInfoUpdateInterval = i4;
            this.width = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            this.height = 720;
            this.fps = 30;
            this.sample_rate = 48000;
            this.channel_num = 1;
            this.videoSourceType = 0;
        }

        public MediaRecorderConfiguration(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.storagePath = str;
            this.containerFormat = i;
            this.streamType = i2;
            this.maxDurationMs = i3;
            this.recorderInfoUpdateInterval = i4;
            this.width = i5;
            this.height = i6;
            this.fps = i7;
            this.sample_rate = i8;
            this.channel_num = i9;
            this.videoSourceType = i10;
        }
    }

    public AgoraMediaRecorder(RtcEngineImpl rtcEngineImpl, RecorderStreamInfo recorderStreamInfo) {
        this.mEngineReference = new WeakReference<>(rtcEngineImpl);
        this.mStreamInfo = recorderStreamInfo;
        if (recorderStreamInfo.channelId == null) {
            recorderStreamInfo.channelId = "";
        }
    }

    public static String getChannelId(RecorderStreamInfo recorderStreamInfo) {
        if (recorderStreamInfo != null) {
            return recorderStreamInfo.channelId;
        }
        return null;
    }

    public static int getStreamType(RecorderStreamInfo recorderStreamInfo) {
        if (recorderStreamInfo != null) {
            return recorderStreamInfo.recorderStreamType;
        }
        return 0;
    }

    public static int getUserId(RecorderStreamInfo recorderStreamInfo) {
        if (recorderStreamInfo != null) {
            return recorderStreamInfo.uid;
        }
        return 0;
    }

    public void release() {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            rtcEngineImpl.releaseRecorder(getChannelId(this.mStreamInfo), getUserId(this.mStreamInfo), true);
        }
        this.mEngineReference = null;
    }

    public int setMediaRecorderObserver(IMediaRecorderCallback iMediaRecorderCallback) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.setMediaRecorderObserver(iMediaRecorderCallback, getUserId(this.mStreamInfo), getChannelId(this.mStreamInfo), true, getStreamType(this.mStreamInfo));
        }
        this.mEngineReference = null;
        return -7;
    }

    public int startRecording(MediaRecorderConfiguration mediaRecorderConfiguration) {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.startRecording(mediaRecorderConfiguration.storagePath, mediaRecorderConfiguration.containerFormat, mediaRecorderConfiguration.streamType, mediaRecorderConfiguration.maxDurationMs, mediaRecorderConfiguration.recorderInfoUpdateInterval, getUserId(this.mStreamInfo), getChannelId(this.mStreamInfo), true, getStreamType(this.mStreamInfo), mediaRecorderConfiguration.width, mediaRecorderConfiguration.height, mediaRecorderConfiguration.fps, mediaRecorderConfiguration.sample_rate, mediaRecorderConfiguration.channel_num, mediaRecorderConfiguration.videoSourceType);
        }
        this.mEngineReference = null;
        return -7;
    }

    public int stopRecording() {
        RtcEngineImpl rtcEngineImpl;
        WeakReference<RtcEngineImpl> weakReference = this.mEngineReference;
        if (weakReference != null && (rtcEngineImpl = weakReference.get()) != null) {
            return rtcEngineImpl.stopRecording(getChannelId(this.mStreamInfo), getUserId(this.mStreamInfo), true, getStreamType(this.mStreamInfo));
        }
        this.mEngineReference = null;
        return -7;
    }
}
