package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class d1w0 {

    /* JADX INFO: renamed from: a */
    public final long f83306a;

    /* JADX INFO: renamed from: c */
    public long f83308c;

    /* JADX INFO: renamed from: b */
    public final c1w0 f83307b = new c1w0();

    /* JADX INFO: renamed from: d */
    public int f83309d = 0;

    /* JADX INFO: renamed from: e */
    public int f83310e = 0;

    /* JADX INFO: renamed from: f */
    public int f83311f = 0;

    public d1w0() {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        this.f83306a = jCurrentTimeMillis;
        this.f83308c = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public final int m109684a() {
        return this.f83309d;
    }

    /* JADX INFO: renamed from: b */
    public final long m109685b() {
        return this.f83306a;
    }

    /* JADX INFO: renamed from: c */
    public final long m109686c() {
        return this.f83308c;
    }

    /* JADX INFO: renamed from: d */
    public final c1w0 m109687d() {
        c1w0 c1w0Var = this.f83307b;
        c1w0 c1w0VarClone = c1w0Var.clone();
        c1w0Var.f78310a = false;
        c1w0Var.f78311b = 0;
        return c1w0VarClone;
    }

    /* JADX INFO: renamed from: e */
    public final String m109688e() {
        return "Created: " + this.f83306a + " Last accessed: " + this.f83308c + " Accesses: " + this.f83309d + "\nEntries retrieved: Valid: " + this.f83310e + " Stale: " + this.f83311f;
    }

    /* JADX INFO: renamed from: f */
    public final void m109689f() {
        this.f83308c = vny0.m199064b().currentTimeMillis();
        this.f83309d++;
    }

    /* JADX INFO: renamed from: g */
    public final void m109690g() {
        this.f83311f++;
        this.f83307b.f78311b++;
    }

    /* JADX INFO: renamed from: h */
    public final void m109691h() {
        this.f83310e++;
        this.f83307b.f78310a = true;
    }
}
