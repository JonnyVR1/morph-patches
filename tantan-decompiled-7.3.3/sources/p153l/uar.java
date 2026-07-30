package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* JADX INFO: loaded from: classes2.dex */
public class uar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageScope f178225a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f178226b;

    public uar(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f178225a = lazyJavaPackageScope;
        this.f178226b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaPackageScope.m90658i0(this.f178225a, this.f178226b, (LazyJavaPackageScope.C15327a) obj);
    }
}
