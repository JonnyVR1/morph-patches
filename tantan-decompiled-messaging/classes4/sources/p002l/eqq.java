package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eqq {

    /* JADX INFO: renamed from: i */
    public static final Object f9935i = new Object();

    /* JADX INFO: renamed from: j */
    public static int f9936j;

    /* JADX INFO: renamed from: k */
    public static eqq f9937k;

    /* JADX INFO: renamed from: b */
    public int f9939b;

    /* JADX INFO: renamed from: e */
    public long f9942e;

    /* JADX INFO: renamed from: f */
    public int f9943f;

    /* JADX INFO: renamed from: h */
    public eqq f9945h;

    /* JADX INFO: renamed from: a */
    public int f9938a = -1;

    /* JADX INFO: renamed from: c */
    public boolean f9940c = false;

    /* JADX INFO: renamed from: d */
    public boolean f9941d = false;

    /* JADX INFO: renamed from: g */
    public boolean f9944g = false;

    /* JADX INFO: renamed from: a */
    public static eqq m12661a() {
        synchronized (f9935i) {
            try {
                eqq eqqVar = f9937k;
                if (eqqVar == null) {
                    return new eqq();
                }
                f9937k = eqqVar.f9945h;
                f9936j--;
                eqqVar.f9945h = null;
                return eqqVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public eqq m12662b(boolean z) {
        this.f9940c = z;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public eqq m12663c(boolean z) {
        this.f9941d = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public eqq m12664d(long j) {
        this.f9942e = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public eqq m12665e(boolean z) {
        this.f9944g = z;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public eqq m12666f(int i) {
        this.f9938a = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public eqq m12667g(int i) {
        this.f9943f = i;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public eqq m12668h(int i) {
        this.f9939b = i;
        return this;
    }

    public String toString() {
        return "jumpInfo" + this.f9938a + "." + this.f9939b + "." + this.f9940c + "." + this.f9941d + "." + this.f9942e + "." + this.f9943f + "." + this.f9944g;
    }
}
