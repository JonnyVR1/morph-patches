package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2400n0;
import com.google.android.gms.internal.play_billing.C2402o0;
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.h6s0;
import p149l.lvx0;
import p149l.ntx0;
import p149l.zux0;

/* JADX INFO: renamed from: com.android.billingclient.api.f0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0876f0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4017a = 0;

    static {
        int i = InterfaceC0878g0.f4024a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m5022a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + h6s0.m129527b(exc.getMessage());
            int i = C2403p.f10369a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static C2398m0 m5023b(int i, int i2, C0871d c0871d) {
        try {
            ntx0 ntx0VarM14870D = C2398m0.m14870D();
            lvx0 lvx0VarM14907D = C2402o0.m14907D();
            lvx0VarM14907D.m151924r(c0871d.m4966b());
            lvx0VarM14907D.m151923q(c0871d.m4965a());
            lvx0VarM14907D.m151925s(i);
            ntx0VarM14870D.m161418o(lvx0VarM14907D);
            ntx0VarM14870D.m161420r(i2);
            return (C2398m0) ntx0VarM14870D.m135959k();
        } catch (Exception e) {
            C2403p.m14921l("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static C2398m0 m5024c(int i, int i2, C0871d c0871d, @Nullable String str) {
        try {
            lvx0 lvx0VarM14907D = C2402o0.m14907D();
            lvx0VarM14907D.m151924r(c0871d.m4966b());
            lvx0VarM14907D.m151923q(c0871d.m4965a());
            lvx0VarM14907D.m151925s(i);
            if (str != null) {
                lvx0VarM14907D.m151922o(str);
            }
            ntx0 ntx0VarM14870D = C2398m0.m14870D();
            ntx0VarM14870D.m161418o(lvx0VarM14907D);
            ntx0VarM14870D.m161420r(i2);
            return (C2398m0) ntx0VarM14870D.m135959k();
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static C2400n0 m5025d(int i) {
        try {
            zux0 zux0VarM14875C = C2400n0.m14875C();
            zux0VarM14875C.m220274r(i);
            return (C2400n0) zux0VarM14875C.m135959k();
        } catch (Exception e) {
            C2403p.m14921l("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
