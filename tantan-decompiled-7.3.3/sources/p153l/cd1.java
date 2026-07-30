package p153l;

import com.p074ss.bytertc.audio.device.router.AudioRouteDeviceManager;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class cd1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioRouteDeviceManager f81048a;

    public /* synthetic */ cd1(AudioRouteDeviceManager audioRouteDeviceManager) {
        this.f81048a = audioRouteDeviceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f81048a.bluetoothScoConnectionCheck();
    }
}
