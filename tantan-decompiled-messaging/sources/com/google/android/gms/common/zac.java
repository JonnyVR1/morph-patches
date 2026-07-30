package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import p149l.g60;

/* JADX INFO: loaded from: classes6.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ g60 zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i, g60 g60Var) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i;
        this.zac = g60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.m124547b(new IntentSenderRequest.C0054b(errorResolutionPendingIntent.getIntentSender()).m226a());
    }
}
