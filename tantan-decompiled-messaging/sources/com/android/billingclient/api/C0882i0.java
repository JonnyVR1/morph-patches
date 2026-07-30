package com.android.billingclient.api;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2398m0;
import com.google.android.gms.internal.play_billing.C2400n0;
import com.google.android.gms.internal.play_billing.C2403p;
import com.google.android.gms.internal.play_billing.C2404p0;
import com.google.android.gms.internal.play_billing.C2408r0;
import com.google.android.gms.internal.play_billing.C2418w0;
import com.google.android.gms.internal.play_billing.C2422y0;
import com.google.android.gms.internal.play_billing.C2424z0;
import p149l.g1y0;
import p149l.yxx0;

/* JADX INFO: renamed from: com.android.billingclient.api.i0 */
/* JADX INFO: loaded from: classes.dex */
final class C0882i0 implements InterfaceC0878g0 {

    /* JADX INFO: renamed from: b */
    private C2408r0 f4063b;

    /* JADX INFO: renamed from: c */
    private final C0884j0 f4064c;

    public C0882i0(Context context, C2408r0 c2408r0) {
        this.f4064c = new C0884j0(context);
        this.f4063b = c2408r0;
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: a */
    public final void mo5040a(C2404p0 c2404p0) {
        try {
            g1y0 g1y0VarM14957F = C2418w0.m14957F();
            g1y0VarM14957F.m124137s(this.f4063b);
            g1y0VarM14957F.m124136r(c2404p0);
            this.f4064c.m5048a((C2418w0) g1y0VarM14957F.m135959k());
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: b */
    public final void mo5041b(C2422y0 c2422y0) {
        try {
            C0884j0 c0884j0 = this.f4064c;
            g1y0 g1y0VarM14957F = C2418w0.m14957F();
            g1y0VarM14957F.m124137s(this.f4063b);
            g1y0VarM14957F.m124138t(c2422y0);
            c0884j0.m5048a((C2418w0) g1y0VarM14957F.m135959k());
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: c */
    public final void mo5042c(@Nullable C2424z0 c2424z0) {
        if (c2424z0 == null) {
            return;
        }
        try {
            g1y0 g1y0VarM14957F = C2418w0.m14957F();
            g1y0VarM14957F.m124137s(this.f4063b);
            g1y0VarM14957F.m124139u(c2424z0);
            this.f4064c.m5048a((C2418w0) g1y0VarM14957F.m135959k());
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: d */
    public final void mo5043d(@Nullable C2398m0 c2398m0) {
        if (c2398m0 == null) {
            return;
        }
        try {
            g1y0 g1y0VarM14957F = C2418w0.m14957F();
            g1y0VarM14957F.m124137s(this.f4063b);
            g1y0VarM14957F.m124134o(c2398m0);
            this.f4064c.m5048a((C2418w0) g1y0VarM14957F.m135959k());
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: e */
    public final void mo5044e(@Nullable C2400n0 c2400n0, int i) {
        try {
            yxx0 yxx0Var = (yxx0) this.f4063b.m14772k();
            yxx0Var.m216489o(i);
            this.f4063b = (C2408r0) yxx0Var.m135959k();
            mo5046g(c2400n0);
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: f */
    public final void mo5045f(@Nullable C2398m0 c2398m0, int i) {
        try {
            yxx0 yxx0Var = (yxx0) this.f4063b.m14772k();
            yxx0Var.m216489o(i);
            this.f4063b = (C2408r0) yxx0Var.m135959k();
            mo5043d(c2398m0);
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0878g0
    /* JADX INFO: renamed from: g */
    public final void mo5046g(@Nullable C2400n0 c2400n0) {
        if (c2400n0 == null) {
            return;
        }
        try {
            g1y0 g1y0VarM14957F = C2418w0.m14957F();
            g1y0VarM14957F.m124137s(this.f4063b);
            g1y0VarM14957F.m124135q(c2400n0);
            this.f4064c.m5048a((C2418w0) g1y0VarM14957F.m135959k());
        } catch (Throwable th) {
            C2403p.m14921l("BillingLogger", "Unable to log.", th);
        }
    }
}
