package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class pts0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f151212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qts0 f151213b;

    public pts0(qts0 qts0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f151212a = uncaughtExceptionHandler;
        this.f151213b = qts0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f151213b.m176484h(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f151212a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            x2t0.m206866d("AdMob exception reporter failed reporting the exception.");
        }
        if (this.f151212a != null) {
        }
    }
}
