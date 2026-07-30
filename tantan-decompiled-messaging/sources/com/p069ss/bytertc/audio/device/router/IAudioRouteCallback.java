package com.p069ss.bytertc.audio.device.router;

/* JADX INFO: loaded from: classes12.dex */
public interface IAudioRouteCallback {
    void onDeviceEvent(@AudioRouteDeviceManager.RoutingDeviceType int i, boolean z, String str);

    void onError(int i, String str);
}
