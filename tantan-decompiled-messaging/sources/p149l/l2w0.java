package p149l;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class l2w0 {
    /* JADX INFO: renamed from: a */
    public static final x2w0 m148321a(Callable callable, Object obj, y2w0 y2w0Var) {
        return m148322b(callable, y2w0Var.f195717a, obj, y2w0Var);
    }

    /* JADX INFO: renamed from: b */
    public static final x2w0 m148322b(Callable callable, rmw0 rmw0Var, Object obj, y2w0 y2w0Var) {
        return new x2w0(y2w0Var, obj, y2w0.f195716d, Collections.EMPTY_LIST, rmw0Var.mo122102R(callable));
    }

    /* JADX INFO: renamed from: c */
    public static final x2w0 m148323c(gnr gnrVar, Object obj, y2w0 y2w0Var) {
        return new x2w0(y2w0Var, obj, y2w0.f195716d, Collections.EMPTY_LIST, gnrVar);
    }

    /* JADX INFO: renamed from: d */
    public static final x2w0 m148324d(final f2w0 f2w0Var, rmw0 rmw0Var, Object obj, y2w0 y2w0Var) {
        return m148322b(new Callable() { // from class: l.k2w0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                f2w0Var.zza();
                return null;
            }
        }, rmw0Var, obj, y2w0Var);
    }
}
