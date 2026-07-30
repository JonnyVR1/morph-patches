package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p149l.msq0;
import p149l.qkq0;
import p149l.qq3;
import p149l.upk0;
import p149l.viq0;
import p149l.yqq0;

/* JADX INFO: renamed from: com.xiaomi.push.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14729c {

    /* JADX INFO: renamed from: a */
    private final byte[] f61650a;

    /* JADX INFO: renamed from: b */
    private final int f61651b;

    /* JADX INFO: renamed from: c */
    private int f61652c;

    /* JADX INFO: renamed from: d */
    private final OutputStream f61653d;

    /* JADX INFO: renamed from: com.xiaomi.push.c$a */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C14729c(byte[] bArr, int i, int i2) {
        this.f61653d = null;
        this.f61650a = bArr;
        this.f61652c = i;
        this.f61651b = i + i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m85464G(int i) {
        return m85471V(i);
    }

    /* JADX INFO: renamed from: H */
    public static int m85465H(int i, int i2) {
        return m85468P(i) + m85464G(i2);
    }

    /* JADX INFO: renamed from: I */
    public static int m85466I(int i, long j) {
        return m85468P(i) + m85467J(j);
    }

    /* JADX INFO: renamed from: J */
    public static int m85467J(long j) {
        return m85469Q(j);
    }

    /* JADX INFO: renamed from: P */
    public static int m85468P(int i) {
        return m85471V(msq0.m156169b(i, 0));
    }

    /* JADX INFO: renamed from: Q */
    public static int m85469Q(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: R */
    private void m85470R() throws IOException {
        OutputStream outputStream = this.f61653d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f61650a, 0, this.f61652c);
        this.f61652c = 0;
    }

    /* JADX INFO: renamed from: V */
    public static int m85471V(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: b */
    public static int m85472b(int i) {
        if (i >= 0) {
            return m85471V(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: c */
    public static int m85473c(int i, int i2) {
        return m85468P(i) + m85472b(i2);
    }

    /* JADX INFO: renamed from: d */
    public static int m85474d(int i, long j) {
        return m85468P(i) + m85479i(j);
    }

    /* JADX INFO: renamed from: e */
    public static int m85475e(int i, String str) {
        return m85468P(i) + m85480j(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m85476f(int i, viq0 viq0Var) {
        return m85468P(i) + m85481k(viq0Var);
    }

    /* JADX INFO: renamed from: g */
    public static int m85477g(int i, yqq0 yqq0Var) {
        return m85468P(i) + m85482l(yqq0Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m85478h(int i, boolean z) {
        return m85468P(i) + m85483m(z);
    }

    /* JADX INFO: renamed from: i */
    public static int m85479i(long j) {
        return m85469Q(j);
    }

    /* JADX INFO: renamed from: j */
    public static int m85480j(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m85471V(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            upk0.m194883a("UTF-8 not supported.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m85481k(viq0 viq0Var) {
        return m85471V(viq0Var.m198605a()) + viq0Var.m198605a();
    }

    /* JADX INFO: renamed from: l */
    public static int m85482l(yqq0 yqq0Var) {
        int iMo98329i = yqq0Var.mo98329i();
        return m85471V(iMo98329i) + iMo98329i;
    }

    /* JADX INFO: renamed from: m */
    public static int m85483m(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: n */
    public static C14729c m85484n(OutputStream outputStream) {
        return m85485o(outputStream, 4096);
    }

    /* JADX INFO: renamed from: o */
    public static C14729c m85485o(OutputStream outputStream, int i) {
        return new C14729c(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: p */
    public static C14729c m85486p(byte[] bArr, int i, int i2) {
        return new C14729c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: A */
    public void m85487A(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m85501W(bytes.length);
        m85491E(bytes);
    }

    /* JADX INFO: renamed from: B */
    public void m85488B(viq0 viq0Var) throws IOException {
        byte[] bArrM198606d = viq0Var.m198606d();
        m85501W(bArrM198606d.length);
        m85491E(bArrM198606d);
    }

    /* JADX INFO: renamed from: C */
    public void m85489C(yqq0 yqq0Var) throws IOException {
        m85501W(yqq0Var.mo98326a());
        yqq0Var.mo98328e(this);
    }

    /* JADX INFO: renamed from: D */
    public void m85490D(boolean z) throws IOException {
        m85498S(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: E */
    public void m85491E(byte[] bArr) throws IOException {
        m85492F(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: F */
    public void m85492F(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f61651b;
        int i4 = this.f61652c;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f61650a;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f61652c += i2;
            return;
        }
        int i6 = i3 - i4;
        System.arraycopy(bArr, i, bArr2, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f61652c = this.f61651b;
        m85470R();
        if (i8 > this.f61651b) {
            this.f61653d.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, this.f61650a, 0, i8);
            this.f61652c = i8;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m85493K() {
        if (m85502a() == 0) {
            return;
        }
        qkq0.m175383a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: L */
    public void m85494L(int i) throws IOException {
        m85501W(i);
    }

    /* JADX INFO: renamed from: M */
    public void m85495M(int i, int i2) throws IOException {
        m85499T(i, 0);
        m85494L(i2);
    }

    /* JADX INFO: renamed from: N */
    public void m85496N(int i, long j) throws IOException {
        m85499T(i, 0);
        m85497O(j);
    }

    /* JADX INFO: renamed from: O */
    public void m85497O(long j) throws IOException {
        m85500U(j);
    }

    /* JADX INFO: renamed from: S */
    public void m85498S(int i) throws IOException {
        m85504r((byte) i);
    }

    /* JADX INFO: renamed from: T */
    public void m85499T(int i, int i2) throws IOException {
        m85501W(msq0.m156169b(i, i2));
    }

    /* JADX INFO: renamed from: U */
    public void m85500U(long j) throws IOException {
        while (((-128) & j) != 0) {
            m85498S((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m85498S((int) j);
    }

    /* JADX INFO: renamed from: W */
    public void m85501W(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m85498S((i & 127) | 128);
            i >>>= 7;
        }
        m85498S(i);
    }

    /* JADX INFO: renamed from: a */
    public int m85502a() {
        if (this.f61653d == null) {
            return this.f61651b - this.f61652c;
        }
        qq3.m175877a("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void m85503q() throws IOException {
        if (this.f61653d != null) {
            m85470R();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m85504r(byte b) throws IOException {
        if (this.f61652c == this.f61651b) {
            m85470R();
        }
        byte[] bArr = this.f61650a;
        int i = this.f61652c;
        this.f61652c = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: s */
    public void m85505s(int i) throws IOException {
        if (i >= 0) {
            m85501W(i);
        } else {
            m85500U(i);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m85506t(int i, int i2) throws IOException {
        m85499T(i, 0);
        m85505s(i2);
    }

    /* JADX INFO: renamed from: u */
    public void m85507u(int i, long j) throws IOException {
        m85499T(i, 0);
        m85512z(j);
    }

    /* JADX INFO: renamed from: v */
    public void m85508v(int i, String str) throws IOException {
        m85499T(i, 2);
        m85487A(str);
    }

    /* JADX INFO: renamed from: w */
    public void m85509w(int i, viq0 viq0Var) throws IOException {
        m85499T(i, 2);
        m85488B(viq0Var);
    }

    /* JADX INFO: renamed from: x */
    public void m85510x(int i, yqq0 yqq0Var) throws IOException {
        m85499T(i, 2);
        m85489C(yqq0Var);
    }

    /* JADX INFO: renamed from: y */
    public void m85511y(int i, boolean z) throws IOException {
        m85499T(i, 0);
        m85490D(z);
    }

    /* JADX INFO: renamed from: z */
    public void m85512z(long j) throws IOException {
        m85500U(j);
    }

    private C14729c(OutputStream outputStream, byte[] bArr) {
        this.f61653d = outputStream;
        this.f61650a = bArr;
        this.f61652c = 0;
        this.f61651b = bArr.length;
    }
}
