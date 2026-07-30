package com.tencent.liteav.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.audio.impl.C14155a;
import com.tencent.liteav.audio.impl.InterfaceC14156b;
import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit;
import com.tencent.liteav.audio.impl.earmonitor.InterfaceC14163a;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.p092b.InterfaceC14169a;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.structs.C14204a;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class TXCAudioEngine implements InterfaceC14156b, InterfaceC14163a {
    private static final int EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE = 10056;
    private static final int EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE = 10055;
    private static final String TAG = "AudioEngine :TXCAudioEngine_java";
    private TXSystemAudioKit mAudioKit;
    private static final long SYSTEM_AUDIO_KIT_RESTART_INTERVAL = 2000;
    static TXCAudioEngine sInstance = new TXCAudioEngine();
    protected static Context mContext = null;
    private static boolean has_trae = false;
    private static WeakReference<InterfaceC14147e> mAudioCoreDataListener = null;
    protected static final HashMap<String, WeakReference<InterfaceC14147e>> mJitterDataListenerMap = new HashMap<>();
    private static final Object mJitterDataListenerMapLock = new Object();
    protected static final HashMap<String, WeakReference<InterfaceC14146d>> mJitterEventListenerMap = new HashMap<>();
    private static final Object mJitterEventListenerMapLock = new Object();
    private static volatile boolean has_init = false;
    private final ArrayList<WeakReference<InterfaceC14169a>> mCallbackList = new ArrayList<>();
    protected boolean mDeviceIsRecording = false;
    protected boolean mIsCustomRecord = false;
    protected boolean mIsCallComed = false;

    private TXCAudioEngine() {
    }

    public static synchronized void CreateInstance(Context context, String str) {
        CreateInstanceWithoutInitDevice(context, str);
        TXCAudioEngineJNI.nativeInitAudioDevice();
    }

    public static synchronized void CreateInstanceWithoutInitDevice(Context context, String str) {
        TXCLog.m84152i(TAG, "CreateInstance: ");
        mContext = context.getApplicationContext();
        if (has_init) {
            TXCLog.m84152i(TAG, "CreateInstance already created~ ");
            return;
        }
        if (TXCAudioEngineJNI.nativeCheckTraeEngine(context)) {
            has_trae = true;
        }
        TXCAudioEngineJNI.nativeUseSysAudioDevice(!has_trae);
        if (has_trae) {
            TXCAudioEngineJNI.InitTraeEngineLibrary(context);
            TXCAudioEngineJNI.nativeSetTRAEConfig(str);
            TXCAudioEngineJNI.nativeInitBeforeEngineCreate(context);
            C14155a.m83876a().m83880a(context.getApplicationContext());
            C14155a.m83876a().m83881a(sInstance);
            TXCAudioEngineJNI.nativeNewAudioSessionDuplicate(mContext);
        } else {
            TXCMultAudioTrackPlayer.getInstance();
            TXCAudioSysRecord.getInstance();
        }
        has_init = true;
    }

    public static String buildTRAEConfig(Context context, Boolean bool, boolean z, long j) {
        String strConcat = "sharp {\n".concat("  os android\n").concat("  trae {\n").concat("    dev {\n");
        if (bool != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(strConcat);
            sb.append("  closeOpensl ");
            sb.append(bool.booleanValue() ? "n" : BaseSei.f14625Y);
            sb.append(SignParameters.NEW_LINE);
            strConcat = sb.toString();
        }
        boolean z2 = System.currentTimeMillis() - C14144b.m83853a().m83857b("timestamp_rollback_to_stable_samplerate", 0L) < j;
        TXCLog.m84153i(TAG, "low latency samplerate, enable: %b, isBlocked: %b, blockTime: %d", Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j));
        if (!z2 && z) {
            strConcat = strConcat.concat("  component 1\n").concat("  cap {\n").concat("    hw_sr 48000\n").concat("  }\n").concat("  play {\n").concat("    hw_sr 48000\n").concat("  }");
        }
        return strConcat.concat("    }\n").concat("  }\n").concat("}");
    }

    private TXSystemAudioKit createManufacturerAudioKit(Context context) {
        if (Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI)) {
            return new HuaweiAudioKit();
        }
        return null;
    }

    public static void enableAudioEarMonitoring(boolean z) {
        TXCLog.m84152i(TAG, "enableAudioEarMonitoring: " + z);
        TXCAudioEngineJNI.nativeEnableAudioEarMonitoring(z);
    }

    public static boolean enableAudioVolumeEvaluation(boolean z, int i) {
        TXCLog.m84152i(TAG, "enableAudioVolumeEvaluation : " + z + "interval:" + i);
        TXCAudioEngineJNI.nativeEnableAudioVolumeEvaluation(z, i);
        return true;
    }

    public static TXCAudioEngine getInstance() {
        return sInstance;
    }

    private static int getLowLatencySampleRate(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        try {
            return Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (NumberFormatException e) {
            TXCLog.m84150e(TAG, "can't parse low latency samplerate", e);
            return -1;
        }
    }

    public static int getMixingPlayoutVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetMixingPlayoutVolumeLevel();
    }

    private void handleAudioEvent(String str, int i, String str2, String str3) {
        if (i == EVT_AUDIO_DEVICE_ROLLBACK_TO_STABLE_SAMPLERATE) {
            C14144b.m83853a().m83856a("timestamp_rollback_to_stable_samplerate", System.currentTimeMillis());
        } else if (i == EVT_AUDIO_DEVICE_RESTART_WHEN_USING_STABLE_SAMPLERATE) {
            C14144b.m83853a().m83856a("timestamp_rollback_to_stable_samplerate", 0L);
            TXCLog.m84152i(TAG, "audio device restart when using stable samplerate");
        }
    }

    public static boolean hasTrae() {
        return has_trae;
    }

    public static void onAudioJitterBufferNotify(String str, int i, String str2) {
        InterfaceC14146d interfaceC14146d;
        synchronized (mJitterEventListenerMapLock) {
            try {
                HashMap<String, WeakReference<InterfaceC14146d>> map = mJitterEventListenerMap;
                interfaceC14146d = map.get(str) != null ? map.get(str).get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14146d != null) {
            TXCLog.m84152i(TAG, "onAudioJitterBufferNotify  cur state " + i);
            interfaceC14146d.onAudioJitterBufferNotify(str, i, str2);
        }
    }

    public static void onAudioPlayPcmData(String str, byte[] bArr, long j, int i, int i2) {
        InterfaceC14147e interfaceC14147e;
        synchronized (mJitterDataListenerMapLock) {
            try {
                HashMap<String, WeakReference<InterfaceC14147e>> map = mJitterDataListenerMap;
                interfaceC14147e = map.get(str) != null ? map.get(str).get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14147e != null) {
            interfaceC14147e.onAudioPlayPcmData(str, bArr, j, i, i2);
        }
    }

    public static void onCorePlayPcmData(byte[] bArr, long j, int i, int i2) {
        InterfaceC14147e interfaceC14147e;
        WeakReference<InterfaceC14147e> weakReference = mAudioCoreDataListener;
        if (weakReference == null || (interfaceC14147e = weakReference.get()) == null) {
            return;
        }
        interfaceC14147e.onAudioPlayPcmData(null, bArr, j, i, i2);
    }

    public static void setAudioEarMonitoringVolume(int i) {
        TXCLog.m84152i(TAG, "setAudioEarMonitoringVolume: " + i);
        TXCAudioEngineJNI.nativeSetAudioEarMonitoringVolume(i);
    }

    public static void setAudioRoute(int i) {
        TXCLog.m84152i(TAG, "setAudioRoute: " + i);
        TXCAudioEngineJNI.nativeSetAudioRoute(i);
    }

    public static void setPlayoutDataListener(InterfaceC14147e interfaceC14147e) {
        mAudioCoreDataListener = new WeakReference<>(interfaceC14147e);
        TXCAudioEngineJNI.nativeSetPlayoutDataListener(interfaceC14147e != null);
    }

    public static void setSystemVolumeType(int i) {
        TXCLog.m84152i(TAG, "setSystemVolumeType: " + i);
        TXCAudioEngineJNI.nativeSetSystemVolumeType(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemAudioKit() {
        Context context;
        if (this.mAudioKit != null || (context = mContext) == null) {
            return;
        }
        TXSystemAudioKit tXSystemAudioKitCreateManufacturerAudioKit = createManufacturerAudioKit(context);
        this.mAudioKit = tXSystemAudioKitCreateManufacturerAudioKit;
        if (tXSystemAudioKitCreateManufacturerAudioKit == null) {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
        } else {
            TXCAudioEngineJNI.nativeNotifySystemEarMonitoringInitializing();
            this.mAudioKit.initialize(mContext, this);
        }
    }

    public void EnableMixMode(boolean z) {
        TXCAudioEngineJNI.nativeEnableMixMode(z);
    }

    public void addEventCallback(WeakReference<InterfaceC14169a> weakReference) {
        if (weakReference == null) {
            return;
        }
        synchronized (this.mCallbackList) {
            this.mCallbackList.add(weakReference);
            TXCAudioEngineJNI.nativeSetEventCallbackEnabled(true);
        }
    }

    public void clean() {
        TXCAudioEngineJNI.nativeClean();
    }

    public void enableAutoRestartDevice(boolean z) {
        TXCAudioEngineJNI.nativeEnableAutoRestartDevice(z);
    }

    public boolean enableCaptureEOSMode(boolean z) {
        TXCLog.m84152i(TAG, "enableEosMode " + z);
        TXCAudioEngineJNI.nativeEnableCaptureEOSMode(z);
        return true;
    }

    public void enableEncodedDataCallback(boolean z) {
        TXCAudioEngineJNI.nativeEnableEncodedDataCallback(z);
    }

    public void enableEncodedDataPackWithTRAEHeaderCallback(boolean z) {
        TXCAudioEngineJNI.nativeEnableEncodedDataPackWithTRAEHeaderCallback(z);
    }

    public void enableSoftAEC(boolean z, int i) {
        TXCLog.m84152i(TAG, "enableSoftAEC: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAEC(i);
    }

    public void enableSoftAGC(boolean z, int i) {
        TXCLog.m84152i(TAG, "enableSoftAGC: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftAGC(i);
    }

    public void enableSoftANS(boolean z, int i) {
        TXCLog.m84152i(TAG, "enableSoftANS: enable = " + z + " level = " + i);
        if (!z) {
            i = 0;
        }
        TXCAudioEngineJNI.nativeSetSoftANS(i);
    }

    public void forceCallbackMixedPlayAudioFrame(boolean z) {
        TXCAudioEngineJNI.nativeForceCallbackMixedPlayAudioFrame(z);
    }

    public int getAECType() {
        return 2;
    }

    public TXCAudioEncoderConfig getAudioEncoderConfig() {
        return TXCAudioEngineJNI.nativeGetEncoderConfig();
    }

    public int getEncoderChannels() {
        return TXCAudioEngineJNI.nativeGetEncoderChannels();
    }

    public int getEncoderSampleRate() {
        return TXCAudioEngineJNI.nativeGetEncoderSampleRate();
    }

    public int getPlayAECType() {
        return has_trae ? 2 : 0;
    }

    public int getPlayChannels() {
        return 2;
    }

    public int getPlaySampleRate() {
        return 48000;
    }

    public int getRemotePlayoutVolumeLevel(String str) {
        if (str == null) {
            return 0;
        }
        return TXCAudioEngineJNI.nativeGetRemotePlayoutVolumeLevel(str);
    }

    public int getSoftwareCaptureVolumeLevel() {
        return TXCAudioEngineJNI.nativeGetSoftwareCaptureVolumeLevel();
    }

    public StatusBucket getStatus(int i) {
        return TXCAudioEngineJNI.getStatus(i);
    }

    public boolean isAudioDeviceCapturing() {
        boolean zNativeIsAudioDeviceCapturing = TXCAudioEngineJNI.nativeIsAudioDeviceCapturing();
        TXCLog.m84152i(TAG, "isRecording: " + zNativeIsAudioDeviceCapturing);
        return zNativeIsAudioDeviceCapturing;
    }

    public boolean isRemoteAudioPlaying(String str) {
        if (str == null) {
            return false;
        }
        return TXCAudioEngineJNI.nativeIsRemoteAudioPlaying(str);
    }

    public boolean muteLocalAudio(boolean z) {
        TXCLog.m84152i(TAG, "setRecordMute: " + z);
        TXCAudioEngineJNI.nativeMuteLocalAudio(z);
        return true;
    }

    public void muteRemoteAudio(String str, boolean z) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudio(str, z);
    }

    public void muteRemoteAudioInSpeaker(String str, boolean z) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeMuteRemoteAudioInSpeaker(str, z);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.InterfaceC14163a
    public void onAudioKitError(TXSystemAudioKit tXSystemAudioKit) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.m84152i(TAG, "onAudioKitError");
        TXSystemAudioKit tXSystemAudioKit2 = this.mAudioKit;
        if (tXSystemAudioKit2 != null) {
            tXSystemAudioKit2.stopSystemEarMonitoring();
            this.mAudioKit.uninitialize();
            this.mAudioKit = null;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.liteav.audio.TXCAudioEngine.1
            @Override // java.lang.Runnable
            public void run() {
                TXCAudioEngine.this.startSystemAudioKit();
            }
        }, SYSTEM_AUDIO_KIT_RESTART_INTERVAL);
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.InterfaceC14163a
    public void onAudioKitInitFinished(TXSystemAudioKit tXSystemAudioKit, boolean z) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.m84153i(TAG, "system audio kit init finished, ret: %b.", Boolean.valueOf(z));
        if (z) {
            return;
        }
        TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
    }

    @Override // com.tencent.liteav.audio.impl.InterfaceC14156b
    public void onCallStateChanged(int i) {
        if (i == 0) {
            TXCLog.m84152i(TAG, "TelephonyManager.CALL_STATE_IDLE!");
            if (this.mIsCallComed) {
                this.mIsCallComed = false;
                TXCAudioEngineJNI.resumeAudioCapture();
                TXAudioEffectManagerImpl.getInstance().recoverAllMusics();
                TXAudioEffectManagerImpl.getCacheInstance().recoverAllMusics();
                TXAudioEffectManagerImpl.getAutoCacheHolder().recoverAllMusics();
                return;
            }
            return;
        }
        if (i == 1) {
            TXCLog.m84152i(TAG, "TelephonyManager.CALL_STATE_RINGING!");
            return;
        }
        if (i != 2) {
            return;
        }
        TXCLog.m84152i(TAG, "TelephonyManager.CALL_STATE_OFFHOOK!");
        TXCAudioEngineJNI.pauseAudioCapture(true);
        TXAudioEffectManagerImpl.getInstance().interruptAllMusics();
        TXAudioEffectManagerImpl.getCacheInstance().interruptAllMusics();
        TXAudioEffectManagerImpl.getAutoCacheHolder().interruptAllMusics();
        this.mIsCallComed = true;
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.InterfaceC14163a
    public void onEarMonitoringInitialized(TXSystemAudioKit tXSystemAudioKit, boolean z) {
        if (this.mAudioKit != tXSystemAudioKit) {
            return;
        }
        TXCLog.m84153i(TAG, "onEarMonitoringInitialized result: %b", Boolean.valueOf(z));
        if (z) {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(this.mAudioKit);
        } else {
            TXCAudioEngineJNI.nativeSetSystemEarMonitoring(null);
        }
    }

    public void onError(String str, int i, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<InterfaceC14169a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    InterfaceC14169a interfaceC14169a = it.next().get();
                    if (interfaceC14169a != null) {
                        arrayList.add(interfaceC14169a);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC14169a) it2.next()).onError(str, i, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onEvent(String str, int i, String str2, String str3) {
        handleAudioEvent(str, i, str2, str3);
        ArrayList arrayList = new ArrayList();
        synchronized (this.mCallbackList) {
            try {
                if (this.mCallbackList.size() <= 0) {
                    return;
                }
                Iterator<WeakReference<InterfaceC14169a>> it = this.mCallbackList.iterator();
                while (it.hasNext()) {
                    InterfaceC14169a interfaceC14169a = it.next().get();
                    if (interfaceC14169a != null) {
                        arrayList.add(interfaceC14169a);
                    } else {
                        it.remove();
                    }
                }
                if (this.mCallbackList.size() <= 0) {
                    TXCAudioEngineJNI.nativeSetEventCallbackEnabled(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC14169a) it2.next()).onEvent(str, i, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int pauseAudioCapture(boolean z) {
        TXCLog.m84152i(TAG, "pauseAudioCapture: " + z);
        TXCAudioEngineJNI.pauseAudioCapture(z);
        return 0;
    }

    public void pauseLocalAudio() {
        TXCAudioEngineJNI.nativePauseLocalAudio();
    }

    public int resumeAudioCapture() {
        TXCLog.m84152i(TAG, "resumeRecord");
        TXCAudioEngineJNI.resumeAudioCapture();
        return 0;
    }

    public void resumeLocalAudio() {
        TXCAudioEngineJNI.nativeResumeLocalAudio();
    }

    public void sendCustomPCMData(byte[] bArr, int i, int i2) {
        TXCAudioEngineJNI.sendCustomPCMData(bArr, i, i2);
    }

    public boolean setAudioCaptureDataListener(InterfaceC14148f interfaceC14148f) {
        TXCLog.m84152i(TAG, "setRecordListener ");
        if (interfaceC14148f == null) {
            TXCAudioEngineJNI.setAudioCaptureDataListener(null);
            return true;
        }
        TXCAudioEngineJNI.setAudioCaptureDataListener(new WeakReference(interfaceC14148f));
        return true;
    }

    public void setAudioDumpingListener(TXCAudioEngineJNI.InterfaceC14154a interfaceC14154a) {
        TXCAudioEngineJNI.SetAudioDumpingListener(interfaceC14154a);
    }

    public boolean setAudioEncoderParam(int i, int i2) {
        TXCAudioEngineJNI.nativeSetAudioEncoderParam(i, i2);
        return true;
    }

    public void setAudioQuality(int i, int i2) {
        TXCAudioEngineJNI.nativeSetAudioQuality(i, i2);
    }

    public void setCaptureDataCallbackFormat(int i, int i2, int i3) {
        TXCLog.m84152i(TAG, "setCaptureDataCallbackFormat: sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetCaptureDataCallbackFormat(i, i2, i3);
    }

    public void setEncoderChannels(int i) {
        TXCAudioEngineJNI.nativeSetEncoderChannels(i);
    }

    public boolean setEncoderFECPercent(float f) {
        TXCAudioEngineJNI.nativeSetEncoderFECPercent(f);
        return true;
    }

    public void setEncoderSampleRate(int i) {
        TXCAudioEngineJNI.nativeSetEncoderSampleRate(i);
    }

    public void setMaxSelectedPlayStreams(int i) {
        TXCAudioEngineJNI.nativeSetMaxSelectedPlayStreams(i);
    }

    public boolean setMixingPlayoutVolume(float f) {
        TXCLog.m84152i(TAG, "setPlayoutVolume: " + f);
        TXCAudioEngineJNI.nativeSetMixingPlayoutVolume(f);
        return true;
    }

    public void setPlayoutDataCallbackFormat(int i, int i2, int i3) {
        TXCLog.m84152i(TAG, "setPlayoutDataCallbackFormat: sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetPlayoutDataCallbackFormat(i, i2, i3);
    }

    public void setRemoteAudioCacheParams(String str, boolean z, int i, int i2, int i3) {
        TXCAudioEngineJNI.nativeSetRemoteAudioCacheParams(str, z, i, i2, i3);
    }

    public void setRemoteAudioStreamEventListener(String str, InterfaceC14146d interfaceC14146d) {
        if (str == null) {
            return;
        }
        synchronized (mJitterEventListenerMapLock) {
            mJitterEventListenerMap.put(str, new WeakReference<>(interfaceC14146d));
        }
    }

    public void setRemotePlayoutVolume(String str, int i) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeSetRemotePlayoutVolume(str, i);
    }

    public void setRemoteStreamDataCallbackFormat(String str, int i, int i2, int i3) {
        TXCLog.m84152i(TAG, "setRemoteStreamDataCallbackFormat: id-" + str + " sampleRate-" + i + " channels-" + i2 + " length-" + i3);
        TXCAudioEngineJNI.nativeSetRemoteStreamDataCallbackFormat(str, i, i2, i3);
    }

    public boolean setReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCLog.m84152i(TAG, "setReverbType: " + tXVoiceReverbType.getNativeValue());
        TXCAudioEngineJNI.nativeSetRecordReverb(tXVoiceReverbType.getNativeValue());
        return true;
    }

    public void setSetAudioEngineRemoteStreamDataListener(String str, InterfaceC14147e interfaceC14147e) {
        if (str == null) {
            return;
        }
        synchronized (mJitterDataListenerMapLock) {
            mJitterDataListenerMap.put(str, new WeakReference<>(interfaceC14147e));
        }
        TXCAudioEngineJNI.nativeSetAudioEngineRemoteStreamDataListener(str, interfaceC14147e != null);
    }

    public boolean setSoftwareCaptureVolume(float f) {
        TXCLog.m84152i(TAG, "setRecordVolume: " + f);
        TXCAudioEngineJNI.nativeSetSoftwareCaptureVolume(f);
        return true;
    }

    public void setSystemAudioKitEnabled() {
        startSystemAudioKit();
    }

    public boolean setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCLog.m84152i(TAG, "setVoiceChangerType " + tXVoiceChangerType.getNativeValue());
        TXCAudioEngineJNI.nativeSetCaptureVoiceChanger(tXVoiceChangerType.getNativeValue());
        return true;
    }

    public int startLocalAudio(int i, boolean z) {
        TXCLog.m84152i(TAG, "startLocalAudio audioFormat:" + i);
        Context context = mContext;
        if (context == null) {
            TXCLog.m84152i(TAG, "Please call CreateInstance fisrt!!!");
            return TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        }
        TXCAudioEngineJNI.InitTraeEngineLibrary(context);
        TXCAudioEngineJNI.nativeStartLocalAudio(i, z);
        this.mDeviceIsRecording = true;
        return 0;
    }

    public int startLocalAudioDumping(int i, int i2, String str) {
        return TXCAudioEngineJNI.nativeStartLocalAudioDumping(i, i2, str);
    }

    public void startRemoteAudio(String str, boolean z) {
        TXCAudioEngineJNI.nativeStartRemoteAudio(sInstance, z, str);
        TXCAudioEngineJNI.nativeSetRemoteAudioJitterCycle(str, C14188c.m84036a().m84061a("Audio", "LIVE_JitterCycle"));
        TXCAudioEngineJNI.nativeSetRemoteAudioBlockThreshold(str, C14188c.m84036a().m84061a("Audio", "LoadingThreshold"));
    }

    public int stopLocalAudio() {
        TXCLog.m84152i(TAG, "stopLocalAudio");
        TXCAudioEngineJNI.nativeStopLocalAudio();
        this.mDeviceIsRecording = false;
        return 0;
    }

    public void stopLocalAudioDumping() {
        TXCAudioEngineJNI.nativeStopLocalAudioDumping();
    }

    public void stopRemoteAudio(String str) {
        if (str == null) {
            return;
        }
        TXCAudioEngineJNI.nativeStopRemoteAudio(str);
    }

    public void sendCustomPCMData(C14204a c14204a) {
        TXCAudioEngineJNI.sendCustomPCMData(c14204a);
    }
}
