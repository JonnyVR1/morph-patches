package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import p153l.azm;
import p153l.i5d0;
import p153l.rg50;

/* JADX INFO: loaded from: classes.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j, str, executionContext);
    }

    public static rg50 addProgressResponseListener(rg50 rg50Var, final ExecutionContext executionContext) {
        return rg50Var.m181359v().m181364b(new azm() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p153l.azm
            public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
                i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(interfaceC15867a.request());
                return i5d0VarMo101076a.m138664N().m138678b(new ProgressTouchableResponseBody(i5d0VarMo101076a.m138670k(), executionContext)).m138679c();
            }
        }).m181365c();
    }
}
