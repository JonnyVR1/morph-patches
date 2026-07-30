package p153l;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zqf0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f205611a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile T f205612b;

    /* JADX INFO: renamed from: a */
    public abstract T mo80520a();

    /* JADX INFO: renamed from: b */
    public T m221013b() {
        if (this.f205612b == null) {
            synchronized (this.f205611a) {
                try {
                    if (this.f205612b == null) {
                        this.f205612b = mo80520a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f205612b;
    }
}
