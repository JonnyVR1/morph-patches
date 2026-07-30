package com.tantanapp.common.network;

import androidx.annotation.NonNull;
import p153l.i5d0;
import p153l.k5d0;
import p153l.x1d0;

/* JADX INFO: loaded from: classes11.dex */
public interface ApiCallBack {
    x1d0 beforeCall(x1d0 x1d0Var) throws Exception;

    @NonNull
    k5d0 decodeResponse(@NonNull i5d0 i5d0Var);

    void requestCancel(x1d0 x1d0Var);

    void whenApiError(x1d0 x1d0Var, Throwable th);

    void whenApiFinish(x1d0 x1d0Var);

    void whenGetResponse(x1d0 x1d0Var, i5d0 i5d0Var);

    Exception whenResponseCheckError(ApiExcep apiExcep);
}
