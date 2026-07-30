package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* JADX INFO: loaded from: classes2.dex */
public class exq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KClassImpl f96321a;

    /* JADX INFO: renamed from: b */
    public final KClassImpl.Data f96322b;

    public exq(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f96321a = kClassImpl;
        this.f96322b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.m88663b0(this.f96321a, this.f96322b);
    }
}
