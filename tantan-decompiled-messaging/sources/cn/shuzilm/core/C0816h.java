package cn.shuzilm.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: cn.shuzilm.core.h */
/* JADX INFO: loaded from: classes.dex */
class C0816h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3822a;

    public C0816h(Context context) {
        this.f3822a = context;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        try {
            DUHelper.oxlbmV0d(this.f3822a, network, 1);
        } catch (Throwable unused) {
        }
    }
}
