package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class oif0<T> {

    /* JADX INFO: renamed from: a */
    public final T f144111a;

    /* JADX INFO: renamed from: b */
    public final Thread f144112b = Thread.currentThread();

    public oif0(T t) {
        this.f144111a = t;
    }

    /* JADX INFO: renamed from: a */
    public T m164508a() {
        if (m164509b()) {
            return this.f144111a;
        }
        qkq0.m175383a("No value in this thread (hasValue should be checked before)");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m164509b() {
        return this.f144112b == Thread.currentThread();
    }
}
