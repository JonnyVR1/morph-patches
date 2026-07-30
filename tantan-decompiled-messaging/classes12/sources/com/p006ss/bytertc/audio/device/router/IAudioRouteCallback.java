package com.p006ss.bytertc.audio.device.router;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface IAudioRouteCallback {
    void onDeviceEvent(@AudioRouteDeviceManager.RoutingDeviceType int i, boolean z, String str);

    void onError(int i, String str);
}
