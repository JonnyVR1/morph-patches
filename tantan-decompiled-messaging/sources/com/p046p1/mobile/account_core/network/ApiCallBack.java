package com.p046p1.mobile.account_core.network;

import p149l.exc0;
import p149l.stc0;
import p149l.sx3;

/* JADX INFO: loaded from: classes8.dex */
public interface ApiCallBack {
    stc0 beforeCall(stc0 stc0Var) throws Exception;

    Exception beforeExceptionCheck(exc0 exc0Var);

    void whenApiError(Exception exc);

    void whenApiFinish();

    void whenGetRealCall(sx3 sx3Var);

    void whenGetResponse(exc0 exc0Var);
}
