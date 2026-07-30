package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class o33 {

    /* JADX INFO: renamed from: a */
    public boolean f141595a = true;

    /* JADX INFO: renamed from: b */
    public boolean f141596b = false;

    /* JADX INFO: renamed from: c */
    public boolean f141597c = false;

    /* JADX INFO: renamed from: d */
    public boolean f141598d = false;

    /* JADX INFO: renamed from: e */
    public boolean f141599e = false;

    /* JADX INFO: renamed from: f */
    public int f141600f = 2000;

    /* JADX INFO: renamed from: g */
    public int f141601g = 300;

    /* JADX INFO: renamed from: h */
    public int f141602h = 5;

    /* JADX INFO: renamed from: i */
    public int f141603i = 10000;

    /* JADX INFO: renamed from: j */
    public long f141604j = 3000;

    /* JADX INFO: renamed from: k */
    public int f141605k = 200;

    /* JADX INFO: renamed from: l */
    public InterfaceC18827b f141606l = new C18826a();

    /* JADX INFO: renamed from: l.o33$a */
    public class C18826a implements InterfaceC18827b {
        public C18826a() {
        }

        @Override // p149l.o33.InterfaceC18827b
        public String getType() {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: l.o33$b */
    public interface InterfaceC18827b {
        String getType();
    }

    /* JADX INFO: renamed from: l.o33$c */
    public static class C18828c {

        /* JADX INFO: renamed from: a */
        public o33 f141608a = new o33();

        /* JADX INFO: renamed from: a */
        public o33 m162371a() {
            return this.f141608a;
        }

        /* JADX INFO: renamed from: b */
        public C18828c m162372b(boolean z) {
            this.f141608a.f141599e = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18828c m162373c(boolean z) {
            this.f141608a.f141595a = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18828c m162374d(long j) {
            this.f141608a.f141604j = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18828c m162375e(int i) {
            this.f141608a.f141600f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C18828c m162376f(boolean z) {
            this.f141608a.f141596b = z;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18828c m162377g(InterfaceC18827b interfaceC18827b) {
            this.f141608a.f141606l = interfaceC18827b;
            return this;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m162359g() {
        return this.f141597c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m162360h() {
        return this.f141599e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m162361i() {
        return this.f141598d;
    }

    /* JADX INFO: renamed from: j */
    public boolean m162362j() {
        return this.f141595a;
    }

    /* JADX INFO: renamed from: k */
    public long m162363k() {
        return this.f141604j;
    }

    /* JADX INFO: renamed from: l */
    public int m162364l() {
        return this.f141600f;
    }

    /* JADX INFO: renamed from: m */
    public int m162365m() {
        return this.f141601g;
    }

    /* JADX INFO: renamed from: n */
    public int m162366n() {
        return this.f141605k;
    }

    /* JADX INFO: renamed from: o */
    public int m162367o() {
        return this.f141602h;
    }

    /* JADX INFO: renamed from: p */
    public int m162368p() {
        return this.f141603i;
    }

    /* JADX INFO: renamed from: q */
    public String m162369q() {
        return this.f141606l.getType();
    }

    /* JADX INFO: renamed from: r */
    public boolean m162370r() {
        return this.f141596b;
    }
}
