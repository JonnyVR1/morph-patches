package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class d9r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f85141a;

    public d9r(LazyJavaScope lazyJavaScope) {
        this.f85141a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m89783W(this.f85141a, (Name) obj);
    }
}
