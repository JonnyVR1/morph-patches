package p153l;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes6.dex */
public final class x2s0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y2s0 f192182a;

    public x2s0(y2s0 y2s0Var) {
        this.f192182a = y2s0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (y2s0.class) {
            this.f192182a.f197280a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (y2s0.class) {
            this.f192182a.f197280a = null;
        }
    }
}
