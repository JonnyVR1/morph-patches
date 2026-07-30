package p153l;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k1g0 {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f123491b = k1g0.class;

    /* JADX INFO: renamed from: a */
    public Map<by3, n0f> f123492a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static k1g0 m147857b() {
        return new k1g0();
    }

    /* JADX INFO: renamed from: a */
    public synchronized n0f m147858a(by3 by3Var) {
        wn80.m207182g(by3Var);
        n0f n0fVarM160958m = this.f123492a.get(by3Var);
        if (n0fVarM160958m != null) {
            synchronized (n0fVarM160958m) {
                if (!n0f.m160957d0(n0fVarM160958m)) {
                    this.f123492a.remove(by3Var);
                    huf.m137195w(f123491b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(n0fVarM160958m)), by3Var.getAnimationUriString(), Integer.valueOf(System.identityHashCode(by3Var)));
                    return null;
                }
                n0fVarM160958m = n0f.m160958m(n0fVarM160958m);
            }
        }
        return n0fVarM160958m;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m147859c() {
        huf.m137187o(f123491b, "Count = %d", Integer.valueOf(this.f123492a.size()));
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m147860d(by3 by3Var, n0f n0fVar) {
        wn80.m207182g(by3Var);
        wn80.m207177b(Boolean.valueOf(n0f.m160957d0(n0fVar)));
        n0f.m160959n(this.f123492a.put(by3Var, n0f.m160958m(n0fVar)));
        m147859c();
    }

    /* JADX INFO: renamed from: e */
    public boolean m147861e(by3 by3Var) {
        n0f n0fVarRemove;
        wn80.m207182g(by3Var);
        synchronized (this) {
            n0fVarRemove = this.f123492a.remove(by3Var);
        }
        if (n0fVarRemove == null) {
            return false;
        }
        try {
            return n0fVarRemove.m160971a0();
        } finally {
            n0fVarRemove.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m147862f(by3 by3Var, n0f n0fVar) {
        wn80.m207182g(by3Var);
        wn80.m207182g(n0fVar);
        wn80.m207177b(Boolean.valueOf(n0f.m160957d0(n0fVar)));
        n0f n0fVar2 = this.f123492a.get(by3Var);
        if (n0fVar2 == null) {
            return false;
        }
        fb5<PooledByteBuffer> fb5VarM160986t = n0fVar2.m160986t();
        fb5<PooledByteBuffer> fb5VarM160986t2 = n0fVar.m160986t();
        if (fb5VarM160986t != null && fb5VarM160986t2 != null) {
            try {
                if (fb5VarM160986t.m124875B() == fb5VarM160986t2.m124875B()) {
                    this.f123492a.remove(by3Var);
                    fb5.m124874v(fb5VarM160986t2);
                    fb5.m124874v(fb5VarM160986t);
                    n0f.m160959n(n0fVar2);
                    m147859c();
                    return true;
                }
            } catch (Throwable th) {
                fb5.m124874v(fb5VarM160986t2);
                fb5.m124874v(fb5VarM160986t);
                n0f.m160959n(n0fVar2);
                throw th;
            }
        }
        fb5.m124874v(fb5VarM160986t2);
        fb5.m124874v(fb5VarM160986t);
        n0f.m160959n(n0fVar2);
        return false;
    }
}
