package io.agora.rtc2;

import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenCaptureParameters {
    public boolean captureAudio = false;
    public VideoCaptureParameters videoCaptureParameters = new VideoCaptureParameters();
    public boolean captureVideo = true;
    public AudioCaptureParameters audioCaptureParameters = new AudioCaptureParameters();

    public static class AudioCaptureParameters {
        public int sampleRate = 16000;
        public int channels = 2;
        public int captureSignalVolume = 100;
        public boolean allowCaptureCurrentApp = true;

        @CalledByNative("AudioCaptureParameters")
        public int getCaptureSignalVolume() {
            return this.captureSignalVolume;
        }

        @CalledByNative("AudioCaptureParameters")
        public int getChannels() {
            return this.channels;
        }

        @CalledByNative("AudioCaptureParameters")
        public int getSampleRate() {
            return this.sampleRate;
        }

        public String toString() {
            return "AudioCaptureParameters{sampleRate=" + this.sampleRate + ", channels=" + this.channels + ", captureSignalVolume=" + this.captureSignalVolume + ", allowCaptureCurrentApp=" + this.allowCaptureCurrentApp + '}';
        }
    }

    public static class VideoCaptureParameters {
        public int bitrate = 0;
        public int framerate = 15;
        public int width = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        public int height = 720;
        public int contentHint = 1;

        @CalledByNative("VideoCaptureParameters")
        public int getBitrate() {
            return this.bitrate;
        }

        @CalledByNative("VideoCaptureParameters")
        public int getContentHint() {
            return this.contentHint;
        }

        @CalledByNative("VideoCaptureParameters")
        public int getFramerate() {
            return this.framerate;
        }

        @CalledByNative("VideoCaptureParameters")
        public int getHeight() {
            return this.height;
        }

        @CalledByNative("VideoCaptureParameters")
        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return "VideoCaptureParameters{bitrate=" + this.bitrate + ", framerate=" + this.framerate + ", width=" + this.width + ", height=" + this.height + ", contentHint=" + this.contentHint + '}';
        }
    }

    @CalledByNative
    public AudioCaptureParameters getAudioCaptureParameters() {
        return this.audioCaptureParameters;
    }

    @CalledByNative
    public VideoCaptureParameters getVideoCaptureParameters() {
        return this.videoCaptureParameters;
    }

    @CalledByNative
    public boolean isCaptureAudio() {
        return this.captureAudio;
    }

    @CalledByNative
    public boolean isCaptureVideo() {
        return this.captureVideo;
    }

    public String toString() {
        return "ScreenCaptureParameters{captureAudio=" + this.captureAudio + ", videoCaptureParameters=" + this.videoCaptureParameters + ", captureVideo=" + this.captureVideo + ", audioCaptureParameters=" + this.audioCaptureParameters + '}';
    }
}
