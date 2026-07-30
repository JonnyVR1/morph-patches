package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class uqv0 {

    /* JADX INFO: renamed from: a */
    public final Object f177784a;

    /* JADX INFO: renamed from: b */
    public s8r0 f177785b = new s8r0();

    /* JADX INFO: renamed from: c */
    public boolean f177786c;

    /* JADX INFO: renamed from: d */
    public boolean f177787d;

    public uqv0(Object obj) {
        this.f177784a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m195017a(int i, gnv0 gnv0Var) {
        if (this.f177787d) {
            return;
        }
        if (i != -1) {
            this.f177785b.m182663a(i);
        }
        this.f177786c = true;
        gnv0Var.zza(this.f177784a);
    }

    /* JADX INFO: renamed from: b */
    public final void m195018b(tpv0 tpv0Var) {
        if (this.f177787d || !this.f177786c) {
            return;
        }
        uar0 uar0VarM182664b = this.f177785b.m182664b();
        this.f177785b = new s8r0();
        this.f177786c = false;
        tpv0Var.mo140602a(this.f177784a, uar0VarM182664b);
    }

    /* JADX INFO: renamed from: c */
    public final void m195019c(tpv0 tpv0Var) {
        this.f177787d = true;
        if (this.f177786c) {
            this.f177786c = false;
            tpv0Var.mo140602a(this.f177784a, this.f177785b.m182664b());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uqv0.class != obj.getClass()) {
            return false;
        }
        return this.f177784a.equals(((uqv0) obj).f177784a);
    }

    public final int hashCode() {
        return this.f177784a.hashCode();
    }
}
