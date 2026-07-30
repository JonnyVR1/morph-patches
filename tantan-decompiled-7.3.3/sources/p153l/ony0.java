package p153l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ony0 implements wny0 {

    /* JADX INFO: renamed from: i */
    public static final fpw0 f148239i = new fpw0() { // from class: l.kny0
        @Override // p153l.fpw0
        public final Object zza() {
            return ony0.m168415m();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f148240j = new Random();

    /* JADX INFO: renamed from: a */
    public final wyt0 f148241a;

    /* JADX INFO: renamed from: b */
    public final hwt0 f148242b;

    /* JADX INFO: renamed from: c */
    public final HashMap f148243c;

    /* JADX INFO: renamed from: d */
    public final fpw0 f148244d;

    /* JADX INFO: renamed from: e */
    public uny0 f148245e;

    /* JADX INFO: renamed from: f */
    public d0u0 f148246f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f148247g;

    /* JADX INFO: renamed from: h */
    public long f148248h;

    public ony0(fpw0 fpw0Var) {
        this.f148244d = fpw0Var;
        this.f148241a = new wyt0();
        this.f148242b = new hwt0();
        this.f148243c = new HashMap();
        this.f148246f = d0u0.f84608a;
        this.f148248h = -1L;
    }

    /* JADX INFO: renamed from: m */
    public static String m168415m() {
        byte[] bArr = new byte[12];
        f148240j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p153l.wny0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo168416a(yfy0 yfy0Var) {
        uny0 uny0Var;
        try {
            String str = this.f148247g;
            if (str != null) {
                mny0 mny0Var = (mny0) this.f148243c.get(str);
                if (mny0Var == null) {
                    throw null;
                }
                m168424n(mny0Var);
            }
            Iterator it = this.f148243c.values().iterator();
            while (it.hasNext()) {
                mny0 mny0Var2 = (mny0) it.next();
                it.remove();
                if (mny0Var2.f137747e && (uny0Var = this.f148245e) != null) {
                    uny0Var.mo187031i(yfy0Var, mny0Var2.f137743a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // p153l.wny0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo168417b(yfy0 yfy0Var) {
        mny0 mny0VarM168423l;
        kzy0 kzy0Var;
        mny0 mny0VarM168423l2;
        mny0 mny0Var;
        try {
            if (this.f148245e == null) {
                throw null;
            }
            if (!yfy0Var.f199685b.m113469o()) {
                kzy0 kzy0Var2 = yfy0Var.f199687d;
                if (kzy0Var2 == null) {
                    mny0VarM168423l = m168423l(yfy0Var.f199686c, yfy0Var.f199687d);
                    if (this.f148247g == null) {
                        this.f148247g = mny0VarM168423l.f137743a;
                    }
                    kzy0Var = yfy0Var.f199687d;
                    if (kzy0Var != null) {
                        mny0VarM168423l2 = m168423l(yfy0Var.f199686c, new kzy0(kzy0Var.f129476a, kzy0Var.f129479d, kzy0Var.f129477b));
                        if (!mny0VarM168423l2.f137747e) {
                            mny0VarM168423l2.f137747e = true;
                            yfy0Var.f199685b.mo113468n(yfy0Var.f199687d.f129476a, this.f148242b);
                            this.f148242b.m137513i(yfy0Var.f199687d.f129477b);
                            Math.max(0L, mpw0.m159396I(0L) + mpw0.m159396I(0L));
                            String unused = mny0VarM168423l2.f137743a;
                        }
                    }
                    if (!mny0VarM168423l.f137747e) {
                        mny0VarM168423l.f137747e = true;
                        String unused2 = mny0VarM168423l.f137743a;
                    }
                    if (mny0VarM168423l.f137743a.equals(this.f148247g)) {
                        mny0VarM168423l.f137748f = true;
                        this.f148245e.mo187032k(yfy0Var, mny0VarM168423l.f137743a);
                    }
                } else if (kzy0Var2.f129479d >= m168422k() && ((mny0Var = (mny0) this.f148243c.get(this.f148247g)) == null || mny0Var.f137745c != -1 || mny0Var.f137744b == yfy0Var.f199686c)) {
                    mny0VarM168423l = m168423l(yfy0Var.f199686c, yfy0Var.f199687d);
                    if (this.f148247g == null) {
                        this.f148247g = mny0VarM168423l.f137743a;
                    }
                    kzy0Var = yfy0Var.f199687d;
                    if (kzy0Var != null && kzy0Var.m152240b()) {
                        mny0VarM168423l2 = m168423l(yfy0Var.f199686c, new kzy0(kzy0Var.f129476a, kzy0Var.f129479d, kzy0Var.f129477b));
                        if (!mny0VarM168423l2.f137747e) {
                            mny0VarM168423l2.f137747e = true;
                            yfy0Var.f199685b.mo113468n(yfy0Var.f199687d.f129476a, this.f148242b);
                            this.f148242b.m137513i(yfy0Var.f199687d.f129477b);
                            Math.max(0L, mpw0.m159396I(0L) + mpw0.m159396I(0L));
                            String unused3 = mny0VarM168423l2.f137743a;
                        }
                    }
                    if (!mny0VarM168423l.f137747e) {
                        mny0VarM168423l.f137747e = true;
                        String unused4 = mny0VarM168423l.f137743a;
                    }
                    if (mny0VarM168423l.f137743a.equals(this.f148247g) && !mny0VarM168423l.f137748f) {
                        mny0VarM168423l.f137748f = true;
                        this.f148245e.mo187032k(yfy0Var, mny0VarM168423l.f137743a);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wny0
    /* JADX INFO: renamed from: c */
    public final void mo168418c(uny0 uny0Var) {
        this.f148245e = uny0Var;
    }

    @Override // p153l.wny0
    /* JADX INFO: renamed from: d */
    public final synchronized void mo168419d(yfy0 yfy0Var) {
        try {
            if (this.f148245e == null) {
                throw null;
            }
            d0u0 d0u0Var = this.f148246f;
            this.f148246f = yfy0Var.f199685b;
            Iterator it = this.f148243c.values().iterator();
            while (it.hasNext()) {
                mny0 mny0Var = (mny0) it.next();
                if (!mny0Var.m159218l(d0u0Var, this.f148246f) || mny0Var.m159217k(yfy0Var)) {
                    it.remove();
                    if (mny0Var.f137747e) {
                        if (mny0Var.f137743a.equals(this.f148247g)) {
                            m168424n(mny0Var);
                        }
                        this.f148245e.mo187031i(yfy0Var, mny0Var.f137743a, false);
                    }
                }
            }
            m168425o(yfy0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.wny0
    /* JADX INFO: renamed from: e */
    public final synchronized String mo168420e(d0u0 d0u0Var, kzy0 kzy0Var) {
        return m168423l(d0u0Var.mo113468n(kzy0Var.f129476a, this.f148242b).f111930c, kzy0Var).f137743a;
    }

    @Override // p153l.wny0
    /* JADX INFO: renamed from: f */
    public final synchronized void mo168421f(yfy0 yfy0Var, int i) {
        try {
            if (this.f148245e == null) {
                throw null;
            }
            Iterator it = this.f148243c.values().iterator();
            while (it.hasNext()) {
                mny0 mny0Var = (mny0) it.next();
                if (mny0Var.m159217k(yfy0Var)) {
                    it.remove();
                    if (mny0Var.f137747e) {
                        boolean zEquals = mny0Var.f137743a.equals(this.f148247g);
                        boolean z = false;
                        if (i == 0 && zEquals && mny0Var.f137748f) {
                            z = true;
                        }
                        if (zEquals) {
                            m168424n(mny0Var);
                        }
                        this.f148245e.mo187031i(yfy0Var, mny0Var.f137743a, z);
                    }
                }
            }
            m168425o(yfy0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m168422k() {
        mny0 mny0Var = (mny0) this.f148243c.get(this.f148247g);
        return (mny0Var == null || mny0Var.f137745c == -1) ? this.f148248h + 1 : mny0Var.f137745c;
    }

    /* JADX INFO: renamed from: l */
    public final mny0 m168423l(int i, @Nullable kzy0 kzy0Var) {
        long j = Long.MAX_VALUE;
        mny0 mny0Var = null;
        for (mny0 mny0Var2 : this.f148243c.values()) {
            mny0Var2.m159215g(i, kzy0Var);
            if (mny0Var2.m159216j(i, kzy0Var)) {
                long j2 = mny0Var2.f137745c;
                if (j2 == -1 || j2 < j) {
                    mny0Var = mny0Var2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = mpw0.f137957a;
                    if (mny0Var.f137746d != null && mny0Var2.f137746d != null) {
                        mny0Var = mny0Var2;
                    }
                }
            }
        }
        if (mny0Var != null) {
            return mny0Var;
        }
        String strM168415m = m168415m();
        mny0 mny0Var3 = new mny0(this, strM168415m, i, kzy0Var);
        this.f148243c.put(strM168415m, mny0Var3);
        return mny0Var3;
    }

    /* JADX INFO: renamed from: n */
    public final void m168424n(mny0 mny0Var) {
        if (mny0Var.f137745c != -1) {
            this.f148248h = mny0Var.f137745c;
        }
        this.f148247g = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    /* JADX INFO: renamed from: o */
    public final void m168425o(yfy0 yfy0Var) {
        if (yfy0Var.f199685b.m113469o()) {
            String str = this.f148247g;
            if (str != null) {
                mny0 mny0Var = (mny0) this.f148243c.get(str);
                mny0Var.getClass();
                m168424n(mny0Var);
                return;
            }
            return;
        }
        mny0 mny0Var2 = (mny0) this.f148243c.get(this.f148247g);
        mny0 mny0VarM168423l = m168423l(yfy0Var.f199686c, yfy0Var.f199687d);
        this.f148247g = mny0VarM168423l.f137743a;
        mo168417b(yfy0Var);
        kzy0 kzy0Var = yfy0Var.f199687d;
        if (kzy0Var == null || !kzy0Var.m152240b()) {
            return;
        }
        if (mny0Var2 != null) {
            if (mny0Var2.f137745c == kzy0Var.f129479d && mny0Var2.f137746d != null && mny0Var2.f137746d.f129477b == yfy0Var.f199687d.f129477b && mny0Var2.f137746d.f129478c == yfy0Var.f199687d.f129478c) {
                return;
            }
        }
        kzy0 kzy0Var2 = yfy0Var.f199687d;
        String unused = m168423l(yfy0Var.f199686c, new kzy0(kzy0Var2.f129476a, kzy0Var2.f129479d)).f137743a;
        String unused2 = mny0VarM168423l.f137743a;
    }

    @Override // p153l.wny0
    @Nullable
    public final synchronized String zze() {
        return this.f148247g;
    }

    public ony0() {
        throw null;
    }
}
