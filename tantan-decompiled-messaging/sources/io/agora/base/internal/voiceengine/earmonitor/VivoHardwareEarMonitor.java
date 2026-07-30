package io.agora.base.internal.voiceengine.earmonitor;

/* JADX INFO: loaded from: classes2.dex */
public class VivoHardwareEarMonitor extends GsaiHardwareEarMonitor {
    private static final String TAG = "VivoHardwareEarMonitor";

    public VivoHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        super(hardwareEarMonitorListener, TAG);
    }

    @Override // io.agora.base.internal.voiceengine.earmonitor.GsaiHardwareEarMonitor
    public int getMixerSoundType() {
        return 10;
    }
}
