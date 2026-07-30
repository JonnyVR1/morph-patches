package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.aqq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReportLevel f64684a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ReportLevel f64685b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<FqName, ReportLevel> f64686c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f64687d;

    /* JADX INFO: renamed from: e */
    public final boolean f64688e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<FqName, ? extends ReportLevel> map) {
        reportLevel.getClass();
        map.getClass();
        this.f64684a = reportLevel;
        this.f64685b = reportLevel2;
        this.f64686c = map;
        this.f64687d = LazyKt__LazyJVMKt.m87229b(new aqq(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f64688e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m89426b(Jsr305Settings jsr305Settings) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(jsr305Settings.f64684a.getDescription());
        ReportLevel reportLevel = jsr305Settings.f64685b;
        if (reportLevel != null) {
            listCreateListBuilder.add("under-migration:" + reportLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.f64686c.entrySet()) {
            listCreateListBuilder.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ReportLevel m89427c() {
        return this.f64684a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final ReportLevel m89428d() {
        return this.f64685b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<FqName, ReportLevel> m89429e() {
        return this.f64686c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f64684a == jsr305Settings.f64684a && this.f64685b == jsr305Settings.f64685b && Intrinsics.m87488d(this.f64686c, jsr305Settings.f64686c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m89430f() {
        return this.f64688e;
    }

    public int hashCode() {
        int iHashCode = this.f64684a.hashCode() * 31;
        ReportLevel reportLevel = this.f64685b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f64686c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f64684a + ", migrationLevel=" + this.f64685b + ", userDefinedLevelForSpecificAnnotation=" + this.f64686c + ')';
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
