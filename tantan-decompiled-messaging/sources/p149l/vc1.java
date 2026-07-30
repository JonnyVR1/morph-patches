package p149l;

import com.p069ss.bytertc.audio.device.router.AudioRouteDeviceManager;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class vc1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioRouteDeviceManager f180901a;

    public /* synthetic */ vc1(AudioRouteDeviceManager audioRouteDeviceManager) {
        this.f180901a = audioRouteDeviceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f180901a.bluetoothScoConnectionCheck();
    }
}
