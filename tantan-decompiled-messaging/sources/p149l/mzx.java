package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.MyMeetEntryNearby;
import com.p046p1.mobile.putong.core.data.ODiamondFeed;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/mzx;", "", "Lcom/p1/mobile/putong/core/api/CoreLikers$a;", "likersData", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "oDiamondFeed", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "nearby", "<init>", "(Lcom/p1/mobile/putong/core/api/CoreLikers$a;Lcom/p1/mobile/putong/core/data/ODiamondFeed;Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/api/CoreLikers$a;", "()Lcom/p1/mobile/putong/core/api/CoreLikers$a;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/api/CoreLikers$a;)V", "b", "Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "c", "()Lcom/p1/mobile/putong/core/data/ODiamondFeed;", "f", "(Lcom/p1/mobile/putong/core/data/ODiamondFeed;)V", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "()Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "e", "(Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class mzx {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public CoreLikers.C4719a likersData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ODiamondFeed oDiamondFeed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MyMeetEntryNearby nearby;

    public /* synthetic */ mzx(CoreLikers.C4719a c4719a, ODiamondFeed oDiamondFeed, MyMeetEntryNearby myMeetEntryNearby, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c4719a, (i & 2) != 0 ? null : oDiamondFeed, (i & 4) != 0 ? null : myMeetEntryNearby);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CoreLikers.C4719a getLikersData() {
        return this.likersData;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MyMeetEntryNearby getNearby() {
        return this.nearby;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ODiamondFeed getODiamondFeed() {
        return this.oDiamondFeed;
    }

    /* JADX INFO: renamed from: d */
    public final void m157177d(@Nullable CoreLikers.C4719a c4719a) {
        this.likersData = c4719a;
    }

    /* JADX INFO: renamed from: e */
    public final void m157178e(@Nullable MyMeetEntryNearby myMeetEntryNearby) {
        this.nearby = myMeetEntryNearby;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mzx)) {
            return false;
        }
        mzx mzxVar = (mzx) other;
        return Intrinsics.m87488d(this.likersData, mzxVar.likersData) && Intrinsics.m87488d(this.oDiamondFeed, mzxVar.oDiamondFeed) && Intrinsics.m87488d(this.nearby, mzxVar.nearby);
    }

    /* JADX INFO: renamed from: f */
    public final void m157179f(@Nullable ODiamondFeed oDiamondFeed) {
        this.oDiamondFeed = oDiamondFeed;
    }

    public int hashCode() {
        CoreLikers.C4719a c4719a = this.likersData;
        int iHashCode = (c4719a == null ? 0 : c4719a.hashCode()) * 31;
        ODiamondFeed oDiamondFeed = this.oDiamondFeed;
        int iHashCode2 = (iHashCode + (oDiamondFeed == null ? 0 : oDiamondFeed.hashCode())) * 31;
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        return iHashCode2 + (myMeetEntryNearby != null ? myMeetEntryNearby.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MeetEntranceData(likersData=" + this.likersData + ", oDiamondFeed=" + this.oDiamondFeed + ", nearby=" + this.nearby + ")";
    }

    public mzx(@Nullable CoreLikers.C4719a c4719a, @Nullable ODiamondFeed oDiamondFeed, @Nullable MyMeetEntryNearby myMeetEntryNearby) {
        this.likersData = c4719a;
        this.oDiamondFeed = oDiamondFeed;
        this.nearby = myMeetEntryNearby;
    }

    public mzx() {
        this(null, null, null, 7, null);
    }
}
