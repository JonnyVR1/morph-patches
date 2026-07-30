package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class hvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f109689a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f109690b;

    public hvq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f109689a = data;
        this.f109690b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87769Y(this.f109689a, this.f109690b);
    }
}
