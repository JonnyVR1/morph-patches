package p149l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qif0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f154764a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile T f154765b;

    /* JADX INFO: renamed from: a */
    public abstract T mo79337a();

    /* JADX INFO: renamed from: b */
    public T m174875b() {
        if (this.f154765b == null) {
            synchronized (this.f154764a) {
                try {
                    if (this.f154765b == null) {
                        this.f154765b = mo79337a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f154765b;
    }
}
