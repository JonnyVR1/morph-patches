package com.p069ss.bytertc.audio.device.webrtc;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.p069ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver;
import com.p069ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver;
import com.tencent.ugc.TXRecordCommon;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p149l.y9g0;

/* JADX INFO: loaded from: classes12.dex */
public class WebRtcAudioManager implements VolumeChangedObserver.OnVolumeChangedListener, MicMuteChangedObserver.OnMicMuteChangedListener {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static int MAX_VOLUMED = 0;
    private static int MAX_VOLUMED_VOIP = 0;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = false;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private int apiLevel;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private Set<NativeRecordCallbackInfo> lastRecordcallbackInfos;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private WebRtcAudioEarBack mByteAudioEarback;
    private MicMuteChangedObserver mMicMuteChangedObserver;
    private VolumeChangedObserver mVolumeChangedObserver;
    private long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private int preferAudioLayer = 0;
    private AudioManagerRecordingCallback recordingCallback = null;
    private AudioManagerPhoneStateListener phoneStateListener = null;
    private int microphoneVolume = 100;
    private int curMode = -2;
    private boolean modeInvalid = false;

    public class AudioManagerPhoneStateListener extends PhoneStateListener {
        private int callState = 0;

        public AudioManagerPhoneStateListener() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            synchronized (WebRtcAudioManager.this) {
                try {
                    int i2 = this.callState;
                    this.callState = i;
                    RXLogging.m5690i(WebRtcAudioManager.TAG, "onCallStateChanged, from: " + i2 + ", to: " + i);
                    if (i != 0) {
                        if ((i == 1 || i == 2) && i2 == 0) {
                            if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                                RXLogging.m5690i(WebRtcAudioManager.TAG, "startPhoneCall");
                                WebRtcAudioManager webRtcAudioManager = WebRtcAudioManager.this;
                                webRtcAudioManager.nativeOnPhoneCallStart(webRtcAudioManager.nativeAudioManager);
                            } else {
                                RXLogging.m5688e(WebRtcAudioManager.TAG, "nativeAudioManager is null");
                            }
                        }
                    } else if (i2 == 1 || i2 == 2) {
                        if (WebRtcAudioManager.this.nativeAudioManager != 0) {
                            RXLogging.m5690i(WebRtcAudioManager.TAG, "endPhoneCall");
                            WebRtcAudioManager webRtcAudioManager2 = WebRtcAudioManager.this;
                            webRtcAudioManager2.nativeOnPhoneCallEnd(webRtcAudioManager2.nativeAudioManager);
                        } else {
                            RXLogging.m5688e(WebRtcAudioManager.TAG, "nativeAudioManager is null");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
        }
    }

    public class AudioManagerRecordingCallback extends AudioManager.AudioRecordingCallback {
        private WebRtcAudioManager manager;

        public AudioManagerRecordingCallback(WebRtcAudioManager webRtcAudioManager) {
            this.manager = webRtcAudioManager;
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < list.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = list.get(i);
                NativeRecordCallbackInfo nativeRecordCallbackInfo = new NativeRecordCallbackInfo();
                nativeRecordCallbackInfo.audio_session_id = audioRecordingConfiguration.getClientAudioSessionId();
                nativeRecordCallbackInfo.client_audio_source = audioRecordingConfiguration.getClientAudioSource();
                int i2 = Build.VERSION.SDK_INT;
                int i3 = -1;
                nativeRecordCallbackInfo.audio_source = i2 >= 29 ? audioRecordingConfiguration.getAudioSource() : -1;
                if (i2 >= 29) {
                    i3 = audioRecordingConfiguration.isClientSilenced() ? 1 : 0;
                }
                nativeRecordCallbackInfo.is_client_silenced = i3;
                hashSet.add(nativeRecordCallbackInfo);
            }
            synchronized (this.manager) {
                try {
                    if (WebRtcAudioManager.this.nativeAudioManager != 0 && (WebRtcAudioManager.this.lastRecordcallbackInfos == null || !WebRtcAudioManager.this.lastRecordcallbackInfos.equals(hashSet))) {
                        WebRtcAudioManager.this.nativeRecordCallbackChanged(hashSet.toArray(new NativeRecordCallbackInfo[hashSet.size()]), WebRtcAudioManager.this.nativeAudioManager);
                        WebRtcAudioManager.this.lastRecordcallbackInfos = hashSet;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class NativeAudioLayer {
        public static final int kAndroidAAudioAudio = 8;
        public static final int kAndroidJavaAudio = 5;
        public static final int kAndroidJavaInputAndAAudioOutputAudio = 9;
        public static final int kAndroidJavaInputAndOpenSLESOutputAudio = 7;
        public static final int kAndroidOpenSLESAudio = 6;
        public static final int kPlatformDefaultAudio = 0;

        private NativeAudioLayer() {
        }
    }

    public final class NativeRecordCallbackInfo {
        private int audio_session_id;
        private int audio_source;
        private int client_audio_source;
        private int is_client_silenced;

        private NativeRecordCallbackInfo() {
            this.audio_session_id = -1;
            this.client_audio_source = -1;
            this.audio_source = -1;
            this.is_client_silenced = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && NativeRecordCallbackInfo.class == obj.getClass()) {
                NativeRecordCallbackInfo nativeRecordCallbackInfo = (NativeRecordCallbackInfo) obj;
                if (this.audio_session_id == nativeRecordCallbackInfo.audio_session_id && this.client_audio_source == nativeRecordCallbackInfo.client_audio_source && this.audio_source == nativeRecordCallbackInfo.audio_source && this.is_client_silenced == nativeRecordCallbackInfo.is_client_silenced) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.audio_session_id), Integer.valueOf(this.client_audio_source), Integer.valueOf(this.audio_source), Integer.valueOf(this.is_client_silenced));
        }
    }

    public WebRtcAudioManager(long j) {
        synchronized (this) {
            RXLogging.m5690i(TAG, "ctor(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
            this.nativeAudioManager = j;
            AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
            this.audioManager = audioManager;
            MAX_VOLUMED = audioManager.getStreamMaxVolume(3);
            MAX_VOLUMED_VOIP = audioManager.getStreamMaxVolume(0);
            refreshAudioParameters();
            WebRtcAudioUtils.logAudioState(TAG);
        }
    }

    private int SetAudioMode(int i) {
        RXLogging.m5690i(TAG, "SetAudioMode enter, modeInvalid: " + this.modeInvalid + ", curMode: " + this.curMode + ", setMode: " + i);
        try {
            if (i != this.curMode || this.modeInvalid) {
                this.audioManager.setMode(i);
                RXLogging.m5692w(TAG, "set mode from: " + this.curMode + ", to: " + i + ", modeInvalid is: " + this.modeInvalid);
            }
            int mode = getMode();
            this.curMode = mode;
            this.modeInvalid = mode != i;
            RXLogging.m5690i(TAG, "SetAudioMode leave, modeInvalid: " + this.modeInvalid + ", curMode: " + this.curMode + ", setMode: " + i);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        y9g0.m213537a("Expected condition to be true");
    }

    private int earBackEnable(boolean z) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackEnable(z);
        }
        return -1;
    }

    private boolean earBackGetIsSupport() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackSupport();
        }
        return false;
    }

    private int earBackGetLatency() {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            return webRtcAudioEarBack.ByteAudioEarBackGetLatency();
        }
        return -1;
    }

