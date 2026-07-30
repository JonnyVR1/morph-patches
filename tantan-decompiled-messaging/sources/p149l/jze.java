package p149l;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class jze implements Closeable {

    /* JADX INFO: renamed from: n */
    public static boolean f120374n;

    /* JADX INFO: renamed from: a */
    public final fa5<PooledByteBuffer> f120375a;

    /* JADX INFO: renamed from: b */
    public final syg0<FileInputStream> f120376b;

    /* JADX INFO: renamed from: c */
    public egm f120377c;

    /* JADX INFO: renamed from: d */
    public int f120378d;

    /* JADX INFO: renamed from: e */
    public int f120379e;

    /* JADX INFO: renamed from: f */
    public int f120380f;

    /* JADX INFO: renamed from: g */
    public int f120381g;

    /* JADX INFO: renamed from: h */
    public int f120382h;

    /* JADX INFO: renamed from: i */
    public int f120383i;

    /* JADX INFO: renamed from: j */
    public wq3 f120384j;

    /* JADX INFO: renamed from: k */
    public ColorSpace f120385k;

    /* JADX INFO: renamed from: l */
    public String f120386l;

    /* JADX INFO: renamed from: m */
    public boolean f120387m;

    public jze(fa5<PooledByteBuffer> fa5Var) {
        this.f120377c = egm.f90961c;
        this.f120378d = -1;
        this.f120379e = 0;
        this.f120380f = -1;
        this.f120381g = -1;
        this.f120382h = 1;
        this.f120383i = -1;
        rf80.m179111b(Boolean.valueOf(fa5.m120144Q(fa5Var)));
        this.f120375a = fa5Var.clone();
        this.f120376b = null;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m143893Y(jze jzeVar) {
        return jzeVar.f120378d >= 0 && jzeVar.f120380f >= 0 && jzeVar.f120381g >= 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m143894c0(jze jzeVar) {
        return jzeVar != null && jzeVar.m143908Z();
    }

    /* JADX INFO: renamed from: m */
    public static jze m143895m(jze jzeVar) {
        if (jzeVar != null) {
            return jzeVar.m143914k();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m143896n(jze jzeVar) {
        if (jzeVar != null) {
            jzeVar.close();
        }
    }

    /* JADX INFO: renamed from: B */
    public String m143897B(int i) {
        fa5<PooledByteBuffer> fa5VarM143923t = m143923t();
        if (fa5VarM143923t == null) {
            return "";
        }
        int iMin = Math.min(m143902M(), i);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBufferM120155B = fa5VarM143923t.m120155B();
            if (pooledByteBufferM120155B == null) {
                fa5VarM143923t.close();
                return "";
            }
            pooledByteBufferM120155B.mo8156p(0, bArr, 0, iMin);
            fa5VarM143923t.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } catch (Throwable th) {
            fa5VarM143923t.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public egm m143898F() {
        m143910g0();
        return this.f120377c;
    }

    /* JADX INFO: renamed from: H */
    public InputStream m143899H() {
        syg0<FileInputStream> syg0Var = this.f120376b;
        if (syg0Var != null) {
            return syg0Var.get();
        }
        fa5 fa5VarM120152t = fa5.m120152t(this.f120375a);
        if (fa5VarM120152t == null) {
            return null;
        }
        try {
            return new ab80((PooledByteBuffer) fa5VarM120152t.m120155B());
        } finally {
            fa5.m120154v(fa5VarM120152t);
        }
    }

    /* JADX INFO: renamed from: I */
    public InputStream m143900I() {
        return (InputStream) rf80.m179116g(m143899H());
    }

    /* JADX INFO: renamed from: J */
    public int m143901J() {
        return this.f120382h;
    }

    /* JADX INFO: renamed from: M */
    public int m143902M() {
        fa5<PooledByteBuffer> fa5Var = this.f120375a;
        return (fa5Var == null || fa5Var.m120155B() == null) ? this.f120383i : this.f120375a.m120155B().size();
    }

    /* JADX INFO: renamed from: N */
    public String m143903N() {
        return this.f120386l;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m143904Q() {
        return this.f120387m;
    }

    /* JADX INFO: renamed from: S */
    public final void m143905S() {
        egm egmVarM125989d = ggm.m125989d(m143899H());
        this.f120377c = egmVarM125989d;
        Pair<Integer, Integer> pairM143912i0 = kod.m146695b(egmVarM125989d) ? m143912i0() : m143911h0().m208684b();
        if (egmVarM125989d == kod.JPEG && this.f120378d == -1) {
            if (pairM143912i0 != null) {
                int iM198969b = vmq.m198969b(m143899H());
                this.f120379e = iM198969b;
                this.f120378d = vmq.m198968a(iM198969b);
                return;
            }
            return;
        }
        if (egmVarM125989d == kod.HEIF && this.f120378d == -1) {
            int iM191055a = tyk.m191055a(m143899H());
            this.f120379e = iM191055a;
            this.f120378d = vmq.m198968a(iM191055a);
        } else if (this.f120378d == -1) {
            this.f120378d = 0;
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m143906T(int i) {
        egm egmVar = this.f120377c;
        if ((egmVar != kod.JPEG && egmVar != kod.DNG) || this.f120376b != null) {
            return true;
        }
        rf80.m179116g(this.f120375a);
        PooledByteBuffer pooledByteBufferM120155B = this.f120375a.m120155B();
        return i >= 2 && pooledByteBufferM120155B.mo8157r(i + (-2)) == -1 && pooledByteBufferM120155B.mo8157r(i - 1) == -39;
    }

    /* JADX INFO: renamed from: U */
    public int m143907U() {
        m143910g0();
        return this.f120378d;
    }

    /* JADX INFO: renamed from: Z */
    public synchronized boolean m143908Z() {
        return fa5.m120144Q(this.f120375a) || this.f120376b != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fa5.m120154v(this.f120375a);
    }

    /* JADX INFO: renamed from: d0 */
    public void m143909d0() {
        if (!f120374n) {
            m143905S();
        } else {
            if (this.f120387m) {
                return;
            }
            m143905S();
            this.f120387m = true;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m143910g0() {
        if (this.f120380f < 0 || this.f120381g < 0) {
            m143909d0();
        }
    }

    public int getHeight() {
        m143910g0();
        return this.f120381g;
    }

    public int getWidth() {
        m143910g0();
        return this.f120380f;
    }

    /* JADX INFO: renamed from: h0 */
    public final xgm m143911h0() throws Throwable {
        InputStream inputStreamM143899H;
        try {
            inputStreamM143899H = m143899H();
            try {
                xgm xgmVarM186957d = t23.m186957d(inputStreamM143899H);
                this.f120385k = xgmVarM186957d.getColorSpace();
                Pair<Integer, Integer> pairM208684b = xgmVarM186957d.m208684b();
                if (pairM208684b != null) {
                    this.f120380f = pairM208684b.component1().intValue();
                    this.f120381g = pairM208684b.component2().intValue();
                }
                if (inputStreamM143899H != null) {
                    try {
                        inputStreamM143899H.close();
                    } catch (IOException unused) {
                    }
                }
                return xgmVarM186957d;
            } catch (Throwable th) {
                th = th;
                if (inputStreamM143899H != null) {
                    try {
                        inputStreamM143899H.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamM143899H = null;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final Pair<Integer, Integer> m143912i0() {
        InputStream inputStreamM143899H = m143899H();
        if (inputStreamM143899H == null) {
            return null;
        }
        Pair<Integer, Integer> pairM184834f = slp0.m184834f(inputStreamM143899H);
        if (pairM184834f != null) {
            this.f120380f = pairM184834f.component1().intValue();
            this.f120381g = pairM184834f.component2().intValue();
        }
        return pairM184834f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m143913j0(wq3 wq3Var) {
        this.f120384j = wq3Var;
    }

    /* JADX INFO: renamed from: k */
    public jze m143914k() {
        jze jzeVar;
        syg0<FileInputStream> syg0Var = this.f120376b;
        if (syg0Var != null) {
            jzeVar = new jze(syg0Var, this.f120383i);
        } else {
            fa5 fa5VarM120152t = fa5.m120152t(this.f120375a);
            if (fa5VarM120152t == null) {
                jzeVar = null;
            } else {
                try {
                    jzeVar = new jze((fa5<PooledByteBuffer>) fa5VarM120152t);
                } catch (Throwable th) {
                    fa5.m120154v(fa5VarM120152t);
                    throw th;
                }
            }
            fa5.m120154v(fa5VarM120152t);
        }
        if (jzeVar != null) {
            jzeVar.m143921q(this);
        }
        return jzeVar;
    }

    /* JADX INFO: renamed from: k0 */
    public void m143915k0(int i) {
        this.f120379e = i;
    }

    /* JADX INFO: renamed from: l0 */
    public void m143916l0(int i) {
        this.f120381g = i;
    }

    /* JADX INFO: renamed from: m0 */
    public void m143917m0(egm egmVar) {
        this.f120377c = egmVar;
    }

    /* JADX INFO: renamed from: n0 */
    public void m143918n0(int i) {
        this.f120378d = i;
    }

    /* JADX INFO: renamed from: o0 */
    public void m143919o0(int i) {
        this.f120382h = i;
    }

    /* JADX INFO: renamed from: p0 */
    public void m143920p0(String str) {
        this.f120386l = str;
    }

    /* JADX INFO: renamed from: q */
    public void m143921q(jze jzeVar) {
        this.f120377c = jzeVar.m143898F();
        this.f120380f = jzeVar.getWidth();
        this.f120381g = jzeVar.getHeight();
        this.f120378d = jzeVar.m143907U();
        this.f120379e = jzeVar.m143926x();
        this.f120382h = jzeVar.m143901J();
        this.f120383i = jzeVar.m143902M();
        this.f120384j = jzeVar.m143924u();
        this.f120385k = jzeVar.m143925v();
        this.f120387m = jzeVar.m143904Q();
    }

    /* JADX INFO: renamed from: q0 */
    public void m143922q0(int i) {
        this.f120380f = i;
    }

    /* JADX INFO: renamed from: t */
    public fa5<PooledByteBuffer> m143923t() {
        return fa5.m120152t(this.f120375a);
    }

    /* JADX INFO: renamed from: u */
    public wq3 m143924u() {
        return this.f120384j;
    }

    /* JADX INFO: renamed from: v */
    public ColorSpace m143925v() {
        m143910g0();
        return this.f120385k;
    }

    /* JADX INFO: renamed from: x */
    public int m143926x() {
        m143910g0();
        return this.f120379e;
    }

    public jze(syg0<FileInputStream> syg0Var) {
        this.f120377c = egm.f90961c;
        this.f120378d = -1;
        this.f120379e = 0;
        this.f120380f = -1;
        this.f120381g = -1;
        this.f120382h = 1;
        this.f120383i = -1;
        rf80.m179116g(syg0Var);
        this.f120375a = null;
        this.f120376b = syg0Var;
    }

    public jze(syg0<FileInputStream> syg0Var, int i) {
        this(syg0Var);
        this.f120383i = i;
    }
}
