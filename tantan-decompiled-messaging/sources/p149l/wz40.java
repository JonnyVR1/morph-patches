package p149l;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class wz40<T> {

    /* JADX INFO: renamed from: a */
    public SoftReference<T> f188702a = null;

    /* JADX INFO: renamed from: b */
    public SoftReference<T> f188703b = null;

    /* JADX INFO: renamed from: c */
    public SoftReference<T> f188704c = null;

    /* JADX INFO: renamed from: a */
    public void m206245a() {
        SoftReference<T> softReference = this.f188702a;
        if (softReference != null) {
            softReference.clear();
            this.f188702a = null;
        }
        SoftReference<T> softReference2 = this.f188703b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f188703b = null;
        }
        SoftReference<T> softReference3 = this.f188704c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f188704c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public T m206246b() {
        SoftReference<T> softReference = this.f188702a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: c */
    public void m206247c(T t) {
        this.f188702a = new SoftReference<>(t);
        this.f188703b = new SoftReference<>(t);
        this.f188704c = new SoftReference<>(t);
    }
}
