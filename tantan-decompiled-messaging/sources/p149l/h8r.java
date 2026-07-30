package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class h8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f106459a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f106460b;

    public h8r(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f106459a = lazyJavaClassMemberScope;
        this.f106460b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m89690i1(this.f106459a, this.f106460b, (Name) obj);
    }
}
