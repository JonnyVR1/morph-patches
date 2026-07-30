package p002l;

import java.util.Objects;
import l.b4g0;
import l.y4s;
import l.z4s;
import l.zs6;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a5s implements zs6<c<?>> {
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> c<?> m9403a(b4g0<T> b4g0Var, boolean z) {
        a aVarB = z ? a.b() : b.b();
        Objects.requireNonNull(aVarB);
        b4g0Var.b(new y4s(aVarB));
        return aVarB.doOnUnsubscribe(new z4s(b4g0Var));
    }
}
