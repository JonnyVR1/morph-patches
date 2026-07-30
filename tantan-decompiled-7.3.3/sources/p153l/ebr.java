package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class ebr implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f92954a;

    public ebr(LazyJavaScope lazyJavaScope) {
        this.f92954a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90692u(this.f92954a);
    }
}
