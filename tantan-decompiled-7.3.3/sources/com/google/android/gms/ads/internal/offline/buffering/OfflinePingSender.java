package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.AbstractC0764b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.k1t0;
import p153l.k6s0;
import p153l.qws0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: e */
    public final k1t0 f9714e;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9714e = k6s0.m148568a().m184302j(context, new qws0());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final AbstractC0764b.a doWork() {
        try {
            this.f9714e.zzh();
            return AbstractC0764b.a.m4417c();
        } catch (RemoteException unused) {
            return AbstractC0764b.a.m4415a();
        }
    }
}
