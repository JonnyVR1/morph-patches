package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class owq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Getter f146078a;

    public owq(KPropertyImpl.Getter getter) {
        this.f146078a = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Getter.m87950e0(this.f146078a);
    }
}
