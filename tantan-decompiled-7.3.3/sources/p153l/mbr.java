package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: loaded from: classes2.dex */
public class mbr implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaTypeParameterResolver f135745a;

    public mbr(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        this.f135745a = lazyJavaTypeParameterResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaTypeParameterResolver.m90516c(this.f135745a, (JavaTypeParameter) obj);
    }
}
