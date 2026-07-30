package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class t8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f168944a;

    public t8r(LazyJavaScope lazyJavaScope) {
        this.f168944a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m89800t(this.f168944a);
    }
}
