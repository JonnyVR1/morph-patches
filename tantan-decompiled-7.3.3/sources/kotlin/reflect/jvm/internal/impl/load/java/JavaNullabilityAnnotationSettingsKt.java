package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FqName f65342a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final FqName f65343b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f65344c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final FqName f65345d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f65346e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName[] f65347f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> f65348g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final JavaNullabilityAnnotationsStatus f65349h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f65342a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f65343b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f65344c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f65345d = fqName4;
        String strM91937a = fqName3.m91937a();
        f65346e = strM91937a;
        f65347f = new FqName[]{new FqName(strM91937a + ".Nullable"), new FqName(strM91937a + ".NonNull")};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pairM88129a = TuplesKt.m88129a(fqName5, companion.m90307a());
        Pair pairM88129a2 = TuplesKt.m88129a(new FqName("androidx.annotation"), companion.m90307a());
        Pair pairM88129a3 = TuplesKt.m88129a(new FqName("android.support.annotation"), companion.m90307a());
        Pair pairM88129a4 = TuplesKt.m88129a(new FqName("android.annotation"), companion.m90307a());
        Pair pairM88129a5 = TuplesKt.m88129a(new FqName("com.android.annotations"), companion.m90307a());
        Pair pairM88129a6 = TuplesKt.m88129a(new FqName("org.eclipse.jdt.annotation"), companion.m90307a());
        Pair pairM88129a7 = TuplesKt.m88129a(new FqName("org.checkerframework.checker.nullness.qual"), companion.m90307a());
        Pair pairM88129a8 = TuplesKt.m88129a(fqName4, companion.m90307a());
        Pair pairM88129a9 = TuplesKt.m88129a(new FqName("javax.annotation"), companion.m90307a());
        Pair pairM88129a10 = TuplesKt.m88129a(new FqName("edu.umd.cs.findbugs.annotations"), companion.m90307a());
        Pair pairM88129a11 = TuplesKt.m88129a(new FqName("io.reactivex.annotations"), companion.m90307a());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pairM88129a12 = TuplesKt.m88129a(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM88129a13 = TuplesKt.m88129a(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM88129a14 = TuplesKt.m88129a(new FqName("lombok"), companion.m90307a());
        KotlinVersion kotlinVersion = new KotlinVersion(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f65348g = new NullabilityAnnotationStatesImpl(MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, pairM88129a4, pairM88129a5, pairM88129a6, pairM88129a7, pairM88129a8, pairM88129a9, pairM88129a10, pairM88129a11, pairM88129a12, pairM88129a13, pairM88129a14, TuplesKt.m88129a(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.m88129a(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 1), reportLevel2)), TuplesKt.m88129a(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2)), TuplesKt.m88129a(new FqName("jakarta.annotation"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 4), reportLevel2))));
        f65349h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Jsr305Settings m90297a(@NotNull KotlinVersion kotlinVersion) {
        kotlinVersion.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f65349h;
        ReportLevel reportLevelM90305c = (javaNullabilityAnnotationsStatus.m90306d() == null || javaNullabilityAnnotationsStatus.m90306d().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.m90305c() : javaNullabilityAnnotationsStatus.m90304b();
        return new Jsr305Settings(reportLevelM90305c, m90298b(reportLevelM90305c), null, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ReportLevel m90298b(@NotNull ReportLevel reportLevel) {
        reportLevel.getClass();
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ReportLevel m90299c(@NotNull FqName fqName, @NotNull KotlinVersion kotlinVersion) {
        fqName.getClass();
        kotlinVersion.getClass();
        return m90302f(fqName, NullabilityAnnotationStates.Companion.m90345a(), kotlinVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final FqName m90300d() {
        return f65343b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final FqName[] m90301e() {
        return f65347f;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ReportLevel m90302f(@NotNull FqName fqName, @NotNull NullabilityAnnotationStates<? extends ReportLevel> nullabilityAnnotationStates, @NotNull KotlinVersion kotlinVersion) {
        fqName.getClass();
        nullabilityAnnotationStates.getClass();
        kotlinVersion.getClass();
        ReportLevel reportLevelMo90344a = nullabilityAnnotationStates.mo90344a(fqName);
        if (reportLevelMo90344a != null) {
            return reportLevelMo90344a;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatusMo90344a = f65348g.mo90344a(fqName);
        if (javaNullabilityAnnotationsStatusMo90344a == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatusMo90344a.m90306d() == null || javaNullabilityAnnotationsStatusMo90344a.m90306d().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatusMo90344a.m90305c() : javaNullabilityAnnotationsStatusMo90344a.m90304b();
    }
}
