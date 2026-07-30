package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class xqf0<T> {

    /* JADX INFO: renamed from: a */
    public final T f195800a;

    /* JADX INFO: renamed from: b */
    public final Thread f195801b = Thread.currentThread();

    public xqf0(T t) {
        this.f195800a = t;
    }

    /* JADX INFO: renamed from: a */
    public T m212733a() {
        if (m212734b()) {
            return this.f195800a;
        }
        wtq0.m207906a("No value in this thread (hasValue should be checked before)");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m212734b() {
        return this.f195801b == Thread.currentThread();
    }
}
