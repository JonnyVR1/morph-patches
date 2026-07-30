package com.google.android.gms.internal.play_billing;

import p149l.esy0;
import p149l.xoy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2376b1 {

    /* JADX INFO: renamed from: a */
    public Object f10310a;

    /* JADX INFO: renamed from: b */
    public xoy0 f10311b;

    /* JADX INFO: renamed from: c */
    public esy0 f10312c = esy0.m117966i();

    /* JADX INFO: renamed from: d */
    public boolean f10313d;

    /* JADX INFO: renamed from: a */
    public final void m14751a() {
        this.f10310a = null;
        this.f10311b = null;
        this.f10312c.mo117967c(null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14752b(Object obj) {
        this.f10313d = true;
        xoy0 xoy0Var = this.f10311b;
        boolean z = xoy0Var != null && xoy0Var.m210454a(obj);
        if (z) {
            this.f10310a = null;
            this.f10311b = null;
            this.f10312c = null;
        }
        return z;
    }

    public final void finalize() {
        esy0 esy0Var;
        xoy0 xoy0Var = this.f10311b;
        if (xoy0Var != null && !xoy0Var.isDone()) {
            xoy0Var.m210455b(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f10310a))));
        }
        if (this.f10313d || (esy0Var = this.f10312c) == null) {
            return;
        }
        esy0Var.mo117967c(null);
    }
}
