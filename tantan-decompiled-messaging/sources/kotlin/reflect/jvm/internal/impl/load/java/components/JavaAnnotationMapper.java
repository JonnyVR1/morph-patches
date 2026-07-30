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
    public static final Name f64774a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Name f64775b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Name f64776c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<FqName, FqName> f64777d;

    static {
        Name nameM91079i = Name.m91079i("message");
        nameM91079i.getClass();
        f64774a = nameM91079i;
        Name nameM91079i2 = Name.m91079i("allowedTargets");
        nameM91079i2.getClass();
        f64775b = nameM91079i2;
        Name nameM91079i3 = Name.m91079i("value");
        nameM91079i3.getClass();
        f64776c = nameM91079i3;
        f64777d = MapsKt.mapOf(TuplesKt.m87240a(StandardNames.FqNames.f63847G, JvmAnnotationNames.f64696d), TuplesKt.m87240a(StandardNames.FqNames.f63855K, JvmAnnotationNames.f64698f), TuplesKt.m87240a(StandardNames.FqNames.f63863O, JvmAnnotationNames.f64701i));
    }

    private JavaAnnotationMapper() {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AnnotationDescriptor m89520f(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaAnnotationMapper.m89525e(javaAnnotation, lazyJavaResolverContext, z);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AnnotationDescriptor m89521a(@NotNull FqName fqName, @NotNull JavaAnnotationOwner javaAnnotationOwner, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        JavaAnnotation javaAnnotationMo89007b;
        fqName.getClass();
        javaAnnotationOwner.getClass();
        lazyJavaResolverContext.getClass();
        if (Intrinsics.m87488d(fqName, StandardNames.FqNames.f63928x)) {
            FqName fqName2 = JvmAnnotationNames.f64700h;
            fqName2.getClass();
            JavaAnnotation javaAnnotationMo89007b2 = javaAnnotationOwner.mo89007b(fqName2);
            if (javaAnnotationMo89007b2 != null || javaAnnotationOwner.mo89014r()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationMo89007b2, lazyJavaResolverContext);
            }
        }
        FqName fqName3 = f64777d.get(fqName);
        if (fqName3 == null || (javaAnnotationMo89007b = javaAnnotationOwner.mo89007b(fqName3)) == null) {
            return null;
        }
        return m89520f(INSTANCE, javaAnnotationMo89007b, lazyJavaResolverContext, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Name m89522b() {
        return f64774a;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Name m89523c() {
        return f64776c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Name m89524d() {
        return f64775b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final AnnotationDescriptor m89525e(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext, boolean z) {
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        ClassId classIdMo89002e = javaAnnotation.mo89002e();
        ClassId.Companion companion = ClassId.Companion;
        FqName fqName = JvmAnnotationNames.f64696d;
        fqName.getClass();
        if (Intrinsics.m87488d(classIdMo89002e, companion.m91045c(fqName))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        FqName fqName2 = JvmAnnotationNames.f64698f;
        fqName2.getClass();
        if (Intrinsics.m87488d(classIdMo89002e, companion.m91045c(fqName2))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        FqName fqName3 = JvmAnnotationNames.f64701i;
        fqName3.getClass();
        if (Intrinsics.m87488d(classIdMo89002e, companion.m91045c(fqName3))) {
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.f63863O);
        }
        FqName fqName4 = JvmAnnotationNames.f64700h;
        fqName4.getClass();
        if (Intrinsics.m87488d(classIdMo89002e, companion.m91045c(fqName4))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, z);
    }
}
