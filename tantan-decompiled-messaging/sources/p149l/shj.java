package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class shj {

    /* JADX INFO: renamed from: a */
    public String f164574a;

    /* JADX INFO: renamed from: b */
    public int f164575b;

    /* JADX INFO: renamed from: c */
    public boolean f164576c;

    /* JADX INFO: renamed from: d */
    public String f164577d;

    /* JADX INFO: renamed from: e */
    public int f164578e;

    /* JADX INFO: renamed from: f */
    public final int[] f164579f;

    /* JADX INFO: renamed from: g */
    public boolean f164580g;

    /* JADX INFO: renamed from: l.shj$a */
    public static class C19950a {

        /* JADX INFO: renamed from: b */
        public String f164582b;

        /* JADX INFO: renamed from: c */
        public int f164583c;

        /* JADX INFO: renamed from: f */
        public boolean f164586f;

        /* JADX INFO: renamed from: g */
        public boolean f164587g;

        /* JADX INFO: renamed from: a */
        public String f164581a = "";

        /* JADX INFO: renamed from: d */
        public int[] f164584d = new int[2];

        /* JADX INFO: renamed from: e */
        public int f164585e = 0;

        /* JADX INFO: renamed from: j */
        public static C19950a m184205j() {
            return new C19950a();
        }

        /* JADX INFO: renamed from: h */
        public shj m184206h() {
            TextUtils.isEmpty(this.f164581a);
            return new shj(this);
        }

        /* JADX INFO: renamed from: i */
        public C19950a m184207i(int i) {
            this.f164585e = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19950a m184208k(int i) {
            this.f164583c = i;
            if (i == 80) {
                int[] iArr = this.f164584d;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = xdl0.m208412y0();
                    this.f164584d[1] = (int) (xdl0.m208408w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C19950a m184209l(double d, double d2) {
            this.f164584d[0] = (int) Math.round(((double) xdl0.m208412y0()) * d);
            int[] iArr = this.f164584d;
            iArr[1] = (int) Math.round(((double) iArr[0]) * d2);
            this.f164587g = this.f164584d[1] >= xdl0.m208408w0() + xdl0.m208331F0();
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19950a m184210m(String str) {
            this.f164581a = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19950a m184211n(boolean z) {
            this.f164586f = z;
            return this;
        }
    }

    public shj(C19950a c19950a) {
        this.f164577d = c19950a.f164582b;
        this.f164574a = c19950a.f164581a;
        this.f164575b = c19950a.f164583c;
        this.f164579f = c19950a.f164584d;
        this.f164578e = c19950a.f164585e;
        this.f164576c = c19950a.f164586f;
        this.f164580g = c19950a.f164587g;
    }

    /* JADX INFO: renamed from: a */
    public int m184193a() {
        return this.f164578e;
    }

    /* JADX INFO: renamed from: b */
    public int m184194b() {
        return this.f164575b;
    }

    /* JADX INFO: renamed from: c */
    public String m184195c() {
        return this.f164574a;
    }

    /* JADX INFO: renamed from: d */
    public int[] m184196d() {
        return this.f164579f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m184197e() {
        return this.f164580g;
    }
}
