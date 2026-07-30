package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class xlq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f195010a;

    /* JADX INFO: renamed from: b */
    public final JavaAnnotationDescriptor f195011b;

    public xlq(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        this.f195010a = lazyJavaResolverContext;
        this.f195011b = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaAnnotationDescriptor.m90407g(this.f195010a, this.f195011b);
    }
}
