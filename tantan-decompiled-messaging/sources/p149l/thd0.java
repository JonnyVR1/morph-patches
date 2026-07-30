package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class thd0 {

    /* JADX INFO: renamed from: l */
    public static final byte[] f170221l = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte f170222a;

    /* JADX INFO: renamed from: b */
    public final boolean f170223b;

    /* JADX INFO: renamed from: c */
    public final boolean f170224c;

    /* JADX INFO: renamed from: d */
    public final byte f170225d;

    /* JADX INFO: renamed from: e */
    public final boolean f170226e;

    /* JADX INFO: renamed from: f */
    public final byte f170227f;

    /* JADX INFO: renamed from: g */
    public final int f170228g;

    /* JADX INFO: renamed from: h */
    public final long f170229h;

    /* JADX INFO: renamed from: i */
    public final int f170230i;

    /* JADX INFO: renamed from: j */
    public final byte[] f170231j;

    /* JADX INFO: renamed from: k */
    public final byte[] f170232k;

    /* JADX INFO: renamed from: l.thd0$b */
    public static final class C20176b {

        /* JADX INFO: renamed from: a */
        public boolean f170233a;

        /* JADX INFO: renamed from: b */
        public boolean f170234b;

        /* JADX INFO: renamed from: c */
        public byte f170235c;

        /* JADX INFO: renamed from: d */
        public int f170236d;

        /* JADX INFO: renamed from: e */
        public long f170237e;

        /* JADX INFO: renamed from: f */
        public int f170238f;

        /* JADX INFO: renamed from: g */
        public byte[] f170239g = thd0.f170221l;

        /* JADX INFO: renamed from: h */
        public byte[] f170240h = thd0.f170221l;

        /* JADX INFO: renamed from: i */
        public thd0 m188892i() {
            return new thd0(this);
        }

        /* JADX INFO: renamed from: j */
        public C20176b m188893j(byte[] bArr) {
            p11.m167011e(bArr);
            this.f170239g = bArr;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20176b m188894k(boolean z) {
            this.f170234b = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C20176b m188895l(boolean z) {
            this.f170233a = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20176b m188896m(byte[] bArr) {
            p11.m167011e(bArr);
            this.f170240h = bArr;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C20176b m188897n(byte b) {
            this.f170235c = b;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C20176b m188898o(int i) {
            p11.m167007a(i >= 0 && i <= 65535);
            this.f170236d = i & j6f.COLOR_SPACE_UNCALIBRATED;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C20176b m188899p(int i) {
            this.f170238f = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C20176b m188900q(long j) {
            this.f170237e = j;
            return this;
        }
    }

    public thd0(C20176b c20176b) {
        this.f170222a = (byte) 2;
        this.f170223b = c20176b.f170233a;
        this.f170224c = false;
        this.f170226e = c20176b.f170234b;
        this.f170227f = c20176b.f170235c;
        this.f170228g = c20176b.f170236d;
        this.f170229h = c20176b.f170237e;
        this.f170230i = c20176b.f170238f;
        byte[] bArr = c20176b.f170239g;
        this.f170231j = bArr;
        this.f170225d = (byte) (bArr.length / 4);
        this.f170232k = c20176b.f170240h;
    }

    /* JADX INFO: renamed from: b */
    public static int m188881b(int i) {
        return mwm.m156756g(i + 1, 65536);
    }

    /* JADX INFO: renamed from: c */
    public static int m188882c(int i) {
        return mwm.m156756g(i - 1, 65536);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static thd0 m188883d(d860 d860Var) {
        byte[] bArr;
        if (d860Var.m110295a() < 12) {
            return null;
        }
        int iM110279H = d860Var.m110279H();
        byte b = (byte) (iM110279H >> 6);
        boolean z = ((iM110279H >> 5) & 1) == 1;
        byte b2 = (byte) (iM110279H & 15);
        if (b != 2) {
            return null;
        }
        int iM110279H2 = d860Var.m110279H();
        boolean z2 = ((iM110279H2 >> 7) & 1) == 1;
        byte b3 = (byte) (iM110279H2 & 127);
        int iM110285N = d860Var.m110285N();
        long jM110281J = d860Var.m110281J();
        int iM110311q = d860Var.m110311q();
        if (b2 > 0) {
            bArr = new byte[b2 * 4];
            for (int i = 0; i < b2; i++) {
                d860Var.m110306l(bArr, i * 4, 4);
            }
        } else {
            bArr = f170221l;
        }
        byte[] bArr2 = new byte[d860Var.m110295a()];
        d860Var.m110306l(bArr2, 0, d860Var.m110295a());
        return new C20176b().m188895l(z).m188894k(z2).m188897n(b3).m188898o(iM110285N).m188900q(jM110281J).m188899p(iM110311q).m188893j(bArr).m188896m(bArr2).m188892i();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && thd0.class == obj.getClass()) {
            thd0 thd0Var = (thd0) obj;
            if (this.f170227f == thd0Var.f170227f && this.f170228g == thd0Var.f170228g && this.f170226e == thd0Var.f170226e && this.f170229h == thd0Var.f170229h && this.f170230i == thd0Var.f170230i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((((527 + this.f170227f) * 31) + this.f170228g) * 31) + (this.f170226e ? 1 : 0)) * 31;
        long j = this.f170229h;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f170230i;
    }

    public String toString() {
        return vck0.m197793D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f170227f), Integer.valueOf(this.f170228g), Long.valueOf(this.f170229h), Integer.valueOf(this.f170230i), Boolean.valueOf(this.f170226e));
    }
}
