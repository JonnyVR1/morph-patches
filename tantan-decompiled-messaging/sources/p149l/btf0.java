package p149l;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class btf0 {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f77216b = btf0.class;

    /* JADX INFO: renamed from: a */
    public Map<cx3, jze> f77217a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static btf0 m103828b() {
        return new btf0();
    }

    /* JADX INFO: renamed from: a */
    public synchronized jze m103829a(cx3 cx3Var) {
        rf80.m179116g(cx3Var);
        jze jzeVarM143895m = this.f77217a.get(cx3Var);
        if (jzeVarM143895m != null) {
            synchronized (jzeVarM143895m) {
                if (!jze.m143894c0(jzeVarM143895m)) {
                    this.f77217a.remove(cx3Var);
                    tsf.m190557w(f77216b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(jzeVarM143895m)), cx3Var.getAnimationUriString(), Integer.valueOf(System.identityHashCode(cx3Var)));
                    return null;
                }
                jzeVarM143895m = jze.m143895m(jzeVarM143895m);
            }
        }
        return jzeVarM143895m;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m103830c() {
        tsf.m190549o(f77216b, "Count = %d", Integer.valueOf(this.f77217a.size()));
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m103831d(cx3 cx3Var, jze jzeVar) {
        rf80.m179116g(cx3Var);
        rf80.m179111b(Boolean.valueOf(jze.m143894c0(jzeVar)));
        jze.m143896n(this.f77217a.put(cx3Var, jze.m143895m(jzeVar)));
        m103830c();
    }

    /* JADX INFO: renamed from: e */
    public boolean m103832e(cx3 cx3Var) {
        jze jzeVarRemove;
        rf80.m179116g(cx3Var);
        synchronized (this) {
            jzeVarRemove = this.f77217a.remove(cx3Var);
        }
        if (jzeVarRemove == null) {
            return false;
        }
        try {
            return jzeVarRemove.m143908Z();
        } finally {
            jzeVarRemove.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m103833f(cx3 cx3Var, jze jzeVar) {
        rf80.m179116g(cx3Var);
        rf80.m179116g(jzeVar);
        rf80.m179111b(Boolean.valueOf(jze.m143894c0(jzeVar)));
        jze jzeVar2 = this.f77217a.get(cx3Var);
        if (jzeVar2 == null) {
            return false;
        }
        fa5<PooledByteBuffer> fa5VarM143923t = jzeVar2.m143923t();
        fa5<PooledByteBuffer> fa5VarM143923t2 = jzeVar.m143923t();
        if (fa5VarM143923t != null && fa5VarM143923t2 != null) {
            try {
                if (fa5VarM143923t.m120155B() == fa5VarM143923t2.m120155B()) {
                    this.f77217a.remove(cx3Var);
                    fa5.m120154v(fa5VarM143923t2);
                    fa5.m120154v(fa5VarM143923t);
                    jze.m143896n(jzeVar2);
                    m103830c();
                    return true;
                }
            } catch (Throwable th) {
                fa5.m120154v(fa5VarM143923t2);
                fa5.m120154v(fa5VarM143923t);
                jze.m143896n(jzeVar2);
                throw th;
            }
        }
        fa5.m120154v(fa5VarM143923t2);
        fa5.m120154v(fa5VarM143923t);
        jze.m143896n(jzeVar2);
        return false;
    }
}