    private void earBackInit() {
        if (this.mByteAudioEarback == null) {
            this.mByteAudioEarback = new WebRtcAudioEarBack(this);
        }
        this.mByteAudioEarback.ByteAudioEarBackInit();
    }

    private int earBackSetEffect(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackEffect(i);
        return 0;
    }

    private int earBackSetEqualizer(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackEqualizer(i);
        return 0;
    }

    private int earBackSetVolume(int i) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack == null) {
            return 0;
        }
        webRtcAudioEarBack.ByteAudioEarBackSetVolume(i);
        return 0;
    }

    private int[] getActiveRecordingSessionIds() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return new int[0];
        }
        try {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < activeRecordingConfigurations.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = activeRecordingConfigurations.get(i);
                if (audioRecordingConfiguration != null) {
                    arrayList.add(Integer.valueOf(audioRecordingConfiguration.getClientAudioSessionId()));
                }
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            return iArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return new int[0];
        }
    }

    private String getAudioDeviceInfo() {
        try {
            return "{ Audio State: audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", has mic: " + WebRtcAudioUtils.hasMicrophone() + ", music active: " + this.audioManager.isMusicActive() + ", speakerphone: " + this.audioManager.isSpeakerphoneOn() + ", headset: " + this.audioManager.isWiredHeadsetOn() + "BT SCO: " + this.audioManager.isBluetoothScoOn() + "music actived: " + this.audioManager.isMusicActive() + "permission: " + WebRtcAudioUtils.isPermissionGranted() + " bt_sco_available_off_call: " + this.audioManager.isBluetoothScoAvailableOffCall() + " }";
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return stringWriter.toString();
        }
    }

    private int getFixedDevicePlayVolume() {
        try {
            int mode = this.audioManager.getMode();
            int i = 3;
            if (mode != 0) {
                if (mode == 1) {
                    i = 2;
                } else if (mode == 2 || mode == 3) {
                    i = 0;
                }
            }
            return (int) ((((double) this.audioManager.getStreamVolume(i)) * 100.0d) / ((double) this.audioManager.getStreamMaxVolume(i)));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return -1;
        }
    }

    private int getFixedDeviceRecordVolume() {
        return this.microphoneVolume;
    }

    private int getLowLatencyInputFramesPerBuffer() {
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        if (isLowLatencyOutputSupported()) {
            try {
                property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            } catch (Exception e) {
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                RXLogging.m5688e(TAG, stringWriter.toString());
                property = "";
            }
            if (property != null && Integer.parseInt(property) != 0) {
                return Integer.parseInt(property);
            }
        }
        return 256;
    }

    private int getMicrophoneMuteState() {
        try {
            return this.audioManager.isMicrophoneMute() ? 1 : 0;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return -1;
        }
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getMode() {
        try {
            return this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return -1;
        }
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            RXLogging.m5690i(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return TXRecordCommon.AUDIO_SAMPLERATE_8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            RXLogging.m5690i(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
        RXLogging.m5690i(TAG, "Sample rate is set to " + defaultSampleRateHz + " Hz");
        return defaultSampleRateHz;
    }

    private int getPreferAudioLayer() {
        return 0;
    }

    private int getSampleRateForApiLevel() {
        String property;
        try {
            property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            property = "";
        }
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        synchronized (this) {
            try {
                RXLogging.m5690i(TAG, "init(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
                if (this.initialized) {
                    return true;
                }
                RXLogging.m5690i(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
                if (this.recordingCallback == null) {
                    AudioManagerRecordingCallback audioManagerRecordingCallback = new AudioManagerRecordingCallback(this);
                    this.recordingCallback = audioManagerRecordingCallback;
                    try {
                        this.audioManager.registerAudioRecordingCallback(audioManagerRecordingCallback, null);
                    } catch (Exception e) {
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        RXLogging.m5688e(TAG, stringWriter.toString());
                    }
                }
                registerPhoneStateListener(32);
                this.mVolumeChangedObserver = new VolumeChangedObserver(this);
                try {
                    int mode = this.audioManager.getMode();
                    if (mode == 0) {
                        onVolumeChanged(3, this.audioManager.getStreamVolume(3));
                    } else if (mode == 3) {
                        onVolumeChanged(0, this.audioManager.getStreamVolume(0));
                    }
                    this.initialized = true;
                } catch (Exception e2) {
                    StringWriter stringWriter2 = new StringWriter();
                    e2.printStackTrace(new PrintWriter(stringWriter2));
                    RXLogging.m5688e(TAG, stringWriter2.toString());
                }
                this.mMicMuteChangedObserver = new MicMuteChangedObserver(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isAAudioSupported() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        try {
            return 3 == this.audioManager.getMode();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return false;
        }
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zDeviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (zDeviceIsBlacklistedForOpenSLESUsage) {
            RXLogging.m5690i(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return zDeviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isPermissionGranted() {
        return WebRtcAudioUtils.isPermissionGranted();
    }

    private boolean isProAudioSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private boolean isRecordShouldUseVoiceRecognition() {
        return Build.BRAND.equals("samsung");
    }

    private boolean isWiredHeadsetOn() {
        try {
            return this.audioManager.isWiredHeadsetOn();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            RXLogging.m5688e(TAG, stringWriter.toString());
            return false;
        }
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, int i7, long j);

    private native void nativeOnHardwareEarbackReleased(boolean z, long j);

    private native void nativeOnHardwareEarbackSupportParamsGet(String str, long j);

    private native void nativeOnHardwareEarbackSupported(boolean z, long j);

    private native void nativeOnMicMuteChanged(boolean z, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnPhoneCallEnd(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnPhoneCallStart(long j);

    private native void nativeOnPhoneStateListenerRegisterChanged(boolean z, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRecordCallbackChanged(Object[] objArr, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPhoneStateListenerRegistered(boolean z) {
        synchronized (this) {
            try {
                if (this.nativeAudioManager != 0) {
                    RXLogging.m5690i(TAG, "dixing: notifyPhoneStateListenerRegistered: " + z + ", " + this.nativeAudioManager);
                    nativeOnPhoneStateListenerRegisterChanged(z, this.nativeAudioManager);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void onVolumeChanged(int i, int i2, long j);

    private void refreshAudioParameters() {
        storeAudioParameters();
        nativeCacheAudioParameters(this.apiLevel, this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, this.preferAudioLayer, this.nativeAudioManager);
    }

    private void registerPhoneStateListener(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ss.bytertc.audio.device.webrtc.WebRtcAudioManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (WebRtcAudioManager.this.phoneStateListener == null) {
                        WebRtcAudioManager.this.phoneStateListener = WebRtcAudioManager.this.new AudioManagerPhoneStateListener();
                    }
                    if (i == 0) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(false);
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone");
                    if (telephonyManager != null) {
                        telephonyManager.listen(WebRtcAudioManager.this.phoneStateListener, i);
                    }
                    if (i == 32) {
                        WebRtcAudioManager.this.notifyPhoneStateListenerRegistered(true);
                    }
                    RXLogging.m5690i(WebRtcAudioManager.TAG, "registerPhoneStateListener success with event: " + i);
                } catch (Throwable th) {
                    th.printStackTrace();
                    RXLogging.m5688e(WebRtcAudioManager.TAG, "registerPhoneStateListener (" + i + "), error: " + th.getCause() + ", " + th.getMessage());
                }
            }
        });
    }

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        blacklistDeviceForOpenSLESUsageIsOverridden = true;
        blacklistDeviceForOpenSLESUsage = z;
    }

    public static synchronized void setStereoInput(boolean z) {
        RXLogging.m5692w(TAG, "Overriding default input behavior: setStereoInput(" + z + ')');
        useStereoInput = z;
    }

    public static synchronized void setStereoOutput(boolean z) {
        RXLogging.m5692w(TAG, "Overriding default output behavior: setStereoOutput(" + z + ')');
        useStereoOutput = z;
    }

    private void storeAudioParameters() {
        this.apiLevel = Build.VERSION.SDK_INT;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
        this.preferAudioLayer = getPreferAudioLayer();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[Catch: all -> 0x002b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0025, B:13:0x0044, B:14:0x0046, B:16:0x004e, B:17:0x0053, B:19:0x0057, B:20:0x005c, B:22:0x0060, B:23:0x0065, B:24:0x006b, B:12:0x002e), top: B:30:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[Catch: all -> 0x002b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0025, B:13:0x0044, B:14:0x0046, B:16:0x004e, B:17:0x0053, B:19:0x0057, B:20:0x005c, B:22:0x0060, B:23:0x0065, B:24:0x006b, B:12:0x002e), top: B:30:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[Catch: all -> 0x002b, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0025, B:13:0x0044, B:14:0x0046, B:16:0x004e, B:17:0x0053, B:19:0x0057, B:20:0x005c, B:22:0x0060, B:23:0x0065, B:24:0x006b, B:12:0x002e), top: B:30:0x0003, inners: #0 }] */
    private void terminate() {
        VolumeChangedObserver volumeChangedObserver;
        MicMuteChangedObserver micMuteChangedObserver;
        WebRtcAudioEarBack webRtcAudioEarBack;
        synchronized (this) {
            RXLogging.m5690i(TAG, "terminate(" + this + ")" + WebRtcAudioUtils.getThreadInfo());
            AudioManagerRecordingCallback audioManagerRecordingCallback = this.recordingCallback;
            if (audioManagerRecordingCallback != null) {
                try {
                    this.audioManager.unregisterAudioRecordingCallback(audioManagerRecordingCallback);
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    RXLogging.m5688e(TAG, stringWriter.toString());
                }
                this.recordingCallback = null;
                registerPhoneStateListener(0);
                volumeChangedObserver = this.mVolumeChangedObserver;
                if (volumeChangedObserver != null) {
                    volumeChangedObserver.release();
                    this.mVolumeChangedObserver = null;
                }
                micMuteChangedObserver = this.mMicMuteChangedObserver;
                if (micMuteChangedObserver != null) {
                    micMuteChangedObserver.release();
                    this.mMicMuteChangedObserver = null;
                }
                webRtcAudioEarBack = this.mByteAudioEarback;
                if (webRtcAudioEarBack != null) {
                    webRtcAudioEarBack.ByteAudioEarBackRelease();
                    this.mByteAudioEarback = null;
                }
                this.nativeAudioManager = 0L;
                this.initialized = false;
            } else {
                registerPhoneStateListener(0);
                volumeChangedObserver = this.mVolumeChangedObserver;
                if (volumeChangedObserver != null) {
                    volumeChangedObserver.release();
                    this.mVolumeChangedObserver = null;
                }
                micMuteChangedObserver = this.mMicMuteChangedObserver;
                if (micMuteChangedObserver != null) {
                    micMuteChangedObserver.release();
                    this.mMicMuteChangedObserver = null;
                }
                webRtcAudioEarBack = this.mByteAudioEarback;
                if (webRtcAudioEarBack != null) {
                    webRtcAudioEarBack.ByteAudioEarBackRelease();
                    this.mByteAudioEarback = null;
                }
                this.nativeAudioManager = 0L;
                this.initialized = false;
            }
            throw th;
        }
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }

    public void onEvent(int i, int i2) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.mByteAudioEarback;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onEvent(i, i2);
        }
    }

    public void onHardwareEarbackReleased(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackReleased(z, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onHardwareEarbackSupportParamsGet(String str) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackSupportParamsGet(str, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onHardwareEarbackSupported(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnHardwareEarbackSupported(z, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.MicMuteChangedObserver.OnMicMuteChangedListener
    public void onMicMuteChanged(boolean z) {
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    nativeOnMicMuteChanged(z, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.audio.device.webrtc.observer.VolumeChangedObserver.OnVolumeChangedListener
    public void onVolumeChanged(int i, int i2) {
        double d = ((((double) i2) * 1.0d) / ((double) (i == 0 ? MAX_VOLUMED_VOIP : MAX_VOLUMED))) * 100.0d;
        synchronized (this) {
            try {
                long j = this.nativeAudioManager;
                if (j != 0) {
                    onVolumeChanged(i, (int) d, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
