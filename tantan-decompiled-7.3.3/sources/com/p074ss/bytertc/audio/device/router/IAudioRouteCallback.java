package com.p074ss.bytertc.audio.device.router;

/* JADX INFO: loaded from: classes11.dex */
public interface IAudioRouteCallback {
    void onDeviceEvent(@AudioRouteDeviceManager.RoutingDeviceType int i, boolean z, String str);

    void onError(int i, String str);
}
