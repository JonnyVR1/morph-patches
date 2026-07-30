package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class dhw {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m115822a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static StackTraceElement[] m115823b() {
        return psd0.m173590A(new Exception());
    }

    /* JADX INFO: renamed from: c */
    public static <N> t9t<N> m115824c() {
        return t9t.m189761b(m115823b());
    }

    /* JADX INFO: renamed from: d */
    public static <N> t9t<N> m115825d(@NonNull y20<N> y20Var) {
        return t9t.m189762c(m115823b(), y20Var);
    }

    /* JADX INFO: renamed from: e */
    public static <N> t9t<N> m115826e(@NonNull y20<N> y20Var, y20<Throwable> y20Var2) {
        return t9t.m189763d(m115823b(), y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: f */
    public static <N> t9t<N> m115827f(@NonNull y20<N> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        return t9t.m189764e(m115823b(), y20Var, y20Var2, x20Var);
    }

    /* JADX INFO: renamed from: g */
    public static <T> t9t<T> m115828g(bb50<T> bb50Var) {
        return t9t.m189765f(m115823b(), bb50Var);
    }

    /* JADX INFO: renamed from: h */
    public static <N> t9t<N> m115829h(@NonNull y20<N> y20Var) {
        return t9t.m189763d(m115823b(), y20Var, new y20() { // from class: l.chw
            @Override // p153l.y20
            public final void call(Object obj) {
                dhw.m115822a((Throwable) obj);
            }
        });
    }
}
