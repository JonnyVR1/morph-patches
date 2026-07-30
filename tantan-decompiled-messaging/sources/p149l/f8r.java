package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class f8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f96397a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaClassMemberScope f96398b;

    public f8r(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f96397a = lazyJavaResolverContext;
        this.f96398b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.m89684Y0(this.f96397a, this.f96398b);
    }
}
