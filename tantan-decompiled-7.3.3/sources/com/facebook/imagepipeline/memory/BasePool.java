package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import java.util.Set;
import p153l.bj80;
import p153l.bve0;
import p153l.cj80;
import p153l.gqy;
import p153l.huf;
import p153l.pg3;
import p153l.vi80;
import p153l.vyi0;
import p153l.wn80;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePool<V> implements vi80<V> {

    /* JADX INFO: renamed from: a */
    public final Class<?> f6480a;

    /* JADX INFO: renamed from: b */
    public final gqy f6481b;

    /* JADX INFO: renamed from: c */
    public final bj80 f6482c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final SparseArray<pg3<V>> f6483d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Set<V> f6484e;

    /* JADX INFO: renamed from: f */
    public boolean f6485f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final C1640a f6486g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public final C1640a f6487h;

    /* JADX INFO: renamed from: i */
    public final cj80 f6488i;

    /* JADX INFO: renamed from: j */
    public boolean f6489j;

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
    public static class C1640a {

        /* JADX INFO: renamed from: a */
        public int f6490a;

        /* JADX INFO: renamed from: b */
        public int f6491b;

        /* JADX INFO: renamed from: a */
        public void m8482a(int i) {
            int i2;
            int i3 = this.f6491b;
            if (i3 < i || (i2 = this.f6490a) <= 0) {
                huf.m137172B("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f6491b), Integer.valueOf(this.f6490a));
            } else {
                this.f6490a = i2 - 1;
                this.f6491b = i3 - i;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m8483b(int i) {
            this.f6490a++;
            this.f6491b += i;
        }
    }

    public BasePool(gqy gqyVar, bj80 bj80Var, cj80 cj80Var) {
        this.f6480a = getClass();
        this.f6481b = (gqy) wn80.m207182g(gqyVar);
        bj80 bj80Var2 = (bj80) wn80.m207182g(bj80Var);
        this.f6482c = bj80Var2;
        this.f6488i = (cj80) wn80.m207182g(cj80Var);
        this.f6483d = new SparseArray<>();
        if (bj80Var2.f76969f) {
            m8473r();
        } else {
            m8477v(new SparseIntArray(0));
        }
        this.f6484e = bve0.m106564b();
        this.f6487h = new C1640a();
        this.f6486g = new C1640a();
    }

    /* JADX INFO: renamed from: g */
    public abstract V mo8462g(int i);

    @Override // p153l.vi80
    public V get(int i) throws Throwable {
        V vMo8462g;
        V vMo8472q;
        m8464i();
        int iMo8469n = mo8469n(i);
        synchronized (this) {
            try {
                pg3<V> pg3VarM8467l = m8467l(iMo8469n);
                if (pg3VarM8467l != null && (vMo8472q = mo8472q(pg3VarM8467l)) != null) {
                    wn80.m207184i(this.f6484e.add(vMo8472q));
                    int iMo8470o = mo8470o(vMo8472q);
                    int iMo8471p = mo8471p(iMo8470o);
                    this.f6486g.m8483b(iMo8471p);
                    this.f6487h.m8482a(iMo8471p);
                    this.f6488i.mo110081b(iMo8471p);
                    m8478w();
                    if (huf.m137185m(2)) {
                        huf.m137188p(this.f6480a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo8472q)), Integer.valueOf(iMo8470o));
                    }
                    return vMo8472q;
                }
                int iMo8471p2 = mo8471p(iMo8469n);
                if (!m8463h(iMo8471p2)) {
                    throw new PoolSizeViolationException(this.f6482c.f76964a, this.f6486g.f6491b, this.f6487h.f6491b, iMo8471p2);
                }
                this.f6486g.m8483b(iMo8471p2);
                if (pg3VarM8467l != null) {
                    pg3VarM8467l.m172216e();
                }
                try {
                    vMo8462g = mo8462g(iMo8469n);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f6486g.m8482a(iMo8471p2);
                            pg3<V> pg3VarM8467l2 = m8467l(iMo8469n);
                            if (pg3VarM8467l2 != null) {
                                pg3VarM8467l2.m172213b();
                            }
                            vyi0.m203999c(th);
                            vMo8462g = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        wn80.m207184i(this.f6484e.add(vMo8462g));
                        m8481z();
                        this.f6488i.mo110080a(iMo8471p2);
                        m8478w();
                        if (huf.m137185m(2)) {
                            huf.m137188p(this.f6480a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vMo8462g)), Integer.valueOf(iMo8469n));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return vMo8462g;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public synchronized boolean m8463h(int i) {
        if (this.f6489j) {
            return true;
        }
        bj80 bj80Var = this.f6482c;
        int i2 = bj80Var.f76964a;
        int i3 = this.f6486g.f6491b;
        if (i > i2 - i3) {
            this.f6488i.mo110082c();
            return false;
        }
        int i4 = bj80Var.f76965b;
        if (i > i4 - (i3 + this.f6487h.f6491b)) {
            m8480y(i4 - i);
        }
        if (i <= i2 - (this.f6486g.f6491b + this.f6487h.f6491b)) {
            return true;
        }
        this.f6488i.mo110082c();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m8464i() {
        try {
            wn80.m207184i(!m8475t() || this.f6487h.f6491b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8465j(SparseIntArray sparseIntArray) {
        this.f6483d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int iKeyAt = sparseIntArray.keyAt(i);
            this.f6483d.put(iKeyAt, new pg3<>(mo8471p(iKeyAt), sparseIntArray.valueAt(i), 0, this.f6482c.f76969f));
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public abstract void mo8466k(V v2);

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public synchronized pg3<V> m8467l(int i) {
        try {
            pg3<V> pg3Var = this.f6483d.get(i);
            if (pg3Var == null && this.f6485f) {
                if (huf.m137185m(2)) {
                    huf.m137187o(this.f6480a, "creating new bucket %s", Integer.valueOf(i));
                }
                pg3<V> pg3VarMo8479x = mo8479x(i);
                this.f6483d.put(i, pg3VarMo8479x);
                return pg3VarMo8479x;
            }
            return pg3Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized pg3<V> m8468m(int i) {
        return this.f6483d.get(i);
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo8469n(int i);

    /* JADX INFO: renamed from: o */
    public abstract int mo8470o(V v2);

    /* JADX INFO: renamed from: p */
    public abstract int mo8471p(int i);

    /* JADX INFO: renamed from: q */
    public synchronized V mo8472q(pg3<V> pg3Var) {
        return pg3Var.m172214c();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m8473r() {
        try {
            SparseIntArray sparseIntArray = this.f6482c.f76966c;
            if (sparseIntArray != null) {
                m8465j(sparseIntArray);
                this.f6485f = false;
            } else {
                this.f6485f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.vi80, p153l.w4d0
    public void release(V v2) {
        wn80.m207182g(v2);
        int iMo8470o = mo8470o(v2);
        int iMo8471p = mo8471p(iMo8470o);
        synchronized (this) {
            try {
                pg3<V> pg3VarM8468m = m8468m(iMo8470o);
                if (!this.f6484e.remove(v2)) {
                    huf.m137178f(this.f6480a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8470o));
                    mo8466k(v2);
                    this.f6488i.mo110084e(iMo8471p);
                } else if (pg3VarM8468m == null || pg3VarM8468m.m172217f() || m8475t() || !mo8476u(v2)) {
                    if (pg3VarM8468m != null) {
                        pg3VarM8468m.m172213b();
                    }
                    if (huf.m137185m(2)) {
                        huf.m137188p(this.f6480a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8470o));
                    }
                    mo8466k(v2);
                    this.f6486g.m8482a(iMo8471p);
                    this.f6488i.mo110084e(iMo8471p);
                } else {
                    pg3VarM8468m.m172218h(v2);
                    this.f6487h.m8483b(iMo8471p);
                    this.f6486g.m8482a(iMo8471p);
                    this.f6488i.mo110085f(iMo8471p);
                    if (huf.m137185m(2)) {
                        huf.m137188p(this.f6480a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v2)), Integer.valueOf(iMo8470o));
                    }
                }
                m8478w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8474s() {
        this.f6481b.mo131504a(this);
        this.f6488i.mo110086g(this);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: t */
    public synchronized boolean m8475t() {
        boolean z;
        z = this.f6486g.f6491b + this.f6487h.f6491b > this.f6482c.f76965b;
        if (z) {
            this.f6488i.mo110083d();
        }
        return z;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo8476u(V v2) {
        wn80.m207182g(v2);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m8477v(SparseIntArray sparseIntArray) {
        try {
            wn80.m207182g(sparseIntArray);
            this.f6483d.clear();
            SparseIntArray sparseIntArray2 = this.f6482c.f76966c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int iKeyAt = sparseIntArray2.keyAt(i);
                    this.f6483d.put(iKeyAt, new pg3<>(mo8471p(iKeyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(iKeyAt, 0), this.f6482c.f76969f));
                }
                this.f6485f = false;
            } else {
                this.f6485f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* JADX INFO: renamed from: w */
    public final void m8478w() {
        if (huf.m137185m(2)) {
            huf.m137190r(this.f6480a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f6486g.f6490a), Integer.valueOf(this.f6486g.f6491b), Integer.valueOf(this.f6487h.f6490a), Integer.valueOf(this.f6487h.f6491b));
        }
    }

    /* JADX INFO: renamed from: x */
    public pg3<V> mo8479x(int i) {
        return new pg3<>(mo8471p(i), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, this.f6482c.f76969f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    /* JADX INFO: renamed from: y */
    public synchronized void m8480y(int i) {
        try {
            int i2 = this.f6486g.f6491b;
            int i3 = this.f6487h.f6491b;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (huf.m137185m(2)) {
                huf.m137189q(this.f6480a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f6486g.f6491b + this.f6487h.f6491b), Integer.valueOf(iMin));
            }
            m8478w();
            for (int i4 = 0; i4 < this.f6483d.size() && iMin > 0; i4++) {
                pg3 pg3Var = (pg3) wn80.m207182g(this.f6483d.valueAt(i4));
                while (iMin > 0) {
                    Object objMo157352g = pg3Var.mo157352g();
                    if (objMo157352g == null) {
                        break;
                    }
                    mo8466k(objMo157352g);
                    int i5 = pg3Var.f152227a;
                    iMin -= i5;
                    this.f6487h.m8482a(i5);
                }
            }
            m8478w();
            if (huf.m137185m(2)) {
                huf.m137188p(this.f6480a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f6486g.f6491b + this.f6487h.f6491b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: z */
    public synchronized void m8481z() {
        if (m8475t()) {
            m8480y(this.f6482c.f76965b);
        }
    }

    public BasePool(gqy gqyVar, bj80 bj80Var, cj80 cj80Var, boolean z) {
        this(gqyVar, bj80Var, cj80Var);
        this.f6489j = z;
    }
}
