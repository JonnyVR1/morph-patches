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
    public static final JavaNullabilityAnnotationsStatus f65350d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReportLevel f65351a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final KotlinVersion f65352b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ReportLevel f65353c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final JavaNullabilityAnnotationsStatus m90307a() {
            return JavaNullabilityAnnotationsStatus.f65350d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i & 4) != 0 ? reportLevel : reportLevel2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ReportLevel m90304b() {
        return this.f65353c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ReportLevel m90305c() {
        return this.f65351a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final KotlinVersion m90306d() {
        return this.f65352b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f65351a == javaNullabilityAnnotationsStatus.f65351a && Intrinsics.m88377d(this.f65352b, javaNullabilityAnnotationsStatus.f65352b) && this.f65353c == javaNullabilityAnnotationsStatus.f65353c;
    }

    public int hashCode() {
        int iHashCode = this.f65351a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f65352b;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31) + this.f65353c.hashCode();
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f65351a + ", sinceVersion=" + this.f65352b + ", reportLevelAfter=" + this.f65353c + ')';
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevel, @Nullable KotlinVersion kotlinVersion, @NotNull ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.f65351a = reportLevel;
        this.f65352b = kotlinVersion;
        this.f65353c = reportLevel2;
    }
}
