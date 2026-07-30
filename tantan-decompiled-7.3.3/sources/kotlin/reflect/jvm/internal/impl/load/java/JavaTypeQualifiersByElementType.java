package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeQualifiersByElementType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f65357a;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMap) {
        enumMap.getClass();
        this.f65357a = enumMap;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final JavaDefaultQualifiers m90314a(@Nullable AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f65357a.get(annotationQualifierApplicabilityType);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> m90315b() {
        return this.f65357a;
    }
}
