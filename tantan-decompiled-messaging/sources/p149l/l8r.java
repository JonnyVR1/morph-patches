package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class l8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f126851a;

    public l8r(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f126851a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m89680B0(this.f126851a, (Name) obj);
    }
}
