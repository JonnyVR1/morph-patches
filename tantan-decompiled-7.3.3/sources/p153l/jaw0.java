package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jaw0 {

    /* JADX INFO: renamed from: a */
    public final long f119022a;

    /* JADX INFO: renamed from: c */
    public long f119024c;

    /* JADX INFO: renamed from: b */
    public final iaw0 f119023b = new iaw0();

    /* JADX INFO: renamed from: d */
    public int f119025d = 0;

    /* JADX INFO: renamed from: e */
    public int f119026e = 0;

    /* JADX INFO: renamed from: f */
    public int f119027f = 0;

    public jaw0() {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        this.f119022a = jCurrentTimeMillis;
        this.f119024c = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: a */
    public final int m144078a() {
        return this.f119025d;
    }

    /* JADX INFO: renamed from: b */
    public final long m144079b() {
        return this.f119022a;
    }

    /* JADX INFO: renamed from: c */
    public final long m144080c() {
        return this.f119024c;
    }

    /* JADX INFO: renamed from: d */
    public final iaw0 m144081d() {
        iaw0 iaw0Var = this.f119023b;
        iaw0 iaw0VarClone = iaw0Var.clone();
        iaw0Var.f113629a = false;
        iaw0Var.f113630b = 0;
        return iaw0VarClone;
    }

    /* JADX INFO: renamed from: e */
    public final String m144082e() {
        return "Created: " + this.f119022a + " Last accessed: " + this.f119024c + " Accesses: " + this.f119025d + "\nEntries retrieved: Valid: " + this.f119026e + " Stale: " + this.f119027f;
    }

    /* JADX INFO: renamed from: f */
    public final void m144083f() {
        this.f119024c = bxy0.m106918b().currentTimeMillis();
        this.f119025d++;
    }

    /* JADX INFO: renamed from: g */
    public final void m144084g() {
        this.f119027f++;
        this.f119023b.f113630b++;
    }

    /* JADX INFO: renamed from: h */
    public final void m144085h() {
        this.f119026e++;
        this.f119023b.f113629a = true;
    }
}
