package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class np1 implements lp1 {

    /* JADX INFO: renamed from: a */
    public final int f139902a;

    /* JADX INFO: renamed from: b */
    public final int f139903b;

    /* JADX INFO: renamed from: c */
    public final int f139904c;

    /* JADX INFO: renamed from: d */
    public final int f139905d;

    public np1(int i, int i2, int i3, int i4) {
        this.f139902a = i;
        this.f139903b = i2;
        this.f139904c = i3;
        this.f139905d = i4;
    }

    /* JADX INFO: renamed from: b */
    public static np1 m160440b(d860 d860Var) {
        int iM110315u = d860Var.m110315u();
        d860Var.m110293V(8);
        int iM110315u2 = d860Var.m110315u();
        int iM110315u3 = d860Var.m110315u();
        d860Var.m110293V(4);
        int iM110315u4 = d860Var.m110315u();
        d860Var.m110293V(12);
        return new np1(iM110315u, iM110315u2, iM110315u3, iM110315u4);
    }

    /* JADX INFO: renamed from: a */
    public boolean m160441a() {
        return (this.f139903b & 16) == 16;
    }

    @Override // p149l.lp1
    public int getType() {
        return 1751742049;
    }
}
