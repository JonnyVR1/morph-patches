package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class ixq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl.Data f117451a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl f117452b;

    public ixq(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f117451a = data;
        this.f117452b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88660Y(this.f117451a, this.f117452b);
    }
}
