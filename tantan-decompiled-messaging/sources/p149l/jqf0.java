package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class jqf0 {

    /* JADX INFO: renamed from: o */
    public static int f119261o;

    /* JADX INFO: renamed from: a */
    public lqf0 f119262a;

    /* JADX INFO: renamed from: b */
    public boolean f119263b;

    /* JADX INFO: renamed from: c */
    public final String f119264c;

    /* JADX INFO: renamed from: d */
    public final C17845b f119265d;

    /* JADX INFO: renamed from: e */
    public final C17845b f119266e;

    /* JADX INFO: renamed from: f */
    public final C17845b f119267f;

    /* JADX INFO: renamed from: g */
    public double f119268g;

    /* JADX INFO: renamed from: h */
    public double f119269h;

    /* JADX INFO: renamed from: i */
    public boolean f119270i = true;

    /* JADX INFO: renamed from: j */
    public double f119271j = 0.005d;

    /* JADX INFO: renamed from: k */
    public double f119272k = 0.005d;

    /* JADX INFO: renamed from: l */
    public CopyOnWriteArraySet<xqf0> f119273l = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: m */
    public double f119274m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: n */
    public final cr2 f119275n;

    /* JADX INFO: renamed from: l.jqf0$b */
    public static class C17845b {

        /* JADX INFO: renamed from: a */
        public double f119276a;

        /* JADX INFO: renamed from: b */
        public double f119277b;

        public C17845b() {
        }
    }

    public jqf0(cr2 cr2Var) {
        this.f119265d = new C17845b();
        this.f119266e = new C17845b();
        this.f119267f = new C17845b();
        if (cr2Var == null) {
            ig3.m135964a("Spring cannot be created outside of a BaseSpringSystem");
            throw null;
        }
        this.f119275n = cr2Var;
        StringBuilder sb = new StringBuilder("spring:");
        int i = f119261o;
        f119261o = i + 1;
        sb.append(i);
        this.f119264c = sb.toString();
        m142805p(lqf0.f129333c);
    }

    /* JADX INFO: renamed from: a */
    public jqf0 m142790a(xqf0 xqf0Var) {
        if (xqf0Var != null) {
            this.f119273l.add(xqf0Var);
            return this;
        }
        ig3.m135964a("newListener is required");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m142791b(double d) {
        double d2;
        boolean z;
        boolean z2;
        boolean zM142798i = m142798i();
        if (zM142798i && this.f119270i) {
            return;
        }
        this.f119274m += d <= 0.064d ? d : 0.064d;
        lqf0 lqf0Var = this.f119262a;
        double d3 = lqf0Var.f129335b;
        double d4 = lqf0Var.f129334a;
        C17845b c17845b = this.f119265d;
        double d5 = c17845b.f119276a;
        double d6 = c17845b.f119277b;
        C17845b c17845b2 = this.f119267f;
        double d7 = c17845b2.f119276a;
        double d8 = c17845b2.f119277b;
        while (true) {
            d2 = this.f119274m;
            if (d2 < 0.001d) {
                break;
            }
            double d9 = d2 - 0.001d;
            this.f119274m = d9;
            if (d9 < 0.001d) {
                C17845b c17845b3 = this.f119266e;
                c17845b3.f119276a = d5;
                c17845b3.f119277b = d6;
            }
            double d10 = this.f119269h;
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
        C17845b c17845b4 = this.f119267f;
        c17845b4.f119276a = d7;
        c17845b4.f119277b = d8;
        C17845b c17845b5 = this.f119265d;
        c17845b5.f119276a = d5;
        c17845b5.f119277b = d6;
        if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m142797h(d2 / 0.001d);
        }
        boolean z3 = true;
        if (m142798i() || (this.f119263b && m142799j())) {
            if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double d18 = this.f119269h;
                this.f119268g = d18;
                this.f119265d.f119276a = d18;
            } else {
                double d19 = this.f119265d.f119276a;
                this.f119269h = d19;
                this.f119268g = d19;
            }
            m142806q(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            z = true;
        } else {
            z = zM142798i;
        }
        if (this.f119270i) {
            this.f119270i = false;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f119270i = true;
        } else {
            z3 = false;
        }
        for (xqf0 xqf0Var : this.f119273l) {
            if (z2) {
                xqf0Var.mo9240a(this);
            }
            xqf0Var.mo9242c(this);
            if (z3) {
                xqf0Var.mo9243d(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m142792c() {
        this.f119273l.clear();
        this.f119275n.m108323d(this);
    }

    /* JADX INFO: renamed from: d */
    public double m142793d() {
        return this.f119265d.f119276a;
    }

    /* JADX INFO: renamed from: e */
    public final double m142794e(C17845b c17845b) {
        return Math.abs(this.f119269h - c17845b.f119276a);
    }

    /* JADX INFO: renamed from: f */
    public double m142795f() {
        return this.f119269h;
    }

    /* JADX INFO: renamed from: g */
    public String m142796g() {
        return this.f119264c;
    }

    /* JADX INFO: renamed from: h */
    public final void m142797h(double d) {
        C17845b c17845b = this.f119265d;
        double d2 = c17845b.f119276a * d;
        C17845b c17845b2 = this.f119266e;
        double d3 = 1.0d - d;
        c17845b.f119276a = d2 + (c17845b2.f119276a * d3);
        c17845b.f119277b = (c17845b.f119277b * d) + (c17845b2.f119277b * d3);
    }

    /* JADX INFO: renamed from: i */
    public boolean m142798i() {
        if (Math.abs(this.f119265d.f119277b) <= this.f119271j) {
            return m142794e(this.f119265d) <= this.f119272k || this.f119262a.f129335b == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean m142799j() {
        if (this.f119262a.f129335b <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return false;
        }
        if (this.f119268g >= this.f119269h || m142793d() <= this.f119269h) {
            return this.f119268g > this.f119269h && m142793d() < this.f119269h;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public jqf0 m142800k() {
        this.f119273l.clear();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public jqf0 m142801l() {
        C17845b c17845b = this.f119265d;
        double d = c17845b.f119276a;
        this.f119269h = d;
        this.f119267f.f119276a = d;
        c17845b.f119277b = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public jqf0 m142802m(double d) {
        return m142803n(d, true);
    }

    /* JADX INFO: renamed from: n */
    public jqf0 m142803n(double d, boolean z) {
        this.f119268g = d;
        this.f119265d.f119276a = d;
        this.f119275n.m108320a(m142796g());
        Iterator<xqf0> it = this.f119273l.iterator();
        while (it.hasNext()) {
            it.next().mo9242c(this);
        }
        if (z) {
            m142801l();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public jqf0 m142804o(double d) {
        if (this.f119269h != d || !m142798i()) {
            this.f119268g = m142793d();
            this.f119269h = d;
            this.f119275n.m108320a(m142796g());
            Iterator<xqf0> it = this.f119273l.iterator();
            while (it.hasNext()) {
                it.next().mo9241b(this);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public jqf0 m142805p(lqf0 lqf0Var) {
        if (lqf0Var != null) {
            this.f119262a = lqf0Var;
            return this;
        }
        ig3.m135964a("springConfig is required");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public jqf0 m142806q(double d) {
        C17845b c17845b = this.f119265d;
        if (d == c17845b.f119277b) {
            return this;
        }
        c17845b.f119277b = d;
        this.f119275n.m108320a(m142796g());
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m142807r() {
        return (m142798i() && m142808s()) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m142808s() {
        return this.f119270i;
    }
}
