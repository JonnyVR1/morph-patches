package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class k8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f121848a;

    public k8r(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f121848a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m89679A0(this.f121848a, (Name) obj);
    }
}
