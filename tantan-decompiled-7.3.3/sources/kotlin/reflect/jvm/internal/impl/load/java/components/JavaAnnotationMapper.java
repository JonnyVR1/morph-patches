package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaAnnotationMapper {

    @NotNull
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Name f65448a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Name f65449b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Name f65450c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<FqName, FqName> f65451d;

    static {
        Name nameM91970i = Name.m91970i("message");
        nameM91970i.getClass();
        f65448a = nameM91970i;
        Name nameM91970i2 = Name.m91970i("allowedTargets");
        nameM91970i2.getClass();
        f65449b = nameM91970i2;
        Name nameM91970i3 = Name.m91970i("value");
        nameM91970i3.getClass();
        f65450c = nameM91970i3;
        f65451d = MapsKt.mapOf(TuplesKt.m88129a(StandardNames.FqNames.f64521G, JvmAnnotationNames.f65370d), TuplesKt.m88129a(StandardNames.FqNames.f64529K, JvmAnnotationNames.f65372f), TuplesKt.m88129a(StandardNames.FqNames.f64537O, JvmAnnotationNames.f65375i));
    }

    private JavaAnnotationMapper() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AnnotationDescriptor m90411f(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaAnnotationMapper.m90416e(javaAnnotation, lazyJavaResolverContext, z);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AnnotationDescriptor m90412a(@NotNull FqName fqName, @NotNull JavaAnnotationOwner javaAnnotationOwner, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        JavaAnnotation javaAnnotationMo89898b;
        fqName.getClass();
        javaAnnotationOwner.getClass();
        lazyJavaResolverContext.getClass();
        if (Intrinsics.m88377d(fqName, StandardNames.FqNames.f64602x)) {
            FqName fqName2 = JvmAnnotationNames.f65374h;
            fqName2.getClass();
            JavaAnnotation javaAnnotationMo89898b2 = javaAnnotationOwner.mo89898b(fqName2);
            if (javaAnnotationMo89898b2 != null || javaAnnotationOwner.mo89905r()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationMo89898b2, lazyJavaResolverContext);
            }
        }
        FqName fqName3 = f65451d.get(fqName);
        if (fqName3 == null || (javaAnnotationMo89898b = javaAnnotationOwner.mo89898b(fqName3)) == null) {
            return null;
        }
        return m90411f(INSTANCE, javaAnnotationMo89898b, lazyJavaResolverContext, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Name m90413b() {
        return f65448a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m90414c() {
        return f65450c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Name m90415d() {
        return f65449b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final AnnotationDescriptor m90416e(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext, boolean z) {
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        ClassId classIdMo89893e = javaAnnotation.mo89893e();
        ClassId.Companion companion = ClassId.Companion;
        FqName fqName = JvmAnnotationNames.f65370d;
        fqName.getClass();
        if (Intrinsics.m88377d(classIdMo89893e, companion.m91936c(fqName))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        FqName fqName2 = JvmAnnotationNames.f65372f;
        fqName2.getClass();
        if (Intrinsics.m88377d(classIdMo89893e, companion.m91936c(fqName2))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        FqName fqName3 = JvmAnnotationNames.f65375i;
        fqName3.getClass();
        if (Intrinsics.m88377d(classIdMo89893e, companion.m91936c(fqName3))) {
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f64537O);
        }
        FqName fqName4 = JvmAnnotationNames.f65374h;
        fqName4.getClass();
        if (Intrinsics.m88377d(classIdMo89893e, companion.m91936c(fqName4))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, z);
    }
}
