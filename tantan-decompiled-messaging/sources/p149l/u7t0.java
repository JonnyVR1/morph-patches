package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class u7t0 {

    /* JADX INFO: renamed from: a */
    public final s8r0 f175071a = new s8r0();

    /* JADX INFO: renamed from: a */
    public final u7t0 m192164a(int i) {
        this.f175071a.m182663a(i);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final u7t0 m192165b(iat0 iat0Var) {
        uar0 uar0Var = iat0Var.f112328a;
        for (int i = 0; i < uar0Var.m192798b(); i++) {
            this.f175071a.m182663a(uar0Var.m192797a(i));
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final u7t0 m192166c(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.f175071a.m182663a(iArr[i]);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final u7t0 m192167d(int i, boolean z) {
        if (z) {
            this.f175071a.m182663a(i);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final iat0 m192168e() {
        return new iat0(this.f175071a.m182664b(), null);
    }
}
