package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import p149l.okq;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeEnhancementState {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Jsr305Settings f64680a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<FqName, ReportLevel> f64681b;

    /* JADX INFO: renamed from: c */
    public final boolean f64682c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final ReportLevel m89421c(KotlinVersion kotlinVersion, FqName fqName) {
            fqName.getClass();
            return JavaNullabilityAnnotationSettingsKt.m89408c(fqName, kotlinVersion);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final JavaTypeEnhancementState m89422b(@NotNull KotlinVersion kotlinVersion) {
            kotlinVersion.getClass();
            return new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.m89406a(kotlinVersion), new okq(kotlinVersion));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305Settings, @NotNull Function1<? super FqName, ? extends ReportLevel> function1) {
        jsr305Settings.getClass();
        function1.getClass();
        this.f64680a = jsr305Settings;
        this.f64681b = function1;
        this.f64682c = jsr305Settings.m89430f() || function1.invoke(JavaNullabilityAnnotationSettingsKt.m89409d()) == ReportLevel.IGNORE;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89417a() {
        return this.f64682c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<FqName, ReportLevel> m89418b() {
        return this.f64681b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Jsr305Settings m89419c() {
        return this.f64680a;
    }

    @NotNull
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f64680a + ", getReportLevelForAnnotation=" + this.f64681b + ')';
    }
}
