package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/ifo0;", "", "", "type", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "()Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class ifo0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveExtraData roomInfo;

    public ifo0(@NotNull String str, @NotNull BLiveExtraData bLiveExtraData) {
        str.getClass();
        bLiveExtraData.getClass();
        this.type = str;
        this.roomInfo = bLiveExtraData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BLiveExtraData getRoomInfo() {
        return this.roomInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ifo0)) {
            return false;
        }
        ifo0 ifo0Var = (ifo0) other;
        return Intrinsics.m87488d(this.type, ifo0Var.type) && Intrinsics.m87488d(this.roomInfo, ifo0Var.roomInfo);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.roomInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "VoiceRoomInfoEditInfo(type=" + this.type + ", roomInfo=" + this.roomInfo + ")";
    }
}
