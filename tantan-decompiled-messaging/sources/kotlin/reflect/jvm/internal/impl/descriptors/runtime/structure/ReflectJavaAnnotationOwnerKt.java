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
    public static final ReflectJavaAnnotation m89008a(@NotNull Annotation[] annotationArr, @NotNull FqName fqName) {
        annotationArr.getClass();
        fqName.getClass();
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.m87488d(ReflectClassUtilKt.m88991e(JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation))).m91034a(), fqName)) {
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
    public static final List<ReflectJavaAnnotation> m89009b(@NotNull Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}
