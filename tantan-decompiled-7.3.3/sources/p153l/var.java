package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class var implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f183152a;

    public var(LazyJavaScope lazyJavaScope) {
        this.f183152a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90691t(this.f183152a);
    }
}
