package p149l;

import com.google.zxing.FormatException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class i0l0 {

    /* JADX INFO: renamed from: h */
    public static final i0l0[] f110353h = m133889a();

    /* JADX INFO: renamed from: a */
    public final int f110354a;

    /* JADX INFO: renamed from: b */
    public final int f110355b;

    /* JADX INFO: renamed from: c */
    public final int f110356c;

    /* JADX INFO: renamed from: d */
    public final int f110357d;

    /* JADX INFO: renamed from: e */
    public final int f110358e;

    /* JADX INFO: renamed from: f */
    public final C17457c f110359f;

    /* JADX INFO: renamed from: g */
    public final int f110360g;

    /* JADX INFO: renamed from: l.i0l0$b */
    public static final class C17456b {

        /* JADX INFO: renamed from: a */
        public final int f110361a;

        /* JADX INFO: renamed from: b */
        public final int f110362b;

        public C17456b(int i, int i2) {
            this.f110361a = i;
            this.f110362b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m133898a() {
            return this.f110361a;
        }

        /* JADX INFO: renamed from: b */
        public int m133899b() {
            return this.f110362b;
        }
    }

    public i0l0(int i, int i2, int i3, int i4, int i5, C17457c c17457c) {
        this.f110354a = i;
        this.f110355b = i2;
        this.f110356c = i3;
        this.f110357d = i4;
        this.f110358e = i5;
        this.f110359f = c17457c;
        int iM133901b = c17457c.m133901b();
        int iM133898a = 0;
        for (C17456b c17456b : c17457c.m133900a()) {
            iM133898a += c17456b.m133898a() * (c17456b.m133899b() + iM133901b);
        }
        this.f110360g = iM133898a;
    }

    /* JADX INFO: renamed from: a */
    public static i0l0[] m133889a() {
        int i = 1;
        int i2 = 5;
        i0l0 i0l0Var = new i0l0(1, 10, 10, 8, 8, new C17457c(i2, new C17456b(i, 3)));
        i0l0 i0l0Var2 = new i0l0(2, 12, 12, 10, 10, new C17457c(7, new C17456b(i, i2)));
        i0l0 i0l0Var3 = new i0l0(3, 14, 14, 12, 12, new C17457c(10, new C17456b(i, 8)));
        int i3 = 12;
        i0l0 i0l0Var4 = new i0l0(4, 16, 16, 14, 14, new C17457c(i3, new C17456b(i, i3)));
        int i4 = 18;
        i0l0 i0l0Var5 = new i0l0(5, 18, 18, 16, 16, new C17457c(14, new C17456b(i, i4)));
        i0l0 i0l0Var6 = new i0l0(6, 20, 20, 18, 18, new C17457c(i4, new C17456b(i, 22)));
        i0l0 i0l0Var7 = new i0l0(7, 22, 22, 20, 20, new C17457c(20, new C17456b(i, 30)));
        int i5 = 36;
        i0l0 i0l0Var8 = new i0l0(8, 24, 24, 22, 22, new C17457c(24, new C17456b(i, i5)));
        i0l0 i0l0Var9 = new i0l0(9, 26, 26, 24, 24, new C17457c(28, new C17456b(i, 44)));
        i0l0 i0l0Var10 = new i0l0(10, 32, 32, 14, 14, new C17457c(i5, new C17456b(i, 62)));
        int i6 = 42;
        i0l0 i0l0Var11 = new i0l0(11, 36, 36, 16, 16, new C17457c(i6, new C17456b(i, 86)));
        int i7 = 114;
        int i8 = 48;
        i0l0 i0l0Var12 = new i0l0(12, 40, 40, 18, 18, new C17457c(i8, new C17456b(i, i7)));
        int i9 = 144;
        int i10 = 56;
        i0l0 i0l0Var13 = new i0l0(13, 44, 44, 20, 20, new C17457c(i10, new C17456b(i, i9)));
        i0l0 i0l0Var14 = new i0l0(14, 48, 48, 22, 22, new C17457c(68, new C17456b(i, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)));
        int i11 = 2;
        i0l0 i0l0Var15 = new i0l0(15, 52, 52, 24, 24, new C17457c(i6, new C17456b(i11, 102)));
        i0l0 i0l0Var16 = new i0l0(16, 64, 64, 14, 14, new C17457c(i10, new C17456b(i11, 140)));
        int i12 = 4;
        i0l0 i0l0Var17 = new i0l0(17, 72, 72, 16, 16, new C17457c(i5, new C17456b(i12, 92)));
        i0l0 i0l0Var18 = new i0l0(18, 80, 80, 18, 18, new C17457c(i8, new C17456b(i12, i7)));
        i0l0 i0l0Var19 = new i0l0(19, 88, 88, 20, 20, new C17457c(i10, new C17456b(i12, i9)));
        i0l0 i0l0Var20 = new i0l0(20, 96, 96, 22, 22, new C17457c(68, new C17456b(i12, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)));
        i0l0 i0l0Var21 = new i0l0(21, 104, 104, 24, 24, new C17457c(i10, new C17456b(6, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)));
        i0l0 i0l0Var22 = new i0l0(22, 120, 120, 18, 18, new C17457c(68, new C17456b(6, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384)));
        i0l0 i0l0Var23 = new i0l0(23, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 20, 20, new C17457c(62, new C17456b(8, 163)));
        i0l0 i0l0Var24 = new i0l0(24, 144, 144, 22, 22, new C17457c(62, new C17456b(8, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256), new C17456b(i11, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)));
        int i13 = 1;
        i0l0 i0l0Var25 = new i0l0(25, 8, 18, 6, 16, new C17457c(7, new C17456b(i13, 5)));
        i0l0 i0l0Var26 = new i0l0(26, 8, 32, 6, 14, new C17457c(11, new C17456b(i13, 10)));
        int i14 = 1;
        return new i0l0[]{i0l0Var, i0l0Var2, i0l0Var3, i0l0Var4, i0l0Var5, i0l0Var6, i0l0Var7, i0l0Var8, i0l0Var9, i0l0Var10, i0l0Var11, i0l0Var12, i0l0Var13, i0l0Var14, i0l0Var15, i0l0Var16, i0l0Var17, i0l0Var18, i0l0Var19, i0l0Var20, i0l0Var21, i0l0Var22, i0l0Var23, i0l0Var24, i0l0Var25, i0l0Var26, new i0l0(27, 12, 26, 10, 24, new C17457c(14, new C17456b(i14, 16))), new i0l0(28, 12, 36, 10, 16, new C17457c(18, new C17456b(i14, 22))), new i0l0(29, 16, 36, 14, 16, new C17457c(24, new C17456b(1, 32))), new i0l0(30, 16, 48, 14, 22, new C17457c(28, new C17456b(1, 49)))};
    }

    /* JADX INFO: renamed from: h */
    public static i0l0 m133890h(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (i0l0 i0l0Var : f110353h) {
            if (i0l0Var.f110355b == i && i0l0Var.f110356c == i2) {
                return i0l0Var;
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: b */
    public int m133891b() {
        return this.f110358e;
    }

    /* JADX INFO: renamed from: c */
    public int m133892c() {
        return this.f110357d;
    }

    /* JADX INFO: renamed from: d */
    public C17457c m133893d() {
        return this.f110359f;
    }

    /* JADX INFO: renamed from: e */
    public int m133894e() {
        return this.f110356c;
    }

    /* JADX INFO: renamed from: f */
    public int m133895f() {
        return this.f110355b;
    }

    /* JADX INFO: renamed from: g */
    public int m133896g() {
        return this.f110360g;
    }

    /* JADX INFO: renamed from: i */
    public int m133897i() {
        return this.f110354a;
    }

    public String toString() {
        return String.valueOf(this.f110354a);
    }

    /* JADX INFO: renamed from: l.i0l0$c */
    public static final class C17457c {

        /* JADX INFO: renamed from: a */
        public final int f110363a;

        /* JADX INFO: renamed from: b */
        public final C17456b[] f110364b;

        public C17457c(int i, C17456b c17456b) {
            this.f110363a = i;
            this.f110364b = new C17456b[]{c17456b};
        }

        /* JADX INFO: renamed from: a */
        public C17456b[] m133900a() {
            return this.f110364b;
        }

        /* JADX INFO: renamed from: b */
        public int m133901b() {
            return this.f110363a;
        }

        public C17457c(int i, C17456b c17456b, C17456b c17456b2) {
            this.f110363a = i;
            this.f110364b = new C17456b[]{c17456b, c17456b2};
        }
    }
}
