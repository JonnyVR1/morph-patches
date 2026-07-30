package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p149l.phx0;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements phx0.InterfaceC19219a {
    private phx0 zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // p149l.phx0.InterfaceC19219a
    @MainThread
    public final void doStartService(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new phx0(this);
        }
        this.zza.m169156a(context, intent);
    }
}
