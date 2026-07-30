package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class bbr implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f75980a;

    public bbr(LazyJavaScope lazyJavaScope) {
        this.f75980a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m90673J(this.f75980a, (Name) obj);
    }
}
