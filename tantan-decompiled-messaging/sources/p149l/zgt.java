package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zgt {

    /* JADX INFO: renamed from: b */
    public String f203084b;

    /* JADX INFO: renamed from: c */
    public String f203085c;

    /* JADX INFO: renamed from: f */
    public String f203088f;

    /* JADX INFO: renamed from: a */
    public final C21695a f203083a = new C21695a(this);

    /* JADX INFO: renamed from: d */
    public String f203086d = "live";

    /* JADX INFO: renamed from: e */
    public boolean f203087e = false;

    /* JADX INFO: renamed from: g */
    public String f203089g = null;

    /* JADX INFO: renamed from: h */
    public long f203090h = 0;

    /* JADX INFO: renamed from: i */
    public long f203091i = 0;

    /* JADX INFO: renamed from: j */
    public int f203092j = 1;

    /* JADX INFO: renamed from: k */
    public String f203093k = "";

    /* JADX INFO: renamed from: l */
    public String f203094l = "";

    /* JADX INFO: renamed from: m */
    public boolean f203095m = false;

    /* JADX INFO: renamed from: l.zgt$a */
    public static final class C21695a {

        /* JADX INFO: renamed from: a */
        public final zgt f203096a;

        public C21695a(zgt zgtVar) {
            this.f203096a = zgtVar;
        }

        /* JADX INFO: renamed from: a */
        public String m218714a() {
            return this.f203096a.f203085c;
        }

        /* JADX INFO: renamed from: b */
        public String m218715b() {
            return this.f203096a.m218694e();
        }

        /* JADX INFO: renamed from: c */
        public String m218716c() {
            return this.f203096a.m218696g();
        }

        /* JADX INFO: renamed from: d */
        public String m218717d() {
            return this.f203096a.f203084b;
        }

        /* JADX INFO: renamed from: e */
        public long m218718e() {
            return this.f203096a.m218698i();
        }

        /* JADX INFO: renamed from: f */
        public long m218719f() {
            return this.f203096a.m218699j();
        }

        /* JADX INFO: renamed from: g */
        public boolean m218720g() {
            return this.f203096a.f203095m;
        }

        /* JADX INFO: renamed from: h */
        public boolean m218721h() {
            return this.f203096a.m218713x();
        }
    }

    public zgt(String str) {
        this.f203084b = str;
        this.f203085c = str;
    }

    /* JADX INFO: renamed from: c */
    public String m218692c() {
        return this.f203085c;
    }

    /* JADX INFO: renamed from: d */
    public String m218693d() {
        return this.f203094l;
    }

    /* JADX INFO: renamed from: e */
    public String m218694e() {
        return this.f203086d;
    }

    /* JADX INFO: renamed from: f */
    public String m218695f() {
        return this.f203088f;
    }

    /* JADX INFO: renamed from: g */
    public String m218696g() {
        String str = this.f203089g;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public final C21695a m218697h() {
        return this.f203083a;
    }

    /* JADX INFO: renamed from: i */
    public long m218698i() {
        return this.f203091i;
    }

    /* JADX INFO: renamed from: j */
    public long m218699j() {
        return this.f203090h;
    }

    /* JADX INFO: renamed from: k */
    public String m218700k() {
        return this.f203093k;
    }

    /* JADX INFO: renamed from: l */
    public void m218701l() {
        this.f203092j++;
    }

    /* JADX INFO: renamed from: m */
    public void m218702m(String str) {
        this.f203085c = str;
    }

    /* JADX INFO: renamed from: n */
    public void m218703n(String str) {
        this.f203094l = str;
    }

    /* JADX INFO: renamed from: o */
    public void m218704o(String str) {
        this.f203086d = str;
    }

    /* JADX INFO: renamed from: p */
    public void m218705p(boolean z) {
        this.f203095m = z;
    }

    /* JADX INFO: renamed from: q */
    public void m218706q(String str) {
        this.f203088f = str;
    }

    /* JADX INFO: renamed from: r */
    public void m218707r(String str) {
        if (TextUtils.isEmpty(this.f203089g)) {
            this.f203089g = str;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m218708s(String str) {
        this.f203084b = str;
    }

    /* JADX INFO: renamed from: t */
    public void m218709t(boolean z) {
        this.f203087e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m218710u(long j) {
        this.f203091i = j;
    }

    /* JADX INFO: renamed from: v */
    public void m218711v(long j) {
        this.f203090h = j;
    }

    /* JADX INFO: renamed from: w */
    public void m218712w(String str) {
        this.f203093k = str;
    }

    /* JADX INFO: renamed from: x */
    public boolean m218713x() {
        return this.f203087e;
    }
}
