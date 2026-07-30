package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class op1 implements lp1 {

    /* JADX INFO: renamed from: a */
    public final int f144938a;

    /* JADX INFO: renamed from: b */
    public final int f144939b;

    /* JADX INFO: renamed from: c */
    public final int f144940c;

    /* JADX INFO: renamed from: d */
    public final int f144941d;

    /* JADX INFO: renamed from: e */
    public final int f144942e;

    /* JADX INFO: renamed from: f */
    public final int f144943f;

    public op1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f144938a = i;
        this.f144939b = i2;
        this.f144940c = i3;
        this.f144941d = i4;
        this.f144942e = i5;
        this.f144943f = i6;
    }

    /* JADX INFO: renamed from: c */
    public static op1 m165288c(d860 d860Var) {
        int iM110315u = d860Var.m110315u();
        d860Var.m110293V(12);
        int iM110315u2 = d860Var.m110315u();
        int iM110315u3 = d860Var.m110315u();
        int iM110315u4 = d860Var.m110315u();
        d860Var.m110293V(4);
        int iM110315u5 = d860Var.m110315u();
        int iM110315u6 = d860Var.m110315u();
        d860Var.m110293V(8);
        return new op1(iM110315u, iM110315u2, iM110315u3, iM110315u4, iM110315u5, iM110315u6);
    }

    /* JADX INFO: renamed from: a */
    public long m165289a() {
        return vck0.m197832W0(this.f144942e, ((long) this.f144940c) * 1000000, this.f144941d);
    }

    /* JADX INFO: renamed from: b */
    public int m165290b() {
        int i = this.f144938a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        jwv.m143689i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f144938a));
        return -1;
    }

    @Override // p149l.lp1
    public int getType() {
        return 1752331379;
    }
}
