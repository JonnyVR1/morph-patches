package p153l;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/khi;", "", "", "lastUpdateT", "", "", "Ll/mhi;", "fullVers", "<init>", "(JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "(J)V", "Ljava/util/Map;", "()Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class khi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long lastUpdateT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, mhi> fullVers;

    public /* synthetic */ khi(long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new LinkedHashMap() : map);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, mhi> m149790a() {
        return this.fullVers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdateT() {
        return this.lastUpdateT;
    }

    /* JADX INFO: renamed from: c */
    public final void m149792c(long j) {
        this.lastUpdateT = j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof khi)) {
            return false;
        }
        khi khiVar = (khi) other;
        return this.lastUpdateT == khiVar.lastUpdateT && Intrinsics.m88377d(this.fullVers, khiVar.fullVers);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.lastUpdateT) * 31;
        Map<String, mhi> map = this.fullVers;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepPackageRecordBaseVerData(lastUpdateT=" + this.lastUpdateT + ", fullVers=" + this.fullVers + ")";
    }

    public khi(long j, @NotNull Map<String, mhi> map) {
        map.getClass();
        this.lastUpdateT = j;
        this.fullVers = map;
    }

    public khi() {
        this(0L, null, 3, null);
    }
}
