package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import p149l.e16;

/* JADX INFO: renamed from: com.bumptech.glide.manager.e */
/* JADX INFO: loaded from: classes.dex */
public class C1103e implements InterfaceC1102d {
    @Override // com.bumptech.glide.manager.InterfaceC1102d
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC1101c mo5592a(@NonNull Context context, @NonNull InterfaceC1101c.a aVar) {
        boolean z = e16.m114373a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new DefaultConnectivityMonitor(context, aVar) : new C1105g();
    }
}
