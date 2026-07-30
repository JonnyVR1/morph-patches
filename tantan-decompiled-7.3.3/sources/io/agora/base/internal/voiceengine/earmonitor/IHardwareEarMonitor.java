package io.agora.base.internal.voiceengine.earmonitor;

/* JADX INFO: loaded from: classes2.dex */
public interface IHardwareEarMonitor {
    void destroy();

    int enableHardwareEarMonitor(boolean z);

    void initialize();

    boolean isHardwareEarMonitorSupported();

    int setHardwareEarMonitorVolume(int i);
}
