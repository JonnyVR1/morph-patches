package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.List;
import java.util.concurrent.Callable;
import p153l.ukb0;
import p153l.wxt0;

/* JADX INFO: renamed from: com.android.billingclient.api.p */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0899p implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f4097a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ukb0 f4098b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0871b f4099c;

    public CallableC0899p(C0871b c0871b, String str, ukb0 ukb0Var) {
        this.f4097a = str;
        this.f4098b = ukb0Var;
        this.f4099c = c0871b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        wxt0 wxt0VarM4878Y = this.f4099c.m4878Y(this.f4097a, 9);
        List listM208443b = wxt0VarM4878Y.m208443b();
        ukb0 ukb0Var = this.f4098b;
        if (listM208443b != null) {
            ukb0Var.mo5077b(wxt0VarM4878Y.m208442a(), wxt0VarM4878Y.m208443b());
            return null;
        }
        ukb0Var.mo5077b(wxt0VarM4878Y.m208442a(), zzco.zzl());
        return null;
    }
}
