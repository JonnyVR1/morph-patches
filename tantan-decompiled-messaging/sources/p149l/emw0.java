package p149l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class emw0 extends cmw0 implements gnr {
    @Override // p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        mo112529f().addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: f */
    public abstract gnr mo112529f();
}
