package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class wpi0 {

    /* JADX INFO: renamed from: g */
    public static final Object f190305g = new Object();

    /* JADX INFO: renamed from: h */
    public static int f190306h;

    /* JADX INFO: renamed from: i */
    public static wpi0 f190307i;

    /* JADX INFO: renamed from: a */
    public int f190308a;

    /* JADX INFO: renamed from: b */
    public int f190309b;

    /* JADX INFO: renamed from: c */
    public int f190310c;

    /* JADX INFO: renamed from: d */
    public int f190311d;

    /* JADX INFO: renamed from: e */
    public String f190312e;

    /* JADX INFO: renamed from: f */
    public wpi0 f190313f;

    /* JADX INFO: renamed from: a */
    public static wpi0 m207460a() {
        synchronized (f190305g) {
            try {
                wpi0 wpi0Var = f190307i;
                if (wpi0Var == null) {
                    return new wpi0();
                }
                f190307i = wpi0Var.f190313f;
                f190306h--;
                wpi0Var.f190313f = null;
                return wpi0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m207461b() {
        synchronized (f190305g) {
            try {
                int i = f190306h;
                if (i < 30) {
                    this.f190313f = f190307i;
                    f190307i = this;
                    f190306h = i + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m207462c(int i, int i2, int i3, int i4, String str) {
        this.f190308a = i;
        this.f190309b = i2;
        this.f190311d = i4;
        this.f190312e = str;
        this.f190310c = i3;
    }
}
