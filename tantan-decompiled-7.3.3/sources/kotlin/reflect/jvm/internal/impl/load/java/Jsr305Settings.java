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
import p153l.bsq;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ReportLevel f65358a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ReportLevel f65359b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<FqName, ReportLevel> f65360c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f65361d;

    /* JADX INFO: renamed from: e */
    public final boolean f65362e;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<FqName, ? extends ReportLevel> map) {
        reportLevel.getClass();
        map.getClass();
        this.f65358a = reportLevel;
        this.f65359b = reportLevel2;
        this.f65360c = map;
        this.f65361d = LazyKt__LazyJVMKt.m88118b(new bsq(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f65362e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m90317b(Jsr305Settings jsr305Settings) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(jsr305Settings.f65358a.getDescription());
        ReportLevel reportLevel = jsr305Settings.f65359b;
        if (reportLevel != null) {
            listCreateListBuilder.add("under-migration:" + reportLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.f65360c.entrySet()) {
            listCreateListBuilder.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ReportLevel m90318c() {
        return this.f65358a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final ReportLevel m90319d() {
        return this.f65359b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<FqName, ReportLevel> m90320e() {
        return this.f65360c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f65358a == jsr305Settings.f65358a && this.f65359b == jsr305Settings.f65359b && Intrinsics.m88377d(this.f65360c, jsr305Settings.f65360c);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m90321f() {
        return this.f65362e;
    }

    public int hashCode() {
        int iHashCode = this.f65358a.hashCode() * 31;
        ReportLevel reportLevel = this.f65359b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f65360c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f65358a + ", migrationLevel=" + this.f65359b + ", userDefinedLevelForSpecificAnnotation=" + this.f65360c + ')';
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
