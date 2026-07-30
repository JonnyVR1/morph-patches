package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;

/* JADX INFO: loaded from: classes2.dex */
public class c9r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f79960a;

    public c9r(LazyJavaScope lazyJavaScope) {
        this.f79960a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m89801u(this.f79960a);
    }
}
