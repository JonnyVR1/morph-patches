package p149l;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class nvt0 extends PhantomReference implements m75.InterfaceC18411a {

    /* JADX INFO: renamed from: a */
    public final Set f140845a;

    /* JADX INFO: renamed from: b */
    public final Runnable f140846b;

    public /* synthetic */ nvt0(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, cxs0 cxs0Var) {
        super(obj, referenceQueue);
        this.f140845a = set;
        this.f140846b = runnable;
    }

    @Override // p149l.m75.InterfaceC18411a
    /* JADX INFO: renamed from: a */
    public final void mo153349a() {
        if (this.f140845a.remove(this)) {
            clear();
            this.f140846b.run();
        }
    }
}
