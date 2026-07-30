package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class dvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl f88091a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f88092b;

    public dvq(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f88091a = kClassImpl;
        this.f88092b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87772b0(this.f88091a, this.f88092b);
    }
}
