package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import p153l.pgy0;
import p153l.why0;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements why0 {
    private pgy0<AppMeasurementJobService> zza;

    private final pgy0<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new pgy0<>(this);
        }
        return this.zza;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        return zza().m172310g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().m172314k(intent);
    }

    @Override // p153l.why0
    public final void zza(@NonNull Intent intent) {
    }

    @Override // p153l.why0
    @TargetApi(24)
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // p153l.why0
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
