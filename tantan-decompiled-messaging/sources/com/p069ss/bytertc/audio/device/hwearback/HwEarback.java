package com.p069ss.bytertc.audio.device.hwearback;

import com.p069ss.bytertc.audio.device.router.device.HWEarBackDeviceSupport;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes12.dex */
public class HwEarback implements IHardWareEarback {
    private HWEarBackDeviceSupport hwEarback;

    public HwEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.hwEarback = null;
        this.hwEarback = new HWEarBackDeviceSupport(webRtcAudioEarBack);
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int close() {
        return this.hwEarback.HWEnableKaraoke(false);
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return this.hwEarback.getLatency();
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.hwEarback.HWEarBack_init();
        return 0;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        return this.hwEarback.HWGetKaraokeSupport();
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i, int i2) {
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        return this.hwEarback.HWEnableKaraoke(true);
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        close();
        this.hwEarback.HWDestroy();
        return 0;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        return this.hwEarback.HWSetEffectMode(i);
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i) {
        return this.hwEarback.HWSetEqualizerMode(i);
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        return this.hwEarback.setVolume(i);
    }
}
