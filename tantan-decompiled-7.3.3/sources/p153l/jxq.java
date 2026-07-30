package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class jxq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f123067a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f123068b;

    public jxq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f123067a = data;
        this.f123068b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88670f0(this.f123067a, this.f123068b);
    }
}
