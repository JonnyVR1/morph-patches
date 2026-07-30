package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class fvk {

    /* JADX INFO: renamed from: a */
    public final int f99451a;

    /* JADX INFO: renamed from: b */
    public final int f99452b;

    /* JADX INFO: renamed from: c */
    public final int f99453c;

    /* JADX INFO: renamed from: d */
    public final boolean f99454d;

    /* JADX INFO: renamed from: e */
    public final int f99455e;

    /* JADX INFO: renamed from: l.fvk$a */
    public static class C16929a {

        /* JADX INFO: renamed from: a */
        public int f99456a = 300;

        /* JADX INFO: renamed from: b */
        public int f99457b = 10000;

        /* JADX INFO: renamed from: c */
        public int f99458c = 50;

        /* JADX INFO: renamed from: d */
        public boolean f99459d = true;

        /* JADX INFO: renamed from: e */
        public int f99460e = 5000;

        /* JADX INFO: renamed from: f */
        public fvk m123332f() {
            return new fvk(this);
        }

        /* JADX INFO: renamed from: g */
        public C16929a m123333g(int i) {
            this.f99460e = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16929a m123334h(boolean z) {
            this.f99459d = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16929a m123335i(int i) {
            this.f99457b = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16929a m123336j(int i) {
            this.f99458c = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16929a m123337k(int i) {
            this.f99456a = i;
            return this;
        }
    }

    public fvk(C16929a c16929a) {
        this.f99451a = c16929a.f99456a;
        this.f99452b = c16929a.f99457b;
        this.f99453c = c16929a.f99458c;
        this.f99454d = c16929a.f99459d;
        this.f99455e = c16929a.f99460e;
    }

    /* JADX INFO: renamed from: a */
    public int m123323a() {
        return this.f99452b;
    }

    /* JADX INFO: renamed from: b */
    public int m123324b() {
        return this.f99453c;
    }

    /* JADX INFO: renamed from: c */
    public int m123325c() {
        return this.f99451a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m123326d() {
        return this.f99454d;
    }

    public String toString() {
        return "HappyEyeballsConfig{ipv6ConnectTimeout=" + this.f99451a + ", ipv4ConnectTimeout=" + this.f99452b + ", ipv4DelayMillis=" + this.f99453c + ", enablePreferenceCache=" + this.f99454d + ", dnsResolveTimeout=" + this.f99455e + '}';
    }
}
