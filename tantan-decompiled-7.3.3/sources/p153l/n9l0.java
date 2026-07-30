package p153l;

import com.google.zxing.FormatException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class n9l0 {

    /* JADX INFO: renamed from: h */
    public static final n9l0[] f140913h = m161989a();

    /* JADX INFO: renamed from: a */
    public final int f140914a;

    /* JADX INFO: renamed from: b */
    public final int f140915b;

    /* JADX INFO: renamed from: c */
    public final int f140916c;

    /* JADX INFO: renamed from: d */
    public final int f140917d;

    /* JADX INFO: renamed from: e */
    public final int f140918e;

    /* JADX INFO: renamed from: f */
    public final C18828c f140919f;

    /* JADX INFO: renamed from: g */
    public final int f140920g;

    /* JADX INFO: renamed from: l.n9l0$b */
    public static final class C18827b {

        /* JADX INFO: renamed from: a */
        public final int f140921a;

        /* JADX INFO: renamed from: b */
        public final int f140922b;

        public C18827b(int i, int i2) {
            this.f140921a = i;
            this.f140922b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m161998a() {
            return this.f140921a;
        }

        /* JADX INFO: renamed from: b */
        public int m161999b() {
            return this.f140922b;
        }
    }

    public n9l0(int i, int i2, int i3, int i4, int i5, C18828c c18828c) {
        this.f140914a = i;
        this.f140915b = i2;
        this.f140916c = i3;
        this.f140917d = i4;
        this.f140918e = i5;
        this.f140919f = c18828c;
        int iM162001b = c18828c.m162001b();
        int iM161998a = 0;
        for (C18827b c18827b : c18828c.m162000a()) {
            iM161998a += c18827b.m161998a() * (c18827b.m161999b() + iM162001b);
        }
        this.f140920g = iM161998a;
    }

    /* JADX INFO: renamed from: a */
    public static n9l0[] m161989a() {
        int i = 1;
        int i2 = 5;
        n9l0 n9l0Var = new n9l0(1, 10, 10, 8, 8, new C18828c(i2, new C18827b(i, 3)));
        n9l0 n9l0Var2 = new n9l0(2, 12, 12, 10, 10, new C18828c(7, new C18827b(i, i2)));
        n9l0 n9l0Var3 = new n9l0(3, 14, 14, 12, 12, new C18828c(10, new C18827b(i, 8)));
        int i3 = 12;
        n9l0 n9l0Var4 = new n9l0(4, 16, 16, 14, 14, new C18828c(i3, new C18827b(i, i3)));
        int i4 = 18;
        n9l0 n9l0Var5 = new n9l0(5, 18, 18, 16, 16, new C18828c(14, new C18827b(i, i4)));
        n9l0 n9l0Var6 = new n9l0(6, 20, 20, 18, 18, new C18828c(i4, new C18827b(i, 22)));
        n9l0 n9l0Var7 = new n9l0(7, 22, 22, 20, 20, new C18828c(20, new C18827b(i, 30)));
        int i5 = 36;
        n9l0 n9l0Var8 = new n9l0(8, 24, 24, 22, 22, new C18828c(24, new C18827b(i, i5)));
        n9l0 n9l0Var9 = new n9l0(9, 26, 26, 24, 24, new C18828c(28, new C18827b(i, 44)));
        n9l0 n9l0Var10 = new n9l0(10, 32, 32, 14, 14, new C18828c(i5, new C18827b(i, 62)));
        int i6 = 42;
        n9l0 n9l0Var11 = new n9l0(11, 36, 36, 16, 16, new C18828c(i6, new C18827b(i, 86)));
        int i7 = 114;
        int i8 = 48;
        n9l0 n9l0Var12 = new n9l0(12, 40, 40, 18, 18, new C18828c(i8, new C18827b(i, i7)));
        int i9 = 144;
        int i10 = 56;
        n9l0 n9l0Var13 = new n9l0(13, 44, 44, 20, 20, new C18828c(i10, new C18827b(i, i9)));
        n9l0 n9l0Var14 = new n9l0(14, 48, 48, 22, 22, new C18828c(68, new C18827b(i, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)));
        int i11 = 2;
        n9l0 n9l0Var15 = new n9l0(15, 52, 52, 24, 24, new C18828c(i6, new C18827b(i11, 102)));
        n9l0 n9l0Var16 = new n9l0(16, 64, 64, 14, 14, new C18828c(i10, new C18827b(i11, 140)));
        int i12 = 4;
        n9l0 n9l0Var17 = new n9l0(17, 72, 72, 16, 16, new C18828c(i5, new C18827b(i12, 92)));
        n9l0 n9l0Var18 = new n9l0(18, 80, 80, 18, 18, new C18828c(i8, new C18827b(i12, i7)));
        n9l0 n9l0Var19 = new n9l0(19, 88, 88, 20, 20, new C18828c(i10, new C18827b(i12, i9)));
        n9l0 n9l0Var20 = new n9l0(20, 96, 96, 22, 22, new C18828c(68, new C18827b(i12, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256)));
        n9l0 n9l0Var21 = new n9l0(21, 104, 104, 24, 24, new C18828c(i10, new C18827b(6, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA)));
        n9l0 n9l0Var22 = new n9l0(22, 120, 120, 18, 18, new C18828c(68, new C18827b(6, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384)));
        n9l0 n9l0Var23 = new n9l0(23, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 20, 20, new C18828c(62, new C18827b(8, 163)));
        n9l0 n9l0Var24 = new n9l0(24, 144, 144, 22, 22, new C18828c(62, new C18827b(8, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256), new C18827b(i11, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)));
        int i13 = 1;
        n9l0 n9l0Var25 = new n9l0(25, 8, 18, 6, 16, new C18828c(7, new C18827b(i13, 5)));
        n9l0 n9l0Var26 = new n9l0(26, 8, 32, 6, 14, new C18828c(11, new C18827b(i13, 10)));
        int i14 = 1;
        return new n9l0[]{n9l0Var, n9l0Var2, n9l0Var3, n9l0Var4, n9l0Var5, n9l0Var6, n9l0Var7, n9l0Var8, n9l0Var9, n9l0Var10, n9l0Var11, n9l0Var12, n9l0Var13, n9l0Var14, n9l0Var15, n9l0Var16, n9l0Var17, n9l0Var18, n9l0Var19, n9l0Var20, n9l0Var21, n9l0Var22, n9l0Var23, n9l0Var24, n9l0Var25, n9l0Var26, new n9l0(27, 12, 26, 10, 24, new C18828c(14, new C18827b(i14, 16))), new n9l0(28, 12, 36, 10, 16, new C18828c(18, new C18827b(i14, 22))), new n9l0(29, 16, 36, 14, 16, new C18828c(24, new C18827b(1, 32))), new n9l0(30, 16, 48, 14, 22, new C18828c(28, new C18827b(1, 49)))};
    }

    /* JADX INFO: renamed from: h */
    public static n9l0 m161990h(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (n9l0 n9l0Var : f140913h) {
            if (n9l0Var.f140915b == i && n9l0Var.f140916c == i2) {
                return n9l0Var;
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: renamed from: b */
    public int m161991b() {
        return this.f140918e;
    }

    /* JADX INFO: renamed from: c */
    public int m161992c() {
        return this.f140917d;
    }

    /* JADX INFO: renamed from: d */
    public C18828c m161993d() {
        return this.f140919f;
    }

    /* JADX INFO: renamed from: e */
    public int m161994e() {
        return this.f140916c;
    }

    /* JADX INFO: renamed from: f */
    public int m161995f() {
        return this.f140915b;
    }

    /* JADX INFO: renamed from: g */
    public int m161996g() {
        return this.f140920g;
    }

    /* JADX INFO: renamed from: i */
    public int m161997i() {
        return this.f140914a;
    }

    public String toString() {
        return String.valueOf(this.f140914a);
    }

    /* JADX INFO: renamed from: l.n9l0$c */
    public static final class C18828c {

        /* JADX INFO: renamed from: a */
        public final int f140923a;

        /* JADX INFO: renamed from: b */
        public final C18827b[] f140924b;

        public C18828c(int i, C18827b c18827b) {
            this.f140923a = i;
            this.f140924b = new C18827b[]{c18827b};
        }

        /* JADX INFO: renamed from: a */
        public C18827b[] m162000a() {
            return this.f140924b;
        }

        /* JADX INFO: renamed from: b */
        public int m162001b() {
            return this.f140923a;
        }

        public C18828c(int i, C18827b c18827b, C18827b c18827b2) {
            this.f140923a = i;
            this.f140924b = new C18827b[]{c18827b, c18827b2};
        }
    }
}
