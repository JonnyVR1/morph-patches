package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class ryq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Setter f165454a;

    public ryq(KPropertyImpl.Setter setter) {
        this.f165454a = setter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Setter.m88846e0(this.f165454a);
    }
}
