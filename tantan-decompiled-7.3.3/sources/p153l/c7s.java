package p153l;

import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class c7s implements cu6<C22421c<?>> {
    @Override // p153l.cu6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> C22421c<?> mo102872a(jcg0<T> jcg0Var, boolean z) {
        wbg0 wbg0VarM222758b = z ? C22507a.m222758b() : C22508b.m222767b();
        Objects.requireNonNull(wbg0VarM222758b);
        jcg0Var.m144357b(new z6s(wbg0VarM222758b));
        return wbg0VarM222758b.doOnUnsubscribe(new a7s(jcg0Var));
    }
}
