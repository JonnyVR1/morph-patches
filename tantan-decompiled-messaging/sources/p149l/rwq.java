package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class rwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Setter f161366a;

    public rwq(KPropertyImpl.Setter setter) {
        this.f161366a = setter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Setter.m87954d0(this.f161366a);
    }
}
