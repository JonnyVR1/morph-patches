package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LazyJavaPackageFragment f65745b;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        lazyJavaPackageFragment.getClass();
        this.f65745b = lazyJavaPackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* JADX INFO: renamed from: b */
    public SourceFile mo89484b() {
        SourceFile sourceFile = SourceFile.f64738a;
        sourceFile.getClass();
        return sourceFile;
    }

    @NotNull
    public String toString() {
        return this.f65745b + ": " + this.f65745b.m90653H0().keySet();
    }
}
