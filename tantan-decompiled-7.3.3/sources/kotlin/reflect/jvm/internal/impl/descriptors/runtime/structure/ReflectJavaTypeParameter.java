package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeVariable<?> f65043a;

    public ReflectJavaTypeParameter(@NotNull TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.f65043a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaClassifierType> getUpperBounds() {
        Type[] bounds = this.f65043a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type));
        }
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.singleOrNull((List) arrayList);
        return Intrinsics.m88377d(reflectJavaClassifierType != null ? reflectJavaClassifierType.mo89902I() : null, Object.class) ? CollectionsKt.emptyList() : arrayList;
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
        return (obj instanceof ReflectJavaTypeParameter) && Intrinsics.m88377d(this.f65043a, ((ReflectJavaTypeParameter) obj).f65043a);
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
    @Nullable
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.f65043a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Name nameM91970i = Name.m91970i(this.f65043a.getName());
        nameM91970i.getClass();
        return nameM91970i;
    }

    public int hashCode() {
        return this.f65043a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaTypeParameter.class.getName() + ": " + this.f65043a;
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
