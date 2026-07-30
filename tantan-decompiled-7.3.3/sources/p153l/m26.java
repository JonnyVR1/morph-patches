package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class m26 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f134499a;

    /* JADX INFO: renamed from: b */
    public final ClassOrPackageFragmentDescriptor f134500b;

    public m26(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.f134499a = lazyJavaResolverContext;
        this.f134500b = classOrPackageFragmentDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.m90466g(this.f134499a, this.f134500b);
    }
}
