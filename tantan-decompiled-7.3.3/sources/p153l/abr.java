package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class abr implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f69646a;

    public abr(LazyJavaScope lazyJavaScope) {
        this.f69646a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m90669F(this.f69646a, (Name) obj);
    }
}
