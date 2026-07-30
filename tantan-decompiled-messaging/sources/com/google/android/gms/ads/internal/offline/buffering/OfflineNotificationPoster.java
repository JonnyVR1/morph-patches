package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.AbstractC0762b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.annotation.KeepForSdk;
import p149l.ess0;
import p149l.exr0;
import p149l.kns0;
import p149l.s050;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: e */
    public final ess0 f9676e;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9676e = exr0.m118702a().m156446j(context, new kns0());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final AbstractC0762b.a doWork() {
        try {
            this.f9676e.mo108561y3(s050.m181848Y2(getApplicationContext()), new zza(getInputData().m4317d("uri"), getInputData().m4317d("gws_query_id"), getInputData().m4317d("image_url")));
            return AbstractC0762b.a.m4415c();
        } catch (RemoteException unused) {
            return AbstractC0762b.a.m4413a();
        }
    }
}
