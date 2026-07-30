package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import p149l.lmx0;

/* JADX INFO: loaded from: classes6.dex */
final class zzij extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a */
    public final lmx0 f10230a;

    /* JADX INFO: renamed from: b */
    public final Handler f10231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2102a7 f10232c;

    public zzij(C2102a7 c2102a7, Handler handler, lmx0 lmx0Var) {
        this.f10232c = c2102a7;
        this.f10231b = handler;
        this.f10230a = lmx0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10231b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
