package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;

/* JADX INFO: loaded from: classes2.dex */
public class q8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider f153211a;

    /* JADX INFO: renamed from: b */
    public final JavaPackage f153212b;

    public q8r(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.f153211a = lazyJavaPackageFragmentProvider;
        this.f153212b = javaPackage;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragmentProvider.m89614f(this.f153211a, this.f153212b);
    }
}
