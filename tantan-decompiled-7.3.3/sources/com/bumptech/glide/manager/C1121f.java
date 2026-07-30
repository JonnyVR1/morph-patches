package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import p153l.j26;

/* JADX INFO: renamed from: com.bumptech.glide.manager.f */
/* JADX INFO: loaded from: classes.dex */
public class C1121f implements InterfaceC1119d {
    @Override // com.bumptech.glide.manager.InterfaceC1119d
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC1118c mo5630a(@NonNull Context context, @NonNull InterfaceC1118c.a aVar) {
        boolean z = j26.m143188a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new C1120e(context, aVar) : new C1127l();
    }
}
