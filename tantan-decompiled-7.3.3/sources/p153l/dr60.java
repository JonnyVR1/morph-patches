package p153l;

/* JADX INFO: loaded from: classes11.dex */
final class dr60<T> {

    /* JADX INFO: renamed from: a */
    private cr60<T> f90361a;

    /* JADX INFO: renamed from: b */
    private cr60<T> f90362b;

    /* JADX INFO: renamed from: a */
    public synchronized void m117684a(cr60<T> cr60Var) {
        try {
            if (cr60Var == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            cr60<T> cr60Var2 = this.f90362b;
            if (cr60Var2 != null) {
                cr60Var2.f83304c = cr60Var;
                this.f90362b = cr60Var;
            } else {
                if (this.f90361a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f90362b = cr60Var;
                this.f90361a = cr60Var;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized cr60<T> m117685b() {
        cr60<T> cr60Var;
        cr60Var = this.f90361a;
        if (cr60Var != null) {
            cr60<T> cr60Var2 = cr60Var.f83304c;
            this.f90361a = cr60Var2;
            if (cr60Var2 == null) {
                this.f90362b = null;
            }
        }
        return cr60Var;
    }

    /* JADX INFO: renamed from: c */
    public synchronized cr60<T> m117686c(int i) throws InterruptedException {
        try {
            if (this.f90361a == null) {
                wait(i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m117685b();
    }
}
