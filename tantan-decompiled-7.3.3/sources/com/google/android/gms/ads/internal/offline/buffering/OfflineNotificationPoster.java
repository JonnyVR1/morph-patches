package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.AbstractC0764b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.annotation.KeepForSdk;
import p153l.h950;
import p153l.k1t0;
import p153l.k6s0;
import p153l.qws0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: e */
    public final k1t0 f9713e;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9713e = k6s0.m148568a().m184302j(context, new qws0());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final AbstractC0764b.a doWork() {
        try {
            this.f9713e.mo138153y3(h950.m134038Y2(getApplicationContext()), new zza(getInputData().m4319d("uri"), getInputData().m4319d("gws_query_id"), getInputData().m4319d("image_url")));
            return AbstractC0764b.a.m4417c();
        } catch (RemoteException unused) {
            return AbstractC0764b.a.m4415a();
        }
    }
}
