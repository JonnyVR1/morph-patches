package p149l;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class f0v0 {

    /* JADX INFO: renamed from: a */
    public final b0v0 f94015a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f94016b;

    public f0v0(b0v0 b0v0Var, rmw0 rmw0Var) {
        this.f94015a = b0v0Var;
        this.f94016b = rmw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m119057a(e2w0 e2w0Var) {
        final b0v0 b0v0Var = this.f94015a;
        Objects.requireNonNull(b0v0Var);
        jmw0.m142245r(this.f94016b.mo122102R(new Callable() { // from class: l.d0v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b0v0Var.getWritableDatabase();
            }
        }), new e0v0(this, e2w0Var), this.f94016b);
    }
}
