package p153l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kvw0 extends ivw0 implements hpr {
    @Override // p153l.hpr
    public final void addListener(Runnable runnable, Executor executor) {
        mo147106f().addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: f */
    public abstract hpr mo147106f();
}
