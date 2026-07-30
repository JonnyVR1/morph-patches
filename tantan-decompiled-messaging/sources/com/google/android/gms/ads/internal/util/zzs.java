package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p149l.sjy0;

/* JADX INFO: loaded from: classes6.dex */
final class zzs extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2075b f9727a;

    public /* synthetic */ zzs(C2075b c2075b, sjy0 sjy0Var) {
        this.f9727a = c2075b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f9727a.f9719e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f9727a.f9719e = false;
        }
    }
}
