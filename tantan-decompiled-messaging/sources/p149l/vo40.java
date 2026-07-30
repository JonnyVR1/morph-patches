package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class vo40 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final NotFoundClasses f182335a;

    public vo40(NotFoundClasses notFoundClasses) {
        this.f182335a = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NotFoundClasses.m88555e(this.f182335a, (FqName) obj);
    }
}
