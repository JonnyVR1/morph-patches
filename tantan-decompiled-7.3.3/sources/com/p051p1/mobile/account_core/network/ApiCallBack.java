package com.p051p1.mobile.account_core.network;

import p153l.i5d0;
import p153l.ry3;
import p153l.x1d0;

/* JADX INFO: loaded from: classes8.dex */
public interface ApiCallBack {
    x1d0 beforeCall(x1d0 x1d0Var) throws Exception;

    Exception beforeExceptionCheck(i5d0 i5d0Var);

    void whenApiError(Exception exc);

    void whenApiFinish();

    void whenGetRealCall(ry3 ry3Var);

    void whenGetResponse(i5d0 i5d0Var);
}
