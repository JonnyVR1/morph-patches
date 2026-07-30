package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class dbr implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f87696a;

    public dbr(LazyJavaScope lazyJavaScope) {
        this.f87696a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90675X(this.f87696a);
    }
}
