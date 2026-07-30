package p149l;

import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class b5s implements zs6<C22306c<?>> {
    @Override // p149l.zs6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> C22306c<?> mo95058a(b4g0<T> b4g0Var, boolean z) {
        p3g0 p3g0VarM221512b = z ? C22392a.m221512b() : C22393b.m221521b();
        Objects.requireNonNull(p3g0VarM221512b);
        b4g0Var.m100252b(new y4s(p3g0VarM221512b));
        return p3g0VarM221512b.doOnUnsubscribe(new z4s(b4g0Var));
    }
}
