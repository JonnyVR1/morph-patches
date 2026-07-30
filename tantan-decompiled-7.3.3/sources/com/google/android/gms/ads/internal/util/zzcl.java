package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
final class zzcl extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2097a f9763a;

    public zzcl(C2097a c2097a) {
        this.f9763a = c2097a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f9763a.m12343e(context, intent);
    }
}
