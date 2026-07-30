package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class jvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f119965a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f119966b;

    public jvq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f119965a = data;
        this.f119966b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87773c0(this.f119965a, this.f119966b);
    }
}
