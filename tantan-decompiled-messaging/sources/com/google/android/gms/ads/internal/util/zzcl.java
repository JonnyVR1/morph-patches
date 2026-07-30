package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
final class zzcl extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2074a f9726a;

    public zzcl(C2074a c2074a) {
        this.f9726a = c2074a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f9726a.m12289e(context, intent);
    }
}
