package p153l;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class njg0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jpg0 f142292a;

    public njg0(jpg0 jpg0Var) {
        this.f142292a = jpg0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        jpg0 jpg0Var = this.f142292a;
        jpg0.m146497a(jpg0Var.f122101b);
        if (jpg0Var.f122100a.size() <= 0) {
            return;
        }
        jpg0Var.f122100a.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        jpg0 jpg0Var = this.f142292a;
        jpg0.m146497a(jpg0Var.f122101b);
        if (jpg0Var.f122100a.size() <= 0) {
            return;
        }
        jpg0Var.f122100a.get(0).getClass();
        throw new ClassCastException();
    }
}
