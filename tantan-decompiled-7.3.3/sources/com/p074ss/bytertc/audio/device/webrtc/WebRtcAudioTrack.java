package com.p074ss.bytertc.audio.device.webrtc;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ExceptionUtils;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import java.nio.ByteBuffer;
import p153l.gig0;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final int INVALID_AUDIO_SESSION_ID = -1;
    private static final String TAG = "WebRtcAudioTrack";

    @Nullable
    private static ErrorCallback errorCallback;

    @Nullable
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static boolean sForbidVoip;
    private static volatile boolean speakerMute;
    private static int usageAttribute;
    private String apiResult;
    private final AudioManager audioManager;

    @Nullable
    private AudioTrackThread audioThread;

    @Nullable
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public static class AudioTrackErrorCode {
        public static final int AUDIO_TRACK_INIT_CREATE_FAIL = -203;
        public static final int AUDIO_TRACK_INIT_CREATE_INVALID_STATE = -204;
        public static final int AUDIO_TRACK_INIT_ERROR = -205;
        public static final int AUDIO_TRACK_INIT_ILLEGAL_ARGUMENTS = -202;
        public static final int AUDIO_TRACK_INIT_IS_NOT_NULL = -201;
        public static final int AUDIO_TRACK_INIT_MINBUFFER_ERROR = -200;
        public static final int AUDIO_TRACK_START_ILLEGAL_STATE = -102;
        public static final int AUDIO_TRACK_START_INVALID_STATE = -103;
        public static final int AUDIO_TRACK_START_IS_NULL = -100;
        public static final int AUDIO_TRACK_START_THREAD_NOT_NULL = -101;
        public static final int AUDIO_TRACK_SUCCESS = 0;

        private AudioTrackErrorCode() {
        }
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            if (audioTrack == null) {
                return -1;
            }
            return audioTrack.write(byteBuffer, i, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int iWriteBytes;
            if (WebRtcAudioTrack.this.audioTrack == null) {
                RXLogging.m5742e(WebRtcAudioTrack.TAG, "null audio track instance");
                this.keepAlive = false;
            } else {
                RXLogging.m5744i(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
                RXLogging.m5744i(WebRtcAudioTrack.TAG, "AudioTrack state: " + WebRtcAudioTrack.this.audioTrack.getPlayState());
            }
            Process.setThreadPriority(-19);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                synchronized (this) {
                    try {
                        if (this.keepAlive) {
                            WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                            webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                try {
                    iWriteBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, iCapacity);
                } catch (Exception e) {
                    this.keepAlive = false;
                    RXLogging.m5742e(WebRtcAudioTrack.TAG, "AudioTrack.write error, Exception: " + e.getMessage());
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write error, Exception: " + e.getMessage());
                    iWriteBytes = -1;
                }
                if (iWriteBytes != iCapacity && iWriteBytes < 0) {
                    this.keepAlive = false;
                    RXLogging.m5742e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWriteBytes);
                    WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWriteBytes);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                RXLogging.m5744i(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    RXLogging.m5744i(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e2) {
                    RXLogging.m5742e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e2.getMessage());
                }
            }
        }

        public void stopThread() {
            synchronized (this) {
                RXLogging.m5744i(WebRtcAudioTrack.TAG, "stopThread");
                this.keepAlive = false;
            }
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.apiResult = "";
        threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        gig0.m130323a("Expected condition to be true");
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        RXLogging.m5744i(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(sForbidVoip ? 3 : 0);
        RXLogging.m5744i(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            RXLogging.m5746w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            RXLogging.m5746w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return sForbidVoip ? new AudioTrack(3, i, i2, 2, i3, 1) : new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private int getAudioSessionId() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getAudioSessionId();
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "getStreamMaxVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamMaxVolume(0);
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return audioTrack.getStreamType();
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "getStreamVolume");
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, boolean z) {
        this.apiResult = "InitPlayout(sampleRate=" + i + ", channels=" + i2 + ", forbidVoip=" + z + "):";
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            RXLogging.m5744i(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ")");
            this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
            StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
            sb.append(this.byteBuffer.capacity());
            RXLogging.m5744i(TAG, sb.toString());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int iChannelCountToConfiguration = channelCountToConfiguration(i2);
            int minBufferSize = AudioTrack.getMinBufferSize(i, iChannelCountToConfiguration, 2);
            RXLogging.m5744i(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult += "AudioTrack.getMinBufferSize returns an invalid value.";
                return AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR;
            }
            if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                this.apiResult += "Conflict with existing AudioTrack.";
                return AudioTrackErrorCode.AUDIO_TRACK_INIT_IS_NOT_NULL;
            }
            try {
                this.apiResult += "minBufferSizeInBytes: " + minBufferSize;
                AudioTrack audioTrackCreateAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, iChannelCountToConfiguration, minBufferSize);
                this.audioTrack = audioTrackCreateAudioTrackOnLollipopOrHigher;
                if (audioTrackCreateAudioTrackOnLollipopOrHigher != null && audioTrackCreateAudioTrackOnLollipopOrHigher.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return 0;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                this.apiResult += "Initialization of audio track failed.";
                return this.audioTrack == null ? AudioTrackErrorCode.AUDIO_TRACK_INIT_CREATE_FAIL : AudioTrackErrorCode.AUDIO_TRACK_INIT_CREATE_INVALID_STATE;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e) + e.getMessage());
                releaseAudioResources();
                return AudioTrackErrorCode.AUDIO_TRACK_INIT_ILLEGAL_ARGUMENTS;
            }
        } catch (Exception e2) {
            RXLogging.m5747w(TAG, "initPlayout exception", e2);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2));
            this.apiResult += "initPlayout exception";
            return AudioTrackErrorCode.AUDIO_TRACK_INIT_ERROR;
        }
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        RXLogging.m5744i(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logBufferSizeInFrames() {
        RXLogging.m5744i(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        RXLogging.m5744i(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (this.audioTrack != null) {
            RXLogging.m5744i(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        RXLogging.m5744i(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        RXLogging.m5742e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        RXLogging.m5742e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        RXLogging.m5742e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        RXLogging.m5746w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
        usageAttribute = i;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        RXLogging.m5744i(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        RXLogging.m5746w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "setStreamVolume(" + i + ")");
        if (this.audioManager == null) {
            return false;
        }
        if (isVolumeFixed()) {
            RXLogging.m5742e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private int startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "startPlayout");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            RXLogging.m5742e(TAG, "null audio track object");
            return -100;
        }
        if (this.audioThread != null) {
            RXLogging.m5742e(TAG, "the previous audio thread leak");
            return -101;
        }
        this.apiResult = "StartPlayout:";
        try {
            audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return 0;
            }
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            this.apiResult += "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState();
            releaseAudioResources();
            return -103;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioTrack.play failed: " + e.getMessage();
            return -102;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        RXLogging.m5744i(TAG, "stopPlayout");
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        if (this.audioThread != null) {
            RXLogging.m5744i(TAG, "Stopping the AudioTrackThread...");
            this.audioThread.stopThread();
            RXLogging.m5744i(TAG, "interrupt the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                RXLogging.m5742e(TAG, "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState(TAG);
                this.apiResult += "Join of AudioTrackThread timed out.";
            }
            RXLogging.m5744i(TAG, "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        releaseAudioResources();
        RXLogging.m5744i(TAG, "stopPlayout release done.");
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        RXLogging.m5744i(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
