package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class arw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mix0 f72996a;

    public arw0(mix0 mix0Var) {
        this.f72996a = mix0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f72996a.f137037b) {
            try {
                mix0 mix0Var = this.f72996a;
                if (mix0Var.f137038c != null) {
                    mix0Var.f137038c.onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
