package p002l;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public final class zgt {

    /* JADX INFO: renamed from: b */
    public String f23406b;

    /* JADX INFO: renamed from: c */
    public String f23407c;

    /* JADX INFO: renamed from: f */
    public String f23410f;

    /* JADX INFO: renamed from: a */
    public final C0943a f23405a = new C0943a(this);

    /* JADX INFO: renamed from: d */
    public String f23408d = "live";

    /* JADX INFO: renamed from: e */
    public boolean f23409e = false;

    /* JADX INFO: renamed from: g */
    public String f23411g = null;

    /* JADX INFO: renamed from: h */
    public long f23412h = 0;

    /* JADX INFO: renamed from: i */
    public long f23413i = 0;

    /* JADX INFO: renamed from: j */
    public int f23414j = 1;

    /* JADX INFO: renamed from: k */
    public String f23415k = "";

    /* JADX INFO: renamed from: l */
    public String f23416l = "";

    /* JADX INFO: renamed from: m */
    public boolean f23417m = false;

    /* JADX INFO: renamed from: l.zgt$a */
    public static final class C0943a {

        /* JADX INFO: renamed from: a */
        public final zgt f23418a;

        public C0943a(zgt zgtVar) {
            this.f23418a = zgtVar;
        }

        /* JADX INFO: renamed from: a */
        public String m27365a() {
            return this.f23418a.f23407c;
        }

        /* JADX INFO: renamed from: b */
        public String m27366b() {
            return this.f23418a.m27345e();
        }

        /* JADX INFO: renamed from: c */
        public String m27367c() {
            return this.f23418a.m27347g();
        }

        /* JADX INFO: renamed from: d */
        public String m27368d() {
            return this.f23418a.f23406b;
        }

        /* JADX INFO: renamed from: e */
        public long m27369e() {
            return this.f23418a.m27349i();
        }

        /* JADX INFO: renamed from: f */
        public long m27370f() {
            return this.f23418a.m27350j();
        }

        /* JADX INFO: renamed from: g */
        public boolean m27371g() {
            return this.f23418a.f23417m;
        }

        /* JADX INFO: renamed from: h */
        public boolean m27372h() {
            return this.f23418a.m27364x();
        }
    }

    public zgt(String str) {
        this.f23406b = str;
        this.f23407c = str;
    }

    /* JADX INFO: renamed from: c */
    public String m27343c() {
        return this.f23407c;
    }

    /* JADX INFO: renamed from: d */
    public String m27344d() {
        return this.f23416l;
    }

    /* JADX INFO: renamed from: e */
    public String m27345e() {
        return this.f23408d;
    }

    /* JADX INFO: renamed from: f */
    public String m27346f() {
        return this.f23410f;
    }

    /* JADX INFO: renamed from: g */
    public String m27347g() {
        String str = this.f23411g;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public final C0943a m27348h() {
        return this.f23405a;
    }

    /* JADX INFO: renamed from: i */
    public long m27349i() {
        return this.f23413i;
    }

    /* JADX INFO: renamed from: j */
    public long m27350j() {
        return this.f23412h;
    }

    /* JADX INFO: renamed from: k */
    public String m27351k() {
        return this.f23415k;
    }

    /* JADX INFO: renamed from: l */
    public void m27352l() {
        this.f23414j++;
    }

    /* JADX INFO: renamed from: m */
    public void m27353m(String str) {
        this.f23407c = str;
    }

    /* JADX INFO: renamed from: n */
    public void m27354n(String str) {
        this.f23416l = str;
    }

    /* JADX INFO: renamed from: o */
    public void m27355o(String str) {
        this.f23408d = str;
    }

    /* JADX INFO: renamed from: p */
    public void m27356p(boolean z) {
        this.f23417m = z;
    }

    /* JADX INFO: renamed from: q */
    public void m27357q(String str) {
        this.f23410f = str;
    }

    /* JADX INFO: renamed from: r */
    public void m27358r(String str) {
        if (TextUtils.isEmpty(this.f23411g)) {
            this.f23411g = str;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m27359s(String str) {
        this.f23406b = str;
    }

    /* JADX INFO: renamed from: t */
    public void m27360t(boolean z) {
        this.f23409e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m27361u(long j) {
        this.f23413i = j;
    }

    /* JADX INFO: renamed from: v */
    public void m27362v(long j) {
        this.f23412h = j;
    }

    /* JADX INFO: renamed from: w */
    public void m27363w(String str) {
        this.f23415k = str;
    }

    /* JADX INFO: renamed from: x */
    public boolean m27364x() {
        return this.f23409e;
    }
}
