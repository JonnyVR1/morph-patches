package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReflectJavaType f65044a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Annotation[] f65045b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String f65046c;

    /* JADX INFO: renamed from: d */
    public final boolean f65047d;

    public ReflectJavaValueParameter(@NotNull ReflectJavaType reflectJavaType, @NotNull Annotation[] annotationArr, @Nullable String str, boolean z) {
        reflectJavaType.getClass();
        annotationArr.getClass();
        this.f65044a = reflectJavaType;
        this.f65045b = annotationArr;
        this.f65046c = str;
        this.f65047d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        return this.f65044a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    /* JADX INFO: renamed from: a */
    public boolean mo89961a() {
        return this.f65047d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public ReflectJavaAnnotation mo89898b(@NotNull FqName fqName) {
        fqName.getClass();
        return ReflectJavaAnnotationOwnerKt.m89899a(this.f65045b, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @Nullable
    public Name getName() {
        String str = this.f65046c;
        if (str != null) {
            return Name.m91969h(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaValueParameter.class.getName());
        sb.append(": ");
        sb.append(mo89961a() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.m89900b(this.f65045b);
    }
}
