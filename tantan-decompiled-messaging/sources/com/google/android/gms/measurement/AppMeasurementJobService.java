package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import p149l.j7y0;
import p149l.q8y0;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements q8y0 {
    private j7y0<AppMeasurementJobService> zza;

    private final j7y0<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new j7y0<>(this);
        }
        return this.zza;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        return zza().m140129g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().m140133k(intent);
    }

    @Override // p149l.q8y0
    public final void zza(@NonNull Intent intent) {
    }

    @Override // p149l.q8y0
    @TargetApi(24)
    public final void zza(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // p149l.q8y0
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
