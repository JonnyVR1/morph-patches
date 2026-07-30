package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;

/* JADX INFO: loaded from: classes2.dex */
public class jwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KCallableImpl f122952a;

    public jwq(KCallableImpl kCallableImpl) {
        this.f122952a = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(KCallableImpl.m88603Y(this.f122952a));
    }
}
