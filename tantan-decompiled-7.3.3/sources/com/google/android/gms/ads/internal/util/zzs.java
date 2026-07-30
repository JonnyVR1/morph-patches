package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p153l.ysy0;

/* JADX INFO: loaded from: classes6.dex */
final class zzs extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2098b f9764a;

    public /* synthetic */ zzs(C2098b c2098b, ysy0 ysy0Var) {
        this.f9764a = c2098b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f9764a.f9756e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f9764a.f9756e = false;
        }
    }
}
