package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class up1 implements sp1 {

    /* JADX INFO: renamed from: a */
    public final int f180203a;

    /* JADX INFO: renamed from: b */
    public final int f180204b;

    /* JADX INFO: renamed from: c */
    public final int f180205c;

    /* JADX INFO: renamed from: d */
    public final int f180206d;

    public up1(int i, int i2, int i3, int i4) {
        this.f180203a = i;
        this.f180204b = i2;
        this.f180205c = i3;
        this.f180206d = i4;
    }

    /* JADX INFO: renamed from: b */
    public static up1 m197035b(ig60 ig60Var) {
        int iM139831u = ig60Var.m139831u();
        ig60Var.m139809V(8);
        int iM139831u2 = ig60Var.m139831u();
        int iM139831u3 = ig60Var.m139831u();
        ig60Var.m139809V(4);
        int iM139831u4 = ig60Var.m139831u();
        ig60Var.m139809V(12);
        return new up1(iM139831u, iM139831u2, iM139831u3, iM139831u4);
    }

    /* JADX INFO: renamed from: a */
    public boolean m197036a() {
        return (this.f180204b & 16) == 16;
    }

    @Override // p153l.sp1
    public int getType() {
        return 1751742049;
    }
}
