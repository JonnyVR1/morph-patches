package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassLoader f64320a;

    public ReflectJavaClassFinder(@NotNull ClassLoader classLoader) {
        classLoader.getClass();
        this.f64320a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: a */
    public Set<String> mo88941a(@NotNull FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: b */
    public JavaClass mo88942b(@NotNull JavaClassFinder.Request request) {
        request.getClass();
        ClassId classIdM89382a = request.m89382a();
        FqName fqNameM91038f = classIdM89382a.m91038f();
        String strM93478E = C15386d.m93478E(classIdM89382a.m91039g().m91046a(), '.', '$', false, 4, null);
        if (!fqNameM91038f.m91048c()) {
            strM93478E = fqNameM91038f.m91046a() + '.' + strM93478E;
        }
        Class<?> clsM88944a = ReflectJavaClassFinderKt.m88944a(this.f64320a, strM93478E);
        if (clsM88944a != null) {
            return new ReflectJavaClass(clsM88944a);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* JADX INFO: renamed from: c */
    public JavaPackage mo88943c(@NotNull FqName fqName, boolean z) {
        fqName.getClass();
        return new ReflectJavaPackage(fqName);
    }
}
