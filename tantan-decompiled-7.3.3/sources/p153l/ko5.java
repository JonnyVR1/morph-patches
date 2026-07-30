package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class ko5<T> implements kid<T> {

    /* JADX INFO: renamed from: a */
    public Class<? extends T> f127688a;

    public ko5(@NonNull Class<? extends T> cls) {
        this.f127688a = cls;
    }

    @Override // p153l.kid
    /* JADX INFO: renamed from: a */
    public T mo149869a() throws IllegalAccessException, InstantiationException {
        return this.f127688a.newInstance();
    }
}
