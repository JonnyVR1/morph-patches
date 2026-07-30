package com.p074ss.bytertc.audio.device.router.device;

import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.hihonor.android.magicx.media.audio.interfaces.HnAudioClient;
import com.hihonor.android.magicx.media.audio.interfaces.HnEarReturnClient;
import com.hihonor.android.magicx.media.audio.interfaces.IAudioServiceCallback;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HnEarBackDeviceSupport implements IAudioServiceCallback {
    private static final String TAG = "HnEarBackDeviceSupport";
    private WebRtcAudioEarBack earBack;
    private HnAudioClient mHnAudioClient = null;
    private HnEarReturnClient mHnEarReturnClient = null;
    private boolean mIsAudiokitBindSuccess = false;
    private boolean mIsEarReturnBindSuccess = false;

    public HnEarBackDeviceSupport(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.earBack = webRtcAudioEarBack;
    }

    private void printLog(String str) {
        RXLogging.m5744i(TAG, "HnEarBackDeviceSupport:" + str);
    }

    public void HnDestroy() {
        printLog("HnDestroy");
        HnAudioClient hnAudioClient = this.mHnAudioClient;
        if (hnAudioClient != null) {
            hnAudioClient.destroy();
            this.mHnAudioClient = null;
        }
        HnEarReturnClient hnEarReturnClient = this.mHnEarReturnClient;
        if (hnEarReturnClient != null) {
            hnEarReturnClient.destroy();
            this.mHnEarReturnClient = null;
        }
        this.mIsEarReturnBindSuccess = false;
    }

    public int HnEnableEarReturn(boolean z) {
        if (this.mHnEarReturnClient == null || !this.mIsEarReturnBindSuccess) {
            return -1;
        }
        printLog("HnEnableEarReturn=" + z);
        return this.mHnEarReturnClient.enableEarReturn(z);
    }

    public int HnGetLatency() {
        return -1;
    }

    public void HnInitAudioClient() {
        if (!HnAudioClient.isDeviceSupported(ContextUtils.getApplicationContext())) {
            onDeviceSupported(false);
            return;
        }
        printLog("HnInitAudioClient");
        HnAudioClient hnAudioClient = new HnAudioClient(ContextUtils.getApplicationContext(), this);
        this.mHnAudioClient = hnAudioClient;
        hnAudioClient.initialize();
    }

    public void HnInitHnEarReturnClient() {
        if (this.mHnAudioClient == null) {
            return;
        }
        printLog("HnInitHnEarReturnClient");
        List supportedServices = this.mHnAudioClient.getSupportedServices();
        if (supportedServices != null && supportedServices.size() > 0) {
            Iterator it = supportedServices.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == HnAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN.getServiceType()) {
                    this.mHnEarReturnClient = this.mHnAudioClient.createService(HnAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
                    return;
                }
            }
        }
        printLog("service != HnAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN.getServiceType()");
        onDeviceSupported(false);
    }

    public boolean HnIsEarReturnSupport() {
        if (this.mHnEarReturnClient == null || !this.mIsEarReturnBindSuccess) {
            return false;
        }
        printLog("HnIsEarReturnSupport: false");
        return this.mHnEarReturnClient.isServiceSupported();
    }

    public int HnSetEffectMode(int i) {
        if (this.mHnEarReturnClient == null || !this.mIsEarReturnBindSuccess) {
            return -1;
        }
        printLog("HnSetEffectMode=" + i);
        return this.mHnEarReturnClient.setParameter(HnEarReturnClient.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i);
    }

    public int HnSetEqualizer(int i) {
        if (this.mHnEarReturnClient == null || !this.mIsEarReturnBindSuccess) {
            return -1;
        }
        printLog("HnSetEqualizer=" + i);
        return this.mHnEarReturnClient.setParameter(HnEarReturnClient.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i);
    }

    public int HnSetVocalVolume(int i) {
        if (this.mHnEarReturnClient == null || !this.mIsEarReturnBindSuccess) {
            return -1;
        }
        printLog("HnSetVocalVolume=" + i);
        return this.mHnEarReturnClient.setParameter(HnEarReturnClient.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i);
    }

    public void onDeviceSupported(boolean z) {
        if (this.earBack != null) {
            printLog("Hn onDeviceSupported: " + z);
            this.earBack.onHardwareEarbackSupported(z);
        }
    }

    public void onResult(int i) {
        printLog(String.format("onResult result=%d", Integer.valueOf(i)));
        if (i == 0) {
            HnInitHnEarReturnClient();
            this.mIsAudiokitBindSuccess = true;
            return;
        }
        if (i == 2) {
            this.mIsEarReturnBindSuccess = false;
            this.mIsAudiokitBindSuccess = false;
            onDeviceSupported(false);
            return;
        }
        if (i != 4) {
            if (i != 1003) {
                if (i == 1806) {
                    onDeviceSupported(false);
                    return;
                }
                if (i != 6) {
                    if (i == 7) {
                        onDeviceSupported(false);
                        return;
                    } else if (i == 1000) {
                        this.mIsEarReturnBindSuccess = true;
                        HnSetVocalVolume(90);
                        onDeviceSupported(HnIsEarReturnSupport());
                        return;
                    } else if (i != 1001) {
                        return;
                    }
                }
            }
            this.mIsEarReturnBindSuccess = false;
            return;
        }
        this.mIsAudiokitBindSuccess = false;
    }
}
