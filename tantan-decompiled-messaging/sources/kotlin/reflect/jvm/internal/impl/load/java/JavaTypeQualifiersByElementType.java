package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeQualifiersByElementType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f64683a;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMap) {
        enumMap.getClass();
        this.f64683a = enumMap;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final JavaDefaultQualifiers m89423a(@Nullable AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f64683a.get(annotationQualifierApplicabilityType);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> m89424b() {
        return this.f64683a;
    }
}
