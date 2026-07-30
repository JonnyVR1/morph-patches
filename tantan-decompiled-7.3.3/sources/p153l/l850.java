package p153l;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class l850<T> {

    /* JADX INFO: renamed from: a */
    public SoftReference<T> f130414a = null;

    /* JADX INFO: renamed from: b */
    public SoftReference<T> f130415b = null;

    /* JADX INFO: renamed from: c */
    public SoftReference<T> f130416c = null;

    /* JADX INFO: renamed from: a */
    public void m153163a() {
        SoftReference<T> softReference = this.f130414a;
        if (softReference != null) {
            softReference.clear();
            this.f130414a = null;
        }
        SoftReference<T> softReference2 = this.f130415b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f130415b = null;
        }
        SoftReference<T> softReference3 = this.f130416c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f130416c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public T m153164b() {
        SoftReference<T> softReference = this.f130414a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: c */
    public void m153165c(T t) {
        this.f130414a = new SoftReference<>(t);
        this.f130415b = new SoftReference<>(t);
        this.f130416c = new SoftReference<>(t);
    }
}
