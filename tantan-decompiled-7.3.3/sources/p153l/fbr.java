package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class fbr implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f98140a;

    public fbr(LazyJavaScope lazyJavaScope) {
        this.f98140a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.m90674W(this.f98140a, (Name) obj);
    }
}
