package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class syf0 {

    /* JADX INFO: renamed from: o */
    public static int f171236o;

    /* JADX INFO: renamed from: a */
    public uyf0 f171237a;

    /* JADX INFO: renamed from: b */
    public boolean f171238b;

    /* JADX INFO: renamed from: c */
    public final String f171239c;

    /* JADX INFO: renamed from: d */
    public final C20186b f171240d;

    /* JADX INFO: renamed from: e */
    public final C20186b f171241e;

    /* JADX INFO: renamed from: f */
    public final C20186b f171242f;

    /* JADX INFO: renamed from: g */
    public double f171243g;

    /* JADX INFO: renamed from: h */
    public double f171244h;

    /* JADX INFO: renamed from: i */
    public boolean f171245i = true;

    /* JADX INFO: renamed from: j */
    public double f171246j = 0.005d;

    /* JADX INFO: renamed from: k */
    public double f171247k = 0.005d;

    /* JADX INFO: renamed from: l */
    public CopyOnWriteArraySet<gzf0> f171248l = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: m */
    public double f171249m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: n */
    public final sr2 f171250n;

    /* JADX INFO: renamed from: l.syf0$b */
    public static class C20186b {

        /* JADX INFO: renamed from: a */
        public double f171251a;

        /* JADX INFO: renamed from: b */
        public double f171252b;

        public C20186b() {
        }
    }

    public syf0(sr2 sr2Var) {
        this.f171240d = new C20186b();
        this.f171241e = new C20186b();
        this.f171242f = new C20186b();
        if (sr2Var == null) {
            wg3.m206174a("Spring cannot be created outside of a BaseSpringSystem");
            throw null;
        }
        this.f171250n = sr2Var;
        StringBuilder sb = new StringBuilder("spring:");
        int i = f171236o;
        f171236o = i + 1;
        sb.append(i);
        this.f171239c = sb.toString();
        m188562p(uyf0.f181593c);
    }

    /* JADX INFO: renamed from: a */
    public syf0 m188547a(gzf0 gzf0Var) {
        if (gzf0Var != null) {
            this.f171248l.add(gzf0Var);
            return this;
        }
        wg3.m206174a("newListener is required");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m188548b(double d) {
        double d2;
        boolean z;
        boolean z2;
        boolean zM188555i = m188555i();
        if (zM188555i && this.f171245i) {
            return;
        }
        this.f171249m += d <= 0.064d ? d : 0.064d;
        uyf0 uyf0Var = this.f171237a;
        double d3 = uyf0Var.f181595b;
        double d4 = uyf0Var.f181594a;
        C20186b c20186b = this.f171240d;
        double d5 = c20186b.f171251a;
        double d6 = c20186b.f171252b;
        C20186b c20186b2 = this.f171242f;
        double d7 = c20186b2.f171251a;
        double d8 = c20186b2.f171252b;
        while (true) {
            d2 = this.f171249m;
            if (d2 < 0.001d) {
                break;
            }
            double d9 = d2 - 0.001d;
            this.f171249m = d9;
            if (d9 < 0.001d) {
                C20186b c20186b3 = this.f171241e;
                c20186b3.f171251a = d5;
                c20186b3.f171252b = d6;
            }
            double d10 = this.f171244h;
            double d11 = ((d10 - d7) * d3) - (d4 * d6);
            double d12 = d6 + (d11 * 0.001d * 0.5d);
            double d13 = ((d10 - (((d6 * 0.001d) * 0.5d) + d5)) * d3) - (d4 * d12);
            double d14 = d6 + (d13 * 0.001d * 0.5d);
            double d15 = ((d10 - (d5 + ((d12 * 0.001d) * 0.5d))) * d3) - (d4 * d14);
            double d16 = d5 + (d14 * 0.001d);
            double d17 = d6 + (d15 * 0.001d);
            d5 += (d6 + ((d12 + d14) * 2.0d) + d17) * 0.16666666666666666d * 0.001d;
            d6 += (d11 + ((d13 + d15) * 2.0d) + (((d10 - d16) * d3) - (d4 * d17))) * 0.16666666666666666d * 0.001d;
            d7 = d16;
            d8 = d17;
        }
        C20186b c20186b4 = this.f171242f;
        c20186b4.f171251a = d7;
        c20186b4.f171252b = d8;
        C20186b c20186b5 = this.f171240d;
        c20186b5.f171251a = d5;
        c20186b5.f171252b = d6;
        if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m188554h(d2 / 0.001d);
        }
        boolean z3 = true;
        if (m188555i() || (this.f171238b && m188556j())) {
            if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double d18 = this.f171244h;
                this.f171243g = d18;
                this.f171240d.f171251a = d18;
            } else {
                double d19 = this.f171240d.f171251a;
                this.f171244h = d19;
                this.f171243g = d19;
            }
            m188563q(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            z = true;
        } else {
            z = zM188555i;
        }
        if (this.f171245i) {
            this.f171245i = false;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f171245i = true;
        } else {
            z3 = false;
        }
        for (gzf0 gzf0Var : this.f171248l) {
            if (z2) {
                gzf0Var.mo9294a(this);
            }
            gzf0Var.mo9296c(this);
            if (z3) {
                gzf0Var.mo9297d(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m188549c() {
        this.f171248l.clear();
        this.f171250n.m187586d(this);
    }

    /* JADX INFO: renamed from: d */
    public double m188550d() {
        return this.f171240d.f171251a;
    }

    /* JADX INFO: renamed from: e */
    public final double m188551e(C20186b c20186b) {
        return Math.abs(this.f171244h - c20186b.f171251a);
    }

    /* JADX INFO: renamed from: f */
    public double m188552f() {
        return this.f171244h;
    }

    /* JADX INFO: renamed from: g */
    public String m188553g() {
        return this.f171239c;
    }

    /* JADX INFO: renamed from: h */
    public final void m188554h(double d) {
        C20186b c20186b = this.f171240d;
        double d2 = c20186b.f171251a * d;
        C20186b c20186b2 = this.f171241e;
        double d3 = 1.0d - d;
        c20186b.f171251a = d2 + (c20186b2.f171251a * d3);
        c20186b.f171252b = (c20186b.f171252b * d) + (c20186b2.f171252b * d3);
    }

    /* JADX INFO: renamed from: i */
    public boolean m188555i() {
        if (Math.abs(this.f171240d.f171252b) <= this.f171246j) {
            return m188551e(this.f171240d) <= this.f171247k || this.f171237a.f181595b == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m188556j() {
        if (this.f171237a.f181595b <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return false;
        }
        if (this.f171243g >= this.f171244h || m188550d() <= this.f171244h) {
            return this.f171243g > this.f171244h && m188550d() < this.f171244h;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public syf0 m188557k() {
        this.f171248l.clear();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public syf0 m188558l() {
        C20186b c20186b = this.f171240d;
        double d = c20186b.f171251a;
        this.f171244h = d;
        this.f171242f.f171251a = d;
        c20186b.f171252b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public syf0 m188559m(double d) {
        return m188560n(d, true);
    }

    /* JADX INFO: renamed from: n */
    public syf0 m188560n(double d, boolean z) {
        this.f171243g = d;
        this.f171240d.f171251a = d;
        this.f171250n.m187583a(m188553g());
        Iterator<gzf0> it = this.f171248l.iterator();
        while (it.hasNext()) {
            it.next().mo9296c(this);
        }
        if (z) {
            m188558l();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public syf0 m188561o(double d) {
        if (this.f171244h != d || !m188555i()) {
            this.f171243g = m188550d();
            this.f171244h = d;
            this.f171250n.m187583a(m188553g());
            Iterator<gzf0> it = this.f171248l.iterator();
            while (it.hasNext()) {
                it.next().mo9295b(this);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public syf0 m188562p(uyf0 uyf0Var) {
        if (uyf0Var != null) {
            this.f171237a = uyf0Var;
            return this;
        }
        wg3.m206174a("springConfig is required");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public syf0 m188563q(double d) {
        C20186b c20186b = this.f171240d;
        if (d == c20186b.f171252b) {
            return this;
        }
        c20186b.f171252b = d;
        this.f171250n.m187583a(m188553g());
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m188564r() {
        return (m188555i() && m188565s()) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m188565s() {
        return this.f171245i;
    }
}
