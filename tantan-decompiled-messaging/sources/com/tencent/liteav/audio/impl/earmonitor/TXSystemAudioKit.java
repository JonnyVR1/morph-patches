package com.tencent.liteav.audio.impl.earmonitor;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public interface TXSystemAudioKit {
    void initialize(Context context, InterfaceC14000a interfaceC14000a);

    void setSystemEarMonitoringVolume(int i);

    void startSystemEarMonitoring();

    void stopSystemEarMonitoring();

    void uninitialize();
}
