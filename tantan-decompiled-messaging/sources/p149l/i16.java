package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes2.dex */
public class i16 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f110422a;

    /* JADX INFO: renamed from: b */
    public final Annotations f110423b;

    public i16(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.f110422a = lazyJavaResolverContext;
        this.f110423b = annotations;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.m89580l(this.f110422a, this.f110423b);
    }
}
