package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u000e¨\u0006$"}, m88121d2 = {"Ll/fek0;", "", "", "eventName", "normalizedEventName", "", "firstTs", "lastTs", "", "countOfEvents", "deviceID", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEventName", "b", "getNormalizedEventName", "c", "J", "getFirstTs", "()J", Constants.INAPP_DATA_TAG, "e", "I", "getCountOfEvents", "f", "getDeviceID", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class fek0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String normalizedEventName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long firstTs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long lastTs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int countOfEvents;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String deviceID;

    public fek0(@NotNull String str, @NotNull String str2, long j, long j2, int i, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.eventName = str;
        this.normalizedEventName = str2;
        this.firstTs = j;
        this.lastTs = j2;
        this.countOfEvents = i;
        this.deviceID = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLastTs() {
        return this.lastTs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fek0)) {
            return false;
        }
        fek0 fek0Var = (fek0) other;
        return Intrinsics.m88377d(this.eventName, fek0Var.eventName) && Intrinsics.m88377d(this.normalizedEventName, fek0Var.normalizedEventName) && this.firstTs == fek0Var.firstTs && this.lastTs == fek0Var.lastTs && this.countOfEvents == fek0Var.countOfEvents && Intrinsics.m88377d(this.deviceID, fek0Var.deviceID);
    }

    public int hashCode() {
        return (((((((((this.eventName.hashCode() * 31) + this.normalizedEventName.hashCode()) * 31) + Long.hashCode(this.firstTs)) * 31) + Long.hashCode(this.lastTs)) * 31) + Integer.hashCode(this.countOfEvents)) * 31) + this.deviceID.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserEventLog(eventName=" + this.eventName + ", normalizedEventName=" + this.normalizedEventName + ", firstTs=" + this.firstTs + ", lastTs=" + this.lastTs + ", countOfEvents=" + this.countOfEvents + ", deviceID=" + this.deviceID + ')';
    }
}
