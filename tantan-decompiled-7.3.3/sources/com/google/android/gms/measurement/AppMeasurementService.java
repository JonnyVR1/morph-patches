package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p153l.pgy0;
import p153l.why0;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements why0 {
    private pgy0<AppMeasurementService> zza;

    private final pgy0<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new pgy0<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@NonNull Intent intent) {
        return zza().m172305b(intent);
    }

    @Override // android.app.Service
    @MainThread
    public final void onCreate() {
        super.onCreate();
        zza().m172306c();
    }

    @Override // android.app.Service
    @MainThread
    public final void onDestroy() {
        zza().m172311h();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public final void onRebind(@NonNull Intent intent) {
        zza().m172312i(intent);
    }

    @Override // android.app.Service
    @MainThread
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        return zza().m172304a(intent, i, i2);
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().m172314k(intent);
    }

    @Override // p153l.why0
    public final void zza(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // p153l.why0
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.why0
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
