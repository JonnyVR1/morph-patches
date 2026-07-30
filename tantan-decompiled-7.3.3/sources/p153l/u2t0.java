package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class u2t0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f177242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w2t0 f177243b;

    public u2t0(w2t0 w2t0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f177242a = uncaughtExceptionHandler;
        this.f177243b = w2t0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f177243b.m204599h(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f177242a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            dct0.m115295d("AdMob exception reporter failed reporting the exception.");
        }
        if (this.f177242a != null) {
        }
    }
}
