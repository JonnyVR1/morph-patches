package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.erm;

/* JADX INFO: loaded from: classes.dex */
final class zzav extends ResultReceiver {
    final /* synthetic */ erm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(C0871b c0871b, Handler handler, erm ermVar) {
        super(handler);
        this.zza = ermVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, @Nullable Bundle bundle) {
        this.zza.mo122189a(C2426p.m14969f(bundle, "BillingClient"));
    }
}
