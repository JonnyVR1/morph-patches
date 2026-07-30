package p153l;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class n0f implements Closeable {

    /* JADX INFO: renamed from: n */
    public static boolean f139609n;

    /* JADX INFO: renamed from: a */
    public final fb5<PooledByteBuffer> f139610a;

    /* JADX INFO: renamed from: b */
    public final a7h0<FileInputStream> f139611b;

    /* JADX INFO: renamed from: c */
    public him f139612c;

    /* JADX INFO: renamed from: d */
    public int f139613d;

    /* JADX INFO: renamed from: e */
    public int f139614e;

    /* JADX INFO: renamed from: f */
    public int f139615f;

    /* JADX INFO: renamed from: g */
    public int f139616g;

    /* JADX INFO: renamed from: h */
    public int f139617h;

    /* JADX INFO: renamed from: i */
    public int f139618i;

    /* JADX INFO: renamed from: j */
    public vr3 f139619j;

    /* JADX INFO: renamed from: k */
    public ColorSpace f139620k;

    /* JADX INFO: renamed from: l */
    public String f139621l;

    /* JADX INFO: renamed from: m */
    public boolean f139622m;

    public n0f(fb5<PooledByteBuffer> fb5Var) {
        this.f139612c = him.f110036c;
        this.f139613d = -1;
        this.f139614e = 0;
        this.f139615f = -1;
        this.f139616g = -1;
        this.f139617h = 1;
        this.f139618i = -1;
        wn80.m207177b(Boolean.valueOf(fb5.m124864Q(fb5Var)));
        this.f139610a = fb5Var.clone();
        this.f139611b = null;
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m160956Z(n0f n0fVar) {
        return n0fVar.f139613d >= 0 && n0fVar.f139615f >= 0 && n0fVar.f139616g >= 0;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m160957d0(n0f n0fVar) {
        return n0fVar != null && n0fVar.m160971a0();
    }

    /* JADX INFO: renamed from: m */
    public static n0f m160958m(n0f n0fVar) {
        if (n0fVar != null) {
            return n0fVar.m160976k();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m160959n(n0f n0fVar) {
        if (n0fVar != null) {
            n0fVar.close();
        }
    }

    /* JADX INFO: renamed from: B */
    public String m160960B(int i) {
        fb5<PooledByteBuffer> fb5VarM160986t = m160986t();
        if (fb5VarM160986t == null) {
            return "";
        }
        int iMin = Math.min(m160965M(), i);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBufferM124875B = fb5VarM160986t.m124875B();
            if (pooledByteBufferM124875B == null) {
                fb5VarM160986t.close();
                return "";
            }
            pooledByteBufferM124875B.mo8210p(0, bArr, 0, iMin);
            fb5VarM160986t.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } catch (Throwable th) {
            fb5VarM160986t.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public him m160961F() {
        m160973h0();
        return this.f139612c;
    }

    /* JADX INFO: renamed from: H */
    public InputStream m160962H() {
        a7h0<FileInputStream> a7h0Var = this.f139611b;
        if (a7h0Var != null) {
            return a7h0Var.get();
        }
        fb5 fb5VarM124872t = fb5.m124872t(this.f139610a);
        if (fb5VarM124872t == null) {
            return null;
        }
        try {
            return new gj80((PooledByteBuffer) fb5VarM124872t.m124875B());
        } finally {
            fb5.m124874v(fb5VarM124872t);
        }
    }

    /* JADX INFO: renamed from: I */
    public InputStream m160963I() {
        return (InputStream) wn80.m207182g(m160962H());
    }

    /* JADX INFO: renamed from: J */
    public int m160964J() {
        return this.f139617h;
    }

    /* JADX INFO: renamed from: M */
    public int m160965M() {
        fb5<PooledByteBuffer> fb5Var = this.f139610a;
        return (fb5Var == null || fb5Var.m124875B() == null) ? this.f139618i : this.f139610a.m124875B().size();
    }

    /* JADX INFO: renamed from: N */
    public String m160966N() {
        return this.f139621l;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m160967Q() {
        return this.f139622m;
    }

    /* JADX INFO: renamed from: S */
    public final void m160968S() {
        him himVarM144985d = jim.m144985d(m160962H());
        this.f139612c = himVarM144985d;
        Pair<Integer, Integer> pairM160975j0 = ppd.m173189b(himVarM144985d) ? m160975j0() : m160974i0().m98405b();
        if (himVarM144985d == ppd.JPEG && this.f139613d == -1) {
            if (pairM160975j0 != null) {
                int iM197017b = uoq.m197017b(m160962H());
                this.f139614e = iM197017b;
                this.f139613d = uoq.m197016a(iM197017b);
                return;
            }
            return;
        }
        if (himVarM144985d == ppd.HEIF && this.f139613d == -1) {
            int iM143146a = j1l.m143146a(m160962H());
            this.f139614e = iM143146a;
            this.f139613d = uoq.m197016a(iM143146a);
        } else if (this.f139613d == -1) {
            this.f139613d = 0;
        }
    }

    /* JADX INFO: renamed from: U */
    public boolean m160969U(int i) {
        him himVar = this.f139612c;
        if ((himVar != ppd.JPEG && himVar != ppd.DNG) || this.f139611b != null) {
            return true;
        }
        wn80.m207182g(this.f139610a);
        PooledByteBuffer pooledByteBufferM124875B = this.f139610a.m124875B();
        return i >= 2 && pooledByteBufferM124875B.mo8211r(i + (-2)) == -1 && pooledByteBufferM124875B.mo8211r(i - 1) == -39;
    }

    /* JADX INFO: renamed from: V */
    public int m160970V() {
        m160973h0();
        return this.f139613d;
    }

    /* JADX INFO: renamed from: a0 */
    public synchronized boolean m160971a0() {
        return fb5.m124864Q(this.f139610a) || this.f139611b != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fb5.m124874v(this.f139610a);
    }

    /* JADX INFO: renamed from: e0 */
    public void m160972e0() {
        if (!f139609n) {
            m160968S();
        } else {
            if (this.f139622m) {
                return;
            }
            m160968S();
            this.f139622m = true;
        }
    }

    public int getHeight() {
        m160973h0();
        return this.f139616g;
    }

    public int getWidth() {
        m160973h0();
        return this.f139615f;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m160973h0() {
        if (this.f139615f < 0 || this.f139616g < 0) {
            m160972e0();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final ajm m160974i0() throws Throwable {
        InputStream inputStreamM160962H;
        try {
            inputStreamM160962H = m160962H();
            try {
                ajm ajmVarM143307d = j33.m143307d(inputStreamM160962H);
                this.f139620k = ajmVarM143307d.getColorSpace();
                Pair<Integer, Integer> pairM98405b = ajmVarM143307d.m98405b();
                if (pairM98405b != null) {
                    this.f139615f = pairM98405b.component1().intValue();
                    this.f139616g = pairM98405b.component2().intValue();
                }
                if (inputStreamM160962H != null) {
                    try {
                        inputStreamM160962H.close();
                    } catch (IOException unused) {
                    }
                }
                return ajmVarM143307d;
            } catch (Throwable th) {
                th = th;
                if (inputStreamM160962H != null) {
                    try {
                        inputStreamM160962H.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamM160962H = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final Pair<Integer, Integer> m160975j0() {
        InputStream inputStreamM160962H = m160962H();
        if (inputStreamM160962H == null) {
            return null;
        }
        Pair<Integer, Integer> pairM207963f = wup0.m207963f(inputStreamM160962H);
        if (pairM207963f != null) {
            this.f139615f = pairM207963f.component1().intValue();
            this.f139616g = pairM207963f.component2().intValue();
        }
        return pairM207963f;
    }

    /* JADX INFO: renamed from: k */
    public n0f m160976k() {
        n0f n0fVar;
        a7h0<FileInputStream> a7h0Var = this.f139611b;
        if (a7h0Var != null) {
            n0fVar = new n0f(a7h0Var, this.f139618i);
        } else {
            fb5 fb5VarM124872t = fb5.m124872t(this.f139610a);
            if (fb5VarM124872t == null) {
                n0fVar = null;
            } else {
                try {
                    n0fVar = new n0f((fb5<PooledByteBuffer>) fb5VarM124872t);
                } catch (Throwable th) {
                    fb5.m124874v(fb5VarM124872t);
                    throw th;
                }
            }
            fb5.m124874v(fb5VarM124872t);
        }
        if (n0fVar != null) {
            n0fVar.m160983q(this);
        }
        return n0fVar;
    }

    /* JADX INFO: renamed from: k0 */
    public void m160977k0(vr3 vr3Var) {
        this.f139619j = vr3Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m160978l0(int i) {
        this.f139614e = i;
    }

    /* JADX INFO: renamed from: m0 */
    public void m160979m0(int i) {
        this.f139616g = i;
    }

    /* JADX INFO: renamed from: n0 */
    public void m160980n0(him himVar) {
        this.f139612c = himVar;
    }

    /* JADX INFO: renamed from: o0 */
    public void m160981o0(int i) {
        this.f139613d = i;
    }

    /* JADX INFO: renamed from: p0 */
    public void m160982p0(int i) {
        this.f139617h = i;
    }

    /* JADX INFO: renamed from: q */
    public void m160983q(n0f n0fVar) {
        this.f139612c = n0fVar.m160961F();
        this.f139615f = n0fVar.getWidth();
        this.f139616g = n0fVar.getHeight();
        this.f139613d = n0fVar.m160970V();
        this.f139614e = n0fVar.m160989x();
        this.f139617h = n0fVar.m160964J();
        this.f139618i = n0fVar.m160965M();
        this.f139619j = n0fVar.m160987u();
        this.f139620k = n0fVar.m160988v();
        this.f139622m = n0fVar.m160967Q();
    }

    /* JADX INFO: renamed from: q0 */
    public void m160984q0(String str) {
        this.f139621l = str;
    }

    /* JADX INFO: renamed from: r0 */
    public void m160985r0(int i) {
        this.f139615f = i;
    }

    /* JADX INFO: renamed from: t */
    public fb5<PooledByteBuffer> m160986t() {
        return fb5.m124872t(this.f139610a);
    }

    /* JADX INFO: renamed from: u */
    public vr3 m160987u() {
        return this.f139619j;
    }

    /* JADX INFO: renamed from: v */
    public ColorSpace m160988v() {
        m160973h0();
        return this.f139620k;
    }

    /* JADX INFO: renamed from: x */
    public int m160989x() {
        m160973h0();
        return this.f139614e;
    }

    public n0f(a7h0<FileInputStream> a7h0Var) {
        this.f139612c = him.f110036c;
        this.f139613d = -1;
        this.f139614e = 0;
        this.f139615f = -1;
        this.f139616g = -1;
        this.f139617h = 1;
        this.f139618i = -1;
        wn80.m207182g(a7h0Var);
        this.f139610a = null;
        this.f139611b = a7h0Var;
    }

    public n0f(a7h0<FileInputStream> a7h0Var, int i) {
        this(a7h0Var);
        this.f139618i = i;
    }
}
