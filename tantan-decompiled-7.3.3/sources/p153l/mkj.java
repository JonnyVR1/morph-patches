package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class mkj {

    /* JADX INFO: renamed from: a */
    public String f137303a;

    /* JADX INFO: renamed from: b */
    public int f137304b;

    /* JADX INFO: renamed from: c */
    public boolean f137305c;

    /* JADX INFO: renamed from: d */
    public String f137306d;

    /* JADX INFO: renamed from: e */
    public int f137307e;

    /* JADX INFO: renamed from: f */
    public final int[] f137308f;

    /* JADX INFO: renamed from: g */
    public boolean f137309g;

    /* JADX INFO: renamed from: l.mkj$a */
    public static class C18643a {

        /* JADX INFO: renamed from: b */
        public String f137311b;

        /* JADX INFO: renamed from: c */
        public int f137312c;

        /* JADX INFO: renamed from: f */
        public boolean f137315f;

        /* JADX INFO: renamed from: g */
        public boolean f137316g;

        /* JADX INFO: renamed from: a */
        public String f137310a = "";

        /* JADX INFO: renamed from: d */
        public int[] f137313d = new int[2];

        /* JADX INFO: renamed from: e */
        public int f137314e = 0;

        /* JADX INFO: renamed from: j */
        public static C18643a m158804j() {
            return new C18643a();
        }

        /* JADX INFO: renamed from: h */
        public mkj m158805h() {
            TextUtils.isEmpty(this.f137310a);
            return new mkj(this);
        }

        /* JADX INFO: renamed from: i */
        public C18643a m158806i(int i) {
            this.f137314e = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C18643a m158807k(int i) {
            this.f137312c = i;
            if (i == 80) {
                int[] iArr = this.f137313d;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = bnl0.m105592y0();
                    this.f137313d[1] = (int) (bnl0.m105588w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C18643a m158808l(double d, double d2) {
            this.f137313d[0] = (int) Math.round(((double) bnl0.m105592y0()) * d);
            int[] iArr = this.f137313d;
            iArr[1] = (int) Math.round(((double) iArr[0]) * d2);
            this.f137316g = this.f137313d[1] >= bnl0.m105588w0() + bnl0.m105511F0();
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18643a m158809m(String str) {
            this.f137310a = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18643a m158810n(boolean z) {
            this.f137315f = z;
            return this;
        }
    }

    public mkj(C18643a c18643a) {
        this.f137306d = c18643a.f137311b;
        this.f137303a = c18643a.f137310a;
        this.f137304b = c18643a.f137312c;
        this.f137308f = c18643a.f137313d;
        this.f137307e = c18643a.f137314e;
        this.f137305c = c18643a.f137315f;
        this.f137309g = c18643a.f137316g;
    }

    /* JADX INFO: renamed from: a */
    public int m158792a() {
        return this.f137307e;
    }

    /* JADX INFO: renamed from: b */
    public int m158793b() {
        return this.f137304b;
    }

    /* JADX INFO: renamed from: c */
    public String m158794c() {
        return this.f137303a;
    }

    /* JADX INFO: renamed from: d */
    public int[] m158795d() {
        return this.f137308f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m158796e() {
        return this.f137309g;
    }
}
