package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
final class zacy implements Runnable {
    final /* synthetic */ Result zaa;
    final /* synthetic */ zada zab;

    public zacy(zada zadaVar, Result result) {
        this.zab = zadaVar;
        this.zaa = result;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(this.zab.zaa)).onSuccess(this.zaa);
                zada zadaVar = this.zab;
                zadaVar.zah.sendMessage(zadaVar.zah.obtainMessage(0, pendingResultOnSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.zab;
                zada.zan(this.zaa);
                googleApiClient = (GoogleApiClient) this.zab.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.zab;
                zadaVar3.zah.sendMessage(zadaVar3.zah.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.zab;
                zada.zan(this.zaa);
                googleApiClient = (GoogleApiClient) this.zab.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.zab);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.zab;
            zada.zan(this.zaa);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zab.zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
            throw th;
        }
    }
}
