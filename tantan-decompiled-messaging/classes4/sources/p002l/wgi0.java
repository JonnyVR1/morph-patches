package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wgi0 {

    /* JADX INFO: renamed from: g */
    public static final Object f21751g = new Object();

    /* JADX INFO: renamed from: h */
    public static int f21752h;

    /* JADX INFO: renamed from: i */
    public static wgi0 f21753i;

    /* JADX INFO: renamed from: a */
    public int f21754a;

    /* JADX INFO: renamed from: b */
    public int f21755b;

    /* JADX INFO: renamed from: c */
    public int f21756c;

    /* JADX INFO: renamed from: d */
    public int f21757d;

    /* JADX INFO: renamed from: e */
    public String f21758e;

    /* JADX INFO: renamed from: f */
    public wgi0 f21759f;

    /* JADX INFO: renamed from: a */
    public static wgi0 m24597a() {
        synchronized (f21751g) {
            try {
                wgi0 wgi0Var = f21753i;
                if (wgi0Var == null) {
                    return new wgi0();
                }
                f21753i = wgi0Var.f21759f;
                f21752h--;
                wgi0Var.f21759f = null;
                return wgi0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24598b() {
        synchronized (f21751g) {
            try {
                int i = f21752h;
                if (i < 30) {
                    this.f21759f = f21753i;
                    f21753i = this;
                    f21752h = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m24599c(int i, int i2, int i3, int i4, String str) {
        this.f21754a = i;
        this.f21755b = i2;
        this.f21757d = i4;
        this.f21758e = str;
        this.f21756c = i3;
    }
}
