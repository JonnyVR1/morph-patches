package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006#"}, m88121d2 = {"Ll/lhi;", "", "", "bid", "", "asym", "", "usedVer", "", "Ll/khi;", "verData", "<init>", "(Ljava/lang/String;IJLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBid", "b", "I", Constants.INAPP_DATA_TAG, "(I)V", "c", "J", "()J", "e", "(J)V", "Ljava/util/Map;", "()Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class lhi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int asym;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long usedVer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<String, khi> verData;

    public /* synthetic */ lhi(String str, int i, long j, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAsym() {
        return this.asym;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUsedVer() {
        return this.usedVer;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, khi> m154205c() {
        return this.verData;
    }

    /* JADX INFO: renamed from: d */
    public final void m154206d(int i) {
        this.asym = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m154207e(long j) {
        this.usedVer = j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lhi)) {
            return false;
        }
        lhi lhiVar = (lhi) other;
        return Intrinsics.m88377d(this.bid, lhiVar.bid) && this.asym == lhiVar.asym && this.usedVer == lhiVar.usedVer && Intrinsics.m88377d(this.verData, lhiVar.verData);
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.asym)) * 31) + Long.hashCode(this.usedVer)) * 31;
        Map<String, khi> map = this.verData;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepPackageRecordData(bid=" + this.bid + ", asym=" + this.asym + ", usedVer=" + this.usedVer + ", verData=" + this.verData + ")";
    }

    public lhi(@NotNull String str, int i, long j, @NotNull Map<String, khi> map) {
        str.getClass();
        map.getClass();
        this.bid = str;
        this.asym = i;
        this.usedVer = j;
        this.verData = map;
    }
}
