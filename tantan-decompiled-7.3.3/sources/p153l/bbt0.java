package p153l;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes6.dex */
public final class bbt0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ebt0 f75991a;

    public bbt0(ebt0 ebt0Var) {
        this.f75991a = ebt0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f75991a.f92986o.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f75991a.f92986o.set(false);
    }
}
