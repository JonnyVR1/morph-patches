package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class e43 {

    /* JADX INFO: renamed from: a */
    public boolean f92035a = true;

    /* JADX INFO: renamed from: b */
    public boolean f92036b = false;

    /* JADX INFO: renamed from: c */
    public boolean f92037c = false;

    /* JADX INFO: renamed from: d */
    public boolean f92038d = false;

    /* JADX INFO: renamed from: e */
    public boolean f92039e = false;

    /* JADX INFO: renamed from: f */
    public int f92040f = 2000;

    /* JADX INFO: renamed from: g */
    public int f92041g = 300;

    /* JADX INFO: renamed from: h */
    public int f92042h = 5;

    /* JADX INFO: renamed from: i */
    public int f92043i = 10000;

    /* JADX INFO: renamed from: j */
    public long f92044j = 3000;

    /* JADX INFO: renamed from: k */
    public int f92045k = 200;

    /* JADX INFO: renamed from: l */
    public InterfaceC16704b f92046l = new C16703a();

    /* JADX INFO: renamed from: l.e43$a */
    public class C16703a implements InterfaceC16704b {
        public C16703a() {
        }

        @Override // p153l.e43.InterfaceC16704b
        public String getType() {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: l.e43$b */
    public interface InterfaceC16704b {
        String getType();
    }

    /* JADX INFO: renamed from: l.e43$c */
    public static class C16705c {

        /* JADX INFO: renamed from: a */
        public e43 f92048a = new e43();

        /* JADX INFO: renamed from: a */
        public e43 m119357a() {
            return this.f92048a;
        }

        /* JADX INFO: renamed from: b */
        public C16705c m119358b(boolean z) {
            this.f92048a.f92039e = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16705c m119359c(boolean z) {
            this.f92048a.f92035a = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16705c m119360d(long j) {
            this.f92048a.f92044j = j;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16705c m119361e(int i) {
            this.f92048a.f92040f = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16705c m119362f(boolean z) {
            this.f92048a.f92036b = z;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16705c m119363g(InterfaceC16704b interfaceC16704b) {
            this.f92048a.f92046l = interfaceC16704b;
            return this;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m119345g() {
        return this.f92037c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m119346h() {
        return this.f92039e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m119347i() {
        return this.f92038d;
    }

    /* JADX INFO: renamed from: j */
    public boolean m119348j() {
        return this.f92035a;
    }

    /* JADX INFO: renamed from: k */
    public long m119349k() {
        return this.f92044j;
    }

    /* JADX INFO: renamed from: l */
    public int m119350l() {
        return this.f92040f;
    }

    /* JADX INFO: renamed from: m */
    public int m119351m() {
        return this.f92041g;
    }

    /* JADX INFO: renamed from: n */
    public int m119352n() {
        return this.f92045k;
    }

    /* JADX INFO: renamed from: o */
    public int m119353o() {
        return this.f92042h;
    }

    /* JADX INFO: renamed from: p */
    public int m119354p() {
        return this.f92043i;
    }

    /* JADX INFO: renamed from: q */
    public String m119355q() {
        return this.f92046l.getType();
    }

    /* JADX INFO: renamed from: r */
    public boolean m119356r() {
        return this.f92036b;
    }
}
