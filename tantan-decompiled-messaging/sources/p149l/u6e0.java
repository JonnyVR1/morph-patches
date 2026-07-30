package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class u6e0 implements fbj0 {

    /* JADX INFO: renamed from: a */
    public final t6e0 f174829a;

    /* JADX INFO: renamed from: b */
    public final d860 f174830b = new d860(32);

    /* JADX INFO: renamed from: c */
    public int f174831c;

    /* JADX INFO: renamed from: d */
    public int f174832d;

    /* JADX INFO: renamed from: e */
    public boolean f174833e;

    /* JADX INFO: renamed from: f */
    public boolean f174834f;

    public u6e0(t6e0 t6e0Var) {
        this.f174829a = t6e0Var;
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: a */
    public void mo120352a(d860 d860Var, int i) {
        int iM110300f;
        boolean z = (i & 1) != 0;
        if (z) {
            iM110300f = d860Var.m110300f() + d860Var.m110279H();
        } else {
            iM110300f = -1;
        }
        if (this.f174834f) {
            if (!z) {
                return;
            }
            this.f174834f = false;
            d860Var.m110292U(iM110300f);
            this.f174832d = 0;
        }
        while (d860Var.m110295a() > 0) {
            int i2 = this.f174832d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM110279H = d860Var.m110279H();
                    d860Var.m110292U(d860Var.m110300f() - 1);
                    if (iM110279H == 255) {
                        this.f174834f = true;
                        return;
                    }
                }
                int iMin = Math.min(d860Var.m110295a(), 3 - this.f174832d);
                d860Var.m110306l(this.f174830b.m110299e(), this.f174832d, iMin);
                int i3 = this.f174832d + iMin;
                this.f174832d = i3;
                if (i3 == 3) {
                    this.f174830b.m110292U(0);
                    this.f174830b.m110291T(3);
                    this.f174830b.m110293V(1);
                    int iM110279H2 = this.f174830b.m110279H();
                    int iM110279H3 = this.f174830b.m110279H();
                    this.f174833e = (iM110279H2 & 128) != 0;
                    this.f174831c = (((iM110279H2 & 15) << 8) | iM110279H3) + 3;
                    int iM110296b = this.f174830b.m110296b();
                    int i4 = this.f174831c;
                    if (iM110296b < i4) {
                        this.f174830b.m110297c(Math.min(4098, Math.max(i4, this.f174830b.m110296b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d860Var.m110295a(), this.f174831c - this.f174832d);
                d860Var.m110306l(this.f174830b.m110299e(), this.f174832d, iMin2);
                int i5 = this.f174832d + iMin2;
                this.f174832d = i5;
                int i6 = this.f174831c;
                if (i5 == i6) {
                    boolean z2 = this.f174833e;
                    d860 d860Var2 = this.f174830b;
                    if (!z2) {
                        d860Var2.m110291T(i6);
                    } else {
                        if (vck0.m197890t(d860Var2.m110299e(), 0, this.f174831c, -1) != 0) {
                            this.f174834f = true;
                            return;
                        }
                        this.f174830b.m110291T(this.f174831c - 4);
                    }
                    this.f174830b.m110292U(0);
                    this.f174829a.mo115502a(this.f174830b);
                    this.f174832d = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: b */
    public void mo120353b() {
        this.f174834f = true;
    }

    @Override // p149l.fbj0
    /* JADX INFO: renamed from: c */
    public void mo120354c(eri0 eri0Var, uqf uqfVar, fbj0.C16793d c16793d) {
        this.f174829a.mo115503c(eri0Var, uqfVar, c16793d);
        this.f174834f = true;
    }
}
