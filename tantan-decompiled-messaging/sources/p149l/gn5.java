package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class gn5<T> implements ehd<T> {

    /* JADX INFO: renamed from: a */
    public Class<? extends T> f103574a;

    public gn5(@NonNull Class<? extends T> cls) {
        this.f103574a = cls;
    }

    @Override // p149l.ehd
    /* JADX INFO: renamed from: a */
    public T mo116451a() throws IllegalAccessException, InstantiationException {
        return this.f103574a.newInstance();
    }
}
