package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class z1n implements Function1 {

    /* JADX INFO: renamed from: a */
    public final IntersectionTypeConstructor f202578a;

    public z1n(IntersectionTypeConstructor intersectionTypeConstructor) {
        this.f202578a = intersectionTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.m93505m(this.f202578a, (KotlinTypeRefiner) obj);
    }
}
