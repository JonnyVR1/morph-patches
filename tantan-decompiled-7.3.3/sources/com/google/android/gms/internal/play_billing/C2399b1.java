package com.google.android.gms.internal.play_billing;

import p153l.dyy0;
import p153l.k1z0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2399b1 {

    /* JADX INFO: renamed from: a */
    public Object f10347a;

    /* JADX INFO: renamed from: b */
    public dyy0 f10348b;

    /* JADX INFO: renamed from: c */
    public k1z0 f10349c = k1z0.m147935i();

    /* JADX INFO: renamed from: d */
    public boolean f10350d;

    /* JADX INFO: renamed from: a */
    public final void m14805a() {
        this.f10347a = null;
        this.f10348b = null;
        this.f10349c.mo147936c(null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14806b(Object obj) {
        this.f10350d = true;
        dyy0 dyy0Var = this.f10348b;
        boolean z = dyy0Var != null && dyy0Var.m118730a(obj);
        if (z) {
            this.f10347a = null;
            this.f10348b = null;
            this.f10349c = null;
        }
        return z;
    }

    public final void finalize() {
        k1z0 k1z0Var;
        dyy0 dyy0Var = this.f10348b;
        if (dyy0Var != null && !dyy0Var.isDone()) {
            dyy0Var.m118731b(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f10347a))));
        }
        if (this.f10350d || (k1z0Var = this.f10349c) == null) {
            return;
        }
        k1z0Var.mo147936c(null);
    }
}
