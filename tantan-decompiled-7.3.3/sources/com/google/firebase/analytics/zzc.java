package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* synthetic */ String call() throws Exception {
        return this.zza.zzb.m222178U();
    }
}
