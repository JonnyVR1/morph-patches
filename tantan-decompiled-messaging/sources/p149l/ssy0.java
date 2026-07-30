package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ssy0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f166258a = new v6w0(32);

    /* JADX INFO: renamed from: b */
    public bsy0 f166259b;

    /* JADX INFO: renamed from: c */
    public bsy0 f166260c;

    /* JADX INFO: renamed from: d */
    public bsy0 f166261d;

    /* JADX INFO: renamed from: e */
    public long f166262e;

    /* JADX INFO: renamed from: f */
    public final wwy0 f166263f;

    public ssy0(wwy0 wwy0Var) {
        this.f166263f = wwy0Var;
        bsy0 bsy0Var = new bsy0(0L, 65536);
        this.f166259b = bsy0Var;
        this.f166260c = bsy0Var;
        this.f166261d = bsy0Var;
    }

    /* JADX INFO: renamed from: j */
    public static bsy0 m185778j(bsy0 bsy0Var, long j) {
        while (j >= bsy0Var.f77148b) {
            bsy0Var = bsy0Var.f77150d;
        }
        return bsy0Var;
    }

    /* JADX INFO: renamed from: k */
    public static bsy0 m185779k(bsy0 bsy0Var, long j, ByteBuffer byteBuffer, int i) {
        bsy0 bsy0VarM185778j = m185778j(bsy0Var, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (bsy0VarM185778j.f77148b - j));
            byteBuffer.put(bsy0VarM185778j.f77149c.f151610a, bsy0VarM185778j.m103725a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == bsy0VarM185778j.f77148b) {
                bsy0VarM185778j = bsy0VarM185778j.f77150d;
            }
        }
        return bsy0VarM185778j;
    }

    /* JADX INFO: renamed from: l */
    public static bsy0 m185780l(bsy0 bsy0Var, long j, byte[] bArr, int i) {
        bsy0 bsy0VarM185778j = m185778j(bsy0Var, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (bsy0VarM185778j.f77148b - j));
            System.arraycopy(bsy0VarM185778j.f77149c.f151610a, bsy0VarM185778j.m103725a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == bsy0VarM185778j.f77148b) {
                bsy0VarM185778j = bsy0VarM185778j.f77150d;
            }
        }
        return bsy0VarM185778j;
    }

    /* JADX INFO: renamed from: m */
    public static bsy0 m185781m(bsy0 bsy0Var, ylx0 ylx0Var, usy0 usy0Var, v6w0 v6w0Var) {
        bsy0 bsy0VarM185780l;
        if (ylx0Var.m215313k()) {
            long j = usy0Var.f178214b;
            int iM197242F = 1;
            v6w0Var.m197259h(1);
            bsy0 bsy0VarM185780l2 = m185780l(bsy0Var, j, v6w0Var.m197264m(), 1);
            long j2 = j + 1;
            byte b = v6w0Var.m197264m()[0];
            int i = b & 128;
            int i2 = b & 127;
            nlx0 nlx0Var = ylx0Var.f198944c;
            byte[] bArr = nlx0Var.f139592a;
            if (bArr == null) {
                nlx0Var.f139592a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            bsy0VarM185780l = m185780l(bsy0VarM185780l2, j2, nlx0Var.f139592a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                v6w0Var.m197259h(2);
                bsy0VarM185780l = m185780l(bsy0VarM185780l, j3, v6w0Var.m197264m(), 2);
                j3 += 2;
                iM197242F = v6w0Var.m197242F();
            }
            int i3 = iM197242F;
            int[] iArr = nlx0Var.f139595d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = nlx0Var.f139596e;
            if (iArr3 == null || iArr3.length < i3) {
                iArr3 = new int[i3];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i3 * 6;
                v6w0Var.m197259h(i4);
                bsy0VarM185780l = m185780l(bsy0VarM185780l, j3, v6w0Var.m197264m(), i4);
                j3 += (long) i4;
                v6w0Var.m197262k(0);
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr2[i5] = v6w0Var.m197242F();
                    iArr4[i5] = v6w0Var.m197241E();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = usy0Var.f178213a - ((int) (j3 - usy0Var.f178214b));
            }
            a7r0 a7r0Var = usy0Var.f178215c;
            int i6 = ggw0.f102568a;
            nlx0Var.m160079c(i3, iArr2, iArr4, a7r0Var.f67947b, nlx0Var.f139592a, a7r0Var.f67946a, a7r0Var.f67948c, a7r0Var.f67949d);
            long j4 = usy0Var.f178214b;
            int i7 = (int) (j3 - j4);
            usy0Var.f178214b = j4 + ((long) i7);
            usy0Var.f178213a -= i7;
        } else {
            bsy0VarM185780l = bsy0Var;
        }
        if (!ylx0Var.m219212e()) {
            ylx0Var.m215311i(usy0Var.f178213a);
            return m185779k(bsy0VarM185780l, usy0Var.f178214b, ylx0Var.f198945d, usy0Var.f178213a);
        }
        v6w0Var.m197259h(4);
        bsy0 bsy0VarM185780l3 = m185780l(bsy0VarM185780l, usy0Var.f178214b, v6w0Var.m197264m(), 4);
        int iM197241E = v6w0Var.m197241E();
        usy0Var.f178214b += 4;
        usy0Var.f178213a -= 4;
        ylx0Var.m215311i(iM197241E);
        bsy0 bsy0VarM185779k = m185779k(bsy0VarM185780l3, usy0Var.f178214b, ylx0Var.f198945d, iM197241E);
        usy0Var.f178214b += (long) iM197241E;
        int i8 = usy0Var.f178213a - iM197241E;
        usy0Var.f178213a = i8;
        ByteBuffer byteBuffer = ylx0Var.f198948g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            ylx0Var.f198948g = ByteBuffer.allocate(i8);
        } else {
            ylx0Var.f198948g.clear();
        }
        return m185779k(bsy0VarM185779k, usy0Var.f178214b, ylx0Var.f198948g, usy0Var.f178213a);
    }

    /* JADX INFO: renamed from: a */
    public final int m185782a(hpy0 hpy0Var, int i, boolean z) throws IOException {
        int iM185790i = m185790i(i);
        bsy0 bsy0Var = this.f166261d;
        int iMo12727a = hpy0Var.mo12727a(bsy0Var.f77149c.f151610a, bsy0Var.m103725a(this.f166262e), iM185790i);
        if (iMo12727a != -1) {
            m185791n(iMo12727a);
            return iMo12727a;
        }
        if (z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final long m185783b() {
        return this.f166262e;
    }

    /* JADX INFO: renamed from: c */
    public final void m185784c(long j) {
        bsy0 bsy0Var;
        if (j != -1) {
            while (true) {
                bsy0Var = this.f166259b;
                if (j < bsy0Var.f77148b) {
                    break;
                }
                this.f166263f.m205890c(bsy0Var.f77149c);
                this.f166259b = this.f166259b.m103726b();
            }
            if (this.f166260c.f77147a < bsy0Var.f77147a) {
                this.f166260c = bsy0Var;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m185785d(ylx0 ylx0Var, usy0 usy0Var) {
        m185781m(this.f166260c, ylx0Var, usy0Var, this.f166258a);
    }

    /* JADX INFO: renamed from: e */
    public final void m185786e(ylx0 ylx0Var, usy0 usy0Var) {
        this.f166260c = m185781m(this.f166260c, ylx0Var, usy0Var, this.f166258a);
    }

    /* JADX INFO: renamed from: f */
    public final void m185787f() {
        bsy0 bsy0Var = this.f166259b;
        if (bsy0Var.f77149c != null) {
            this.f166263f.m205891d(bsy0Var);
            bsy0Var.m103726b();
        }
        this.f166259b.m103727c(0L, 65536);
        bsy0 bsy0Var2 = this.f166259b;
        this.f166260c = bsy0Var2;
        this.f166261d = bsy0Var2;
        this.f166262e = 0L;
        this.f166263f.m205894g();
    }

    /* JADX INFO: renamed from: g */
    public final void m185788g() {
        this.f166260c = this.f166259b;
    }

    /* JADX INFO: renamed from: h */
    public final void m185789h(v6w0 v6w0Var, int i) {
        while (i > 0) {
            int iM185790i = m185790i(i);
            bsy0 bsy0Var = this.f166261d;
            v6w0Var.m197258g(bsy0Var.f77149c.f151610a, bsy0Var.m103725a(this.f166262e), iM185790i);
            i -= iM185790i;
            m185791n(iM185790i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m185790i(int i) {
        bsy0 bsy0Var = this.f166261d;
        if (bsy0Var.f77149c == null) {
            pwy0 pwy0VarM205889b = this.f166263f.m205889b();
            bsy0 bsy0Var2 = new bsy0(this.f166261d.f77148b, 65536);
            bsy0Var.f77149c = pwy0VarM205889b;
            bsy0Var.f77150d = bsy0Var2;
        }
        return Math.min(i, (int) (this.f166261d.f77148b - this.f166262e));
    }

    /* JADX INFO: renamed from: n */
    public final void m185791n(int i) {
        long j = this.f166262e + ((long) i);
        this.f166262e = j;
        bsy0 bsy0Var = this.f166261d;
        if (j == bsy0Var.f77148b) {
            this.f166261d = bsy0Var.f77150d;
        }
    }
}
