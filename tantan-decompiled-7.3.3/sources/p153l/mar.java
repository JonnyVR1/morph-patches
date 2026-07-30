package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class mar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f135588a;

    public mar(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f135588a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m90570A0(this.f135588a, (Name) obj);
    }
}
