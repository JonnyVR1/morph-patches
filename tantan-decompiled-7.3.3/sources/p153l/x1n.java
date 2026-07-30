package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class x1n implements Function1 {

    /* JADX INFO: renamed from: a */
    public final Function1 f192084a;

    public x1n(Function1 function1) {
        this.f192084a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.m93508r(this.f192084a, (KotlinType) obj);
    }
}
