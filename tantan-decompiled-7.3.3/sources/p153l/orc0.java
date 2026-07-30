package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class orc0 {

    /* JADX INFO: renamed from: j */
    public static final Object f148685j = new Object();

    /* JADX INFO: renamed from: k */
    public static int f148686k;

    /* JADX INFO: renamed from: l */
    public static orc0 f148687l;

    /* JADX INFO: renamed from: a */
    public int f148688a;

    /* JADX INFO: renamed from: b */
    public int f148689b;

    /* JADX INFO: renamed from: c */
    public int f148690c;

    /* JADX INFO: renamed from: d */
    public int f148691d;

    /* JADX INFO: renamed from: g */
    public ns2 f148694g;

    /* JADX INFO: renamed from: i */
    public orc0 f148696i;

    /* JADX INFO: renamed from: e */
    public boolean f148692e = false;

    /* JADX INFO: renamed from: f */
    public int f148693f = -1;

    /* JADX INFO: renamed from: h */
    public int f148695h = 1;

    /* JADX INFO: renamed from: a */
    public static orc0 m168910a() {
        synchronized (f148685j) {
            try {
                orc0 orc0Var = f148687l;
                if (orc0Var == null) {
                    return new orc0();
                }
                f148687l = orc0Var.f148696i;
                f148686k--;
                orc0Var.f148696i = null;
                return orc0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m168911b() {
        synchronized (f148685j) {
            try {
                int i = f148686k;
                if (i < 40) {
                    this.f148696i = f148687l;
                    f148687l = this;
                    f148686k = i + 1;
                    this.f148694g = null;
                    this.f148695h = 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
