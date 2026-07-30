package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class kxq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f129222a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f129223b;

    public kxq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f129222a = data;
        this.f129223b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88664c0(this.f129222a, this.f129223b);
    }
}
