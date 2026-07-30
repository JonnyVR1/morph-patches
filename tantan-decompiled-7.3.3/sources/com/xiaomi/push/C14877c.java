package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p153l.asq0;
import p153l.azk0;
import p153l.e0r0;
import p153l.pr3;
import p153l.s1r0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.xiaomi.push.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14877c {

    /* JADX INFO: renamed from: a */
    private final byte[] f62497a;

    /* JADX INFO: renamed from: b */
    private final int f62498b;

    /* JADX INFO: renamed from: c */
    private int f62499c;

    /* JADX INFO: renamed from: d */
    private final OutputStream f62500d;

    /* JADX INFO: renamed from: com.xiaomi.push.c$a */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C14877c(byte[] bArr, int i, int i2) {
        this.f62500d = null;
        this.f62497a = bArr;
        this.f62499c = i;
        this.f62498b = i + i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m86635G(int i) {
        return m86642V(i);
    }

    /* JADX INFO: renamed from: H */
    public static int m86636H(int i, int i2) {
        return m86639P(i) + m86635G(i2);
    }

    /* JADX INFO: renamed from: I */
    public static int m86637I(int i, long j) {
        return m86639P(i) + m86638J(j);
    }

    /* JADX INFO: renamed from: J */
    public static int m86638J(long j) {
        return m86640Q(j);
    }

    /* JADX INFO: renamed from: P */
    public static int m86639P(int i) {
        return m86642V(s1r0.m184058b(i, 0));
    }

    /* JADX INFO: renamed from: Q */
    public static int m86640Q(long j) {
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
    private void m86641R() throws IOException {
        OutputStream outputStream = this.f62500d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f62497a, 0, this.f62499c);
        this.f62499c = 0;
    }

    /* JADX INFO: renamed from: V */
    public static int m86642V(int i) {
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
    public static int m86643b(int i) {
        if (i >= 0) {
            return m86642V(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: c */
    public static int m86644c(int i, int i2) {
        return m86639P(i) + m86643b(i2);
    }

    /* JADX INFO: renamed from: d */
    public static int m86645d(int i, long j) {
        return m86639P(i) + m86650i(j);
    }

    /* JADX INFO: renamed from: e */
    public static int m86646e(int i, String str) {
        return m86639P(i) + m86651j(str);
    }

    /* JADX INFO: renamed from: f */
    public static int m86647f(int i, asq0 asq0Var) {
        return m86639P(i) + m86652k(asq0Var);
    }

    /* JADX INFO: renamed from: g */
    public static int m86648g(int i, e0r0 e0r0Var) {
        return m86639P(i) + m86653l(e0r0Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m86649h(int i, boolean z) {
        return m86639P(i) + m86654m(z);
    }

    /* JADX INFO: renamed from: i */
    public static int m86650i(long j) {
        return m86640Q(j);
    }

    /* JADX INFO: renamed from: j */
    public static int m86651j(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m86642V(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            azk0.m101074a("UTF-8 not supported.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m86652k(asq0 asq0Var) {
        return m86642V(asq0Var.m99967a()) + asq0Var.m99967a();
    }

    /* JADX INFO: renamed from: l */
    public static int m86653l(e0r0 e0r0Var) {
        int iMo118924i = e0r0Var.mo118924i();
        return m86642V(iMo118924i) + iMo118924i;
    }

    /* JADX INFO: renamed from: m */
    public static int m86654m(boolean z) {
        return 1;
    }

    /* JADX INFO: renamed from: n */
    public static C14877c m86655n(OutputStream outputStream) {
        return m86656o(outputStream, 4096);
    }

    /* JADX INFO: renamed from: o */
    public static C14877c m86656o(OutputStream outputStream, int i) {
        return new C14877c(outputStream, new byte[i]);
    }

    /* JADX INFO: renamed from: p */
    public static C14877c m86657p(byte[] bArr, int i, int i2) {
        return new C14877c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: A */
    public void m86658A(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m86672W(bytes.length);
        m86662E(bytes);
    }

    /* JADX INFO: renamed from: B */
    public void m86659B(asq0 asq0Var) throws IOException {
        byte[] bArrM99968d = asq0Var.m99968d();
        m86672W(bArrM99968d.length);
        m86662E(bArrM99968d);
    }

    /* JADX INFO: renamed from: C */
    public void m86660C(e0r0 e0r0Var) throws IOException {
        m86672W(e0r0Var.mo118916a());
        e0r0Var.mo118920e(this);
    }

    /* JADX INFO: renamed from: D */
    public void m86661D(boolean z) throws IOException {
        m86669S(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: E */
    public void m86662E(byte[] bArr) throws IOException {
        m86663F(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: F */
    public void m86663F(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f62498b;
        int i4 = this.f62499c;
        int i5 = i3 - i4;
        byte[] bArr2 = this.f62497a;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f62499c += i2;
            return;
        }
        int i6 = i3 - i4;
        System.arraycopy(bArr, i, bArr2, i4, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.f62499c = this.f62498b;
        m86641R();
        if (i8 > this.f62498b) {
            this.f62500d.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, this.f62497a, 0, i8);
            this.f62499c = i8;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m86664K() {
        if (m86673a() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    /* JADX INFO: renamed from: L */
    public void m86665L(int i) throws IOException {
        m86672W(i);
    }

    /* JADX INFO: renamed from: M */
    public void m86666M(int i, int i2) throws IOException {
        m86670T(i, 0);
        m86665L(i2);
    }

    /* JADX INFO: renamed from: N */
    public void m86667N(int i, long j) throws IOException {
        m86670T(i, 0);
        m86668O(j);
    }

    /* JADX INFO: renamed from: O */
    public void m86668O(long j) throws IOException {
        m86671U(j);
    }

    /* JADX INFO: renamed from: S */
    public void m86669S(int i) throws IOException {
        m86675r((byte) i);
    }

    /* JADX INFO: renamed from: T */
    public void m86670T(int i, int i2) throws IOException {
        m86672W(s1r0.m184058b(i, i2));
    }

    /* JADX INFO: renamed from: U */
    public void m86671U(long j) throws IOException {
        while (((-128) & j) != 0) {
            m86669S((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m86669S((int) j);
    }

    /* JADX INFO: renamed from: W */
    public void m86672W(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m86669S((i & 127) | 128);
            i >>>= 7;
        }
        m86669S(i);
    }

    /* JADX INFO: renamed from: a */
    public int m86673a() {
        if (this.f62500d == null) {
            return this.f62498b - this.f62499c;
        }
        pr3.m173429a("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void m86674q() throws IOException {
        if (this.f62500d != null) {
            m86641R();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m86675r(byte b) throws IOException {
        if (this.f62499c == this.f62498b) {
            m86641R();
        }
        byte[] bArr = this.f62497a;
        int i = this.f62499c;
        this.f62499c = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: s */
    public void m86676s(int i) throws IOException {
        if (i >= 0) {
            m86672W(i);
        } else {
            m86671U(i);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m86677t(int i, int i2) throws IOException {
        m86670T(i, 0);
        m86676s(i2);
    }

    /* JADX INFO: renamed from: u */
    public void m86678u(int i, long j) throws IOException {
        m86670T(i, 0);
        m86683z(j);
    }

    /* JADX INFO: renamed from: v */
    public void m86679v(int i, String str) throws IOException {
        m86670T(i, 2);
        m86658A(str);
    }

    /* JADX INFO: renamed from: w */
    public void m86680w(int i, asq0 asq0Var) throws IOException {
        m86670T(i, 2);
        m86659B(asq0Var);
    }

    /* JADX INFO: renamed from: x */
    public void m86681x(int i, e0r0 e0r0Var) throws IOException {
        m86670T(i, 2);
        m86660C(e0r0Var);
    }

    /* JADX INFO: renamed from: y */
    public void m86682y(int i, boolean z) throws IOException {
        m86670T(i, 0);
        m86661D(z);
    }

    /* JADX INFO: renamed from: z */
    public void m86683z(long j) throws IOException {
        m86671U(j);
    }

    private C14877c(OutputStream outputStream, byte[] bArr) {
        this.f62500d = outputStream;
        this.f62497a = bArr;
        this.f62499c = 0;
        this.f62498b = bArr.length;
    }
}
