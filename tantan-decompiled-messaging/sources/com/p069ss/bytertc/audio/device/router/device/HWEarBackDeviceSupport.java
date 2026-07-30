package com.p069ss.bytertc.audio.device.router.device;

import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes12.dex */
public class HWEarBackDeviceSupport implements IAudioKitCallback {
    private static final String TAG = "HWEarBackDeviceSupport";
    private WebRtcAudioEarBack earBack;
    private HwAudioKaraokeFeatureKit mHwAudioKaraokeFeatureKit;
    private HwAudioKit mHwAudioKit;
    private String mResultType = "";
    private boolean mIsAudiokitBindSuccess = false;
    private boolean mIsAudiokitKaraokeBindSuccess = false;
    private boolean mSupportLowLatencyEarBack = true;

    public HWEarBackDeviceSupport(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.earBack = webRtcAudioEarBack;
    }

    private void initAudioKit() {
        if (this.mIsAudiokitBindSuccess && this.mIsAudiokitKaraokeBindSuccess) {
            onDeviceSupported(HWGetKaraokeSupport());
            return;
        }
        HwAudioKit hwAudioKit = new HwAudioKit(ContextUtils.getApplicationContext(), this);
        this.mHwAudioKit = hwAudioKit;
        hwAudioKit.initialize();
    }

    private void initKaraokeFeature() {
        HwAudioKit hwAudioKit = this.mHwAudioKit;
        if (hwAudioKit != null) {
            this.mHwAudioKaraokeFeatureKit = hwAudioKit.createFeature(HwAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
        }
    }

    private void printLog(String str) {
        RXLogging.m5690i(TAG, "HWEarBackDeviceSupport:" + str);
    }

    public void HWDestroy() {
        if (!this.mIsAudiokitBindSuccess || this.mHwAudioKit == null) {
            return;
        }
        printLog("HWDestroy");
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit != null) {
            hwAudioKaraokeFeatureKit.destroy();
            this.mIsAudiokitKaraokeBindSuccess = false;
        }
        this.mHwAudioKit.destroy();
        this.mIsAudiokitBindSuccess = false;
    }

    public void HWEarBack_init() {
        printLog("HWEarBack_init");
        initAudioKit();
    }

    public int HWEnableKaraoke(boolean z) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWEnableKaraoke enable=" + z);
        return this.mHwAudioKaraokeFeatureKit.enableKaraokeFeature(z);
    }

    public boolean HWGetKaraokeSupport() {
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return false;
        }
        return hwAudioKaraokeFeatureKit.isKaraokeFeatureSupport();
    }

    public int HWSetEffectMode(int i) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWSetEffectMode value=" + i);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i);
    }

    public int HWSetEqualizerMode(int i) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWSetEqualizerMode value=" + i);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i);
    }

    public int getLatency() {
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        return hwAudioKaraokeFeatureKit.getKaraokeLatency();
    }

    public void onDeviceSupported(boolean z) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.earBack;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onHardwareEarbackSupported(z);
        }
    }

    public void onResult(int i) {
        printLog(String.format("onResult result=%d", Integer.valueOf(i)));
        if (i == 0) {
            initKaraokeFeature();
            this.mIsAudiokitBindSuccess = true;
            return;
        }
        if (i == 2) {
            this.mIsAudiokitBindSuccess = false;
            this.mIsAudiokitKaraokeBindSuccess = false;
            onDeviceSupported(false);
            return;
        }
        if (i == 4 || i == 6) {
            this.mIsAudiokitBindSuccess = false;
            return;
        }
        if (i != 1003) {
            if (i == 1806) {
                onDeviceSupported(false);
                return;
            } else if (i == 1000) {
                this.mIsAudiokitKaraokeBindSuccess = true;
                setVolume(90);
                onDeviceSupported(HWGetKaraokeSupport());
                return;
            } else if (i != 1001) {
                return;
            }
        }
        this.mIsAudiokitKaraokeBindSuccess = false;
    }

    public int setVolume(int i) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("setVolume volome=" + i);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i);
    }
}
