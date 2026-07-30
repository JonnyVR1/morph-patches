package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import p153l.rvx0;

/* JADX INFO: loaded from: classes6.dex */
final class zzij extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a */
    public final rvx0 f10267a;

    /* JADX INFO: renamed from: b */
    public final Handler f10268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2125a7 f10269c;

    public zzij(C2125a7 c2125a7, Handler handler, rvx0 rvx0Var) {
        this.f10269c = c2125a7;
        this.f10268b = handler;
        this.f10267a = rvx0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10268b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
