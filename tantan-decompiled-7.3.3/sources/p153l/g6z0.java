package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class g6z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m1z0 f102493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f102494b;

    public g6z0(m1z0 m1z0Var, Callable callable) {
        this.f102493a = m1z0Var;
        this.f102494b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f102493a.m156730t(this.f102494b.call());
        } catch (Exception e) {
            this.f102493a.m156729s(e);
        } catch (Throwable th) {
            this.f102493a.m156729s(new RuntimeException(th));
        }
    }
}
