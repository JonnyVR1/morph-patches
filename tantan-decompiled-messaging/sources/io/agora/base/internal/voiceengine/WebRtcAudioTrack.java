package io.agora.base.internal.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import androidx.annotation.Nullable;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALCULATE_LATENCY_PERIOD = 40;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FORCE_CALC_TIME = 3;
    private static final int DEFAULT_PLAYOUT_LATENCY = 160;
    private static final int MAX_PLAYOUT_LATENCY = 400;
    private static final String TAG = "WebRtcAudioTrack [JavaAdm]";
    private final AudioManager audioManager;

    @Nullable
    private AudioTrackThread audioThread;

    @Nullable
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private int mBytesPerFrame;
    private long mFramesWritten;
    private int mLatencyCalcCount;
    private int mPlayPreviousUnderrun;
    private int mPlayoutLatency;
    private int mPlayoutLoopCounter;
    private int mUnderrunCount;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    @Nullable
    private AudioTrackRoutingListener trackRouteListener;

    @Nullable
    private AudioTrackRoutingListenerForAPI23 trackRouteListenerForAPI23;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static boolean enableLowlatencyPlayout = false;

    @Nullable
    private static WebRtcAudioManager rtcAudioManager = null;
    private static volatile boolean speakerMute = false;

    @Nullable
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;

    @Nullable
    private static ErrorCallback errorCallback = null;

    @Nullable
    private static AudioTrackRouteCallback trackRouteCallback = null;
    private int usageAttribute = DEFAULT_USAGE;
    private int streamType = 0;

    @TargetApi(21)
    private int contentType = 1;

    public interface AudioTrackRouteCallback {
        void onAudioTrackRouteNotify(int i, AudioDeviceInfo audioDeviceInfo);
    }

    public class AudioTrackRoutingListener implements AudioRouting.OnRoutingChangedListener {
        private AudioTrackRoutingListener() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            WebRtcAudioTrack.this.mLatencyCalcCount = 3;
            Logging.m87208d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioRouting] onRoutingChanged: " + type);
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

        @TargetApi(21)
        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WebRtcAudioTrack webRtcAudioTrack;
            Process.setThreadPriority(-19);
            Logging.m87208d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (true) {
                boolean z = this.keepAlive;
                webRtcAudioTrack = WebRtcAudioTrack.this;
                if (!z) {
                    break;
                }
                webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.mPlayoutLatency, WebRtcAudioTrack.this.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(iCapacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                boolean zRunningOnLollipopOrHigher = WebRtcAudioUtils.runningOnLollipopOrHigher();
                WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                int iWriteOnLollipop = zRunningOnLollipopOrHigher ? writeOnLollipop(webRtcAudioTrack2.audioTrack, WebRtcAudioTrack.this.byteBuffer, iCapacity) : writePreLollipop(webRtcAudioTrack2.audioTrack, WebRtcAudioTrack.this.byteBuffer, iCapacity);
                if (iWriteOnLollipop != iCapacity) {
                    Logging.m87209e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWriteOnLollipop);
                    if (iWriteOnLollipop < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWriteOnLollipop);
                    }
                }
                if (WebRtcAudioTrack.this.mFramesWritten == 0) {
                    Logging.m87208d(WebRtcAudioTrack.TAG, "AudioTrackThread write first frame : " + iWriteOnLollipop + " finished.");
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                WebRtcAudioTrack.access$914(webRtcAudioTrack3, iWriteOnLollipop / webRtcAudioTrack3.mBytesPerFrame);
                try {
                    if (WebRtcAudioTrack.this.mPlayoutLoopCounter % 40 == 0) {
                        WebRtcAudioTrack.this.calculateLatencyMillis();
                    }
                    WebRtcAudioTrack webRtcAudioTrack4 = WebRtcAudioTrack.this;
                    webRtcAudioTrack4.mPlayoutLoopCounter = (webRtcAudioTrack4.mPlayoutLoopCounter + 1) % 40;
                } catch (Throwable th) {
                    Logging.m87209e(WebRtcAudioTrack.TAG, "calculateLatencyMillis failed: " + th.getMessage());
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (webRtcAudioTrack.audioTrack != null) {
                Logging.m87208d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m87208d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e) {
                    Logging.m87209e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.m87208d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
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

    @CalledByNative
    public WebRtcAudioTrack(long j, Object obj) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.audioTrack = null;
        this.audioThread = null;
        this.mPlayoutLatency = 0;
        this.mFramesWritten = 0L;
        this.mBytesPerFrame = 0;
        this.mPlayoutLoopCounter = 0;
        this.mUnderrunCount = 0;
        this.mLatencyCalcCount = 0;
        this.mPlayPreviousUnderrun = 0;
        this.trackRouteListenerForAPI23 = null;
        this.trackRouteListener = null;
        threadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("ctor");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        sb.append(", rtc audio manager: ");
        WebRtcAudioManager webRtcAudioManager = (WebRtcAudioManager) obj;
        sb.append(webRtcAudioManager);
        Logging.m87208d(TAG, sb.toString());
        this.nativeAudioTrack = j;
        rtcAudioManager = webRtcAudioManager;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.trackRouteListener = new AudioTrackRoutingListener();
    }

    public static /* synthetic */ long access$914(WebRtcAudioTrack webRtcAudioTrack, long j) {
        long j2 = webRtcAudioTrack.mFramesWritten + j;
        webRtcAudioTrack.mFramesWritten = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        y9g0.m213537a("Expected condition to be true");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateLatencyMillis() {
        if (this.audioTrack == null) {
            Logging.m87209e(TAG, "audiotrack is null");
            return -1;
        }
        boolean z = true;
        boolean z2 = false;
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            int underrunCount = this.audioTrack.getUnderrunCount();
            z2 = underrunCount != this.mUnderrunCount;
            this.mUnderrunCount = underrunCount;
        }
        int i = this.mLatencyCalcCount;
        if (i > 0) {
            this.mLatencyCalcCount = i - 1;
        } else {
            z = z2;
        }
        if (!z) {
            return -1;
        }
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (!this.audioTrack.getTimestamp(audioTimestamp)) {
            Logging.m87208d(TAG, "AudioTrack Timestamp is not valid, framecount(ms): " + ((this.audioTrack.getBufferSizeInFrames() * 1000) / this.audioTrack.getSampleRate()));
            this.mPlayoutLatency = 160;
            return 160;
        }
        long sampleRate = ((this.mFramesWritten - audioTimestamp.framePosition) * 1000000000) / ((long) this.audioTrack.getSampleRate());
        int iNanoTime = (int) (((audioTimestamp.nanoTime + sampleRate) - System.nanoTime()) / 1000000);
        int i2 = iNanoTime + 20;
        Logging.m87208d(TAG, "AudioTrack calculateLatencyMillis --> latencyMillis: " + iNanoTime + ",extraTime: 20,frameTimeDeltaNano: " + sampleRate + ",last latency " + this.mPlayoutLatency + ",new latency: " + i2);
        if (i2 > 0 && iNanoTime <= 400) {
            this.mPlayoutLatency = i2;
        }
        return this.mPlayoutLatency;
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.m87208d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.m87208d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate + ", enableLowlatencyPlayout " + enableLowlatencyPlayout);
        if (i != nativeOutputSampleRate) {
            Logging.m87213w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (this.usageAttribute != DEFAULT_USAGE) {
            Logging.m87213w(TAG, "A non default usage attribute is used: " + this.usageAttribute);
        }
        WebRtcAudioManager webRtcAudioManager = rtcAudioManager;
        AudioAttributes custAudioAttrCtx = webRtcAudioManager != null ? webRtcAudioManager.getCustAudioAttrCtx() : null;
        if (WebRtcAudioUtils.runningOnOreoOrHigher() && enableLowlatencyPlayout && custAudioAttrCtx != null) {
            return new AudioTrack.Builder().setPerformanceMode(enableLowlatencyPlayout ? 1 : 0).setAudioAttributes(new AudioAttributes.Builder().setUsage(this.usageAttribute).setContentType(this.contentType).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).build();
        }
        if (custAudioAttrCtx == null) {
            custAudioAttrCtx = new AudioAttributes.Builder().setUsage(this.usageAttribute).setContentType(this.contentType).build();
        }
        AudioAttributes audioAttributes = custAudioAttrCtx;
        Logging.m87208d(TAG, "AudioTrack playback attribute: " + audioAttributes.toString());
        return new AudioTrack(audioAttributes, new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(this.streamType, i, i2, 2, i3, 1);
    }

    @CalledByNative
    private boolean enableLowlatencyPlayout(boolean z) {
        enableLowlatencyPlayout = z;
        return true;
    }

    private static int getDefaultUsageAttribute() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return getDefaultUsageAttributeOnLollipopOrHigher();
        }
        return 0;
    }

    @TargetApi(21)
    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return 2;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        Logging.m87208d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    @CalledByNative
    private int getStreamVolume() {
        Logging.m87208d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(this.streamType);
    }

    @TargetApi(24)
    @CalledByNative
    private int getUnderrunCount() {
        return WebRtcAudioUtils.runningOnNougatOrHigher() ? getUnderrunCountOnNougatOrHigher() : getUnderrunCountOnLowerThanNougat();
    }

    private int getUnderrunCountOnLowerThanNougat() {
        return -1;
    }

    @TargetApi(24)
    private int getUnderrunCountOnNougatOrHigher() {
        int underrunCount;
        try {
            AudioTrack audioTrack = this.audioTrack;
            underrunCount = (audioTrack == null || audioTrack.getPlayState() != 3) ? 0 : this.audioTrack.getUnderrunCount();
        } catch (Exception e) {
            Logging.m87210e(TAG, "getUnderrun fail ", e);
        }
        int i = underrunCount - this.mPlayPreviousUnderrun;
        int i2 = i >= 0 ? i : 0;
        this.mPlayPreviousUnderrun = underrunCount;
        if (i2 > 0) {
            Logging.m87208d(TAG, "Android AudioTrack underrun count: " + i2);
        }
        return i2;
    }

    @CalledByNative
    private boolean initPlayout(int i, int i2, float f, boolean z) {
        AudioTrackRouteCallback audioTrackRouteCallback;
        Logging.m87208d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + f + ", enableLowlatencyPlayout = " + enableLowlatencyPlayout + ", chatMode = " + z + ")");
        int i3 = i2 * 2;
        this.mBytesPerFrame = i3;
        this.byteBuffer = ByteBuffer.allocateDirect(i3 * (i / 100));
        StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.m87208d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int iChannelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (((float) AudioTrack.getMinBufferSize(i, iChannelCountToConfiguration, 2)) * f);
        Logging.m87208d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            releaseAudioResources();
        }
        try {
            Logging.m87208d(TAG, "initPlayout audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                initPlayoutParametersOnLollipopOrHigher(z);
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i, iChannelCountToConfiguration, minBufferSize);
            } else {
                initPlayoutParametersOnLowerThanLollipop(z);
                this.audioTrack = createAudioTrackOnLowerThanLollipop(i, iChannelCountToConfiguration, minBufferSize);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return false;
            }
            logMainParameters();
            logMainParametersExtended();
            if (ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
                AudioDeviceInfo preferredDevice = this.audioTrack.getPreferredDevice();
                if (preferredDevice != null) {
                    Logging.m87208d(TAG, "[USB] audio track deviceType = " + preferredDevice.getType());
                } else {
                    Logging.m87208d(TAG, "[USB] audioTrack has no preferred device");
                    preferredDevice = this.audioTrack.getRoutedDevice();
                    if (preferredDevice != null) {
                        Logging.m87208d(TAG, "[USB] initPlayout-getRoutedDevice deviceType = " + preferredDevice.getType());
                    }
                }
                if (preferredDevice != null && (audioTrackRouteCallback = trackRouteCallback) != null) {
                    audioTrackRouteCallback.onAudioTrackRouteNotify(1, preferredDevice);
                }
            } else {
                Logging.m87208d(TAG, "[USB] audioTrack has no PackageManager.FEATURE_AUDIO_OUTPUT");
            }
            AudioTrackRoutingListener audioTrackRoutingListener = this.trackRouteListener;
            if (audioTrackRoutingListener != null) {
                this.audioTrack.addOnRoutingChangedListener(audioTrackRoutingListener, (Handler) null);
            }
            Logging.m87208d(TAG, "Init playout finished!");
            return true;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioTrackInitError(e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @TargetApi(21)
    private void initPlayoutParametersOnLollipopOrHigher(boolean z) {
        if (z) {
            this.contentType = 1;
            setAudioTrackUsageAttribute(2);
        } else {
            this.contentType = 2;
            setAudioTrackUsageAttribute(1);
        }
    }

    private void initPlayoutParametersOnLowerThanLollipop(boolean z) {
        if (z) {
            this.streamType = 0;
        } else {
            this.streamType = 3;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    private void logMainParameters() {
        Logging.m87208d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    @TargetApi(24)
    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            Logging.m87208d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            Logging.m87208d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    @TargetApi(24)
    private void logUnderrunCount() {
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            Logging.m87208d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, int i2, long j);

    private void releaseAudioResources() {
        Logging.m87208d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.m87209e(TAG, "Run-time playback error: " + str);
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
        Logging.m87209e(TAG, "Init playout error: " + str);
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
        Logging.m87209e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
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

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m87208d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.m87213w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    @CalledByNative
    private boolean setStreamVolume(int i) {
        Logging.m87208d(TAG, "setStreamVolume(" + i + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.m87209e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(this.streamType, i, 0);
        return true;
    }

    public static void setTrackRouteCallback(AudioTrackRouteCallback audioTrackRouteCallback) {
        Logging.m87208d(TAG, "[USB] Set AudioTrackRouteCallback");
        trackRouteCallback = audioTrackRouteCallback;
    }

    @CalledByNative
    private boolean startPlayout() {
        Logging.m87208d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            this.mFramesWritten = 0L;
            this.mUnderrunCount = 0;
            this.mPlayoutLoopCounter = 0;
            this.mLatencyCalcCount = 3;
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout() {
        Logging.m87208d(TAG, "stopPlayout");
        AudioTrackThread audioTrackThread = this.audioThread;
        if (audioTrackThread != null) {
            audioTrackThread.stopThread();
            Logging.m87208d(TAG, "Stopping the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.m87209e(TAG, "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            Logging.m87208d(TAG, "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        if (this.audioTrack != null) {
            logUnderrunCount();
            AudioTrackRoutingListener audioTrackRoutingListener = this.trackRouteListener;
            if (audioTrackRoutingListener != null) {
                this.audioTrack.removeOnRoutingChangedListener(audioTrackRoutingListener);
            }
        }
        releaseAudioResources();
        this.mPlayPreviousUnderrun = 0;
        return true;
    }

    public synchronized void setAudioTrackUsageAttribute(int i) {
        Logging.m87213w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i);
        this.usageAttribute = i;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m87208d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public class AudioTrackRoutingListenerForAPI23 implements AudioTrack.OnRoutingChangedListener {
        private AudioTrackRoutingListenerForAPI23() {
        }

        @Override // android.media.AudioTrack.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            WebRtcAudioTrack.this.mLatencyCalcCount = 3;
            Logging.m87208d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioRouting] onRoutingChanged: " + type);
        }

        @Override // android.media.AudioTrack.OnRoutingChangedListener
        public void onRoutingChanged(AudioTrack audioTrack) {
            AudioDeviceInfo preferredDevice = audioTrack.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioTrack.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            Logging.m87208d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioTrack] onRoutingChanged: " + type);
        }
    }
}
