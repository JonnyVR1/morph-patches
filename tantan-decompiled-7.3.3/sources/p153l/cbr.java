package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class cbr implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f80839a;

    public cbr(LazyJavaScope lazyJavaScope) {
        this.f80839a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90672I(this.f80839a);
    }
}
