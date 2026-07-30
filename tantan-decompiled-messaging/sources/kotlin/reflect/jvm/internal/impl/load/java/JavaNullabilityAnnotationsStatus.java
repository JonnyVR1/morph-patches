package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaNullabilityAnnotationsStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final JavaNullabilityAnnotationsStatus f64676d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReportLevel f64677a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final KotlinVersion f64678b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReportLevel f64679c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final JavaNullabilityAnnotationsStatus m89416a() {
            return JavaNullabilityAnnotationsStatus.f64676d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ReportLevel m89413b() {
        return this.f64679c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ReportLevel m89414c() {
        return this.f64677a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final KotlinVersion m89415d() {
        return this.f64678b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f64677a == javaNullabilityAnnotationsStatus.f64677a && Intrinsics.m87488d(this.f64678b, javaNullabilityAnnotationsStatus.f64678b) && this.f64679c == javaNullabilityAnnotationsStatus.f64679c;
    }

    public int hashCode() {
        int iHashCode = this.f64677a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f64678b;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31) + this.f64679c.hashCode();
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f64677a + ", sinceVersion=" + this.f64678b + ", reportLevelAfter=" + this.f64679c + ')';
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevel, @Nullable KotlinVersion kotlinVersion, @NotNull ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.f64677a = reportLevel;
        this.f64678b = kotlinVersion;
        this.f64679c = reportLevel2;
    }
}
