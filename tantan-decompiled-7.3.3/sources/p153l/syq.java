package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes2.dex */
public class syq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KPropertyImpl.Setter f171287a;

    public syq(KPropertyImpl.Setter setter) {
        this.f171287a = setter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Setter.m88845d0(this.f171287a);
    }
}
