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
    public final Annotation f64345a;

    public ReflectJavaAnnotation(@NotNull Annotation annotation) {
        annotation.getClass();
        this.f64345a = annotation;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final Annotation m89000I() {
        return this.f64345a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass mo88999C() {
        return new ReflectJavaClass(JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(this.f64345a)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassId mo89002e() {
        return ReflectClassUtilKt.m88991e(JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(this.f64345a)));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && this.f64345a == ((ReflectJavaAnnotation) obj).f64345a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: f */
    public boolean mo89003f() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f64345a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* JADX INFO: renamed from: j */
    public Collection<JavaAnnotationArgument> mo89004j() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(this.f64345a)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f64346b;
            Object objInvoke = method.invoke(this.f64345a, null);
            objInvoke.getClass();
            arrayList.add(factory.m89006a(objInvoke, Name.m91079i(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: t */
    public boolean mo89005t() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f64345a;
    }
}
