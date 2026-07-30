package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class axy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gsy0 f72243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f72244b;

    public axy0(gsy0 gsy0Var, Callable callable) {
        this.f72243a = gsy0Var;
        this.f72244b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f72243a.m127860t(this.f72244b.call());
        } catch (Exception e) {
            this.f72243a.m127859s(e);
        } catch (Throwable th) {
            this.f72243a.m127859s(new RuntimeException(th));
        }
    }
}
