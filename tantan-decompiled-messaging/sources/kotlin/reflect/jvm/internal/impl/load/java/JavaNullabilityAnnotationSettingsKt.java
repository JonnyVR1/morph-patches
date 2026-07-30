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
    public static final FqName f64668a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final FqName f64669b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final FqName f64670c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final FqName f64671d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f64672e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final FqName[] f64673f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> f64674g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final JavaNullabilityAnnotationsStatus f64675h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f64668a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f64669b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f64670c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f64671d = fqName4;
        String strM91046a = fqName3.m91046a();
        f64672e = strM91046a;
        f64673f = new FqName[]{new FqName(strM91046a + ".Nullable"), new FqName(strM91046a + ".NonNull")};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pairM87240a = TuplesKt.m87240a(fqName5, companion.m89416a());
        Pair pairM87240a2 = TuplesKt.m87240a(new FqName("androidx.annotation"), companion.m89416a());
        Pair pairM87240a3 = TuplesKt.m87240a(new FqName("android.support.annotation"), companion.m89416a());
        Pair pairM87240a4 = TuplesKt.m87240a(new FqName("android.annotation"), companion.m89416a());
        Pair pairM87240a5 = TuplesKt.m87240a(new FqName("com.android.annotations"), companion.m89416a());
        Pair pairM87240a6 = TuplesKt.m87240a(new FqName("org.eclipse.jdt.annotation"), companion.m89416a());
        Pair pairM87240a7 = TuplesKt.m87240a(new FqName("org.checkerframework.checker.nullness.qual"), companion.m89416a());
        Pair pairM87240a8 = TuplesKt.m87240a(fqName4, companion.m89416a());
        Pair pairM87240a9 = TuplesKt.m87240a(new FqName("javax.annotation"), companion.m89416a());
        Pair pairM87240a10 = TuplesKt.m87240a(new FqName("edu.umd.cs.findbugs.annotations"), companion.m89416a());
        Pair pairM87240a11 = TuplesKt.m87240a(new FqName("io.reactivex.annotations"), companion.m89416a());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pairM87240a12 = TuplesKt.m87240a(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM87240a13 = TuplesKt.m87240a(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM87240a14 = TuplesKt.m87240a(new FqName("lombok"), companion.m89416a());
        KotlinVersion kotlinVersion = new KotlinVersion(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f64674g = new NullabilityAnnotationStatesImpl(MapsKt.mapOf(pairM87240a, pairM87240a2, pairM87240a3, pairM87240a4, pairM87240a5, pairM87240a6, pairM87240a7, pairM87240a8, pairM87240a9, pairM87240a10, pairM87240a11, pairM87240a12, pairM87240a13, pairM87240a14, TuplesKt.m87240a(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.m87240a(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 1), reportLevel2)), TuplesKt.m87240a(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2)), TuplesKt.m87240a(new FqName("jakarta.annotation"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 4), reportLevel2))));
        f64675h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Jsr305Settings m89406a(@NotNull KotlinVersion kotlinVersion) {
        kotlinVersion.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f64675h;
        ReportLevel reportLevelM89414c = (javaNullabilityAnnotationsStatus.m89415d() == null || javaNullabilityAnnotationsStatus.m89415d().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.m89414c() : javaNullabilityAnnotationsStatus.m89413b();
        return new Jsr305Settings(reportLevelM89414c, m89407b(reportLevelM89414c), null, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ReportLevel m89407b(@NotNull ReportLevel reportLevel) {
        reportLevel.getClass();
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ReportLevel m89408c(@NotNull FqName fqName, @NotNull KotlinVersion kotlinVersion) {
        fqName.getClass();
        kotlinVersion.getClass();
        return m89411f(fqName, NullabilityAnnotationStates.Companion.m89454a(), kotlinVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final FqName m89409d() {
        return f64669b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final FqName[] m89410e() {
        return f64673f;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ReportLevel m89411f(@NotNull FqName fqName, @NotNull NullabilityAnnotationStates<? extends ReportLevel> nullabilityAnnotationStates, @NotNull KotlinVersion kotlinVersion) {
        fqName.getClass();
        nullabilityAnnotationStates.getClass();
        kotlinVersion.getClass();
        ReportLevel reportLevelMo89453a = nullabilityAnnotationStates.mo89453a(fqName);
        if (reportLevelMo89453a != null) {
            return reportLevelMo89453a;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatusMo89453a = f64674g.mo89453a(fqName);
        if (javaNullabilityAnnotationsStatusMo89453a == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatusMo89453a.m89415d() == null || javaNullabilityAnnotationsStatusMo89453a.m89415d().compareTo(kotlinVersion) > 0) ? javaNullabilityAnnotationsStatusMo89453a.m89414c() : javaNullabilityAnnotationsStatusMo89453a.m89413b();
    }
}
