package androidx.work.impl.utils.futures;

/* JADX INFO: loaded from: classes.dex */
class AbstractFuture$Failure$1 extends Throwable {
    public AbstractFuture$Failure$1(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
