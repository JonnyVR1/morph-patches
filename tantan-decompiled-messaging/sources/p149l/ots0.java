package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ots0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f145622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qts0 f145623b;

    public ots0(qts0 qts0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f145622a = uncaughtExceptionHandler;
        this.f145623b = qts0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f145623b.m176484h(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f145622a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            x2t0.m206866d("AdMob exception reporter failed reporting the exception.");
        }
        if (this.f145622a != null) {
        }
    }
}
