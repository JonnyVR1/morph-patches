package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p149l.qq3;

/* JADX INFO: loaded from: classes6.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    public zaf(Result result) {
        super(Looper.getMainLooper());
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return (R) this.zae;
        }
        qq3.m175877a("Creating failed results is not supported");
        return null;
    }
}
