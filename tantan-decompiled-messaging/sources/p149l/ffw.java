package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class ffw {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m121190a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static StackTraceElement[] m121191b() {
        return mkd0.m154949A(new Exception());
    }

    /* JADX INFO: renamed from: c */
    public static <N> s7t<N> m121192c() {
        return s7t.m182523b(m121191b());
    }

    /* JADX INFO: renamed from: d */
    public static <N> s7t<N> m121193d(@NonNull e30<N> e30Var) {
        return s7t.m182524c(m121191b(), e30Var);
    }

    /* JADX INFO: renamed from: e */
    public static <N> s7t<N> m121194e(@NonNull e30<N> e30Var, e30<Throwable> e30Var2) {
        return s7t.m182525d(m121191b(), e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: f */
    public static <N> s7t<N> m121195f(@NonNull e30<N> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        return s7t.m182526e(m121191b(), e30Var, e30Var2, d30Var);
    }

    /* JADX INFO: renamed from: g */
    public static <T> s7t<T> m121196g(m250<T> m250Var) {
        return s7t.m182527f(m121191b(), m250Var);
    }

    /* JADX INFO: renamed from: h */
    public static <N> s7t<N> m121197h(@NonNull e30<N> e30Var) {
        return s7t.m182525d(m121191b(), e30Var, new e30() { // from class: l.efw
            @Override // p149l.e30
            public final void call(Object obj) {
                ffw.m121190a((Throwable) obj);
            }
        });
    }
}
