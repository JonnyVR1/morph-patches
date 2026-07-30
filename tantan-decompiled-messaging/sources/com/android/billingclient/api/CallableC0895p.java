package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.List;
import java.util.concurrent.Callable;
import p149l.qcb0;
import p149l.qot0;

/* JADX INFO: renamed from: com.android.billingclient.api.p */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0895p implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f4097a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ qcb0 f4098b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0867b f4099c;

    public CallableC0895p(C0867b c0867b, String str, qcb0 qcb0Var) {
        this.f4097a = str;
        this.f4098b = qcb0Var;
        this.f4099c = c0867b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        qot0 qot0VarM4868Y = this.f4099c.m4868Y(this.f4097a, 9);
        List listM175771b = qot0VarM4868Y.m175771b();
        qcb0 qcb0Var = this.f4098b;
        if (listM175771b != null) {
            qcb0Var.mo5067b(qot0VarM4868Y.m175770a(), qot0VarM4868Y.m175771b());
            return null;
        }
        qcb0Var.mo5067b(qot0VarM4868Y.m175770a(), zzco.zzl());
        return null;
    }
}
