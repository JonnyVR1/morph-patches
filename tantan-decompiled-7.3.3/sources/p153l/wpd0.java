package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wpd0 {

    /* JADX INFO: renamed from: l */
    public static final byte[] f190282l = new byte[0];

    /* JADX INFO: renamed from: a */
    public final byte f190283a;

    /* JADX INFO: renamed from: b */
    public final boolean f190284b;

    /* JADX INFO: renamed from: c */
    public final boolean f190285c;

    /* JADX INFO: renamed from: d */
    public final byte f190286d;

    /* JADX INFO: renamed from: e */
    public final boolean f190287e;

    /* JADX INFO: renamed from: f */
    public final byte f190288f;

    /* JADX INFO: renamed from: g */
    public final int f190289g;

    /* JADX INFO: renamed from: h */
    public final long f190290h;

    /* JADX INFO: renamed from: i */
    public final int f190291i;

    /* JADX INFO: renamed from: j */
    public final byte[] f190292j;

    /* JADX INFO: renamed from: k */
    public final byte[] f190293k;

    /* JADX INFO: renamed from: l.wpd0$b */
    public static final class C21164b {

        /* JADX INFO: renamed from: a */
        public boolean f190294a;

        /* JADX INFO: renamed from: b */
        public boolean f190295b;

        /* JADX INFO: renamed from: c */
        public byte f190296c;

        /* JADX INFO: renamed from: d */
        public int f190297d;

        /* JADX INFO: renamed from: e */
        public long f190298e;

        /* JADX INFO: renamed from: f */
        public int f190299f;

        /* JADX INFO: renamed from: g */
        public byte[] f190300g = wpd0.f190282l;

        /* JADX INFO: renamed from: h */
        public byte[] f190301h = wpd0.f190282l;

        /* JADX INFO: renamed from: i */
        public wpd0 m207445i() {
            return new wpd0(this);
        }

        /* JADX INFO: renamed from: j */
        public C21164b m207446j(byte[] bArr) {
            w11.m204369e(bArr);
            this.f190300g = bArr;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C21164b m207447k(boolean z) {
            this.f190295b = z;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C21164b m207448l(boolean z) {
            this.f190294a = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C21164b m207449m(byte[] bArr) {
            w11.m204369e(bArr);
            this.f190301h = bArr;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C21164b m207450n(byte b) {
            this.f190296c = b;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C21164b m207451o(int i) {
            w11.m204365a(i >= 0 && i <= 65535);
            this.f190297d = i & p7f.COLOR_SPACE_UNCALIBRATED;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C21164b m207452p(int i) {
            this.f190299f = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21164b m207453q(long j) {
            this.f190298e = j;
            return this;
        }
    }

    public wpd0(C21164b c21164b) {
        this.f190283a = (byte) 2;
        this.f190284b = c21164b.f190294a;
        this.f190285c = false;
        this.f190287e = c21164b.f190295b;
        this.f190288f = c21164b.f190296c;
        this.f190289g = c21164b.f190297d;
        this.f190290h = c21164b.f190298e;
        this.f190291i = c21164b.f190299f;
        byte[] bArr = c21164b.f190300g;
        this.f190292j = bArr;
        this.f190286d = (byte) (bArr.length / 4);
        this.f190293k = c21164b.f190301h;
    }

    /* JADX INFO: renamed from: b */
    public static int m207434b(int i) {
        return nym.m165346g(i + 1, 65536);
    }

    /* JADX INFO: renamed from: c */
    public static int m207435c(int i) {
        return nym.m165346g(i - 1, 65536);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static wpd0 m207436d(ig60 ig60Var) {
        byte[] bArr;
        if (ig60Var.m139811a() < 12) {
            return null;
        }
        int iM139795H = ig60Var.m139795H();
        byte b = (byte) (iM139795H >> 6);
        boolean z = ((iM139795H >> 5) & 1) == 1;
        byte b2 = (byte) (iM139795H & 15);
        if (b != 2) {
            return null;
        }
        int iM139795H2 = ig60Var.m139795H();
        boolean z2 = ((iM139795H2 >> 7) & 1) == 1;
        byte b3 = (byte) (iM139795H2 & 127);
        int iM139801N = ig60Var.m139801N();
        long jM139797J = ig60Var.m139797J();
        int iM139827q = ig60Var.m139827q();
        if (b2 > 0) {
            bArr = new byte[b2 * 4];
            for (int i = 0; i < b2; i++) {
                ig60Var.m139822l(bArr, i * 4, 4);
            }
        } else {
            bArr = f190282l;
        }
        byte[] bArr2 = new byte[ig60Var.m139811a()];
        ig60Var.m139822l(bArr2, 0, ig60Var.m139811a());
        return new C21164b().m207448l(z).m207447k(z2).m207450n(b3).m207451o(iM139801N).m207453q(jM139797J).m207452p(iM139827q).m207446j(bArr).m207449m(bArr2).m207445i();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wpd0.class == obj.getClass()) {
            wpd0 wpd0Var = (wpd0) obj;
            if (this.f190288f == wpd0Var.f190288f && this.f190289g == wpd0Var.f190289g && this.f190287e == wpd0Var.f190287e && this.f190290h == wpd0Var.f190290h && this.f190291i == wpd0Var.f190291i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((((527 + this.f190288f) * 31) + this.f190289g) * 31) + (this.f190287e ? 1 : 0)) * 31;
        long j = this.f190290h;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f190291i;
    }

    public String toString() {
        return bmk0.m105071D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f190288f), Integer.valueOf(this.f190289g), Long.valueOf(this.f190290h), Integer.valueOf(this.f190291i), Boolean.valueOf(this.f190287e));
    }
}
