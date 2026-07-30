package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class yjq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f198668a;

    /* JADX INFO: renamed from: b */
    public final JavaAnnotationDescriptor f198669b;

    public yjq(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        this.f198668a = lazyJavaResolverContext;
        this.f198669b = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaAnnotationDescriptor.m89516g(this.f198668a, this.f198669b);
    }
}
