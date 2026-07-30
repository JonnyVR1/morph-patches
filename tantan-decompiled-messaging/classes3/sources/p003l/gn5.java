package p003l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gn5<T> implements ehd<T> {

    /* JADX INFO: renamed from: a */
    public Class<? extends T> f3955a;

    public gn5(@NonNull Class<? extends T> cls) {
        this.f3955a = cls;
    }

    @Override // p003l.ehd
    /* JADX INFO: renamed from: a */
    public T mo3835a() throws IllegalAccessException, InstantiationException {
        return this.f3955a.newInstance();
    }
}
