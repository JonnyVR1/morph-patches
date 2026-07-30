package p009l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class qif0<T> {

    /* JADX INFO: renamed from: a */
    public final Object f19292a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile T f19293b;

    /* JADX INFO: renamed from: a */
    public abstract T mo9658a();

    /* JADX INFO: renamed from: b */
    public T m21015b() {
        if (this.f19293b == null) {
            synchronized (this.f19292a) {
                try {
                    if (this.f19293b == null) {
                        this.f19293b = mo9658a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f19293b;
    }
}
