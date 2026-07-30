package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class u5m0 {

    /* JADX INFO: renamed from: a */
    public final int f174737a;

    /* JADX INFO: renamed from: b */
    public final int f174738b;

    /* JADX INFO: renamed from: c */
    public final int f174739c;

    /* JADX INFO: renamed from: d */
    public final int f174740d;

    public u5m0(int i, int i2, int i3, int i4) {
        this.f174740d = i4;
        this.f174739c = i3;
        this.f174737a = i;
        this.f174738b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static u5m0 m191871b() {
        return new u5m0(-1, -1, -1, -1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m191872a() {
        return (this.f174737a == -1 || this.f174738b == -1 || this.f174739c == -1 || this.f174740d == -1) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u5m0 u5m0Var = (u5m0) obj;
            if (this.f174737a == u5m0Var.f174737a && this.f174738b == u5m0Var.f174738b && this.f174739c == u5m0Var.f174739c && this.f174740d == u5m0Var.f174740d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(Integer.valueOf(this.f174737a), Integer.valueOf(this.f174738b), Integer.valueOf(this.f174739c), Integer.valueOf(this.f174740d));
    }

    public String toString() {
        return "firstVisibleIndex " + this.f174737a + " lastVisibleIndex " + this.f174738b + " firstCompletelyVisibleIndex " + this.f174739c + " lastCompletelyVisibleIndex " + this.f174740d;
    }
}
