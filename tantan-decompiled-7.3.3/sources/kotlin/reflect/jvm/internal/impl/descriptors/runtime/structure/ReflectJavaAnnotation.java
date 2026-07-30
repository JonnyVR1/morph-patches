package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Annotation f65019a;

    public ReflectJavaAnnotation(@NotNull Annotation annotation) {
        annotation.getClass();
        this.f65019a = annotation;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final Annotation m89891I() {
        return this.f65019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass mo89890C() {
        return new ReflectJavaClass(JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(this.f65019a)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassId mo89893e() {
        return ReflectClassUtilKt.m89882e(JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(this.f65019a)));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && this.f65019a == ((ReflectJavaAnnotation) obj).f65019a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: f */
    public boolean mo89894f() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f65019a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: j */
    public Collection<JavaAnnotationArgument> mo89895j() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(this.f65019a)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f65020b;
            Object objInvoke = method.invoke(this.f65019a, null);
            objInvoke.getClass();
            arrayList.add(factory.m89897a(objInvoke, Name.m91970i(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: t */
    public boolean mo89896t() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f65019a;
    }
}
