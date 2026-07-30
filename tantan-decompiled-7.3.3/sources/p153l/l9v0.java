package p153l;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class l9v0 {

    /* JADX INFO: renamed from: a */
    public final h9v0 f130633a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f130634b;

    public l9v0(h9v0 h9v0Var, xvw0 xvw0Var) {
        this.f130633a = h9v0Var;
        this.f130634b = xvw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m153463a(kbw0 kbw0Var) {
        final h9v0 h9v0Var = this.f130633a;
        Objects.requireNonNull(h9v0Var);
        pvw0.m173991r(this.f130634b.mo155969R(new Callable() { // from class: l.j9v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h9v0Var.getWritableDatabase();
            }
        }), new k9v0(this, kbw0Var), this.f130634b);
    }
}
