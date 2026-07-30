package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class y1z0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f197155a = new bgw0(32);

    /* JADX INFO: renamed from: b */
    public h1z0 f197156b;

    /* JADX INFO: renamed from: c */
    public h1z0 f197157c;

    /* JADX INFO: renamed from: d */
    public h1z0 f197158d;

    /* JADX INFO: renamed from: e */
    public long f197159e;

    /* JADX INFO: renamed from: f */
    public final c6z0 f197160f;

    public y1z0(c6z0 c6z0Var) {
        this.f197160f = c6z0Var;
        h1z0 h1z0Var = new h1z0(0L, 65536);
        this.f197156b = h1z0Var;
        this.f197157c = h1z0Var;
        this.f197158d = h1z0Var;
    }

    /* JADX INFO: renamed from: j */
    public static h1z0 m213999j(h1z0 h1z0Var, long j) {
        while (j >= h1z0Var.f107509b) {
            h1z0Var = h1z0Var.f107511d;
        }
        return h1z0Var;
    }

    /* JADX INFO: renamed from: k */
    public static h1z0 m214000k(h1z0 h1z0Var, long j, ByteBuffer byteBuffer, int i) {
        h1z0 h1z0VarM213999j = m213999j(h1z0Var, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (h1z0VarM213999j.f107509b - j));
            byteBuffer.put(h1z0VarM213999j.f107510c.f182590a, h1z0VarM213999j.m133357a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == h1z0VarM213999j.f107509b) {
                h1z0VarM213999j = h1z0VarM213999j.f107511d;
            }
        }
        return h1z0VarM213999j;
    }

    /* JADX INFO: renamed from: l */
    public static h1z0 m214001l(h1z0 h1z0Var, long j, byte[] bArr, int i) {
        h1z0 h1z0VarM213999j = m213999j(h1z0Var, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (h1z0VarM213999j.f107509b - j));
            System.arraycopy(h1z0VarM213999j.f107510c.f182590a, h1z0VarM213999j.m133357a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == h1z0VarM213999j.f107509b) {
                h1z0VarM213999j = h1z0VarM213999j.f107511d;
            }
        }
        return h1z0VarM213999j;
    }

    /* JADX INFO: renamed from: m */
    public static h1z0 m214002m(h1z0 h1z0Var, evx0 evx0Var, a2z0 a2z0Var, bgw0 bgw0Var) {
        h1z0 h1z0VarM214001l;
        if (evx0Var.m122861k()) {
            long j = a2z0Var.f68233b;
            int iM104249F = 1;
            bgw0Var.m104266h(1);
            h1z0 h1z0VarM214001l2 = m214001l(h1z0Var, j, bgw0Var.m104271m(), 1);
            long j2 = j + 1;
            byte b = bgw0Var.m104271m()[0];
            int i = b & 128;
            int i2 = b & 127;
            tux0 tux0Var = evx0Var.f96056c;
            byte[] bArr = tux0Var.f176221a;
            if (bArr == null) {
                tux0Var.f176221a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            h1z0VarM214001l = m214001l(h1z0VarM214001l2, j2, tux0Var.f176221a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                bgw0Var.m104266h(2);
                h1z0VarM214001l = m214001l(h1z0VarM214001l, j3, bgw0Var.m104271m(), 2);
                j3 += 2;
                iM104249F = bgw0Var.m104249F();
            }
            int i3 = iM104249F;
            int[] iArr = tux0Var.f176224d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = tux0Var.f176225e;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                bgw0Var.m104266h(i4);
                h1z0VarM214001l = m214001l(h1z0VarM214001l, j3, bgw0Var.m104271m(), i4);
                j3 += (long) i4;
                bgw0Var.m104269k(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = bgw0Var.m104249F();
                    iArr4[i5] = bgw0Var.m104248E();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = a2z0Var.f68232a - ((int) (j3 - a2z0Var.f68233b));
            }
            ggr0 ggr0Var = a2z0Var.f68234c;
            int i6 = mpw0.f137957a;
            tux0Var.m192765c(i3, iArr2, iArr4, ggr0Var.f104043b, tux0Var.f176221a, ggr0Var.f104042a, ggr0Var.f104044c, ggr0Var.f104045d);
            long j4 = a2z0Var.f68233b;
            int i7 = (int) (j3 - j4);
            a2z0Var.f68233b = j4 + ((long) i7);
            a2z0Var.f68232a -= i7;
        } else {
            h1z0VarM214001l = h1z0Var;
        }
        if (!evx0Var.m127553e()) {
            evx0Var.m122859i(a2z0Var.f68232a);
            return m214000k(h1z0VarM214001l, a2z0Var.f68233b, evx0Var.f96057d, a2z0Var.f68232a);
        }
        bgw0Var.m104266h(4);
        h1z0 h1z0VarM214001l3 = m214001l(h1z0VarM214001l, a2z0Var.f68233b, bgw0Var.m104271m(), 4);
        int iM104248E = bgw0Var.m104248E();
        a2z0Var.f68233b += 4;
        a2z0Var.f68232a -= 4;
        evx0Var.m122859i(iM104248E);
        h1z0 h1z0VarM214000k = m214000k(h1z0VarM214001l3, a2z0Var.f68233b, evx0Var.f96057d, iM104248E);
        a2z0Var.f68233b += (long) iM104248E;
        int i8 = a2z0Var.f68232a - iM104248E;
        a2z0Var.f68232a = i8;
        ByteBuffer byteBuffer = evx0Var.f96060g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            evx0Var.f96060g = ByteBuffer.allocate(i8);
        } else {
            evx0Var.f96060g.clear();
        }
        return m214000k(h1z0VarM214000k, a2z0Var.f68233b, evx0Var.f96060g, a2z0Var.f68232a);
    }

    /* JADX INFO: renamed from: a */
    public final int m214003a(nyy0 nyy0Var, int i, boolean z) throws IOException {
        int iM214011i = m214011i(i);
        h1z0 h1z0Var = this.f197158d;
        int iMo12781a = nyy0Var.mo12781a(h1z0Var.f107510c.f182590a, h1z0Var.m133357a(this.f197159e), iM214011i);
        if (iMo12781a != -1) {
            m214012n(iMo12781a);
            return iMo12781a;
        }
        if (z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m214004b() {
        return this.f197159e;
    }

    /* JADX INFO: renamed from: c */
    public final void m214005c(long j) {
        h1z0 h1z0Var;
        if (j != -1) {
            while (true) {
                h1z0Var = this.f197156b;
                if (j < h1z0Var.f107509b) {
                    break;
                }
                this.f197160f.m108196c(h1z0Var.f107510c);
                this.f197156b = this.f197156b.m133358b();
            }
            if (this.f197157c.f107508a < h1z0Var.f107508a) {
                this.f197157c = h1z0Var;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m214006d(evx0 evx0Var, a2z0 a2z0Var) {
        m214002m(this.f197157c, evx0Var, a2z0Var, this.f197155a);
    }

    /* JADX INFO: renamed from: e */
    public final void m214007e(evx0 evx0Var, a2z0 a2z0Var) {
        this.f197157c = m214002m(this.f197157c, evx0Var, a2z0Var, this.f197155a);
    }

    /* JADX INFO: renamed from: f */
    public final void m214008f() {
        h1z0 h1z0Var = this.f197156b;
        if (h1z0Var.f107510c != null) {
            this.f197160f.m108197d(h1z0Var);
            h1z0Var.m133358b();
        }
        this.f197156b.m133359c(0L, 65536);
        h1z0 h1z0Var2 = this.f197156b;
        this.f197157c = h1z0Var2;
        this.f197158d = h1z0Var2;
        this.f197159e = 0L;
        this.f197160f.m108200g();
    }

    /* JADX INFO: renamed from: g */
    public final void m214009g() {
        this.f197157c = this.f197156b;
    }

    /* JADX INFO: renamed from: h */
    public final void m214010h(bgw0 bgw0Var, int i) {
        while (i > 0) {
            int iM214011i = m214011i(i);
            h1z0 h1z0Var = this.f197158d;
            bgw0Var.m104265g(h1z0Var.f107510c.f182590a, h1z0Var.m133357a(this.f197159e), iM214011i);
            i -= iM214011i;
            m214012n(iM214011i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m214011i(int i) {
        h1z0 h1z0Var = this.f197158d;
        if (h1z0Var.f107510c == null) {
            v5z0 v5z0VarM108195b = this.f197160f.m108195b();
            h1z0 h1z0Var2 = new h1z0(this.f197158d.f107509b, 65536);
            h1z0Var.f107510c = v5z0VarM108195b;
            h1z0Var.f107511d = h1z0Var2;
        }
        return Math.min(i, (int) (this.f197158d.f107509b - this.f197159e));
    }

    /* JADX INFO: renamed from: n */
    public final void m214012n(int i) {
        long j = this.f197159e + ((long) i);
        this.f197159e = j;
        h1z0 h1z0Var = this.f197158d;
        if (j == h1z0Var.f107509b) {
            this.f197158d = h1z0Var.f107511d;
        }
    }
}
