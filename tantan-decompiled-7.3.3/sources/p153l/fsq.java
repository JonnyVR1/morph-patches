package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class fsq {

    /* JADX INFO: renamed from: i */
    public static final Object f100670i = new Object();

    /* JADX INFO: renamed from: j */
    public static int f100671j;

    /* JADX INFO: renamed from: k */
    public static fsq f100672k;

    /* JADX INFO: renamed from: b */
    public int f100674b;

    /* JADX INFO: renamed from: e */
    public long f100677e;

    /* JADX INFO: renamed from: f */
    public int f100678f;

    /* JADX INFO: renamed from: h */
    public fsq f100680h;

    /* JADX INFO: renamed from: a */
    public int f100673a = -1;

    /* JADX INFO: renamed from: c */
    public boolean f100675c = false;

    /* JADX INFO: renamed from: d */
    public boolean f100676d = false;

    /* JADX INFO: renamed from: g */
    public boolean f100679g = false;

    /* JADX INFO: renamed from: a */
    public static fsq m127226a() {
        synchronized (f100670i) {
            try {
                fsq fsqVar = f100672k;
                if (fsqVar == null) {
                    return new fsq();
                }
                f100672k = fsqVar.f100680h;
                f100671j--;
                fsqVar.f100680h = null;
                return fsqVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public fsq m127227b(boolean z) {
        this.f100675c = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public fsq m127228c(boolean z) {
        this.f100676d = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public fsq m127229d(long j) {
        this.f100677e = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public fsq m127230e(boolean z) {
        this.f100679g = z;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public fsq m127231f(int i) {
        this.f100673a = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public fsq m127232g(int i) {
        this.f100678f = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fsq m127233h(int i) {
        this.f100674b = i;
        return this;
    }

    public String toString() {
        return "jumpInfo" + this.f100673a + "." + this.f100674b + "." + this.f100675c + "." + this.f100676d + "." + this.f100677e + "." + this.f100678f + "." + this.f100679g;
    }
}
