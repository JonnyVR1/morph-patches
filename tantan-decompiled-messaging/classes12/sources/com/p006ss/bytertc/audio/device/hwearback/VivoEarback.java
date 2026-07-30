package com.p006ss.bytertc.audio.device.hwearback;

import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.p006ss.bytertc.BuildConfig;
import com.p006ss.bytertc.audio.device.router.device.VivoKTVHelper;
import com.p006ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VivoEarback implements IHardWareEarback {
    private static final String TAG = "com.ss.bytertc.audio.device.hwearback.VivoEarback";
    private boolean isKtvDeviceOpened = false;
    private SlientPlayer slientPlayer;
    private VivoKTVHelper vivoKtvHelper;
    private WebRtcAudioEarBack webRtcAudioEarBack;

    public VivoEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    private void printLog(String str) {
        String str2 = TAG;
        RXLogging.i(str2, str2 + ":" + str);
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int close() {
        if (this.vivoKtvHelper == null || this.slientPlayer == null) {
            return -1;
        }
        printLog("close");
        this.slientPlayer.stop();
        this.vivoKtvHelper.setPlayFeedbackParam(0);
        this.vivoKtvHelper.setCustomMode(0);
        return 0;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return -1;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.vivoKtvHelper = new VivoKTVHelper(ContextUtils.getApplicationContext());
        SlientPlayer slientPlayer = new SlientPlayer();
        this.slientPlayer = slientPlayer;
        slientPlayer.setRequireDeepBuffer(false);
        boolean zIsSupport = isSupport();
        WebRtcAudioEarBack webRtcAudioEarBack = this.webRtcAudioEarBack;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onHardwareEarbackSupported(zIsSupport);
        }
        printLog("inited, isSupportHardwareEarback=" + zIsSupport);
        return 0;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        VivoKTVHelper vivoKTVHelper = this.vivoKtvHelper;
        if (vivoKTVHelper != null) {
            return vivoKTVHelper.isDeviceSupportKaraoke();
        }
        return false;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i, int i2) {
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        VivoKTVHelper vivoKTVHelper = this.vivoKtvHelper;
        if (vivoKTVHelper == null || this.slientPlayer == null) {
            return -1;
        }
        if (!this.isKtvDeviceOpened && vivoKTVHelper.isDeviceSupportKaraoke()) {
            this.vivoKtvHelper.openKTVDevice();
            this.isKtvDeviceOpened = true;
        }
        printLog("open");
        this.slientPlayer.play();
        this.vivoKtvHelper.setPlayFeedbackParam(1);
        return 0;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        printLog(BuildConfig.BUILD_TYPE);
        if (this.vivoKtvHelper != null) {
            close();
            this.vivoKtvHelper.closeKTVDevice();
            this.isKtvDeviceOpened = false;
        }
        return 0;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        if (this.vivoKtvHelper != null) {
            printLog("setEffect value=" + i);
            if (i >= 0 && i <= this.vivoKtvHelper.getEffectSize()) {
                this.vivoKtvHelper.setCustomMode(i);
                return 0;
            }
            RXLogging.w(TAG, String.format("ByteAudioEarBackEffect vivo valid is [%d,%d], value is %d, ignore it", 0, Integer.valueOf(this.vivoKtvHelper.getEffectSize()), Integer.valueOf(i)));
        }
        return -1;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i) {
        return -1;
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        if (this.vivoKtvHelper == null) {
            return -1;
        }
        printLog("setVolume volume=" + i);
        this.vivoKtvHelper.setMicVolParam((int) ((((double) i) * 15.0d) / 100.0d));
        return 0;
    }
}
