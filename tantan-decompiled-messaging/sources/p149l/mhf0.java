package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class mhf0<T> implements rvc0<T> {

    /* JADX INFO: renamed from: a */
    protected final T f133815a;

    public mhf0(@NonNull T t) {
        this.f133815a = (T) qf80.m174276d(t);
    }

    @Override // p149l.rvc0
    @NonNull
    public final T get() {
        return this.f133815a;
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<T> getResourceClass() {
        return (Class<T>) this.f133815a.getClass();
    }

    @Override // p149l.rvc0
    public final int getSize() {
        return 1;
    }

    @Override // p149l.rvc0
    public void recycle() {
    }
}
