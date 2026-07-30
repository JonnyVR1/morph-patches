package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p149l.j7y0;
import p149l.q8y0;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements q8y0 {
    private j7y0<AppMeasurementService> zza;

    private final j7y0<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new j7y0<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@NonNull Intent intent) {
        return zza().m140124b(intent);
    }

    @Override // android.app.Service
    @MainThread
    public final void onCreate() {
        super.onCreate();
        zza().m140125c();
    }

    @Override // android.app.Service
    @MainThread
    public final void onDestroy() {
        zza().m140130h();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public final void onRebind(@NonNull Intent intent) {
        zza().m140131i(intent);
    }

    @Override // android.app.Service
    @MainThread
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        return zza().m140123a(intent, i, i2);
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().m140133k(intent);
    }

    @Override // p149l.q8y0
    public final void zza(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // p149l.q8y0
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.q8y0
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
