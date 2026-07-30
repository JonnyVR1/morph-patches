package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import p153l.nmq;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeEnhancementState {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Jsr305Settings f65354a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<FqName, ReportLevel> f65355b;

    /* JADX INFO: renamed from: c */
    public final boolean f65356c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final ReportLevel m90312c(KotlinVersion kotlinVersion, FqName fqName) {
            fqName.getClass();
            return JavaNullabilityAnnotationSettingsKt.m90299c(fqName, kotlinVersion);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final JavaTypeEnhancementState m90313b(@NotNull KotlinVersion kotlinVersion) {
            kotlinVersion.getClass();
            return new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.m90297a(kotlinVersion), new nmq(kotlinVersion));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305Settings, @NotNull Function1<? super FqName, ? extends ReportLevel> function1) {
        jsr305Settings.getClass();
        function1.getClass();
        this.f65354a = jsr305Settings;
        this.f65355b = function1;
        this.f65356c = jsr305Settings.m90321f() || function1.invoke(JavaNullabilityAnnotationSettingsKt.m90300d()) == ReportLevel.IGNORE;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90308a() {
        return this.f65356c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<FqName, ReportLevel> m90309b() {
        return this.f65355b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Jsr305Settings m90310c() {
        return this.f65354a;
    }

    @NotNull
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f65354a + ", getReportLevelForAnnotation=" + this.f65355b + ')';
    }
}
