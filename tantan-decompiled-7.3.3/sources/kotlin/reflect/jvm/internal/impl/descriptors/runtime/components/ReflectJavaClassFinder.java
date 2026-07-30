package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassLoader f64994a;

    public ReflectJavaClassFinder(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.f64994a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public Set<String> mo89832a(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaClass mo89833b(@NotNull JavaClassFinder.Request request) {
        request.getClass();
        ClassId classIdM90273a = request.m90273a();
        FqName fqNameM91929f = classIdM90273a.m91929f();
        String strM94369E = C15493d.m94369E(classIdM90273a.m91930g().m91937a(), '.', '$', false, 4, null);
        if (!fqNameM91929f.m91939c()) {
            strM94369E = fqNameM91929f.m91937a() + '.' + strM94369E;
        }
        Class<?> clsM89835a = ReflectJavaClassFinderKt.m89835a(this.f64994a, strM94369E);
        if (clsM89835a != null) {
            return new ReflectJavaClass(clsM89835a);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: c */
    public JavaPackage mo89834c(@NotNull FqName fqName, boolean z) {
        fqName.getClass();
        return new ReflectJavaPackage(fqName);
    }
}
