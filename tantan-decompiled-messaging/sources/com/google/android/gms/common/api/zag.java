package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes6.dex */
final class zag<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    public zag(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.zae = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.zae;
    }
}
