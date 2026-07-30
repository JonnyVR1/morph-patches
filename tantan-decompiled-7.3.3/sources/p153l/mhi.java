package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/mhi;", "", "", "fullVer", "lastVisitT", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "(Ljava/lang/String;)V", "bid", "e", "baseVer", "c", "J", "()J", Constants.INAPP_DATA_TAG, "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class mhi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String bid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String baseVer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long fullVer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long lastVisitT;

    public mhi(long j, long j2) {
        this.fullVer = j;
        this.lastVisitT = j2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseVer() {
        return this.baseVer;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFullVer() {
        return this.fullVer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastVisitT() {
        return this.lastVisitT;
    }

    /* JADX INFO: renamed from: e */
    public final void m158419e(@Nullable String str) {
        this.baseVer = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mhi)) {
            return false;
        }
        mhi mhiVar = (mhi) other;
        return this.fullVer == mhiVar.fullVer && this.lastVisitT == mhiVar.lastVisitT;
    }

    /* JADX INFO: renamed from: f */
    public final void m158420f(@Nullable String str) {
        this.bid = str;
    }

    public int hashCode() {
        return (Long.hashCode(this.fullVer) * 31) + Long.hashCode(this.lastVisitT);
    }

    @NotNull
    public String toString() {
        return "FepPackageRecordVerData(fullVer=" + this.fullVer + ", lastVisitT=" + this.lastVisitT + ")";
    }
}
