package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class z8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f202195a;

    public z8r(LazyJavaScope lazyJavaScope) {
        this.f202195a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m89782J(this.f202195a, (Name) obj);
    }
}
