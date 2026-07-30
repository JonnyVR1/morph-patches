package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fvk {

    /* JADX INFO: renamed from: a */
    public final int f10645a;

    /* JADX INFO: renamed from: b */
    public final int f10646b;

    /* JADX INFO: renamed from: c */
    public final int f10647c;

    /* JADX INFO: renamed from: d */
    public final boolean f10648d;

    /* JADX INFO: renamed from: e */
    public final int f10649e;

    /* JADX INFO: renamed from: l.fvk$a */
    public static class C0579a {

        /* JADX INFO: renamed from: a */
        public int f10650a = 300;

        /* JADX INFO: renamed from: b */
        public int f10651b = 10000;

        /* JADX INFO: renamed from: c */
        public int f10652c = 50;

        /* JADX INFO: renamed from: d */
        public boolean f10653d = true;

        /* JADX INFO: renamed from: e */
        public int f10654e = 5000;

        /* JADX INFO: renamed from: f */
        public fvk m13495f() {
            return new fvk(this);
        }

        /* JADX INFO: renamed from: g */
        public C0579a m13496g(int i) {
            this.f10654e = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0579a m13497h(boolean z) {
            this.f10653d = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0579a m13498i(int i) {
            this.f10651b = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0579a m13499j(int i) {
            this.f10652c = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0579a m13500k(int i) {
            this.f10650a = i;
            return this;
        }
    }

    public fvk(C0579a c0579a) {
        this.f10645a = c0579a.f10650a;
        this.f10646b = c0579a.f10651b;
        this.f10647c = c0579a.f10652c;
        this.f10648d = c0579a.f10653d;
        this.f10649e = c0579a.f10654e;
    }

    /* JADX INFO: renamed from: a */
    public int m13486a() {
        return this.f10646b;
    }

    /* JADX INFO: renamed from: b */
    public int m13487b() {
        return this.f10647c;
    }

    /* JADX INFO: renamed from: c */
    public int m13488c() {
        return this.f10645a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m13489d() {
        return this.f10648d;
    }

    public String toString() {
        return "HappyEyeballsConfig{ipv6ConnectTimeout=" + this.f10645a + ", ipv4ConnectTimeout=" + this.f10646b + ", ipv4DelayMillis=" + this.f10647c + ", enablePreferenceCache=" + this.f10648d + ", dnsResolveTimeout=" + this.f10649e + '}';
    }
}
