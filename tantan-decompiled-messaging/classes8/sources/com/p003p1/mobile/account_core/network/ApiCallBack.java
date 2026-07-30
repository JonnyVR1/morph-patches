package com.p003p1.mobile.account_core.network;

import l.exc0;
import l.stc0;
import l.sx3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface ApiCallBack {
    stc0 beforeCall(stc0 stc0Var) throws Exception;

    Exception beforeExceptionCheck(exc0 exc0Var);

    void whenApiError(Exception exc);

    void whenApiFinish();

    void whenGetRealCall(sx3 sx3Var);

    void whenGetResponse(exc0 exc0Var);
}
