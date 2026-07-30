package com.tantanapp.common.network;

import androidx.annotation.NonNull;
import p149l.exc0;
import p149l.gxc0;
import p149l.stc0;

/* JADX INFO: loaded from: classes13.dex */
public interface ApiCallBack {
    stc0 beforeCall(stc0 stc0Var) throws Exception;

    @NonNull
    gxc0 decodeResponse(@NonNull exc0 exc0Var);

    void requestCancel(stc0 stc0Var);

    void whenApiError(stc0 stc0Var, Throwable th);

    void whenApiFinish(stc0 stc0Var);

    void whenGetResponse(stc0 stc0Var, exc0 exc0Var);

    Exception whenResponseCheckError(ApiExcep apiExcep);
}
