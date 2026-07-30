package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class rwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl f165222a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f165223b;

    public rwq(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f165222a = kClassImpl;
        this.f165223b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88662a0(this.f165222a, this.f165223b);
    }
}
