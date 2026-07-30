package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class jx40 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final NotFoundClasses f122986a;

    public jx40(NotFoundClasses notFoundClasses) {
        this.f122986a = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NotFoundClasses.m89446e(this.f122986a, (FqName) obj);
    }
}
