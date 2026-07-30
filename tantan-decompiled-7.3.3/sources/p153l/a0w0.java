package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a0w0 {

    /* JADX INFO: renamed from: a */
    public final Object f67760a;

    /* JADX INFO: renamed from: b */
    public yhr0 f67761b = new yhr0();

    /* JADX INFO: renamed from: c */
    public boolean f67762c;

    /* JADX INFO: renamed from: d */
    public boolean f67763d;

    public a0w0(Object obj) {
        this.f67760a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m95430a(int i, mwv0 mwv0Var) {
        if (this.f67763d) {
            return;
        }
        if (i != -1) {
            this.f67761b.m215992a(i);
        }
        this.f67762c = true;
        mwv0Var.zza(this.f67760a);
    }

    /* JADX INFO: renamed from: b */
    public final void m95431b(zyv0 zyv0Var) {
        if (this.f67763d || !this.f67762c) {
            return;
        }
        akr0 akr0VarM215993b = this.f67761b.m215993b();
        this.f67761b = new yhr0();
        this.f67762c = false;
        zyv0Var.mo172464a(this.f67760a, akr0VarM215993b);
    }

    /* JADX INFO: renamed from: c */
    public final void m95432c(zyv0 zyv0Var) {
        this.f67763d = true;
        if (this.f67762c) {
            this.f67762c = false;
            zyv0Var.mo172464a(this.f67760a, this.f67761b.m215993b());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0w0.class != obj.getClass()) {
            return false;
        }
        return this.f67760a.equals(((a0w0) obj).f67760a);
    }

    public final int hashCode() {
        return this.f67760a.hashCode();
    }
}
