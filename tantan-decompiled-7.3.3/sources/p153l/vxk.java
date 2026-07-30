package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class vxk {

    /* JADX INFO: renamed from: a */
    public final int f186266a;

    /* JADX INFO: renamed from: b */
    public final int f186267b;

    /* JADX INFO: renamed from: c */
    public final int f186268c;

    /* JADX INFO: renamed from: d */
    public final boolean f186269d;

    /* JADX INFO: renamed from: e */
    public final int f186270e;

    /* JADX INFO: renamed from: l.vxk$a */
    public static class C20953a {

        /* JADX INFO: renamed from: a */
        public int f186271a = 300;

        /* JADX INFO: renamed from: b */
        public int f186272b = 10000;

        /* JADX INFO: renamed from: c */
        public int f186273c = 50;

        /* JADX INFO: renamed from: d */
        public boolean f186274d = true;

        /* JADX INFO: renamed from: e */
        public int f186275e = 5000;

        /* JADX INFO: renamed from: f */
        public vxk m203857f() {
            return new vxk(this);
        }

        /* JADX INFO: renamed from: g */
        public C20953a m203858g(int i) {
            this.f186275e = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20953a m203859h(boolean z) {
            this.f186274d = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20953a m203860i(int i) {
            this.f186272b = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20953a m203861j(int i) {
            this.f186273c = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20953a m203862k(int i) {
            this.f186271a = i;
            return this;
        }
    }

    public vxk(C20953a c20953a) {
        this.f186266a = c20953a.f186271a;
        this.f186267b = c20953a.f186272b;
        this.f186268c = c20953a.f186273c;
        this.f186269d = c20953a.f186274d;
        this.f186270e = c20953a.f186275e;
    }

    /* JADX INFO: renamed from: a */
    public int m203848a() {
        return this.f186267b;
    }

    /* JADX INFO: renamed from: b */
    public int m203849b() {
        return this.f186268c;
    }

    /* JADX INFO: renamed from: c */
    public int m203850c() {
        return this.f186266a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m203851d() {
        return this.f186269d;
    }

    public String toString() {
        return "HappyEyeballsConfig{ipv6ConnectTimeout=" + this.f186266a + ", ipv4ConnectTimeout=" + this.f186267b + ", ipv4DelayMillis=" + this.f186268c + ", enablePreferenceCache=" + this.f186269d + ", dnsResolveTimeout=" + this.f186270e + '}';
    }
}
