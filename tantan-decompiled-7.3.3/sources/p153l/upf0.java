package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class upf0<T> implements u3d0<T> {

    /* JADX INFO: renamed from: a */
    protected final T f180271a;

    public upf0(@NonNull T t) {
        this.f180271a = (T) vn80.m201944d(t);
    }

    @Override // p153l.u3d0
    @NonNull
    public final T get() {
        return this.f180271a;
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<T> getResourceClass() {
        return (Class<T>) this.f180271a.getClass();
    }

    @Override // p153l.u3d0
    public final int getSize() {
        return 1;
    }

    @Override // p153l.u3d0
    public void recycle() {
    }
}
