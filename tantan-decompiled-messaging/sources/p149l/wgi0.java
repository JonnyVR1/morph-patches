package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class wgi0 {

    /* JADX INFO: renamed from: g */
    public static final Object f186196g = new Object();

    /* JADX INFO: renamed from: h */
    public static int f186197h;

    /* JADX INFO: renamed from: i */
    public static wgi0 f186198i;

    /* JADX INFO: renamed from: a */
    public int f186199a;

    /* JADX INFO: renamed from: b */
    public int f186200b;

    /* JADX INFO: renamed from: c */
    public int f186201c;

    /* JADX INFO: renamed from: d */
    public int f186202d;

    /* JADX INFO: renamed from: e */
    public String f186203e;

    /* JADX INFO: renamed from: f */
    public wgi0 f186204f;

    /* JADX INFO: renamed from: a */
    public static wgi0 m203055a() {
        synchronized (f186196g) {
            try {
                wgi0 wgi0Var = f186198i;
                if (wgi0Var == null) {
                    return new wgi0();
                }
                f186198i = wgi0Var.f186204f;
                f186197h--;
                wgi0Var.f186204f = null;
                return wgi0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m203056b() {
        synchronized (f186196g) {
            try {
                int i = f186197h;
                if (i < 30) {
                    this.f186204f = f186198i;
                    f186198i = this;
                    f186197h = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m203057c(int i, int i2, int i3, int i4, String str) {
        this.f186199a = i;
        this.f186200b = i2;
        this.f186202d = i4;
        this.f186203e = str;
        this.f186201c = i3;
    }
}
