package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class n26 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f139814a;

    /* JADX INFO: renamed from: b */
    public final Annotations f139815b;

    public n26(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.f139814a = lazyJavaResolverContext;
        this.f139815b = annotations;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.m90471l(this.f139814a, this.f139815b);
    }
}
