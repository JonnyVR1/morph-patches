package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class ivq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f115190a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f115191b;

    public ivq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f115190a = data;
        this.f115191b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m87779f0(this.f115190a, this.f115191b);
    }
}
