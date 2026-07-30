package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;

/* JADX INFO: loaded from: classes2.dex */
public class har implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f108513a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaClassMemberScope f108514b;

    public har(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f108513a = lazyJavaResolverContext;
        this.f108514b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.m90575Y0(this.f108513a, this.f108514b);
    }
}
