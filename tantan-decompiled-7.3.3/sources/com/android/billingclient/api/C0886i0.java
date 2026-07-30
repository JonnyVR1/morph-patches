package com.android.billingclient.api;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.C2421m0;
import com.google.android.gms.internal.play_billing.C2423n0;
import com.google.android.gms.internal.play_billing.C2426p;
import com.google.android.gms.internal.play_billing.C2427p0;
import com.google.android.gms.internal.play_billing.C2431r0;
import com.google.android.gms.internal.play_billing.C2441w0;
import com.google.android.gms.internal.play_billing.C2445y0;
import com.google.android.gms.internal.play_billing.C2447z0;
import p153l.e7y0;
import p153l.may0;

/* JADX INFO: renamed from: com.android.billingclient.api.i0 */
/* JADX INFO: loaded from: classes.dex */
final class C0886i0 implements InterfaceC0882g0 {

    /* JADX INFO: renamed from: b */
    private C2431r0 f4063b;

    /* JADX INFO: renamed from: c */
    private final C0888j0 f4064c;

    public C0886i0(Context context, C2431r0 c2431r0) {
        this.f4064c = new C0888j0(context);
        this.f4063b = c2431r0;
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: a */
    public final void mo5050a(C2427p0 c2427p0) {
        try {
            may0 may0VarM15011F = C2441w0.m15011F();
            may0VarM15011F.m157759s(this.f4063b);
            may0VarM15011F.m157758r(c2427p0);
            this.f4064c.m5058a((C2441w0) may0VarM15011F.m168605k());
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: b */
    public final void mo5051b(C2445y0 c2445y0) {
        try {
            C0888j0 c0888j0 = this.f4064c;
            may0 may0VarM15011F = C2441w0.m15011F();
            may0VarM15011F.m157759s(this.f4063b);
            may0VarM15011F.m157760t(c2445y0);
            c0888j0.m5058a((C2441w0) may0VarM15011F.m168605k());
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: c */
    public final void mo5052c(@Nullable C2447z0 c2447z0) {
        if (c2447z0 == null) {
            return;
        }
        try {
            may0 may0VarM15011F = C2441w0.m15011F();
            may0VarM15011F.m157759s(this.f4063b);
            may0VarM15011F.m157761u(c2447z0);
            this.f4064c.m5058a((C2441w0) may0VarM15011F.m168605k());
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: d */
    public final void mo5053d(@Nullable C2421m0 c2421m0) {
        if (c2421m0 == null) {
            return;
        }
        try {
            may0 may0VarM15011F = C2441w0.m15011F();
            may0VarM15011F.m157759s(this.f4063b);
            may0VarM15011F.m157756o(c2421m0);
            this.f4064c.m5058a((C2441w0) may0VarM15011F.m168605k());
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: e */
    public final void mo5054e(@Nullable C2423n0 c2423n0, int i) {
        try {
            e7y0 e7y0Var = (e7y0) this.f4063b.m14826k();
            e7y0Var.m119777o(i);
            this.f4063b = (C2431r0) e7y0Var.m168605k();
            mo5056g(c2423n0);
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: f */
    public final void mo5055f(@Nullable C2421m0 c2421m0, int i) {
        try {
            e7y0 e7y0Var = (e7y0) this.f4063b.m14826k();
            e7y0Var.m119777o(i);
            this.f4063b = (C2431r0) e7y0Var.m168605k();
            mo5053d(c2421m0);
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC0882g0
    /* JADX INFO: renamed from: g */
    public final void mo5056g(@Nullable C2423n0 c2423n0) {
        if (c2423n0 == null) {
            return;
        }
        try {
            may0 may0VarM15011F = C2441w0.m15011F();
            may0VarM15011F.m157759s(this.f4063b);
            may0VarM15011F.m157757q(c2423n0);
            this.f4064c.m5058a((C2441w0) may0VarM15011F.m168605k());
        } catch (Throwable th) {
            C2426p.m14975l("BillingLogger", "Unable to log.", th);
        }
    }
}
