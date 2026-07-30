package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f65037a;

    public ReflectJavaPackage(@NotNull FqName fqName) {
        fqName.getClass();
        this.f65037a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<JavaClass> mo89953E(@NotNull Function1<? super Name, Boolean> function1) {
        function1.getClass();
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaAnnotation mo89898b(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo89954d() {
        return this.f65037a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.m88377d(mo89954d(), ((ReflectJavaPackage) obj).mo89954d());
    }

    public int hashCode() {
        return mo89954d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* JADX INFO: renamed from: n */
    public Collection<JavaPackage> mo89955n() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaPackage.class.getName() + ": " + mo89954d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<JavaAnnotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
