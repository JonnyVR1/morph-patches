package com.tantanapp.common.network;

import p153l.pcj;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NetReporter {
    private static y20<Throwable> reportErrorAction;
    private static pcj<Boolean> shouldReport;

    public static void init(y20<Throwable> y20Var, pcj<Boolean> pcjVar) {
        reportErrorAction = y20Var;
        shouldReport = pcjVar;
    }

    public static void reportError(Throwable th) {
        if (reportErrorAction == null || !shouldReport.call().booleanValue()) {
            return;
        }
        reportErrorAction.call(th);
    }
}
