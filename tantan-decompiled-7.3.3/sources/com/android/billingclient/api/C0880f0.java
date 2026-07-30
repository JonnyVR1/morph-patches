package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2423n0;
import com.google.android.gms.internal.play_billing.C2425o0;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.f4y0;
import p153l.nfs0;
import p153l.r4y0;
import p153l.t2y0;

/* JADX INFO: renamed from: com.android.billingclient.api.f0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0880f0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4017a = 0;

    static {
        int i = InterfaceC0882g0.f4024a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m5032a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + nfs0.m162940b(exc.getMessage());
            int i = C2426p.f10406a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static C2421m0 m5033b(int i, int i2, C0875d c0875d) {
        try {
            t2y0 t2y0VarM14924D = C2421m0.m14924D();
            r4y0 r4y0VarM14961D = C2425o0.m14961D();
            r4y0VarM14961D.m179835r(c0875d.m4976b());
            r4y0VarM14961D.m179834q(c0875d.m4975a());
            r4y0VarM14961D.m179836s(i);
            t2y0VarM14924D.m189007o(r4y0VarM14961D);
            t2y0VarM14924D.m189009r(i2);
            return (C2421m0) t2y0VarM14924D.m168605k();
        } catch (Exception e) {
            C2426p.m14975l("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static C2421m0 m5034c(int i, int i2, C0875d c0875d, @Nullable String str) {
        try {
            r4y0 r4y0VarM14961D = C2425o0.m14961D();
            r4y0VarM14961D.m179835r(c0875d.m4976b());
            r4y0VarM14961D.m179834q(c0875d.m4975a());
            r4y0VarM14961D.m179836s(i);
            if (str != null) {
                r4y0VarM14961D.m179833o(str);
            }
            t2y0 t2y0VarM14924D = C2421m0.m14924D();
            t2y0VarM14924D.m189007o(r4y0VarM14961D);
            t2y0VarM14924D.m189009r(i2);
            return (C2421m0) t2y0VarM14924D.m168605k();
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static C2423n0 m5035d(int i) {
        try {
            f4y0 f4y0VarM14929C = C2423n0.m14929C();
            f4y0VarM14929C.m124093r(i);
            return (C2423n0) f4y0VarM14929C.m168605k();
        } catch (Exception e) {
            C2426p.m14975l("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
