package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;

/* JADX INFO: loaded from: classes2.dex */
public class iuq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KCallableImpl f115045a;

    public iuq(KCallableImpl kCallableImpl) {
        this.f115045a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(KCallableImpl.m87712Y(this.f115045a));
    }
}
