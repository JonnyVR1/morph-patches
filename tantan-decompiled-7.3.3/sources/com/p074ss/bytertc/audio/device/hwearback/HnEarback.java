package com.p074ss.bytertc.audio.device.hwearback;

import com.p074ss.bytertc.audio.device.router.device.HnEarBackDeviceSupport;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes11.dex */
public class HnEarback implements IHardWareEarback {
    private HnEarBackDeviceSupport hnEarback;

    public HnEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.hnEarback = null;
        this.hnEarback = new HnEarBackDeviceSupport(webRtcAudioEarBack);
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int close() {
        return this.hnEarback.HnEnableEarReturn(false);
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return this.hnEarback.HnGetLatency();
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.hnEarback.HnInitAudioClient();
        return 0;
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        return this.hnEarback.HnIsEarReturnSupport();
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i, int i2) {
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        return this.hnEarback.HnEnableEarReturn(true);
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        close();
        this.hnEarback.HnDestroy();
        return 0;
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        return this.hnEarback.HnSetEffectMode(i);
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i) {
        return this.hnEarback.HnSetEqualizer(i);
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        return this.hnEarback.HnSetVocalVolume(i);
    }
}
