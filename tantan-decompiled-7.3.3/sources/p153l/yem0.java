package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class yem0 {

    /* JADX INFO: renamed from: a */
    public final int f199381a;

    /* JADX INFO: renamed from: b */
    public final int f199382b;

    /* JADX INFO: renamed from: c */
    public final int f199383c;

    /* JADX INFO: renamed from: d */
    public final int f199384d;

    public yem0(int i, int i2, int i3, int i4) {
        this.f199384d = i4;
        this.f199383c = i3;
        this.f199381a = i;
        this.f199382b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static yem0 m215421b() {
        return new yem0(-1, -1, -1, -1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m215422a() {
        return (this.f199381a == -1 || this.f199382b == -1 || this.f199383c == -1 || this.f199384d == -1) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            yem0 yem0Var = (yem0) obj;
            if (this.f199381a == yem0Var.f199381a && this.f199382b == yem0Var.f199382b && this.f199383c == yem0Var.f199383c && this.f199384d == yem0Var.f199384d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(Integer.valueOf(this.f199381a), Integer.valueOf(this.f199382b), Integer.valueOf(this.f199383c), Integer.valueOf(this.f199384d));
    }

    public String toString() {
        return "firstVisibleIndex " + this.f199381a + " lastVisibleIndex " + this.f199382b + " firstCompletelyVisibleIndex " + this.f199383c + " lastCompletelyVisibleIndex " + this.f199384d;
    }
}
