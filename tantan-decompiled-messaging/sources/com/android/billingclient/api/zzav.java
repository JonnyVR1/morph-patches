package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.cpm;

/* JADX INFO: loaded from: classes.dex */
final class zzav extends ResultReceiver {
    final /* synthetic */ cpm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(C0867b c0867b, Handler handler, cpm cpmVar) {
        super(handler);
        this.zza = cpmVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, @Nullable Bundle bundle) {
        this.zza.mo108168a(C2403p.m14915f(bundle, "BillingClient"));
    }
}
