package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* JADX INFO: loaded from: classes2.dex */
public class tar implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f172759a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaPackageScope f172760b;

    public tar(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        this.f172759a = lazyJavaResolverContext;
        this.f172760b = lazyJavaPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageScope.m90659o0(this.f172759a, this.f172760b);
    }
}
