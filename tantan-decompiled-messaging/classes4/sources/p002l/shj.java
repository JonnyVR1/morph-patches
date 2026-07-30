package p002l;

import android.text.TextUtils;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class shj {

    /* JADX INFO: renamed from: a */
    public String f19021a;

    /* JADX INFO: renamed from: b */
    public int f19022b;

    /* JADX INFO: renamed from: c */
    public boolean f19023c;

    /* JADX INFO: renamed from: d */
    public String f19024d;

    /* JADX INFO: renamed from: e */
    public int f19025e;

    /* JADX INFO: renamed from: f */
    public final int[] f19026f;

    /* JADX INFO: renamed from: g */
    public boolean f19027g;

    /* JADX INFO: renamed from: l.shj$a */
    public static class C0817a {

        /* JADX INFO: renamed from: b */
        public String f19029b;

        /* JADX INFO: renamed from: c */
        public int f19030c;

        /* JADX INFO: renamed from: f */
        public boolean f19033f;

        /* JADX INFO: renamed from: g */
        public boolean f19034g;

        /* JADX INFO: renamed from: a */
        public String f19028a = "";

        /* JADX INFO: renamed from: d */
        public int[] f19031d = new int[2];

        /* JADX INFO: renamed from: e */
        public int f19032e = 0;

        /* JADX INFO: renamed from: j */
        public static C0817a m22482j() {
            return new C0817a();
        }

        /* JADX INFO: renamed from: h */
        public shj m22483h() {
            TextUtils.isEmpty(this.f19028a);
            return new shj(this);
        }

        /* JADX INFO: renamed from: i */
        public C0817a m22484i(int i) {
            this.f19032e = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0817a m22485k(int i) {
            this.f19030c = i;
            if (i == 80) {
                int[] iArr = this.f19031d;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = xdl0.y0();
                    this.f19031d[1] = (int) (xdl0.w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C0817a m22486l(double d, double d2) {
            this.f19031d[0] = (int) Math.round(((double) xdl0.y0()) * d);
            int[] iArr = this.f19031d;
            iArr[1] = (int) Math.round(((double) iArr[0]) * d2);
            this.f19034g = this.f19031d[1] >= xdl0.w0() + xdl0.F0();
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0817a m22487m(String str) {
            this.f19028a = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0817a m22488n(boolean z) {
            this.f19033f = z;
            return this;
        }
    }

    public shj(C0817a c0817a) {
        this.f19024d = c0817a.f19029b;
        this.f19021a = c0817a.f19028a;
        this.f19022b = c0817a.f19030c;
        this.f19026f = c0817a.f19031d;
        this.f19025e = c0817a.f19032e;
        this.f19023c = c0817a.f19033f;
        this.f19027g = c0817a.f19034g;
    }

    /* JADX INFO: renamed from: a */
    public int m22470a() {
        return this.f19025e;
    }

    /* JADX INFO: renamed from: b */
    public int m22471b() {
        return this.f19022b;
    }

    /* JADX INFO: renamed from: c */
    public String m22472c() {
        return this.f19021a;
    }

    /* JADX INFO: renamed from: d */
    public int[] m22473d() {
        return this.f19026f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m22474e() {
        return this.f19027g;
    }
}
