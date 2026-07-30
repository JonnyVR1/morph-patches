package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/gq3;", "", "", "mcc", "", "regionName", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "setRegionName", "(Ljava/lang/String;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class gq3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int mcc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String regionName;

    public gq3(int i, @Nullable String str) {
        this.mcc = i;
        this.regionName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMcc() {
        return this.mcc;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof gq3)) {
            return false;
        }
        gq3 gq3Var = (gq3) other;
        return this.mcc == gq3Var.mcc && Intrinsics.m88377d(this.regionName, gq3Var.regionName);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mcc) * 31;
        String str = this.regionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "BuzzRegionMCC(mcc=" + this.mcc + ", regionName='" + this.regionName + "')";
    }
}
