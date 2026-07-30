package p153l;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class rbw0 {
    /* JADX INFO: renamed from: a */
    public static final dcw0 m180765a(Callable callable, Object obj, ecw0 ecw0Var) {
        return m180766b(callable, ecw0Var.f93112a, obj, ecw0Var);
    }

    /* JADX INFO: renamed from: b */
    public static final dcw0 m180766b(Callable callable, xvw0 xvw0Var, Object obj, ecw0 ecw0Var) {
        return new dcw0(ecw0Var, obj, ecw0.f93111d, Collections.EMPTY_LIST, xvw0Var.mo155969R(callable));
    }

    /* JADX INFO: renamed from: c */
    public static final dcw0 m180767c(hpr hprVar, Object obj, ecw0 ecw0Var) {
        return new dcw0(ecw0Var, obj, ecw0.f93111d, Collections.EMPTY_LIST, hprVar);
    }

    /* JADX INFO: renamed from: d */
    public static final dcw0 m180768d(final lbw0 lbw0Var, xvw0 xvw0Var, Object obj, ecw0 ecw0Var) {
        return m180766b(new Callable() { // from class: l.qbw0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                lbw0Var.zza();
                return null;
            }
        }, xvw0Var, obj, ecw0Var);
    }
}
