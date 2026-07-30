package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zap implements PendingResult.StatusListener {
    final /* synthetic */ PendingResult zaa;
    final /* synthetic */ sni0 zab;
    final /* synthetic */ PendingResultUtil.ResultConverter zac;
    final /* synthetic */ zas zad;

    public zap(PendingResult pendingResult, sni0 sni0Var, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.zaa = pendingResult;
        this.zab = sni0Var;
        this.zac = resultConverter;
        this.zad = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.zab.m186940b(ApiExceptionUtil.fromStatus(status));
        } else {
            this.zab.m186941c(this.zac.convert(this.zaa.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
