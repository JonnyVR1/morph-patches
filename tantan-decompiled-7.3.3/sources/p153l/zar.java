package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class zar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f203588a;

    public zar(LazyJavaScope lazyJavaScope) {
        this.f203588a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m90670G(this.f203588a, (Name) obj);
    }
}
