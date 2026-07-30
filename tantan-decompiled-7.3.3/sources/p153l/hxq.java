package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class hxq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f112029a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f112030b;

    public hxq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f112029a = data;
        this.f112030b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88659X(this.f112029a, this.f112030b);
    }
}
