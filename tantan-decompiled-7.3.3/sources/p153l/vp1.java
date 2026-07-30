package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vp1 implements sp1 {

    /* JADX INFO: renamed from: a */
    public final int f185199a;

    /* JADX INFO: renamed from: b */
    public final int f185200b;

    /* JADX INFO: renamed from: c */
    public final int f185201c;

    /* JADX INFO: renamed from: d */
    public final int f185202d;

    /* JADX INFO: renamed from: e */
    public final int f185203e;

    /* JADX INFO: renamed from: f */
    public final int f185204f;

    public vp1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f185199a = i;
        this.f185200b = i2;
        this.f185201c = i3;
        this.f185202d = i4;
        this.f185203e = i5;
        this.f185204f = i6;
    }

    /* JADX INFO: renamed from: c */
    public static vp1 m202184c(ig60 ig60Var) {
        int iM139831u = ig60Var.m139831u();
        ig60Var.m139809V(12);
        int iM139831u2 = ig60Var.m139831u();
        int iM139831u3 = ig60Var.m139831u();
        int iM139831u4 = ig60Var.m139831u();
        ig60Var.m139809V(4);
        int iM139831u5 = ig60Var.m139831u();
        int iM139831u6 = ig60Var.m139831u();
        ig60Var.m139809V(8);
        return new vp1(iM139831u, iM139831u2, iM139831u3, iM139831u4, iM139831u5, iM139831u6);
    }

    /* JADX INFO: renamed from: a */
    public long m202185a() {
        return bmk0.m105110W0(this.f185203e, ((long) this.f185201c) * 1000000, this.f185202d);
    }

    /* JADX INFO: renamed from: b */
    public int m202186b() {
        int i = this.f185199a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        kyv.m152151i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f185199a));
        return -1;
    }

    @Override // p153l.sp1
    public int getType() {
        return 1752331379;
    }
}
