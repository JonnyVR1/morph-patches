package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
final class zzawp extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2248t f10110a;

    public zzawp(ViewOnAttachStateChangeListenerC2248t viewOnAttachStateChangeListenerC2248t) {
        this.f10110a = viewOnAttachStateChangeListenerC2248t;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f10110a.m13313f();
    }
}
