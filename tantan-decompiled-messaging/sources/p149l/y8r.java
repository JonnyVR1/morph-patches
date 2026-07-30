package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class y8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f196862a;

    public y8r(LazyJavaScope lazyJavaScope) {
        this.f196862a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m89778F(this.f196862a, (Name) obj);
    }
}
