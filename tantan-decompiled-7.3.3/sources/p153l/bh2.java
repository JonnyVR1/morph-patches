package p153l;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bh2<T> {

    /* JADX INFO: renamed from: a */
    WeakReference<T> f76707a;

    public bh2(T t) {
        this.f76707a = new WeakReference<>(t);
    }

    /* JADX INFO: renamed from: a */
    public T m104290a() {
        WeakReference<T> weakReference = this.f76707a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
