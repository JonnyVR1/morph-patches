package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, m87232d2 = {"Ll/s8k0;", "", "", "liveId", "roomId", "placeType", "anchorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", Constants.INAPP_DATA_TAG, "getAnchorId", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class s8k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String liveId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String roomId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String placeType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String anchorId;

    public /* synthetic */ s8k0(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLiveId() {
        return this.liveId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlaceType() {
        return this.placeType;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s8k0)) {
            return false;
        }
        s8k0 s8k0Var = (s8k0) other;
        return Intrinsics.m87488d(this.liveId, s8k0Var.liveId) && Intrinsics.m87488d(this.roomId, s8k0Var.roomId) && Intrinsics.m87488d(this.placeType, s8k0Var.placeType) && Intrinsics.m87488d(this.anchorId, s8k0Var.anchorId);
    }

    public int hashCode() {
        String str = this.liveId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.anchorId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserRightRequestInfo(liveId=" + this.liveId + ", roomId=" + this.roomId + ", placeType=" + this.placeType + ", anchorId=" + this.anchorId + ")";
    }

    public s8k0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.liveId = str;
        this.roomId = str2;
        this.placeType = str3;
        this.anchorId = str4;
    }

    public s8k0() {
        this(null, null, null, null, 15, null);
    }
}
