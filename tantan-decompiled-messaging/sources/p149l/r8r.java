package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* JADX INFO: loaded from: classes2.dex */
public class r8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f158247a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaPackageScope f158248b;

    public r8r(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        this.f158247a = lazyJavaResolverContext;
        this.f158248b = lazyJavaPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageScope.m89768o0(this.f158247a, this.f158248b);
    }
}
