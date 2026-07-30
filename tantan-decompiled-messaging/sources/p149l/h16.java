package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class h16 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f105282a;

    /* JADX INFO: renamed from: b */
    public final ClassOrPackageFragmentDescriptor f105283b;

    public h16(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.f105282a = lazyJavaResolverContext;
        this.f105283b = classOrPackageFragmentDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.m89575g(this.f105282a, this.f105283b);
    }
}
