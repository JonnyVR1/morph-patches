package p149l;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class v1t0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y1t0 f179281a;

    public v1t0(y1t0 y1t0Var) {
        this.f179281a = y1t0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f179281a.f195461o.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f179281a.f195461o.set(false);
    }
}
