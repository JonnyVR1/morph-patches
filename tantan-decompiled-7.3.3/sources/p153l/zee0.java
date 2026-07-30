package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zee0 implements jkj0 {

    /* JADX INFO: renamed from: a */
    public final yee0 f203996a;

    /* JADX INFO: renamed from: b */
    public final ig60 f203997b = new ig60(32);

    /* JADX INFO: renamed from: c */
    public int f203998c;

    /* JADX INFO: renamed from: d */
    public int f203999d;

    /* JADX INFO: renamed from: e */
    public boolean f204000e;

    /* JADX INFO: renamed from: f */
    public boolean f204001f;

    public zee0(yee0 yee0Var) {
        this.f203996a = yee0Var;
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: a */
    public void mo145849a(ig60 ig60Var, int i) {
        int iM139816f;
        boolean z = (i & 1) != 0;
        if (z) {
            iM139816f = ig60Var.m139816f() + ig60Var.m139795H();
        } else {
            iM139816f = -1;
        }
        if (this.f204001f) {
            if (!z) {
                return;
            }
            this.f204001f = false;
            ig60Var.m139808U(iM139816f);
            this.f203999d = 0;
        }
        while (ig60Var.m139811a() > 0) {
            int i2 = this.f203999d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM139795H = ig60Var.m139795H();
                    ig60Var.m139808U(ig60Var.m139816f() - 1);
                    if (iM139795H == 255) {
                        this.f204001f = true;
                        return;
                    }
                }
                int iMin = Math.min(ig60Var.m139811a(), 3 - this.f203999d);
                ig60Var.m139822l(this.f203997b.m139815e(), this.f203999d, iMin);
                int i3 = this.f203999d + iMin;
                this.f203999d = i3;
                if (i3 == 3) {
                    this.f203997b.m139808U(0);
                    this.f203997b.m139807T(3);
                    this.f203997b.m139809V(1);
                    int iM139795H2 = this.f203997b.m139795H();
                    int iM139795H3 = this.f203997b.m139795H();
                    this.f204000e = (iM139795H2 & 128) != 0;
                    this.f203998c = (((iM139795H2 & 15) << 8) | iM139795H3) + 3;
                    int iM139812b = this.f203997b.m139812b();
                    int i4 = this.f203998c;
                    if (iM139812b < i4) {
                        this.f203997b.m139813c(Math.min(4098, Math.max(i4, this.f203997b.m139812b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(ig60Var.m139811a(), this.f203998c - this.f203999d);
                ig60Var.m139822l(this.f203997b.m139815e(), this.f203999d, iMin2);
                int i5 = this.f203999d + iMin2;
                this.f203999d = i5;
                int i6 = this.f203998c;
                if (i5 == i6) {
                    boolean z2 = this.f204000e;
                    ig60 ig60Var2 = this.f203997b;
                    if (!z2) {
                        ig60Var2.m139807T(i6);
                    } else {
                        if (bmk0.m105168t(ig60Var2.m139815e(), 0, this.f203998c, -1) != 0) {
                            this.f204001f = true;
                            return;
                        }
                        this.f203997b.m139807T(this.f203998c - 4);
                    }
                    this.f203997b.m139808U(0);
                    this.f203996a.mo140377a(this.f203997b);
                    this.f203999d = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: b */
    public void mo145850b() {
        this.f204001f = true;
    }

    @Override // p153l.jkj0
    /* JADX INFO: renamed from: c */
    public void mo145851c(h0j0 h0j0Var, bsf bsfVar, jkj0.C17969d c17969d) {
        this.f203996a.mo140378c(h0j0Var, bsfVar, c17969d);
        this.f204001f = true;
    }
}
