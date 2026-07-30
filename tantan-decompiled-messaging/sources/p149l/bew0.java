package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class bew0 extends xdw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mew0 f75254b;

    public bew0(mew0 mew0Var) {
        this.f75254b = mew0Var;
    }

    @Override // p149l.xdw0
    /* JADX INFO: renamed from: a */
    public final void mo96146a() {
        synchronized (this.f75254b.f133509f) {
            try {
                if (this.f75254b.f133514k.get() > 0 && this.f75254b.f133514k.decrementAndGet() > 0) {
                    this.f75254b.f133505b.m202813c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                mew0 mew0Var = this.f75254b;
                if (mew0Var.f133516m != null) {
                    mew0Var.f133505b.m202813c("Unbind from service.", new Object[0]);
                    mew0 mew0Var2 = this.f75254b;
                    mew0Var2.f133504a.unbindService(mew0Var2.f133515l);
                    this.f75254b.f133510g = false;
                    this.f75254b.f133516m = null;
                    this.f75254b.f133515l = null;
                }
                this.f75254b.m154338w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
