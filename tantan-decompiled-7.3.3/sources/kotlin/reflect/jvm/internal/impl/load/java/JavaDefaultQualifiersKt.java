package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDefaultQualifiersKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<AnnotationQualifierApplicabilityType> f65333a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<AnnotationQualifierApplicabilityType> f65334b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f65335c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f65336d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f65337e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listListOf = CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        f65333a = listListOf;
        List<AnnotationQualifierApplicabilityType> listListOf2 = CollectionsKt.listOf(annotationQualifierApplicabilityType3);
        f65334b = listListOf2;
        FqName fqNameM90338k = JvmAnnotationNamesKt.m90338k();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<FqName, JavaDefaultQualifiers> mapMapOf = MapsKt.mapOf(TuplesKt.m88129a(fqNameM90338k, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false, true)), TuplesKt.m88129a(JvmAnnotationNamesKt.m90336i(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false, true)), TuplesKt.m88129a(JvmAnnotationNamesKt.m90337j(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), listListOf, false, true, 4, null)));
        f65335c = mapMapOf;
        Map<FqName, JavaDefaultQualifiers> mapMapOf2 = MapsKt.mapOf(TuplesKt.m88129a(JvmAnnotationNamesKt.m90331d(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf2, false, false, 12, null)), TuplesKt.m88129a(JvmAnnotationNamesKt.m90332e(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), listListOf2, false, false, 12, null)));
        f65336d = mapMapOf2;
        f65337e = MapsKt.plus(mapMapOf, mapMapOf2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<FqName, JavaDefaultQualifiers> m90280a() {
        return f65337e;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Map<FqName, JavaDefaultQualifiers> m90281b() {
        return f65335c;
    }
}
