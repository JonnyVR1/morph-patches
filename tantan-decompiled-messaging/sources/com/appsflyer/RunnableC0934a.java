package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.appsflyer.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0934a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f4239a;

    public /* synthetic */ RunnableC0934a(Function1 function1) {
        this.f4239a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.AFAdRevenueData(this.f4239a);
    }
}
