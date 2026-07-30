package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
final class zzawp extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2271t f10147a;

    public zzawp(ViewOnAttachStateChangeListenerC2271t viewOnAttachStateChangeListenerC2271t) {
        this.f10147a = viewOnAttachStateChangeListenerC2271t;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f10147a.m13367f();
    }
}
