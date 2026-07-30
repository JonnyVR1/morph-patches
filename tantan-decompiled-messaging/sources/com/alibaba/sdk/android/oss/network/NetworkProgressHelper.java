package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import p149l.axm;
import p149l.exc0;
import p149l.k850;

/* JADX INFO: loaded from: classes.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j, str, executionContext);
    }

    public static k850 addProgressResponseListener(k850 k850Var, final ExecutionContext executionContext) {
        return k850Var.m144867v().m144881b(new axm() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p149l.axm
            public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
                exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(interfaceC15754a.request());
                return exc0VarMo99454a.m118600N().m118614b(new ProgressTouchableResponseBody(exc0VarMo99454a.m118606k(), executionContext)).m118615c();
            }
        }).m144882c();
    }
}
