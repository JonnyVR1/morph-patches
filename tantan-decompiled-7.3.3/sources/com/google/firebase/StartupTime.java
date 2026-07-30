package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class StartupTime {
    @NonNull
    public static StartupTime create(long j, long j2, long j3) {
        return new AutoValue_StartupTime(j, j2, j3);
    }

    @NonNull
    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
