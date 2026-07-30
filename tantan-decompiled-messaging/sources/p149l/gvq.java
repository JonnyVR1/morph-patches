package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class gvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f104600a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f104601b;

    public gvq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f104600a = data;
        this.f104601b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87768X(this.f104600a, this.f104601b);
    }
}
