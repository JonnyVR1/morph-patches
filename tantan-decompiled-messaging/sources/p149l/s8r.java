package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* JADX INFO: loaded from: classes2.dex */
public class s8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageScope f163100a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaResolverContext f163101b;

    public s8r(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f163100a = lazyJavaPackageScope;
        this.f163101b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaPackageScope.m89767i0(this.f163100a, this.f163101b, (LazyJavaPackageScope.C15220a) obj);
    }
}
