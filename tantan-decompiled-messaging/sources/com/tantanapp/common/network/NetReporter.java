package com.tantanapp.common.network;

import p149l.e30;
import p149l.v9j;

/* JADX INFO: loaded from: classes13.dex */
public class NetReporter {
    private static e30<Throwable> reportErrorAction;
    private static v9j<Boolean> shouldReport;

    public static void init(e30<Throwable> e30Var, v9j<Boolean> v9jVar) {
        reportErrorAction = e30Var;
        shouldReport = v9jVar;
    }

    public static void reportError(Throwable th) {
        if (reportErrorAction == null || !shouldReport.call().booleanValue()) {
            return;
        }
        reportErrorAction.call(th);
    }
}
