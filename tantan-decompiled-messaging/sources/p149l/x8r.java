package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class x8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f191540a;

    public x8r(LazyJavaScope lazyJavaScope) {
        this.f191540a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m89779G(this.f191540a, (Name) obj);
    }
}
