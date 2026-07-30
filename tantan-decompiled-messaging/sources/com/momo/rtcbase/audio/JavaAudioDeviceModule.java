package com.momo.rtcbase.audio;

import android.content.Context;
import android.media.AudioManager;
import com.momo.rtcbase.JniCommon;
import com.momo.rtcbase.Logging;

/* JADX INFO: loaded from: classes8.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int sampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public static class Builder {
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private final Context context;
        private int sampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        private Builder(Context context) {
            this.audioSource = 7;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.sampleRate = WebRtcAudioManager.getSampleRate(audioManager);
        }

        public AudioDeviceModule createAudioDeviceModule() {
            Logging.m20197d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.m20197d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.m20197d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.m20197d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.m20197d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.m20197d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.m20197d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioRecordErrorCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioTrackErrorCallback), this.sampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setSampleRate(int i) {
            Logging.m20197d(JavaAudioDeviceModule.TAG, "Sample rate overridden to: " + i);
            this.sampleRate = i;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.m20198e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.m20198e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.sampleRate = i;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2);

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.sampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j = this.nativeAudioDeviceModule;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j = this.nativeAudioDeviceModule;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
        Logging.m20197d(TAG, "setMicrophoneMute: " + z);
        this.audioInput.setMicrophoneMute(z);
    }

    @Override // com.momo.rtcbase.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
        Logging.m20197d(TAG, "setSpeakerMute: " + z);
        this.audioOutput.setSpeakerMute(z);
    }
}
