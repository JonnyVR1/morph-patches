package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class n45 {

    /* JADX INFO: renamed from: d */
    public static n45 f140182d = new n45(0, 0, 0);

    /* JADX INFO: renamed from: e */
    public static n45 f140183e = new n45(1, 2, 2);

    /* JADX INFO: renamed from: f */
    public static n45 f140184f = new n45(2, 2, 1);

    /* JADX INFO: renamed from: g */
    public static n45 f140185g = new n45(3, 1, 1);

    /* JADX INFO: renamed from: a */
    private int f140186a;

    /* JADX INFO: renamed from: b */
    private int f140187b;

    /* JADX INFO: renamed from: c */
    private int f140188c;

    public n45(int i, int i2, int i3) {
        this.f140186a = i;
        this.f140187b = i2;
        this.f140188c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static n45 m161537a(int i) {
        n45 n45Var = f140182d;
        if (i == n45Var.f140186a) {
            return n45Var;
        }
        n45 n45Var2 = f140183e;
        if (i == n45Var2.f140186a) {
            return n45Var2;
        }
        n45 n45Var3 = f140184f;
        if (i == n45Var3.f140186a) {
            return n45Var3;
        }
        n45 n45Var4 = f140185g;
        if (i == n45Var4.f140186a) {
            return n45Var4;
        }
        return null;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f140186a + ",\n subWidth=" + this.f140187b + ",\n subHeight=" + this.f140188c + '}';
    }
}
