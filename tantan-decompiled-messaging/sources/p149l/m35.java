package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class m35 {

    /* JADX INFO: renamed from: d */
    public static m35 f131013d = new m35(0, 0, 0);

    /* JADX INFO: renamed from: e */
    public static m35 f131014e = new m35(1, 2, 2);

    /* JADX INFO: renamed from: f */
    public static m35 f131015f = new m35(2, 2, 1);

    /* JADX INFO: renamed from: g */
    public static m35 f131016g = new m35(3, 1, 1);

    /* JADX INFO: renamed from: a */
    private int f131017a;

    /* JADX INFO: renamed from: b */
    private int f131018b;

    /* JADX INFO: renamed from: c */
    private int f131019c;

    public m35(int i, int i2, int i3) {
        this.f131017a = i;
        this.f131018b = i2;
        this.f131019c = i3;
    }

    /* JADX INFO: renamed from: a */
    public static m35 m152834a(int i) {
        m35 m35Var = f131013d;
        if (i == m35Var.f131017a) {
            return m35Var;
        }
        m35 m35Var2 = f131014e;
        if (i == m35Var2.f131017a) {
            return m35Var2;
        }
        m35 m35Var3 = f131015f;
        if (i == m35Var3.f131017a) {
            return m35Var3;
        }
        m35 m35Var4 = f131016g;
        if (i == m35Var4.f131017a) {
            return m35Var4;
        }
        return null;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f131017a + ",\n subWidth=" + this.f131018b + ",\n subHeight=" + this.f131019c + '}';
    }
}
