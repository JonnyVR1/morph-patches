package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: loaded from: classes2.dex */
public class k9r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaTypeParameterResolver f122062a;

    public k9r(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        this.f122062a = lazyJavaTypeParameterResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaTypeParameterResolver.m89625c(this.f122062a, (JavaTypeParameter) obj);
    }
}
