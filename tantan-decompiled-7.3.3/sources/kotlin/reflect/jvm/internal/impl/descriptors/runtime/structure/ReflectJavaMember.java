package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    /* JADX INFO: renamed from: H */
    public boolean mo89914H() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass mo89947x() {
        Class<?> declaringClass = mo89936J().getDeclaringClass();
        declaringClass.getClass();
        return new ReflectJavaClass(declaringClass);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public abstract Member mo89936J();

    @NotNull
    /* JADX INFO: renamed from: K */
    public final List<JavaValueParameter> m89946K(@NotNull Type[] typeArr, @NotNull Annotation[][] annotationArr, boolean z) {
        String str;
        typeArr.getClass();
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> listM89875b = Java8ParameterNamesLoader.INSTANCE.m89875b(mo89936J());
        int size = listM89875b != null ? listM89875b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            ReflectJavaType reflectJavaTypeM89958a = ReflectJavaType.f65042a.m89958a(typeArr[i]);
            if (listM89875b != null) {
                str = (String) CollectionsKt.getOrNull(listM89875b, i + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeM89958a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new ReflectJavaValueParameter(reflectJavaTypeM89958a, annotationArr[i], str, z && i == ArraysKt.getLastIndex(typeArr)));
            i++;
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public ReflectJavaAnnotation mo89898b(FqName fqName) {
        Annotation[] declaredAnnotations;
        fqName.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.m89899a(declaredAnnotations, fqName);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.m88377d(mo89936J(), ((ReflectJavaMember) obj).mo89936J());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listM89900b;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (listM89900b = ReflectJavaAnnotationOwnerKt.m89900b(declaredAnnotations)) == null) ? CollectionsKt.emptyList() : listM89900b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public AnnotatedElement getElement() {
        Member memberMo89936J = mo89936J();
        memberMo89936J.getClass();
        return (AnnotatedElement) memberMo89936J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return mo89936J().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Name nameM91970i;
        String name = mo89936J().getName();
        return (name == null || (nameM91970i = Name.m91970i(name)) == null) ? SpecialNames.f66160a : nameM91970i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return mo89936J().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + mo89936J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ JavaAnnotation mo89898b(FqName fqName) {
        return mo89898b(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
