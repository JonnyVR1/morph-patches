package p149l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public final class akr0 {

    /* JADX INFO: renamed from: a */
    public final sir0 f70310a;

    /* JADX INFO: renamed from: b */
    public final hew0 f70311b;

    /* JADX INFO: renamed from: c */
    public final x5w0 f70312c = new x5w0(new byte[64], 64);

    /* JADX INFO: renamed from: d */
    public boolean f70313d;

    /* JADX INFO: renamed from: e */
    public boolean f70314e;

    /* JADX INFO: renamed from: f */
    public boolean f70315f;

    public akr0(sir0 sir0Var, hew0 hew0Var) {
        this.f70310a = sir0Var;
        this.f70311b = hew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m97176a(v6w0 v6w0Var) throws zzcc {
        long jM130704b;
        char c;
        v6w0Var.m197258g(this.f70312c.f191198a, 0, 3);
        this.f70312c.m207157k(0);
        this.f70312c.m207159m(8);
        this.f70313d = this.f70312c.m207161o();
        this.f70314e = this.f70312c.m207161o();
        this.f70312c.m207159m(6);
        x5w0 x5w0Var = this.f70312c;
        v6w0Var.m197258g(x5w0Var.f191198a, 0, x5w0Var.m207150d(8));
        this.f70312c.m207157k(0);
        if (this.f70313d) {
            this.f70312c.m207159m(4);
            long jM207150d = this.f70312c.m207150d(3);
            this.f70312c.m207159m(1);
            int iM207150d = this.f70312c.m207150d(15) << 15;
            this.f70312c.m207159m(1);
            long jM207150d2 = this.f70312c.m207150d(15);
            this.f70312c.m207159m(1);
            if (this.f70315f || !this.f70314e) {
                c = 30;
            } else {
                this.f70312c.m207159m(4);
                long jM207150d3 = ((long) this.f70312c.m207150d(3)) << 30;
                this.f70312c.m207159m(1);
                int iM207150d2 = this.f70312c.m207150d(15) << 15;
                this.f70312c.m207159m(1);
                long jM207150d4 = this.f70312c.m207150d(15);
                this.f70312c.m207159m(1);
                c = 30;
                this.f70311b.m130704b(jM207150d3 | ((long) iM207150d2) | jM207150d4);
                this.f70315f = true;
            }
            jM130704b = this.f70311b.m130704b((jM207150d << c) | ((long) iM207150d) | jM207150d2);
        } else {
            jM130704b = 0;
        }
        this.f70310a.mo121627c(jM130704b, 4);
        this.f70310a.mo121626b(v6w0Var);
        this.f70310a.mo121625a(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m97177b() {
        this.f70315f = false;
        this.f70310a.zze();
    }
}
