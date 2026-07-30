package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaAnnotationOwnerKt {
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ReflectJavaAnnotation m89899a(@NotNull Annotation[] annotationArr, @NotNull FqName fqName) {
        annotationArr.getClass();
        fqName.getClass();
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.m88377d(ReflectClassUtilKt.m89882e(JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation))).m91925a(), fqName)) {
                if (annotation != null) {
                    return new ReflectJavaAnnotation(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<ReflectJavaAnnotation> m89900b(@NotNull Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}
