package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import java.util.Set;
import p149l.bg3;
import p149l.jhy;
import p149l.pa80;
import p149l.rf80;
import p149l.spi0;
import p149l.tsf;
import p149l.ume0;
import p149l.va80;
import p149l.wa80;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePool<V> implements pa80<V> {

    /* JADX INFO: renamed from: a */
    public final Class<?> f6443a;

    /* JADX INFO: renamed from: b */
    public final jhy f6444b;

    /* JADX INFO: renamed from: c */
    public final va80 f6445c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final SparseArray<bg3<V>> f6446d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Set<V> f6447e;

    /* JADX INFO: renamed from: f */
    public boolean f6448f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final C1617a f6449g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public final C1617a f6450h;

    /* JADX INFO: renamed from: i */
    public final wa80 f6451i;

    /* JADX INFO: renamed from: j */
    public boolean f6452j;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            super("Invalid value: " + obj.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.BasePool$a */
    @VisibleForTesting
    public static class C1617a {

        /* JADX INFO: renamed from: a */
        public int f6453a;

        /* JADX INFO: renamed from: b */
        public int f6454b;

        /* JADX INFO: renamed from: a */
        public void m8428a(int i) {
            int i2;
            int i3 = this.f6454b;
            if (i3 < i || (i2 = this.f6453a) <= 0) {
                tsf.m190534B("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f6454b), Integer.valueOf(this.f6453a));
            } else {
                this.f6453a = i2 - 1;
                this.f6454b = i3 - i;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m8429b(int i) {
            this.f6453a++;
            this.f6454b += i;
        }
    }

    public BasePool(jhy jhyVar, va80 va80Var, wa80 wa80Var) {
        this.f6443a = getClass();
        this.f6444b = (jhy) rf80.m179116g(jhyVar);
        va80 va80Var2 = (va80) rf80.m179116g(va80Var);
        this.f6445c = va80Var2;
        this.f6451i = (wa80) rf80.m179116g(wa80Var);
        this.f6446d = new SparseArray<>();
        if (va80Var2.f180721f) {
            m8419r();
        } else {
            m8423v(new SparseIntArray(0));
        }
        this.f6447e = ume0.m194342b();
        this.f6450h = new C1617a();
        this.f6449g = new C1617a();
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo8408g(int i);

    @Override // p149l.pa80
    public V get(int i) throws Throwable {
        V vMo8408g;
        V vMo8418q;
        m8410i();
        int iMo8415n = mo8415n(i);
        synchronized (this) {
            try {
                bg3<V> bg3VarM8413l = m8413l(iMo8415n);
                if (bg3VarM8413l != null && (vMo8418q = mo8418q(bg3VarM8413l)) != null) {
                    rf80.m179118i(this.f6447e.add(vMo8418q));
                    int iMo8416o = mo8416o(vMo8418q);
                    int iMo8417p = mo8417p(iMo8416o);
                    this.f6449g.m8429b(iMo8417p);
                    this.f6450h.m8428a(iMo8417p);
                    this.f6451i.mo189425b(iMo8417p);
                    m8424w();
                    if (tsf.m190547m(2)) {
                        tsf.m190550p(this.f6443a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo8418q)), Integer.valueOf(iMo8416o));
                    }
                    return vMo8418q;
                }
                int iMo8417p2 = mo8417p(iMo8415n);
                if (!m8409h(iMo8417p2)) {
                    throw new PoolSizeViolationException(this.f6445c.f180716a, this.f6449g.f6454b, this.f6450h.f6454b, iMo8417p2);
                }
                this.f6449g.m8429b(iMo8417p2);
                if (bg3VarM8413l != null) {
                    bg3VarM8413l.m101626e();
                }
                try {
                    vMo8408g = mo8408g(iMo8415n);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f6449g.m8428a(iMo8417p2);
                            bg3<V> bg3VarM8413l2 = m8413l(iMo8415n);
                            if (bg3VarM8413l2 != null) {
                                bg3VarM8413l2.m101623b();
                            }
                            spi0.m185371c(th);
                            vMo8408g = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        rf80.m179118i(this.f6447e.add(vMo8408g));
                        m8427z();
                        this.f6451i.mo189424a(iMo8417p2);
                        m8424w();
                        if (tsf.m190547m(2)) {
                            tsf.m190550p(this.f6443a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo8408g)), Integer.valueOf(iMo8415n));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return vMo8408g;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public synchronized boolean m8409h(int i) {
        if (this.f6452j) {
            return true;
        }
        va80 va80Var = this.f6445c;
        int i2 = va80Var.f180716a;
        int i3 = this.f6449g.f6454b;
        if (i > i2 - i3) {
            this.f6451i.mo189426c();
            return false;
        }
        int i4 = va80Var.f180717b;
        if (i > i4 - (i3 + this.f6450h.f6454b)) {
            m8426y(i4 - i);
        }
        if (i <= i2 - (this.f6449g.f6454b + this.f6450h.f6454b)) {
            return true;
        }
        this.f6451i.mo189426c();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m8410i() {
        try {
            rf80.m179118i(!m8421t() || this.f6450h.f6454b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8411j(SparseIntArray sparseIntArray) {
        this.f6446d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int iKeyAt = sparseIntArray.keyAt(i);
            this.f6446d.put(iKeyAt, new bg3<>(mo8417p(iKeyAt), sparseIntArray.valueAt(i), 0, this.f6445c.f180721f));
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public abstract void mo8412k(V v2);

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized bg3<V> m8413l(int i) {
        try {
            bg3<V> bg3Var = this.f6446d.get(i);
            if (bg3Var == null && this.f6448f) {
                if (tsf.m190547m(2)) {
                    tsf.m190549o(this.f6443a, "creating new bucket %s", Integer.valueOf(i));
                }
                bg3<V> bg3VarMo8425x = mo8425x(i);
                this.f6446d.put(i, bg3VarMo8425x);
                return bg3VarMo8425x;
            }
            return bg3Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized bg3<V> m8414m(int i) {
        return this.f6446d.get(i);
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo8415n(int i);

    /* JADX INFO: renamed from: o */
    public abstract int mo8416o(V v2);

    /* JADX INFO: renamed from: p */
    public abstract int mo8417p(int i);

    /* JADX INFO: renamed from: q */
    public synchronized V mo8418q(bg3<V> bg3Var) {
        return bg3Var.m101624c();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m8419r() {
        try {
            SparseIntArray sparseIntArray = this.f6445c.f180718c;
            if (sparseIntArray != null) {
                m8411j(sparseIntArray);
                this.f6448f = false;
            } else {
                this.f6448f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.pa80, p149l.twc0
    public void release(V v2) {
        rf80.m179116g(v2);
        int iMo8416o = mo8416o(v2);
        int iMo8417p = mo8417p(iMo8416o);
        synchronized (this) {
            try {
                bg3<V> bg3VarM8414m = m8414m(iMo8416o);
                if (!this.f6447e.remove(v2)) {
                    tsf.m190540f(this.f6443a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8416o));
                    mo8412k(v2);
                    this.f6451i.mo189428e(iMo8417p);
                } else if (bg3VarM8414m == null || bg3VarM8414m.m101627f() || m8421t() || !mo8422u(v2)) {
                    if (bg3VarM8414m != null) {
                        bg3VarM8414m.m101623b();
                    }
                    if (tsf.m190547m(2)) {
                        tsf.m190550p(this.f6443a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8416o));
                    }
                    mo8412k(v2);
                    this.f6449g.m8428a(iMo8417p);
                    this.f6451i.mo189428e(iMo8417p);
                } else {
                    bg3VarM8414m.m101629h(v2);
                    this.f6450h.m8429b(iMo8417p);
                    this.f6449g.m8428a(iMo8417p);
                    this.f6451i.mo189429f(iMo8417p);
                    if (tsf.m190547m(2)) {
                        tsf.m190550p(this.f6443a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8416o));
                    }
                }
                m8424w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8420s() {
        this.f6444b.mo141613a(this);
        this.f6451i.mo189430g(this);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: t */
    public synchronized boolean m8421t() {
        boolean z;
        z = this.f6449g.f6454b + this.f6450h.f6454b > this.f6445c.f180717b;
        if (z) {
            this.f6451i.mo189427d();
        }
        return z;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo8422u(V v2) {
        rf80.m179116g(v2);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m8423v(SparseIntArray sparseIntArray) {
        try {
            rf80.m179116g(sparseIntArray);
            this.f6446d.clear();
            SparseIntArray sparseIntArray2 = this.f6445c.f180718c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int iKeyAt = sparseIntArray2.keyAt(i);
                    this.f6446d.put(iKeyAt, new bg3<>(mo8417p(iKeyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(iKeyAt, 0), this.f6445c.f180721f));
                }
                this.f6448f = false;
            } else {
                this.f6448f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* JADX INFO: renamed from: w */
    public final void m8424w() {
        if (tsf.m190547m(2)) {
            tsf.m190552r(this.f6443a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f6449g.f6453a), Integer.valueOf(this.f6449g.f6454b), Integer.valueOf(this.f6450h.f6453a), Integer.valueOf(this.f6450h.f6454b));
        }
    }

    /* JADX INFO: renamed from: x */
    public bg3<V> mo8425x(int i) {
        return new bg3<>(mo8417p(i), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, this.f6445c.f180721f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public synchronized void m8426y(int i) {
        try {
            int i2 = this.f6449g.f6454b;
            int i3 = this.f6450h.f6454b;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (tsf.m190547m(2)) {
                tsf.m190551q(this.f6443a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f6449g.f6454b + this.f6450h.f6454b), Integer.valueOf(iMin));
            }
            m8424w();
            for (int i4 = 0; i4 < this.f6446d.size() && iMin > 0; i4++) {
                bg3 bg3Var = (bg3) rf80.m179116g(this.f6446d.valueAt(i4));
                while (iMin > 0) {
                    Object objMo101628g = bg3Var.mo101628g();
                    if (objMo101628g == null) {
                        break;
                    }
                    mo8412k(objMo101628g);
                    int i5 = bg3Var.f75396a;
                    iMin -= i5;
                    this.f6450h.m8428a(i5);
                }
            }
            m8424w();
            if (tsf.m190547m(2)) {
                tsf.m190550p(this.f6443a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f6449g.f6454b + this.f6450h.f6454b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: z */
    public synchronized void m8427z() {
        if (m8421t()) {
            m8426y(this.f6445c.f180717b);
        }
    }

    public BasePool(jhy jhyVar, va80 va80Var, wa80 wa80Var, boolean z) {
        this(jhyVar, va80Var, wa80Var);
        this.f6452j = z;
    }
}
