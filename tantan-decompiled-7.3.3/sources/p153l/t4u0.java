package p153l;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class t4u0 extends PhantomReference implements n85.InterfaceC18818a {

    /* JADX INFO: renamed from: a */
    public final Set f172142a;

    /* JADX INFO: renamed from: b */
    public final Runnable f172143b;

    public /* synthetic */ t4u0(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, i6t0 i6t0Var) {
        super(obj, referenceQueue);
        this.f172142a = set;
        this.f172143b = runnable;
    }

    @Override // p153l.n85.InterfaceC18818a
    /* JADX INFO: renamed from: a */
    public final void mo161894a() {
        if (this.f172142a.remove(this)) {
            clear();
            this.f172143b.run();
        }
    }
}
