package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class far implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f98003a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f98004b;

    public far(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f98003a = lazyJavaClassMemberScope;
        this.f98004b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.m90572D0(this.f98003a, this.f98004b);
    }
}
