package p149l;

/* JADX INFO: loaded from: classes13.dex */
final class yi60<T> {

    /* JADX INFO: renamed from: a */
    private xi60<T> f198446a;

    /* JADX INFO: renamed from: b */
    private xi60<T> f198447b;

    /* JADX INFO: renamed from: a */
    public synchronized void m214882a(xi60<T> xi60Var) {
        try {
            if (xi60Var == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            xi60<T> xi60Var2 = this.f198447b;
            if (xi60Var2 != null) {
                xi60Var2.f192964c = xi60Var;
                this.f198447b = xi60Var;
            } else {
                if (this.f198446a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f198447b = xi60Var;
                this.f198446a = xi60Var;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized xi60<T> m214883b() {
        xi60<T> xi60Var;
        xi60Var = this.f198446a;
        if (xi60Var != null) {
            xi60<T> xi60Var2 = xi60Var.f192964c;
            this.f198446a = xi60Var2;
            if (xi60Var2 == null) {
                this.f198447b = null;
            }
        }
        return xi60Var;
    }

    /* JADX INFO: renamed from: c */
    public synchronized xi60<T> m214884c(int i) throws InterruptedException {
        try {
            if (this.f198446a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m214883b();
    }
}
