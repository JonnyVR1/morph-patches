package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class jar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f119007a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f119008b;

    public jar(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f119007a = lazyJavaClassMemberScope;
        this.f119008b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m90581i1(this.f119007a, this.f119008b, (Name) obj);
    }
}
