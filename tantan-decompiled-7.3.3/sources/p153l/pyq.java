package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class pyq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Getter f154685a;

    public pyq(KPropertyImpl.Getter getter) {
        this.f154685a = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Getter.m88841e0(this.f154685a);
    }
}
