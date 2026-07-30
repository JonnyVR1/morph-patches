package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class d8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f84888a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f84889b;

    public d8r(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f84888a = lazyJavaClassMemberScope;
        this.f84889b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.m89681D0(this.f84888a, this.f84889b);
    }
}
