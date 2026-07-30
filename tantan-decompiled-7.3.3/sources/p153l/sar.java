package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;

/* JADX INFO: loaded from: classes2.dex */
public class sar implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider f167067a;

    /* JADX INFO: renamed from: b */
    public final JavaPackage f167068b;

    public sar(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.f167067a = lazyJavaPackageFragmentProvider;
        this.f167068b = javaPackage;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragmentProvider.m90505f(this.f167067a, this.f167068b);
    }
}
