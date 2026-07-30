package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class nar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassMemberScope f141040a;

    public nar(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f141040a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m90571B0(this.f141040a, (Name) obj);
    }
}
