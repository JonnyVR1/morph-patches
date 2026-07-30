package p007l;

import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public final /* synthetic */ class vc1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioRouteDeviceManager f14143a;

    public /* synthetic */ vc1(AudioRouteDeviceManager audioRouteDeviceManager) {
        this.f14143a = audioRouteDeviceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14143a.bluetoothScoConnectionCheck();
    }
}
