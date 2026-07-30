package io.agora.base.internal.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.tencent.ugc.TXRecordCommon;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorController;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p149l.C19450qa;
import p149l.ii5;
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;

    @Nullable
    @TargetApi(24)
    private static AudioRecordingCallbackImpl mRecordingCallback;
    private static AudioManager mockedAudioManager;
    private final AudioManager audioManager;
    private HardwareEarMonitorController mHardwareEarMonitorController;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private final Object recorderCallbackLock = new Object();

    @Nullable
    private AudioAttributes custAudioAttr = null;
    private boolean initialized = false;
    private boolean mNeedUpdateVolume = false;
    private int mCacheAudioMode = 0;

    @Nullable
    private VolumeChangeReceiver mVolumeChangeReceiver = null;
    private int playoutVolume = 0;

    @TargetApi(24)
    public class AudioRecordingCallbackImpl extends AudioManager.AudioRecordingCallback {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public AudioRecordingCallbackImpl() {
            Logging.m87208d(WebRtcAudioManager.TAG, "AudioRecordingCallbackImpl ctor " + this);
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            Logging.m87208d(WebRtcAudioManager.TAG, "onRecordingConfigChanged " + list.size());
            if (webRtcAudioManager == null) {
                return;
            }
            synchronized (webRtcAudioManager.recorderCallbackLock) {
                try {
                    if (!webRtcAudioManager.initialized) {
                        Logging.m87213w(WebRtcAudioManager.TAG, "dont handle recording callback when destroy!");
                        return;
                    }
                    super.onRecordingConfigChanged(list);
                    Iterator<AudioRecordingConfiguration> it = list.iterator();
                    while (it.hasNext()) {
                        Logging.m87208d(WebRtcAudioManager.TAG, " recording client session ID: " + it.next().getClientAudioSessionId());
                    }
                    webRtcAudioManager.nativeNotifyRecordingStateChanged(list.size(), webRtcAudioManager.nativeAudioManager);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public int registerRtcAudioManager(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
            return 0;
        }
    }

    public class DelayVolumeTask implements Runnable {
        private VolumeChangeReceiver volumeChangeReceiver;

        public DelayVolumeTask(VolumeChangeReceiver volumeChangeReceiver) {
            this.volumeChangeReceiver = volumeChangeReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            VolumeChangeReceiver volumeChangeReceiver;
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (applicationContext != null && (volumeChangeReceiver = this.volumeChangeReceiver) != null) {
                    applicationContext.unregisterReceiver(volumeChangeReceiver);
                    Logging.m87208d(WebRtcAudioManager.TAG, "unregister volume change receiver " + this.volumeChangeReceiver);
                }
            } catch (Exception e) {
                Logging.m87210e(WebRtcAudioManager.TAG, "unregister VolumeChangeReceiver failed ", e);
            }
        }
    }

    public static class VolumeChangeReceiver extends BroadcastReceiver {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public VolumeChangeReceiver(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            if (webRtcAudioManager == null) {
                return;
            }
            webRtcAudioManager.updatePlayoutVolumeChange(true);
        }
    }

    @CalledByNative
    public WebRtcAudioManager(long j, int i, boolean z) {
        Logging.m87208d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo() + ", this " + this);
        this.nativeAudioManager = j;
        StringBuilder sb = new StringBuilder("bufferPeriodMs is: ");
        sb.append(i);
        Logging.m87213w(TAG, sb.toString());
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            this.audioManager = audioManager;
        } else {
            this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        }
        if (ContextUtils.getApplicationContext() != null) {
            if (mRecordingCallback == null) {
                AudioRecordingCallbackImpl audioRecordingCallbackImpl = new AudioRecordingCallbackImpl();
                mRecordingCallback = audioRecordingCallbackImpl;
                this.audioManager.registerAudioRecordingCallback(audioRecordingCallbackImpl, null);
            }
            mRecordingCallback.registerRtcAudioManager(this);
        }
        this.mHardwareEarMonitorController = new HardwareEarMonitorController(z);
        Logging.m87213w(TAG, "ctor finish");
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        y9g0.m213537a("Expected condition to be true");
    }

    @CalledByNative
    private boolean checkRecordingPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || applicationContext.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    @CalledByNative
    private void dispose() {
        Logging.m87208d(TAG, "dispose" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            this.mHardwareEarMonitorController.terminate();
            enableChatMode(false);
            AudioRecordingCallbackImpl audioRecordingCallbackImpl = mRecordingCallback;
            if (audioRecordingCallbackImpl != null) {
                audioRecordingCallbackImpl.registerRtcAudioManager(null);
            }
            synchronized (this.recorderCallbackLock) {
                this.initialized = false;
            }
        }
    }

    @CalledByNative
    private boolean enableChatMode(boolean z) {
        assertTrue(this.audioManager != null);
        int i = z ? 3 : 0;
        this.mCacheAudioMode = i;
        try {
            Logging.m87208d(TAG, "set audio mode to: " + WebRtcAudioUtils.modeToString(i) + " curr: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            this.audioManager.setMode(i);
        } catch (Exception e) {
            Logging.m87209e(TAG, "audioManager.setMode failed: " + e.getMessage());
        }
        return true;
    }

    private int getAudioMode() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        try {
            return audioManager.getMode();
        } catch (Exception e) {
            Logging.m87210e(TAG, "get audio mode failed ", e);
            return 0;
        }
    }

    private int getBufferSizeByPeriod(int i, int i2) {
        return (i / 1000) * i2;
    }

    @CalledByNative
    private int getCallState() {
        if (mockedAudioManager == null) {
            return getAudioMode();
        }
        Logging.m87208d(TAG, "mock call state: " + mockedAudioManager.getRingerMode());
        return mockedAudioManager.getRingerMode();
    }

    @CalledByNative
    private int getCurrentPlayoutDevices() {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(this.audioManager, Integer.valueOf(getStreamType()))).intValue();
            Logging.m87208d(TAG, "get current playout devices: " + iIntValue);
            return iIntValue;
        } catch (Exception e) {
            Logging.m87210e(TAG, "Error getDevicesForStream! ", e);
            return iIntValue;
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    @TargetApi(17)
    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        assertTrue(isLowLatencyOutputSupported());
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() && (property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 * 2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m87208d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return TXRecordCommon.AUDIO_SAMPLERATE_8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.m87208d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateOnJellyBeanMR10OrHigher = WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() ? getSampleRateOnJellyBeanMR10OrHigher() : WebRtcAudioUtils.getDefaultSampleRateHz();
        Logging.m87208d(TAG, "Sample rate is set to " + sampleRateOnJellyBeanMR10OrHigher + " Hz");
        return sampleRateOnJellyBeanMR10OrHigher;
    }

    @TargetApi(17)
    private int getSampleRateOnJellyBeanMR10OrHigher() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    private int getStreamType() {
        return this.mCacheAudioMode == 3 ? 0 : 3;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @CalledByNative
    private boolean init() {
        Logging.m87208d(TAG, "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        this.mHardwareEarMonitorController.initialize();
        this.initialized = true;
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.m87213w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    @CalledByNative
    private boolean isCommunicationModeEnabled() {
        return getAudioMode() == 3;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    @TargetApi(23)
    private boolean isProAudioSupported() {
        return WebRtcAudioUtils.runningOnMarshmallowOrHigher() && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    @SuppressLint({"NewApi"})
    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    @CalledByNative
    private boolean monitorPlayoutVolumeChange(boolean z) {
        Logging.m87208d(TAG, "monitorPlayoutVolumeChange monitor: " + z);
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null && mockedAudioManager == null) {
            if (z) {
                int streamType = getStreamType();
                int streamVolume = this.audioManager.getStreamVolume(streamType);
                if (this.mVolumeChangeReceiver == null) {
                    try {
                        this.mVolumeChangeReceiver = new VolumeChangeReceiver(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                        ii5.m136342l(applicationContext, this.mVolumeChangeReceiver, intentFilter);
                        C19450qa.m173679c(this, streamVolume, streamType);
                        Logging.m87208d(TAG, "register volume change receiver " + this.mVolumeChangeReceiver);
                        return true;
                    } catch (Exception e) {
                        Logging.m87210e(TAG, "Unable to create VolumeChangeReceiver, ", e);
                    }
                }
                return false;
            }
            try {
                if (this.mVolumeChangeReceiver != null) {
                    new Thread(new DelayVolumeTask(this.mVolumeChangeReceiver)).start();
                    this.mVolumeChangeReceiver = null;
                }
                return true;
            } catch (Exception e2) {
                Logging.m87210e(TAG, "unregister VolumeChangeReceiver failed ", e2);
            }
        }
        return false;
    }

    private native void nativeNotifyPlayoutVolumeChange(int i, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyRecordingStateChanged(int i, long j);

    private void notifyPlayoutVolumeChange(int i, int i2) {
        if (this.playoutVolume == i) {
            return;
        }
        this.playoutVolume = i;
        int streamMaxVolume = this.audioManager.getStreamMaxVolume(i2);
        if (streamMaxVolume != 0) {
            i = (int) ((i / streamMaxVolume) * 255.0f);
        }
        nativeNotifyPlayoutVolumeChange(i, this.nativeAudioManager);
        Logging.m87208d(TAG, "notifyPlayoutVolumeChange: " + i);
    }

    @CalledByNative
    private int setAudioAttrCtx(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        Logging.m87208d(TAG, "audioAttr " + audioAttributes.toString());
        this.custAudioAttr = audioAttributes;
        return 0;
    }

    @VisibleForTesting
    public static void setMockedAudioManager(AudioManager audioManager) {
        mockedAudioManager = audioManager;
    }

    @CalledByNative
    private boolean setStreamVolume(int i) {
        Logging.m87208d(TAG, "setStreamVolume(" + i + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.m87209e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(getStreamType(), i, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayoutVolumeChange(boolean z) {
        this.mNeedUpdateVolume = z;
    }

    @CalledByNative
    private boolean updatePlayoutVolumeIfNeeded() {
        if (!this.mNeedUpdateVolume) {
            return false;
        }
        int streamType = getStreamType();
        int streamVolume = this.audioManager.getStreamVolume(streamType);
        C19450qa.m173679c(this, streamVolume, streamType);
        this.mNeedUpdateVolume = false;
        Logging.m87208d(TAG, "playout volume is update to " + streamVolume + ", type " + streamType);
        return true;
    }

    @CalledByNative
    public int enableHardwareEarMonitor(boolean z) {
        return this.mHardwareEarMonitorController.enableHardwareEarMonitor(z);
    }

    @Nullable
    public AudioAttributes getCustAudioAttrCtx() {
        return this.custAudioAttr;
    }

    @CalledByNative
    public boolean isHardwareEarMonitorSupported() {
        return this.mHardwareEarMonitorController.isHardwareEarMonitorSupported();
    }

    public boolean isLowLatencyInputSupported() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }

    @CalledByNative
    public int setHardwareEarMonitorVolume(int i) {
        return this.mHardwareEarMonitorController.setHardwareEarMonitorVolume(i);
    }
}
