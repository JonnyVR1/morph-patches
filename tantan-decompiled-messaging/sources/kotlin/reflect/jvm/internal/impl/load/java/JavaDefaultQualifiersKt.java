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
    public static final List<AnnotationQualifierApplicabilityType> f64659a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<AnnotationQualifierApplicabilityType> f64660b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f64661c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f64662d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f64663e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listListOf = CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        f64659a = listListOf;
        List<AnnotationQualifierApplicabilityType> listListOf2 = CollectionsKt.listOf(annotationQualifierApplicabilityType3);
        f64660b = listListOf2;
        FqName fqNameM89447k = JvmAnnotationNamesKt.m89447k();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<FqName, JavaDefaultQualifiers> mapMapOf = MapsKt.mapOf(TuplesKt.m87240a(fqNameM89447k, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false, true)), TuplesKt.m87240a(JvmAnnotationNamesKt.m89445i(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false, true)), TuplesKt.m87240a(JvmAnnotationNamesKt.m89446j(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), listListOf, false, true, 4, null)));
        f64661c = mapMapOf;
        Map<FqName, JavaDefaultQualifiers> mapMapOf2 = MapsKt.mapOf(TuplesKt.m87240a(JvmAnnotationNamesKt.m89440d(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf2, false, false, 12, null)), TuplesKt.m87240a(JvmAnnotationNamesKt.m89441e(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), listListOf2, false, false, 12, null)));
        f64662d = mapMapOf2;
        f64663e = MapsKt.plus(mapMapOf, mapMapOf2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<FqName, JavaDefaultQualifiers> m89389a() {
        return f64663e;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Map<FqName, JavaDefaultQualifiers> m89390b() {
        return f64661c;
    }
}
