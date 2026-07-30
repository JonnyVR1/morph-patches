package p149l;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class fbg0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bhg0 f96713a;

    public fbg0(bhg0 bhg0Var) {
        this.f96713a = bhg0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        bhg0 bhg0Var = this.f96713a;
        bhg0.m101834a(bhg0Var.f75612b);
        if (bhg0Var.f75611a.size() <= 0) {
            return;
        }
        bhg0Var.f75611a.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        bhg0 bhg0Var = this.f96713a;
        bhg0.m101834a(bhg0Var.f75612b);
        if (bhg0Var.f75611a.size() <= 0) {
            return;
        }
        bhg0Var.f75611a.get(0).getClass();
        throw new ClassCastException();
    }
}
